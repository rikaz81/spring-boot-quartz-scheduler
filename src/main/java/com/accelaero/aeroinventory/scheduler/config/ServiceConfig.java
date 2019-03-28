package com.accelaero.aeroinventory.scheduler.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

	private int grpcPort;

	@Autowired
	public ServiceConfig(@Value("${grpc.port}") int grpcPort) {

		this.grpcPort = grpcPort;
	}

	public int getGrpcPort() {
		return grpcPort;
	}
}
