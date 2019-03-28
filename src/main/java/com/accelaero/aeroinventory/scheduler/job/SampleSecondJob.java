package com.accelaero.aeroinventory.scheduler.job;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class SampleSecondJob extends QuartzJobBean {
	private static final Logger logger = LoggerFactory.getLogger(SampleSecondJob.class);

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		logger.info("Executing SampleSecondJob ");

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		String formattedDate = dateFormat.format(calendar.getTime());
		logger.info(formattedDate + " :: SampleSecondJob :: ");

		logger.info("Exit SampleSecondJob with key {}", jobExecutionContext.getJobDetail().getKey());

	}
}
