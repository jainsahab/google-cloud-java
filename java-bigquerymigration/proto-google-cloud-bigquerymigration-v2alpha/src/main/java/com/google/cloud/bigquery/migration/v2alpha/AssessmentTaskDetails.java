/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/migration/v2alpha/assessment_task.proto

package com.google.cloud.bigquery.migration.v2alpha;

/**
 *
 *
 * <pre>
 * Assessment task config.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails}
 */
public final class AssessmentTaskDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
    AssessmentTaskDetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AssessmentTaskDetails.newBuilder() to construct.
  private AssessmentTaskDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AssessmentTaskDetails() {
    inputPath_ = "";
    outputDataset_ = "";
    querylogsPath_ = "";
    dataSource_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AssessmentTaskDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AssessmentTaskDetails(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

              inputPath_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              outputDataset_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              querylogsPath_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              dataSource_ = s;
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
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
        .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.class,
            com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.Builder.class);
  }

  public static final int INPUT_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object inputPath_;
  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage path for assessment input files.
   * </pre>
   *
   * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputPath.
   */
  @java.lang.Override
  public java.lang.String getInputPath() {
    java.lang.Object ref = inputPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The Cloud Storage path for assessment input files.
   * </pre>
   *
   * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInputPathBytes() {
    java.lang.Object ref = inputPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      inputPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OUTPUT_DATASET_FIELD_NUMBER = 2;
  private volatile java.lang.Object outputDataset_;
  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset for output.
   * </pre>
   *
   * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The outputDataset.
   */
  @java.lang.Override
  public java.lang.String getOutputDataset() {
    java.lang.Object ref = outputDataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputDataset_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The BigQuery dataset for output.
   * </pre>
   *
   * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for outputDataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOutputDatasetBytes() {
    java.lang.Object ref = outputDataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      outputDataset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUERYLOGS_PATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object querylogsPath_;
  /**
   *
   *
   * <pre>
   * Optional. An optional Cloud Storage path to write the query logs (which is
   * then used as an input path on the translation task)
   * </pre>
   *
   * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The querylogsPath.
   */
  @java.lang.Override
  public java.lang.String getQuerylogsPath() {
    java.lang.Object ref = querylogsPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      querylogsPath_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. An optional Cloud Storage path to write the query logs (which is
   * then used as an input path on the translation task)
   * </pre>
   *
   * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for querylogsPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getQuerylogsPathBytes() {
    java.lang.Object ref = querylogsPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      querylogsPath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_SOURCE_FIELD_NUMBER = 4;
  private volatile java.lang.Object dataSource_;
  /**
   *
   *
   * <pre>
   * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
   * from which the input data is extracted.
   * </pre>
   *
   * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataSource.
   */
  @java.lang.Override
  public java.lang.String getDataSource() {
    java.lang.Object ref = dataSource_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSource_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
   * from which the input data is extracted.
   * </pre>
   *
   * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataSource.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDataSourceBytes() {
    java.lang.Object ref = dataSource_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dataSource_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputDataset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, outputDataset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(querylogsPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, querylogsPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSource_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dataSource_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inputPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputDataset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, outputDataset_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(querylogsPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, querylogsPath_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dataSource_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dataSource_);
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails other =
        (com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails) obj;

    if (!getInputPath().equals(other.getInputPath())) return false;
    if (!getOutputDataset().equals(other.getOutputDataset())) return false;
    if (!getQuerylogsPath().equals(other.getQuerylogsPath())) return false;
    if (!getDataSource().equals(other.getDataSource())) return false;
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
    hash = (37 * hash) + INPUT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getInputPath().hashCode();
    hash = (37 * hash) + OUTPUT_DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getOutputDataset().hashCode();
    hash = (37 * hash) + QUERYLOGS_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getQuerylogsPath().hashCode();
    hash = (37 * hash) + DATA_SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getDataSource().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parseFrom(
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
      com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails prototype) {
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
   * Assessment task config.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
      com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.class,
              com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.newBuilder()
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
      inputPath_ = "";

      outputDataset_ = "";

      querylogsPath_ = "";

      dataSource_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskProto
          .internal_static_google_cloud_bigquery_migration_v2alpha_AssessmentTaskDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails build() {
      com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails buildPartial() {
      com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails result =
          new com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails(this);
      result.inputPath_ = inputPath_;
      result.outputDataset_ = outputDataset_;
      result.querylogsPath_ = querylogsPath_;
      result.dataSource_ = dataSource_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails other) {
      if (other
          == com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails.getDefaultInstance())
        return this;
      if (!other.getInputPath().isEmpty()) {
        inputPath_ = other.inputPath_;
        onChanged();
      }
      if (!other.getOutputDataset().isEmpty()) {
        outputDataset_ = other.outputDataset_;
        onChanged();
      }
      if (!other.getQuerylogsPath().isEmpty()) {
        querylogsPath_ = other.querylogsPath_;
        onChanged();
      }
      if (!other.getDataSource().isEmpty()) {
        dataSource_ = other.dataSource_;
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
      com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inputPath_ = "";
    /**
     *
     *
     * <pre>
     * Required. The Cloud Storage path for assessment input files.
     * </pre>
     *
     * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The inputPath.
     */
    public java.lang.String getInputPath() {
      java.lang.Object ref = inputPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Storage path for assessment input files.
     * </pre>
     *
     * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for inputPath.
     */
    public com.google.protobuf.ByteString getInputPathBytes() {
      java.lang.Object ref = inputPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        inputPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Storage path for assessment input files.
     * </pre>
     *
     * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The inputPath to set.
     * @return This builder for chaining.
     */
    public Builder setInputPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      inputPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Storage path for assessment input files.
     * </pre>
     *
     * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInputPath() {

      inputPath_ = getDefaultInstance().getInputPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Cloud Storage path for assessment input files.
     * </pre>
     *
     * <code>string input_path = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for inputPath to set.
     * @return This builder for chaining.
     */
    public Builder setInputPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      inputPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object outputDataset_ = "";
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset for output.
     * </pre>
     *
     * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The outputDataset.
     */
    public java.lang.String getOutputDataset() {
      java.lang.Object ref = outputDataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputDataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset for output.
     * </pre>
     *
     * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for outputDataset.
     */
    public com.google.protobuf.ByteString getOutputDatasetBytes() {
      java.lang.Object ref = outputDataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        outputDataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset for output.
     * </pre>
     *
     * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The outputDataset to set.
     * @return This builder for chaining.
     */
    public Builder setOutputDataset(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      outputDataset_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset for output.
     * </pre>
     *
     * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOutputDataset() {

      outputDataset_ = getDefaultInstance().getOutputDataset();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The BigQuery dataset for output.
     * </pre>
     *
     * <code>string output_dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for outputDataset to set.
     * @return This builder for chaining.
     */
    public Builder setOutputDatasetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      outputDataset_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object querylogsPath_ = "";
    /**
     *
     *
     * <pre>
     * Optional. An optional Cloud Storage path to write the query logs (which is
     * then used as an input path on the translation task)
     * </pre>
     *
     * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The querylogsPath.
     */
    public java.lang.String getQuerylogsPath() {
      java.lang.Object ref = querylogsPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        querylogsPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional Cloud Storage path to write the query logs (which is
     * then used as an input path on the translation task)
     * </pre>
     *
     * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for querylogsPath.
     */
    public com.google.protobuf.ByteString getQuerylogsPathBytes() {
      java.lang.Object ref = querylogsPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        querylogsPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional Cloud Storage path to write the query logs (which is
     * then used as an input path on the translation task)
     * </pre>
     *
     * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The querylogsPath to set.
     * @return This builder for chaining.
     */
    public Builder setQuerylogsPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      querylogsPath_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional Cloud Storage path to write the query logs (which is
     * then used as an input path on the translation task)
     * </pre>
     *
     * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearQuerylogsPath() {

      querylogsPath_ = getDefaultInstance().getQuerylogsPath();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. An optional Cloud Storage path to write the query logs (which is
     * then used as an input path on the translation task)
     * </pre>
     *
     * <code>string querylogs_path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for querylogsPath to set.
     * @return This builder for chaining.
     */
    public Builder setQuerylogsPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      querylogsPath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dataSource_ = "";
    /**
     *
     *
     * <pre>
     * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
     * from which the input data is extracted.
     * </pre>
     *
     * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The dataSource.
     */
    public java.lang.String getDataSource() {
      java.lang.Object ref = dataSource_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSource_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
     * from which the input data is extracted.
     * </pre>
     *
     * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for dataSource.
     */
    public com.google.protobuf.ByteString getDataSourceBytes() {
      java.lang.Object ref = dataSource_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dataSource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
     * from which the input data is extracted.
     * </pre>
     *
     * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The dataSource to set.
     * @return This builder for chaining.
     */
    public Builder setDataSource(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      dataSource_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
     * from which the input data is extracted.
     * </pre>
     *
     * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataSource() {

      dataSource_ = getDefaultInstance().getDataSource();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The data source or data warehouse type (eg: TERADATA/REDSHIFT)
     * from which the input data is extracted.
     * </pre>
     *
     * <code>string data_source = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for dataSource to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      dataSource_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails)
  private static final com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails();
  }

  public static com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssessmentTaskDetails> PARSER =
      new com.google.protobuf.AbstractParser<AssessmentTaskDetails>() {
        @java.lang.Override
        public AssessmentTaskDetails parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AssessmentTaskDetails(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AssessmentTaskDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssessmentTaskDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2alpha.AssessmentTaskDetails
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
