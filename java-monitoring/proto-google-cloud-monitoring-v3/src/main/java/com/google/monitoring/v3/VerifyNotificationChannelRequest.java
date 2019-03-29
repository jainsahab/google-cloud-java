// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `VerifyNotificationChannel` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.VerifyNotificationChannelRequest}
 */
public final class VerifyNotificationChannelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.VerifyNotificationChannelRequest)
    VerifyNotificationChannelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VerifyNotificationChannelRequest.newBuilder() to construct.
  private VerifyNotificationChannelRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VerifyNotificationChannelRequest() {
    name_ = "";
    code_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VerifyNotificationChannelRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              code_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.NotificationServiceProto
        .internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.VerifyNotificationChannelRequest.class,
            com.google.monitoring.v3.VerifyNotificationChannelRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * The notification channel to verify.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The notification channel to verify.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object code_;
  /**
   *
   *
   * <pre>
   * The verification code that was delivered to the channel as
   * a result of invoking the `SendNotificationChannelVerificationCode` API
   * method or that was retrieved from a verified channel via
   * `GetNotificationChannelVerificationCode`. For example, one might have
   * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
   * guaranteed that the code is valid UTF-8; one should not
   * make any assumptions regarding the structure or format of the code).
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The verification code that was delivered to the channel as
   * a result of invoking the `SendNotificationChannelVerificationCode` API
   * method or that was retrieved from a verified channel via
   * `GetNotificationChannelVerificationCode`. For example, one might have
   * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
   * guaranteed that the code is valid UTF-8; one should not
   * make any assumptions regarding the structure or format of the code).
   * </pre>
   *
   * <code>string code = 2;</code>
   */
  public com.google.protobuf.ByteString getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
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
    if (!(obj instanceof com.google.monitoring.v3.VerifyNotificationChannelRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.VerifyNotificationChannelRequest other =
        (com.google.monitoring.v3.VerifyNotificationChannelRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getCode().equals(other.getCode())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.monitoring.v3.VerifyNotificationChannelRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The `VerifyNotificationChannel` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.VerifyNotificationChannelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.VerifyNotificationChannelRequest)
      com.google.monitoring.v3.VerifyNotificationChannelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.VerifyNotificationChannelRequest.class,
              com.google.monitoring.v3.VerifyNotificationChannelRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.VerifyNotificationChannelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      code_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.NotificationServiceProto
          .internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.VerifyNotificationChannelRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.VerifyNotificationChannelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.VerifyNotificationChannelRequest build() {
      com.google.monitoring.v3.VerifyNotificationChannelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.VerifyNotificationChannelRequest buildPartial() {
      com.google.monitoring.v3.VerifyNotificationChannelRequest result =
          new com.google.monitoring.v3.VerifyNotificationChannelRequest(this);
      result.name_ = name_;
      result.code_ = code_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.VerifyNotificationChannelRequest) {
        return mergeFrom((com.google.monitoring.v3.VerifyNotificationChannelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.VerifyNotificationChannelRequest other) {
      if (other == com.google.monitoring.v3.VerifyNotificationChannelRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.VerifyNotificationChannelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.VerifyNotificationChannelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * The notification channel to verify.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The notification channel to verify.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The notification channel to verify.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notification channel to verify.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The notification channel to verify.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object code_ = "";
    /**
     *
     *
     * <pre>
     * The verification code that was delivered to the channel as
     * a result of invoking the `SendNotificationChannelVerificationCode` API
     * method or that was retrieved from a verified channel via
     * `GetNotificationChannelVerificationCode`. For example, one might have
     * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
     * guaranteed that the code is valid UTF-8; one should not
     * make any assumptions regarding the structure or format of the code).
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The verification code that was delivered to the channel as
     * a result of invoking the `SendNotificationChannelVerificationCode` API
     * method or that was retrieved from a verified channel via
     * `GetNotificationChannelVerificationCode`. For example, one might have
     * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
     * guaranteed that the code is valid UTF-8; one should not
     * make any assumptions regarding the structure or format of the code).
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public com.google.protobuf.ByteString getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The verification code that was delivered to the channel as
     * a result of invoking the `SendNotificationChannelVerificationCode` API
     * method or that was retrieved from a verified channel via
     * `GetNotificationChannelVerificationCode`. For example, one might have
     * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
     * guaranteed that the code is valid UTF-8; one should not
     * make any assumptions regarding the structure or format of the code).
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder setCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      code_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The verification code that was delivered to the channel as
     * a result of invoking the `SendNotificationChannelVerificationCode` API
     * method or that was retrieved from a verified channel via
     * `GetNotificationChannelVerificationCode`. For example, one might have
     * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
     * guaranteed that the code is valid UTF-8; one should not
     * make any assumptions regarding the structure or format of the code).
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder clearCode() {

      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The verification code that was delivered to the channel as
     * a result of invoking the `SendNotificationChannelVerificationCode` API
     * method or that was retrieved from a verified channel via
     * `GetNotificationChannelVerificationCode`. For example, one might have
     * "G-123456" or "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only
     * guaranteed that the code is valid UTF-8; one should not
     * make any assumptions regarding the structure or format of the code).
     * </pre>
     *
     * <code>string code = 2;</code>
     */
    public Builder setCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      code_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.VerifyNotificationChannelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.VerifyNotificationChannelRequest)
  private static final com.google.monitoring.v3.VerifyNotificationChannelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.VerifyNotificationChannelRequest();
  }

  public static com.google.monitoring.v3.VerifyNotificationChannelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VerifyNotificationChannelRequest> PARSER =
      new com.google.protobuf.AbstractParser<VerifyNotificationChannelRequest>() {
        @java.lang.Override
        public VerifyNotificationChannelRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VerifyNotificationChannelRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VerifyNotificationChannelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VerifyNotificationChannelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.VerifyNotificationChannelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
