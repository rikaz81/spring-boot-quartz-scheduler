package com.accelaero.aeroinventory.scheduler.controller;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

import javax.validation.Valid;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accelaero.aeroinventory.scheduler.job.SimpleOneTimeJob;
import com.accelaero.aeroinventory.scheduler.job.SimpleScheduleCronJob;
import com.accelaero.aeroinventory.scheduler.payload.ScheduleRequest;
import com.accelaero.aeroinventory.scheduler.payload.ScheduleResponse;
import com.accelaero.aeroinventory.scheduler.payload.ScheduleSimpleRequest;
import com.accelaero.aeroinventory.scheduler.service.JobService;
import com.accelaero.aeroinventory.scheduler.util.CalenderUtils;

@RestController
public class JobSchedulerController {
	private static final Logger logger = LoggerFactory.getLogger(JobSchedulerController.class);
	@Autowired
	JobService jobService;
	@Autowired
	private Scheduler scheduler;

	@PostMapping("/scheduleEmail")
	public ResponseEntity<ScheduleResponse> scheduleEmail(@Valid @RequestBody ScheduleRequest scheduleEmailRequest) {
		try {
			ZonedDateTime dateTime = ZonedDateTime.of(scheduleEmailRequest.getDateTime(),
					scheduleEmailRequest.getTimeZone());
			if (dateTime.isBefore(ZonedDateTime.now())) {
				ScheduleResponse scheduleEmailResponse = new ScheduleResponse(false,
						"dateTime must be after current time");
				return ResponseEntity.badRequest().body(scheduleEmailResponse);
			}

			JobDetail jobDetail = buildJobDetail(scheduleEmailRequest);
			Trigger trigger = buildJobTrigger(jobDetail, dateTime);
			scheduler.scheduleJob(jobDetail, trigger);

			ScheduleResponse scheduleEmailResponse = new ScheduleResponse(true, jobDetail.getKey().getName(),
					jobDetail.getKey().getGroup(), "Email Scheduled Successfully!");
			return ResponseEntity.ok(scheduleEmailResponse);
		} catch (SchedulerException ex) {
			logger.error("Error scheduling email", ex);

			ScheduleResponse scheduleEmailResponse = new ScheduleResponse(false,
					"Error scheduling email. Please try later!");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(scheduleEmailResponse);
		}
	}

	@PostMapping("schedule")
	public ResponseEntity<ScheduleResponse> schedule(@Valid @RequestBody ScheduleSimpleRequest simpleRequest) {

		try {
			logger.info("JobController.schedule()");

			String jobName = simpleRequest.getJobName();
			String cronExpression = simpleRequest.getCronExpression();
			// Date jobScheduleTime = simpleRequest.getJobScheduleTime();
			Date jobScheduleTime = CalenderUtils.add(new Date(), 0, 0, 0, 0, 2, 0);

			// Job Name is mandatory
			if (simpleRequest.getJobName() == null || simpleRequest.getJobName().trim().equals("")) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body(new ScheduleResponse(false, "-", "-", "Email Scheduled Successfully!"));
			}

			if (cronExpression == null || cronExpression.trim().equals("")) {

				jobService.scheduleOneTimeJob(jobName, SimpleOneTimeJob.class, jobScheduleTime, null);
			} else {
				jobService.scheduleCronJob(jobName, SimpleScheduleCronJob.class, jobScheduleTime, cronExpression, null);
			}

			ScheduleResponse scheduleEmailResponse = new ScheduleResponse(true, jobName, "-",
					"Email Scheduled Successfully!");
			return ResponseEntity.ok(scheduleEmailResponse);
		} catch (Exception ex) {

			logger.error("Error scheduling email", ex);

			ScheduleResponse scheduleEmailResponse = new ScheduleResponse(false,
					"Error scheduling email. Please try later!");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(scheduleEmailResponse);
		}

	}

	private JobDetail buildJobDetail(ScheduleRequest scheduleEmailRequest) {
		JobDataMap jobDataMap = new JobDataMap();

		jobDataMap.put("serviceName", "invokeGrpcService");
		jobDataMap.put("email", scheduleEmailRequest.getEmail());
		jobDataMap.put("subject", scheduleEmailRequest.getSubject());
		jobDataMap.put("body", scheduleEmailRequest.getBody());

		return JobBuilder.newJob(SimpleOneTimeJob.class).withIdentity(UUID.randomUUID().toString(), "email-jobs")
				.withDescription("Send Email Job").usingJobData(jobDataMap).storeDurably().build();
	}

	private Trigger buildJobTrigger(JobDetail jobDetail, ZonedDateTime startAt) {
		return TriggerBuilder.newTrigger().forJob(jobDetail)
				.withIdentity(jobDetail.getKey().getName(), "email-triggers").withDescription("Send Email Trigger")
				.startAt(Date.from(startAt.toInstant()))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow()).build();

	}
}
