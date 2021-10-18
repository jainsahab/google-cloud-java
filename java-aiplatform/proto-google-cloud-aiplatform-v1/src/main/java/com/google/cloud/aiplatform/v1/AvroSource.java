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
// source: google/cloud/aiplatform/v1/io.proto

package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * The storage details for Avro input content.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.AvroSource}
 */
public final class AvroSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.AvroSource)
    AvroSourceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AvroSource.newBuilder() to construct.
  private AvroSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AvroSource() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AvroSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AvroSource(
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
              com.google.cloud.aiplatform.v1.GcsSource.Builder subBuilder = null;
              if (gcsSource_ != null) {
                subBuilder = gcsSource_.toBuilder();
              }
              gcsSource_ =
                  input.readMessage(
                      com.google.cloud.aiplatform.v1.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gcsSource_);
                gcsSource_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.aiplatform.v1.IoProto
        .internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.IoProto
        .internal_static_google_cloud_aiplatform_v1_AvroSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.AvroSource.class,
            com.google.cloud.aiplatform.v1.AvroSource.Builder.class);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.GcsSource gcsSource_;
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gcsSource field is set.
   */
  @java.lang.Override
  public boolean hasGcsSource() {
    return gcsSource_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gcsSource.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GcsSource getGcsSource() {
    return gcsSource_ == null
        ? com.google.cloud.aiplatform.v1.GcsSource.getDefaultInstance()
        : gcsSource_;
  }
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    return getGcsSource();
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
    if (gcsSource_ != null) {
      output.writeMessage(1, getGcsSource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gcsSource_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGcsSource());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.AvroSource)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.AvroSource other =
        (com.google.cloud.aiplatform.v1.AvroSource) obj;

    if (hasGcsSource() != other.hasGcsSource()) return false;
    if (hasGcsSource()) {
      if (!getGcsSource().equals(other.getGcsSource())) return false;
    }
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
    if (hasGcsSource()) {
      hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getGcsSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.AvroSource parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.AvroSource prototype) {
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
   * The storage details for Avro input content.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.AvroSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.AvroSource)
      com.google.cloud.aiplatform.v1.AvroSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.IoProto
          .internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.IoProto
          .internal_static_google_cloud_aiplatform_v1_AvroSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.AvroSource.class,
              com.google.cloud.aiplatform.v1.AvroSource.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.AvroSource.newBuilder()
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
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.IoProto
          .internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AvroSource getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.AvroSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AvroSource build() {
      com.google.cloud.aiplatform.v1.AvroSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.AvroSource buildPartial() {
      com.google.cloud.aiplatform.v1.AvroSource result =
          new com.google.cloud.aiplatform.v1.AvroSource(this);
      if (gcsSourceBuilder_ == null) {
        result.gcsSource_ = gcsSource_;
      } else {
        result.gcsSource_ = gcsSourceBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1.AvroSource) {
        return mergeFrom((com.google.cloud.aiplatform.v1.AvroSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.AvroSource other) {
      if (other == com.google.cloud.aiplatform.v1.AvroSource.getDefaultInstance()) return this;
      if (other.hasGcsSource()) {
        mergeGcsSource(other.getGcsSource());
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
      com.google.cloud.aiplatform.v1.AvroSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.aiplatform.v1.AvroSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.aiplatform.v1.GcsSource gcsSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GcsSource,
            com.google.cloud.aiplatform.v1.GcsSource.Builder,
            com.google.cloud.aiplatform.v1.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the gcsSource field is set.
     */
    public boolean hasGcsSource() {
      return gcsSourceBuilder_ != null || gcsSource_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The gcsSource.
     */
    public com.google.cloud.aiplatform.v1.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        return gcsSource_ == null
            ? com.google.cloud.aiplatform.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      } else {
        return gcsSourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcsSource(com.google.cloud.aiplatform.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gcsSource_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGcsSource(com.google.cloud.aiplatform.v1.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGcsSource(com.google.cloud.aiplatform.v1.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (gcsSource_ != null) {
          gcsSource_ =
              com.google.cloud.aiplatform.v1.GcsSource.newBuilder(gcsSource_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gcsSource_ = value;
        }
        onChanged();
      } else {
        gcsSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        gcsSource_ = null;
        onChanged();
      } else {
        gcsSource_ = null;
        gcsSourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.GcsSource.Builder getGcsSourceBuilder() {

      onChanged();
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if (gcsSourceBuilder_ != null) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        return gcsSource_ == null
            ? com.google.cloud.aiplatform.v1.GcsSource.getDefaultInstance()
            : gcsSource_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.GcsSource gcs_source = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.GcsSource,
            com.google.cloud.aiplatform.v1.GcsSource.Builder,
            com.google.cloud.aiplatform.v1.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.GcsSource,
                com.google.cloud.aiplatform.v1.GcsSource.Builder,
                com.google.cloud.aiplatform.v1.GcsSourceOrBuilder>(
                getGcsSource(), getParentForChildren(), isClean());
        gcsSource_ = null;
      }
      return gcsSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.AvroSource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.AvroSource)
  private static final com.google.cloud.aiplatform.v1.AvroSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.AvroSource();
  }

  public static com.google.cloud.aiplatform.v1.AvroSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvroSource> PARSER =
      new com.google.protobuf.AbstractParser<AvroSource>() {
        @java.lang.Override
        public AvroSource parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AvroSource(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AvroSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvroSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.AvroSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
