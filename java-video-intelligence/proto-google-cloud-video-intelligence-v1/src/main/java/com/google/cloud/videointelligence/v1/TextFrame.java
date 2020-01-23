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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

/**
 *
 *
 * <pre>
 * Video frame level annotation results for text annotation (OCR).
 * Contains information regarding timestamp and bounding box locations for the
 * frames containing detected OCR text snippets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1.TextFrame}
 */
public final class TextFrame extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1.TextFrame)
    TextFrameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TextFrame.newBuilder() to construct.
  private TextFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TextFrame() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TextFrame();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TextFrame(
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
              com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder subBuilder =
                  null;
              if (rotatedBoundingBox_ != null) {
                subBuilder = rotatedBoundingBox_.toBuilder();
              }
              rotatedBoundingBox_ =
                  input.readMessage(
                      com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rotatedBoundingBox_);
                rotatedBoundingBox_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (timeOffset_ != null) {
                subBuilder = timeOffset_.toBuilder();
              }
              timeOffset_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timeOffset_);
                timeOffset_ = subBuilder.buildPartial();
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
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_TextFrame_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1_TextFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1.TextFrame.class,
            com.google.cloud.videointelligence.v1.TextFrame.Builder.class);
  }

  public static final int ROTATED_BOUNDING_BOX_FIELD_NUMBER = 1;
  private com.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotatedBoundingBox_;
  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   *
   * @return Whether the rotatedBoundingBox field is set.
   */
  public boolean hasRotatedBoundingBox() {
    return rotatedBoundingBox_ != null;
  }
  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   *
   * @return The rotatedBoundingBox.
   */
  public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly getRotatedBoundingBox() {
    return rotatedBoundingBox_ == null
        ? com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.getDefaultInstance()
        : rotatedBoundingBox_;
  }
  /**
   *
   *
   * <pre>
   * Bounding polygon of the detected text for this frame.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
   * </code>
   */
  public com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder
      getRotatedBoundingBoxOrBuilder() {
    return getRotatedBoundingBox();
  }

  public static final int TIME_OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration timeOffset_;
  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return Whether the timeOffset field is set.
   */
  public boolean hasTimeOffset() {
    return timeOffset_ != null;
  }
  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   *
   * @return The timeOffset.
   */
  public com.google.protobuf.Duration getTimeOffset() {
    return timeOffset_ == null ? com.google.protobuf.Duration.getDefaultInstance() : timeOffset_;
  }
  /**
   *
   *
   * <pre>
   * Timestamp of this frame.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
    return getTimeOffset();
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
    if (rotatedBoundingBox_ != null) {
      output.writeMessage(1, getRotatedBoundingBox());
    }
    if (timeOffset_ != null) {
      output.writeMessage(2, getTimeOffset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rotatedBoundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRotatedBoundingBox());
    }
    if (timeOffset_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTimeOffset());
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1.TextFrame)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1.TextFrame other =
        (com.google.cloud.videointelligence.v1.TextFrame) obj;

    if (hasRotatedBoundingBox() != other.hasRotatedBoundingBox()) return false;
    if (hasRotatedBoundingBox()) {
      if (!getRotatedBoundingBox().equals(other.getRotatedBoundingBox())) return false;
    }
    if (hasTimeOffset() != other.hasTimeOffset()) return false;
    if (hasTimeOffset()) {
      if (!getTimeOffset().equals(other.getTimeOffset())) return false;
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
    if (hasRotatedBoundingBox()) {
      hash = (37 * hash) + ROTATED_BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getRotatedBoundingBox().hashCode();
    }
    if (hasTimeOffset()) {
      hash = (37 * hash) + TIME_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getTimeOffset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1.TextFrame parseFrom(
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

  public static Builder newBuilder(com.google.cloud.videointelligence.v1.TextFrame prototype) {
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
   * Video frame level annotation results for text annotation (OCR).
   * Contains information regarding timestamp and bounding box locations for the
   * frames containing detected OCR text snippets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1.TextFrame}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1.TextFrame)
      com.google.cloud.videointelligence.v1.TextFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_TextFrame_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_TextFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1.TextFrame.class,
              com.google.cloud.videointelligence.v1.TextFrame.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1.TextFrame.newBuilder()
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
      if (rotatedBoundingBoxBuilder_ == null) {
        rotatedBoundingBox_ = null;
      } else {
        rotatedBoundingBox_ = null;
        rotatedBoundingBoxBuilder_ = null;
      }
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = null;
      } else {
        timeOffset_ = null;
        timeOffsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1_TextFrame_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextFrame getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1.TextFrame.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextFrame build() {
      com.google.cloud.videointelligence.v1.TextFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1.TextFrame buildPartial() {
      com.google.cloud.videointelligence.v1.TextFrame result =
          new com.google.cloud.videointelligence.v1.TextFrame(this);
      if (rotatedBoundingBoxBuilder_ == null) {
        result.rotatedBoundingBox_ = rotatedBoundingBox_;
      } else {
        result.rotatedBoundingBox_ = rotatedBoundingBoxBuilder_.build();
      }
      if (timeOffsetBuilder_ == null) {
        result.timeOffset_ = timeOffset_;
      } else {
        result.timeOffset_ = timeOffsetBuilder_.build();
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
      if (other instanceof com.google.cloud.videointelligence.v1.TextFrame) {
        return mergeFrom((com.google.cloud.videointelligence.v1.TextFrame) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1.TextFrame other) {
      if (other == com.google.cloud.videointelligence.v1.TextFrame.getDefaultInstance())
        return this;
      if (other.hasRotatedBoundingBox()) {
        mergeRotatedBoundingBox(other.getRotatedBoundingBox());
      }
      if (other.hasTimeOffset()) {
        mergeTimeOffset(other.getTimeOffset());
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
      com.google.cloud.videointelligence.v1.TextFrame parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.videointelligence.v1.TextFrame) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotatedBoundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly,
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder>
        rotatedBoundingBoxBuilder_;
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     *
     * @return Whether the rotatedBoundingBox field is set.
     */
    public boolean hasRotatedBoundingBox() {
      return rotatedBoundingBoxBuilder_ != null || rotatedBoundingBox_ != null;
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     *
     * @return The rotatedBoundingBox.
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly getRotatedBoundingBox() {
      if (rotatedBoundingBoxBuilder_ == null) {
        return rotatedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.getDefaultInstance()
            : rotatedBoundingBox_;
      } else {
        return rotatedBoundingBoxBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public Builder setRotatedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingPoly value) {
      if (rotatedBoundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rotatedBoundingBox_ = value;
        onChanged();
      } else {
        rotatedBoundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public Builder setRotatedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder builderForValue) {
      if (rotatedBoundingBoxBuilder_ == null) {
        rotatedBoundingBox_ = builderForValue.build();
        onChanged();
      } else {
        rotatedBoundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public Builder mergeRotatedBoundingBox(
        com.google.cloud.videointelligence.v1.NormalizedBoundingPoly value) {
      if (rotatedBoundingBoxBuilder_ == null) {
        if (rotatedBoundingBox_ != null) {
          rotatedBoundingBox_ =
              com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.newBuilder(
                      rotatedBoundingBox_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          rotatedBoundingBox_ = value;
        }
        onChanged();
      } else {
        rotatedBoundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public Builder clearRotatedBoundingBox() {
      if (rotatedBoundingBoxBuilder_ == null) {
        rotatedBoundingBox_ = null;
        onChanged();
      } else {
        rotatedBoundingBox_ = null;
        rotatedBoundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder
        getRotatedBoundingBoxBuilder() {

      onChanged();
      return getRotatedBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    public com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder
        getRotatedBoundingBoxOrBuilder() {
      if (rotatedBoundingBoxBuilder_ != null) {
        return rotatedBoundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return rotatedBoundingBox_ == null
            ? com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.getDefaultInstance()
            : rotatedBoundingBox_;
      }
    }
    /**
     *
     *
     * <pre>
     * Bounding polygon of the detected text for this frame.
     * </pre>
     *
     * <code>.google.cloud.videointelligence.v1.NormalizedBoundingPoly rotated_bounding_box = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly,
            com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder,
            com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder>
        getRotatedBoundingBoxFieldBuilder() {
      if (rotatedBoundingBoxBuilder_ == null) {
        rotatedBoundingBoxBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.videointelligence.v1.NormalizedBoundingPoly,
                com.google.cloud.videointelligence.v1.NormalizedBoundingPoly.Builder,
                com.google.cloud.videointelligence.v1.NormalizedBoundingPolyOrBuilder>(
                getRotatedBoundingBox(), getParentForChildren(), isClean());
        rotatedBoundingBox_ = null;
      }
      return rotatedBoundingBoxBuilder_;
    }

    private com.google.protobuf.Duration timeOffset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        timeOffsetBuilder_;
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     *
     * @return Whether the timeOffset field is set.
     */
    public boolean hasTimeOffset() {
      return timeOffsetBuilder_ != null || timeOffset_ != null;
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     *
     * @return The timeOffset.
     */
    public com.google.protobuf.Duration getTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      } else {
        return timeOffsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeOffset_ = value;
        onChanged();
      } else {
        timeOffsetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder setTimeOffset(com.google.protobuf.Duration.Builder builderForValue) {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = builderForValue.build();
        onChanged();
      } else {
        timeOffsetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder mergeTimeOffset(com.google.protobuf.Duration value) {
      if (timeOffsetBuilder_ == null) {
        if (timeOffset_ != null) {
          timeOffset_ =
              com.google.protobuf.Duration.newBuilder(timeOffset_).mergeFrom(value).buildPartial();
        } else {
          timeOffset_ = value;
        }
        onChanged();
      } else {
        timeOffsetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public Builder clearTimeOffset() {
      if (timeOffsetBuilder_ == null) {
        timeOffset_ = null;
        onChanged();
      } else {
        timeOffset_ = null;
        timeOffsetBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getTimeOffsetBuilder() {

      onChanged();
      return getTimeOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder() {
      if (timeOffsetBuilder_ != null) {
        return timeOffsetBuilder_.getMessageOrBuilder();
      } else {
        return timeOffset_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : timeOffset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Timestamp of this frame.
     * </pre>
     *
     * <code>.google.protobuf.Duration time_offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getTimeOffsetFieldBuilder() {
      if (timeOffsetBuilder_ == null) {
        timeOffsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getTimeOffset(), getParentForChildren(), isClean());
        timeOffset_ = null;
      }
      return timeOffsetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1.TextFrame)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1.TextFrame)
  private static final com.google.cloud.videointelligence.v1.TextFrame DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1.TextFrame();
  }

  public static com.google.cloud.videointelligence.v1.TextFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextFrame> PARSER =
      new com.google.protobuf.AbstractParser<TextFrame>() {
        @java.lang.Override
        public TextFrame parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TextFrame(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TextFrame> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextFrame> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1.TextFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
