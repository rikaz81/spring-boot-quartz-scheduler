// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task.proto

package com.accelaero.aeroinventory.scheduler.external;

public interface GrpcTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:aeroinventory.GrpcTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string jobName = 1;</code>
   */
  java.lang.String getJobName();
  /**
   * <code>string jobName = 1;</code>
   */
  com.google.protobuf.ByteString
      getJobNameBytes();

  /**
   * <code>string serviceName = 2;</code>
   */
  java.lang.String getServiceName();
  /**
   * <code>string serviceName = 2;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <code>string cronExpression = 3;</code>
   */
  java.lang.String getCronExpression();
  /**
   * <code>string cronExpression = 3;</code>
   */
  com.google.protobuf.ByteString
      getCronExpressionBytes();
}