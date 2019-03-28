package com.accelaero.aeroinventory.scheduler.service;

import java.util.Date;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {

	private static final Logger logger = LoggerFactory.getLogger(JobServiceImpl.class);

	@Autowired
	private ApplicationContext context;

	@Autowired
	private Scheduler scheduler;

	/**
	 * Schedule a job by jobName at given date.
	 */
	@Override
	public boolean scheduleOneTimeJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date,
			String serviceName) {
		logger.info("Request received to scheduleJob");

		String jobKey = jobName;
		String groupKey = "SampleGroup";
		String triggerKey = jobName;

		JobDetail jobDetail = JobUtil.createJob(jobClass, false, context, jobKey, groupKey, serviceName);

		logger.info("creating trigger for key :" + jobKey + " at date :" + date);
		Trigger cronTriggerBean = JobUtil.createSingleTrigger(triggerKey, date,
				SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

		try {

			Date dt = scheduler.scheduleJob(jobDetail, cronTriggerBean);
			logger.info("Job with key jobKey :" + jobKey + " and group :" + groupKey
					+ " scheduled successfully for date :" + dt);
			return true;
		} catch (SchedulerException e) {
			logger.info("SchedulerException while scheduling job with key :" + jobKey + " message :" + e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * Schedule a job by jobName at given date.
	 */
	@Override
	public boolean scheduleCronJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date,
			String cronExpression, String serviceName) {
		logger.info("Request received to scheduleJob");

		String jobKey = jobName;
		String groupKey = "SampleGroup";
		String triggerKey = jobName;

		JobDetail jobDetail = JobUtil.createJob(jobClass, false, context, jobKey, groupKey, serviceName);

		logger.info("creating trigger for key :" + jobKey + " at date :" + date);
		Trigger cronTriggerBean = JobUtil.createCronTrigger(triggerKey, date, cronExpression,
				SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

		try {

			Date dt = scheduler.scheduleJob(jobDetail, cronTriggerBean);
			logger.info("Job with key jobKey :" + jobKey + " and group :" + groupKey
					+ " scheduled successfully for date :" + dt);
			return true;
		} catch (SchedulerException e) {
			logger.info("SchedulerException while scheduling job with key :" + jobKey + " message :" + e.getMessage());
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * Check job exist with given name
	 */
	@Override
	public boolean isJobWithNamePresent(String jobName) {
		try {
			String groupKey = "SampleGroup";
			JobKey jobKey = new JobKey(jobName, groupKey);
			if (scheduler.checkExists(jobKey)) {
				return true;
			}
		} catch (SchedulerException e) {
			logger.info("SchedulerException while checking job with name and group exist:" + e.getMessage());
			e.printStackTrace();
		}
		return false;
	}
}


