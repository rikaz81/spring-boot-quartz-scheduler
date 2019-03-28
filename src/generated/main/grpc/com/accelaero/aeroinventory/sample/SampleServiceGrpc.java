package com.accelaero.aeroinventory.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.0)",
    comments = "Source: sample.proto")
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "aeroinventory.SampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "quoteCharge",
      requestType = com.accelaero.aeroinventory.sample.ChargeQuoteRequest.class,
      responseType = com.accelaero.aeroinventory.sample.ChargeQuoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeMethod() {
    io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest, com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeMethod;
    if ((getQuoteChargeMethod = SampleServiceGrpc.getQuoteChargeMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getQuoteChargeMethod = SampleServiceGrpc.getQuoteChargeMethod) == null) {
          SampleServiceGrpc.getQuoteChargeMethod = getQuoteChargeMethod = 
              io.grpc.MethodDescriptor.<com.accelaero.aeroinventory.sample.ChargeQuoteRequest, com.accelaero.aeroinventory.sample.ChargeQuoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aeroinventory.SampleService", "quoteCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.sample.ChargeQuoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.sample.ChargeQuoteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("quoteCharge"))
                  .build();
          }
        }
     }
     return getQuoteChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeByPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "quoteChargeByPost",
      requestType = com.accelaero.aeroinventory.sample.ChargeQuoteRequest.class,
      responseType = com.accelaero.aeroinventory.sample.ChargeQuoteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeByPostMethod() {
    io.grpc.MethodDescriptor<com.accelaero.aeroinventory.sample.ChargeQuoteRequest, com.accelaero.aeroinventory.sample.ChargeQuoteResponse> getQuoteChargeByPostMethod;
    if ((getQuoteChargeByPostMethod = SampleServiceGrpc.getQuoteChargeByPostMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getQuoteChargeByPostMethod = SampleServiceGrpc.getQuoteChargeByPostMethod) == null) {
          SampleServiceGrpc.getQuoteChargeByPostMethod = getQuoteChargeByPostMethod = 
              io.grpc.MethodDescriptor.<com.accelaero.aeroinventory.sample.ChargeQuoteRequest, com.accelaero.aeroinventory.sample.ChargeQuoteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aeroinventory.SampleService", "quoteChargeByPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.sample.ChargeQuoteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.sample.ChargeQuoteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("quoteChargeByPost"))
                  .build();
          }
        }
     }
     return getQuoteChargeByPostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    return new SampleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SampleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SampleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void quoteCharge(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuoteChargeMethod(), responseObserver);
    }

    /**
     */
    public void quoteChargeByPost(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQuoteChargeByPostMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQuoteChargeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
                com.accelaero.aeroinventory.sample.ChargeQuoteResponse>(
                  this, METHODID_QUOTE_CHARGE)))
          .addMethod(
            getQuoteChargeByPostMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.accelaero.aeroinventory.sample.ChargeQuoteRequest,
                com.accelaero.aeroinventory.sample.ChargeQuoteResponse>(
                  this, METHODID_QUOTE_CHARGE_BY_POST)))
          .build();
    }
  }

  /**
   */
  public static final class SampleServiceStub extends io.grpc.stub.AbstractStub<SampleServiceStub> {
    private SampleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void quoteCharge(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuoteChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void quoteChargeByPost(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQuoteChargeByPostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SampleServiceBlockingStub extends io.grpc.stub.AbstractStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.accelaero.aeroinventory.sample.ChargeQuoteResponse quoteCharge(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuoteChargeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.accelaero.aeroinventory.sample.ChargeQuoteResponse quoteChargeByPost(com.accelaero.aeroinventory.sample.ChargeQuoteRequest request) {
      return blockingUnaryCall(
          getChannel(), getQuoteChargeByPostMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SampleServiceFutureStub extends io.grpc.stub.AbstractStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> quoteCharge(
        com.accelaero.aeroinventory.sample.ChargeQuoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuoteChargeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.accelaero.aeroinventory.sample.ChargeQuoteResponse> quoteChargeByPost(
        com.accelaero.aeroinventory.sample.ChargeQuoteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQuoteChargeByPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUOTE_CHARGE = 0;
  private static final int METHODID_QUOTE_CHARGE_BY_POST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUOTE_CHARGE:
          serviceImpl.quoteCharge((com.accelaero.aeroinventory.sample.ChargeQuoteRequest) request,
              (io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse>) responseObserver);
          break;
        case METHODID_QUOTE_CHARGE_BY_POST:
          serviceImpl.quoteChargeByPost((com.accelaero.aeroinventory.sample.ChargeQuoteRequest) request,
              (io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.sample.ChargeQuoteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.accelaero.aeroinventory.sample.Sample.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(getQuoteChargeMethod())
              .addMethod(getQuoteChargeByPostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
