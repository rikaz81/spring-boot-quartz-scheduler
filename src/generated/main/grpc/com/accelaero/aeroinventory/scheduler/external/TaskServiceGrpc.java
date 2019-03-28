package com.accelaero.aeroinventory.scheduler.external;

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
    comments = "Source: task.proto")
public final class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "aeroinventory.TaskService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest,
      com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> getScheduleTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scheduleTask",
      requestType = com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest.class,
      responseType = com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest,
      com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> getScheduleTaskMethod() {
    io.grpc.MethodDescriptor<com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest, com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> getScheduleTaskMethod;
    if ((getScheduleTaskMethod = TaskServiceGrpc.getScheduleTaskMethod) == null) {
      synchronized (TaskServiceGrpc.class) {
        if ((getScheduleTaskMethod = TaskServiceGrpc.getScheduleTaskMethod) == null) {
          TaskServiceGrpc.getScheduleTaskMethod = getScheduleTaskMethod = 
              io.grpc.MethodDescriptor.<com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest, com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aeroinventory.TaskService", "scheduleTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TaskServiceMethodDescriptorSupplier("scheduleTask"))
                  .build();
          }
        }
     }
     return getScheduleTaskMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    return new TaskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void scheduleTask(com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleTaskMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScheduleTaskMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest,
                com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse>(
                  this, METHODID_SCHEDULE_TASK)))
          .build();
    }
  }

  /**
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractStub<TaskServiceStub> {
    private TaskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     */
    public void scheduleTask(com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest request,
        io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleTaskMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse scheduleTask(com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest request) {
      return blockingUnaryCall(
          getChannel(), getScheduleTaskMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TaskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse> scheduleTask(
        com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleTaskMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCHEDULE_TASK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCHEDULE_TASK:
          serviceImpl.scheduleTask((com.accelaero.aeroinventory.scheduler.external.GrpcTaskRequest) request,
              (io.grpc.stub.StreamObserver<com.accelaero.aeroinventory.scheduler.external.GrpcTaskResponse>) responseObserver);
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

  private static abstract class TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TaskServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.accelaero.aeroinventory.scheduler.external.Task.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TaskService");
    }
  }

  private static final class TaskServiceFileDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier {
    TaskServiceFileDescriptorSupplier() {}
  }

  private static final class TaskServiceMethodDescriptorSupplier
      extends TaskServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TaskServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TaskServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TaskServiceFileDescriptorSupplier())
              .addMethod(getScheduleTaskMethod())
              .build();
        }
      }
    }
    return result;
  }
}
