package com.accelaero.aeroinventory.scheduler.grpc.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.accelaero.aeroinventory.sample.ChargeQuoteRequest;
import com.accelaero.aeroinventory.sample.ChargeQuoteResponse;
import com.accelaero.aeroinventory.sample.SampleServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Component
public class AeroInventoryGrpcConsumer {

	private static final Logger logger = LoggerFactory.getLogger(AeroInventoryGrpcConsumer.class);

	private SampleServiceGrpc.SampleServiceBlockingStub helloWorldServiceBlockingStub;

	public AeroInventoryGrpcConsumer() {
		ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 9071).usePlaintext().build();

		helloWorldServiceBlockingStub = SampleServiceGrpc.newBlockingStub(managedChannel);

		logger.info("Inside SampleGrpcClient init ::: ");
	}

	public String invokeGrpcService() {

		ChargeQuoteRequest sampleRQ = ChargeQuoteRequest.newBuilder().setFlightNumber("G9505").build();

		ChargeQuoteResponse response = helloWorldServiceBlockingStub.quoteCharge(sampleRQ);

		logger.info("Returned ChargeQuoteResponse :: " + response.getTotalAmount() + "");

		return "Hello";
	}
}
