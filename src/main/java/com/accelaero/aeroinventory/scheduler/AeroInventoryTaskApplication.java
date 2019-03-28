package com.accelaero.aeroinventory.scheduler;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.accelaero.aeroinventory.scheduler.config.ServiceConfig;
import com.accelaero.aeroinventory.scheduler.rpc.service.TaskServiceGrpcImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ImportResource({ "classpath:spring-quartz.xml" })
@Slf4j
public class AeroInventoryTaskApplication {

	private static Server server;

	public static void main(String[] args) throws IOException {

		ApplicationContext ctx = SpringApplication.run(AeroInventoryTaskApplication.class, args);
		startGrpcServer(ctx);
	}

	private static void startGrpcServer(ApplicationContext ctx) throws IOException {

		TaskServiceGrpcImpl chargeServiceGrpcImpl = ctx.getBean(TaskServiceGrpcImpl.class);
//		ServiceConfig serviceConfig = ctx.getBean(ServiceConfig.class);
//		server = ServerBuilder.forPort(serviceConfig.getGrpcPort()).addService(chargeServiceGrpcImpl).build().start();
		Runtime.getRuntime().addShutdownHook(new Thread(() -> AeroInventoryTaskApplication.stopGrpcServer()));
	}

	private static void stopGrpcServer() {
		if (server != null) {
			log.info("Shutting down gRPC server since JVM is shutting down");
			server.shutdown();
			log.info("gRPC has server shut down properly");
		}
	}

}
