package com.accelaero.aeroinventory.scheduler.service;

import java.util.Date;

import org.springframework.scheduling.quartz.QuartzJobBean;

public interface JobService {
	boolean scheduleOneTimeJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date, String serviceName);

	boolean scheduleCronJob(String jobName, Class<? extends QuartzJobBean> jobClass, Date date, String cronExpression,
			String serviceName);

	// boolean updateOneTimeJob(String jobName, Date date);
	// boolean updateCronJob(String jobName, Date date, String cronExpression);
	//
	// boolean unScheduleJob(String jobName);
	// boolean deleteJob(String jobName);
	// boolean pauseJob(String jobName);
	// boolean resumeJob(String jobName);
	// boolean startJobNow(String jobName);
	// boolean isJobRunning(String jobName);
	// List<Map<String, Object>> getAllJobs();
	boolean isJobWithNamePresent(String jobName);
	// String getJobState(String jobName);
	// boolean stopJob(String jobName);
}
