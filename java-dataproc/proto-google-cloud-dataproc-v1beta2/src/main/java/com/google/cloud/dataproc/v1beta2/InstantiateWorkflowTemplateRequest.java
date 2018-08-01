// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 * <pre>
 * A request to instantiate a workflow template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest}
 */
public  final class InstantiateWorkflowTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)
    InstantiateWorkflowTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InstantiateWorkflowTemplateRequest.newBuilder() to construct.
  private InstantiateWorkflowTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InstantiateWorkflowTemplateRequest() {
    name_ = "";
    version_ = 0;
    instanceId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InstantiateWorkflowTemplateRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            version_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            instanceId_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_InstantiateWorkflowTemplateRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_InstantiateWorkflowTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The "resource name" of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The "resource name" of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <pre>
   * Optional. The version of workflow template to instantiate. If specified,
   * the workflow will be instantiated only if the current version of
   * the workflow template has the supplied version.
   * This option cannot be used to instantiate a previous version of
   * workflow template.
   * </pre>
   *
   * <code>int32 version = 2;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int INSTANCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object instanceId_;
  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string instance_id = 3;</code>
   */
  public java.lang.String getInstanceId() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instanceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A tag that prevents multiple concurrent workflow
   * instances with the same tag from running. This mitigates risk of
   * concurrent instances started due to retries.
   * It is recommended to always set this value to a
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
   * The tag must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). The maximum length is 40 characters.
   * </pre>
   *
   * <code>string instance_id = 3;</code>
   */
  public com.google.protobuf.ByteString
      getInstanceIdBytes() {
    java.lang.Object ref = instanceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instanceId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (version_ != 0) {
      output.writeInt32(2, version_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, instanceId_);
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
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
    }
    if (!getInstanceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, instanceId_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest other = (com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getVersion()
        == other.getVersion());
    result = result && getInstanceId()
        .equals(other.getInstanceId());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + INSTANCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getInstanceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * A request to instantiate a workflow template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)
      com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_InstantiateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_InstantiateWorkflowTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      version_ = 0;

      instanceId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_InstantiateWorkflowTemplateRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest build() {
      com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest buildPartial() {
      com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest result = new com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest(this);
      result.name_ = name_;
      result.version_ = version_;
      result.instanceId_ = instanceId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest other) {
      if (other == com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (!other.getInstanceId().isEmpty()) {
        instanceId_ = other.instanceId_;
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
      com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest) e.getUnfinishedMessage();
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
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
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
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * Optional. The version of workflow template to instantiate. If specified,
     * the workflow will be instantiated only if the current version of
     * the workflow template has the supplied version.
     * This option cannot be used to instantiate a previous version of
     * workflow template.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Optional. The version of workflow template to instantiate. If specified,
     * the workflow will be instantiated only if the current version of
     * the workflow template has the supplied version.
     * This option cannot be used to instantiate a previous version of
     * workflow template.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of workflow template to instantiate. If specified,
     * the workflow will be instantiated only if the current version of
     * the workflow template has the supplied version.
     * This option cannot be used to instantiate a previous version of
     * workflow template.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object instanceId_ = "";
    /**
     * <pre>
     * Optional. A tag that prevents multiple concurrent workflow
     * instances with the same tag from running. This mitigates risk of
     * concurrent instances started due to retries.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The tag must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string instance_id = 3;</code>
     */
    public java.lang.String getInstanceId() {
      java.lang.Object ref = instanceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instanceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A tag that prevents multiple concurrent workflow
     * instances with the same tag from running. This mitigates risk of
     * concurrent instances started due to retries.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The tag must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string instance_id = 3;</code>
     */
    public com.google.protobuf.ByteString
        getInstanceIdBytes() {
      java.lang.Object ref = instanceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instanceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A tag that prevents multiple concurrent workflow
     * instances with the same tag from running. This mitigates risk of
     * concurrent instances started due to retries.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The tag must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string instance_id = 3;</code>
     */
    public Builder setInstanceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A tag that prevents multiple concurrent workflow
     * instances with the same tag from running. This mitigates risk of
     * concurrent instances started due to retries.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The tag must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string instance_id = 3;</code>
     */
    public Builder clearInstanceId() {
      
      instanceId_ = getDefaultInstance().getInstanceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A tag that prevents multiple concurrent workflow
     * instances with the same tag from running. This mitigates risk of
     * concurrent instances started due to retries.
     * It is recommended to always set this value to a
     * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier).
     * The tag must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). The maximum length is 40 characters.
     * </pre>
     *
     * <code>string instance_id = 3;</code>
     */
    public Builder setInstanceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instanceId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest)
  private static final com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest();
  }

  public static com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstantiateWorkflowTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<InstantiateWorkflowTemplateRequest>() {
    @java.lang.Override
    public InstantiateWorkflowTemplateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InstantiateWorkflowTemplateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InstantiateWorkflowTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstantiateWorkflowTemplateRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1beta2.InstantiateWorkflowTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

