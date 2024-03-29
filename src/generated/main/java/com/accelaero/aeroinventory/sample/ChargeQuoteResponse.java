// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package com.accelaero.aeroinventory.sample;

/**
 * Protobuf type {@code aeroinventory.ChargeQuoteResponse}
 */
public  final class ChargeQuoteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:aeroinventory.ChargeQuoteResponse)
    ChargeQuoteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChargeQuoteResponse.newBuilder() to construct.
  private ChargeQuoteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChargeQuoteResponse() {
    totalAmount_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChargeQuoteResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            totalAmount_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.accelaero.aeroinventory.sample.Sample.internal_static_aeroinventory_ChargeQuoteResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.accelaero.aeroinventory.sample.Sample.internal_static_aeroinventory_ChargeQuoteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.accelaero.aeroinventory.sample.ChargeQuoteResponse.class, com.accelaero.aeroinventory.sample.ChargeQuoteResponse.Builder.class);
  }

  public static final int TOTALAMOUNT_FIELD_NUMBER = 1;
  private int totalAmount_;
  /**
   * <code>int32 totalAmount = 1;</code>
   */
  public int getTotalAmount() {
    return totalAmount_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (totalAmount_ != 0) {
      output.writeInt32(1, totalAmount_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalAmount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, totalAmount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.accelaero.aeroinventory.sample.ChargeQuoteResponse)) {
      return super.equals(obj);
    }
    com.accelaero.aeroinventory.sample.ChargeQuoteResponse other = (com.accelaero.aeroinventory.sample.ChargeQuoteResponse) obj;

    boolean result = true;
    result = result && (getTotalAmount()
        == other.getTotalAmount());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOTALAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getTotalAmount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.accelaero.aeroinventory.sample.ChargeQuoteResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code aeroinventory.ChargeQuoteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:aeroinventory.ChargeQuoteResponse)
      com.accelaero.aeroinventory.sample.ChargeQuoteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.accelaero.aeroinventory.sample.Sample.internal_static_aeroinventory_ChargeQuoteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.accelaero.aeroinventory.sample.Sample.internal_static_aeroinventory_ChargeQuoteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.accelaero.aeroinventory.sample.ChargeQuoteResponse.class, com.accelaero.aeroinventory.sample.ChargeQuoteResponse.Builder.class);
    }

    // Construct using com.accelaero.aeroinventory.sample.ChargeQuoteResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      totalAmount_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.accelaero.aeroinventory.sample.Sample.internal_static_aeroinventory_ChargeQuoteResponse_descriptor;
    }

    public com.accelaero.aeroinventory.sample.ChargeQuoteResponse getDefaultInstanceForType() {
      return com.accelaero.aeroinventory.sample.ChargeQuoteResponse.getDefaultInstance();
    }

    public com.accelaero.aeroinventory.sample.ChargeQuoteResponse build() {
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.accelaero.aeroinventory.sample.ChargeQuoteResponse buildPartial() {
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse result = new com.accelaero.aeroinventory.sample.ChargeQuoteResponse(this);
      result.totalAmount_ = totalAmount_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.accelaero.aeroinventory.sample.ChargeQuoteResponse) {
        return mergeFrom((com.accelaero.aeroinventory.sample.ChargeQuoteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.accelaero.aeroinventory.sample.ChargeQuoteResponse other) {
      if (other == com.accelaero.aeroinventory.sample.ChargeQuoteResponse.getDefaultInstance()) return this;
      if (other.getTotalAmount() != 0) {
        setTotalAmount(other.getTotalAmount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.accelaero.aeroinventory.sample.ChargeQuoteResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.accelaero.aeroinventory.sample.ChargeQuoteResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int totalAmount_ ;
    /**
     * <code>int32 totalAmount = 1;</code>
     */
    public int getTotalAmount() {
      return totalAmount_;
    }
    /**
     * <code>int32 totalAmount = 1;</code>
     */
    public Builder setTotalAmount(int value) {
      
      totalAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 totalAmount = 1;</code>
     */
    public Builder clearTotalAmount() {
      
      totalAmount_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:aeroinventory.ChargeQuoteResponse)
  }

  // @@protoc_insertion_point(class_scope:aeroinventory.ChargeQuoteResponse)
  private static final com.accelaero.aeroinventory.sample.ChargeQuoteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.accelaero.aeroinventory.sample.ChargeQuoteResponse();
  }

  public static com.accelaero.aeroinventory.sample.ChargeQuoteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChargeQuoteResponse>
      PARSER = new com.google.protobuf.AbstractParser<ChargeQuoteResponse>() {
    public ChargeQuoteResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChargeQuoteResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChargeQuoteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChargeQuoteResponse> getParserForType() {
    return PARSER;
  }

  public com.accelaero.aeroinventory.sample.ChargeQuoteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

