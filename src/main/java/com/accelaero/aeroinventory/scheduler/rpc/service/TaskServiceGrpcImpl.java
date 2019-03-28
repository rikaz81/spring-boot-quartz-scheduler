package com.accelaero.aeroinventory.scheduler.rpc.service;

import java.util.Date;

import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest;
import com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse;
import com.accelaero.aeroinventory.scheduler.external.TaskServiceGrpc;
import com.accelaero.aeroinventory.scheduler.job.SimpleOneTimeJob;
import com.accelaero.aeroinventory.scheduler.job.SimpleScheduleCronJob;
import com.accelaero.aeroinventory.scheduler.service.JobService;
import com.accelaero.aeroinventory.scheduler.util.CalenderUtils;

import io.grpc.stub.StreamObserver;

@GRpcService
public class TaskServiceGrpcImpl extends TaskServiceGrpc.TaskServiceImplBase {

	private final Logger logger = LoggerFactory.getLogger(TaskServiceGrpcImpl.class);

	@Autowired
	private JobService jobService;

	@Override
	public void scheduleTask(GrpcTaskRequest request, StreamObserver<GrpcTaskResponse> responseObserver) {
		logger.info("Inside scheduleTask Grpc invoked");
		scheduleTaskLogic(request, responseObserver);
		logger.info("exit scheduleTask Grpc invoked");
	}

	private void scheduleTaskLogic(GrpcTaskRequest request, StreamObserver<GrpcTaskResponse> responseObserver) {
		try {

			String jobName = request.getJobName();
			String cronExpression = request.getCronExpression();
			String serviceName = request.getServiceName();

			// Job Name is mandatory
			GrpcTaskResponse.Builder resultBuilder = GrpcTaskResponse.newBuilder();
			if (jobName == null || jobName.trim().equals("")) {
				// validate
				logger.info("JOB NAME REQUIRED ");
				resultBuilder.setStatus("error");
				resultBuilder.setDescription("JOB_NAME_REQUIRED");
			} else {
				if (!jobService.isJobWithNamePresent(jobName)) {
					if (cronExpression == null || cronExpression.trim().equals("")) {
						Date jobScheduleTime = CalenderUtils.add(new Date(), 0, 0, 0, 0, 2, 0);
						jobService.scheduleOneTimeJob(jobName, SimpleOneTimeJob.class, jobScheduleTime, serviceName);
						resultBuilder.setDescription(
								"SIMPLE_JOB_SCHEDULED :: " + jobName + " TRIGGER ON:" + jobScheduleTime);
						logger.info("SIMPLE_JOB_SCHEDULED :: " + jobName + " TRIGGER ON:" + jobScheduleTime);
					} else {
						jobService.scheduleCronJob(jobName, SimpleScheduleCronJob.class, new Date(), cronExpression,
								serviceName);
						resultBuilder
								.setDescription("CRON_JOB_SCHEDULED :: " + jobName + " EXPRESSION :" + cronExpression);
						logger.info("CRON_JOB_SCHEDULED :: " + jobName + " EXPRESSION :" + cronExpression);
					}
					resultBuilder.setStatus("success");

				} else {
					resultBuilder.setStatus("error");
					resultBuilder.setDescription("JOB_WITH_SAME_NAME_EXIST :: " + jobName);
					logger.info("JOB_WITH_SAME_NAME_EXIST :: " + jobName);
				}
			}

			responseObserver.onNext(resultBuilder.build());
			responseObserver.onCompleted();

		} catch (Exception e) {
			logger.error("Service exception received on scheduleTaskLogic : {} ", e.getMessage());
			responseObserver.onError(e);
		}
	}
}
