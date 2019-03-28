package com.accelaero.aeroinventory.scheduler.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.scheduler.grpc.client.AeroInventoryGrpcConsumer;

@Component
public class SimpleOneTimeJob extends QuartzJobBean {
	private static final Logger logger = LoggerFactory.getLogger(SimpleOneTimeJob.class);

	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		logger.info("Executing SimpleOneTimeJob with key {}", jobExecutionContext.getJobDetail().getKey());

		JobDataMap dataMap = jobExecutionContext.getMergedJobDataMap();
		// String myValue = dataMap.getString("myKey");
		if (dataMap != null && !dataMap.isEmpty()) {
			for (String key : dataMap.keySet()) {
				logger.info("KEY: " + key + "    VALUE: " + dataMap.get(key));
			}
		}

		AeroInventoryGrpcConsumer serviceInvoker = new AeroInventoryGrpcConsumer();
		serviceInvoker.invokeGrpcService();

	}

}
