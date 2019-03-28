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
public class SampleFirstJob extends QuartzJobBean {
	private static final Logger logger = LoggerFactory.getLogger(SampleFirstJob.class);

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		logger.info("Executing SampleFirstJob ");

		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		String formattedDate = dateFormat.format(calendar.getTime());

		logger.info(formattedDate + " :: SampleFirstJob :: ");
		logger.info("Exit SampleFirstJob with key {}", jobExecutionContext.getJobDetail().getKey());

	}
}
