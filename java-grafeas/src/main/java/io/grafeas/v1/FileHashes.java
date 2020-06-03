/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/provenance.proto

package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * Container message for hashes of byte content of files, used in source
 * messages to verify integrity of source input to the build.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.FileHashes}
 */
public final class FileHashes extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.FileHashes)
    FileHashesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FileHashes.newBuilder() to construct.
  private FileHashes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FileHashes() {
    fileHash_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FileHashes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FileHashes(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fileHash_ = new java.util.ArrayList<io.grafeas.v1.Hash>();
                mutable_bitField0_ |= 0x00000001;
              }
              fileHash_.add(input.readMessage(io.grafeas.v1.Hash.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        fileHash_ = java.util.Collections.unmodifiableList(fileHash_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Provenance.internal_static_grafeas_v1_FileHashes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Provenance.internal_static_grafeas_v1_FileHashes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.FileHashes.class, io.grafeas.v1.FileHashes.Builder.class);
  }

  public static final int FILE_HASH_FIELD_NUMBER = 1;
  private java.util.List<io.grafeas.v1.Hash> fileHash_;
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grafeas.v1.Hash> getFileHashList() {
    return fileHash_;
  }
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grafeas.v1.HashOrBuilder> getFileHashOrBuilderList() {
    return fileHash_;
  }
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public int getFileHashCount() {
    return fileHash_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.Hash getFileHash(int index) {
    return fileHash_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Collection of file hashes.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
   */
  @java.lang.Override
  public io.grafeas.v1.HashOrBuilder getFileHashOrBuilder(int index) {
    return fileHash_.get(index);
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
    for (int i = 0; i < fileHash_.size(); i++) {
      output.writeMessage(1, fileHash_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < fileHash_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, fileHash_.get(i));
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
    if (!(obj instanceof io.grafeas.v1.FileHashes)) {
      return super.equals(obj);
    }
    io.grafeas.v1.FileHashes other = (io.grafeas.v1.FileHashes) obj;

    if (!getFileHashList().equals(other.getFileHashList())) return false;
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
    if (getFileHashCount() > 0) {
      hash = (37 * hash) + FILE_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getFileHashList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.FileHashes parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.FileHashes parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.FileHashes parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.FileHashes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.FileHashes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.FileHashes parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.FileHashes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.FileHashes parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.FileHashes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.FileHashes parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.FileHashes parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.FileHashes parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.FileHashes prototype) {
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
   * Container message for hashes of byte content of files, used in source
   * messages to verify integrity of source input to the build.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.FileHashes}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.FileHashes)
      io.grafeas.v1.FileHashesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_FileHashes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_FileHashes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.FileHashes.class, io.grafeas.v1.FileHashes.Builder.class);
    }

    // Construct using io.grafeas.v1.FileHashes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFileHashFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (fileHashBuilder_ == null) {
        fileHash_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        fileHashBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Provenance.internal_static_grafeas_v1_FileHashes_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.FileHashes getDefaultInstanceForType() {
      return io.grafeas.v1.FileHashes.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.FileHashes build() {
      io.grafeas.v1.FileHashes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.FileHashes buildPartial() {
      io.grafeas.v1.FileHashes result = new io.grafeas.v1.FileHashes(this);
      int from_bitField0_ = bitField0_;
      if (fileHashBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          fileHash_ = java.util.Collections.unmodifiableList(fileHash_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.fileHash_ = fileHash_;
      } else {
        result.fileHash_ = fileHashBuilder_.build();
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
      if (other instanceof io.grafeas.v1.FileHashes) {
        return mergeFrom((io.grafeas.v1.FileHashes) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.FileHashes other) {
      if (other == io.grafeas.v1.FileHashes.getDefaultInstance()) return this;
      if (fileHashBuilder_ == null) {
        if (!other.fileHash_.isEmpty()) {
          if (fileHash_.isEmpty()) {
            fileHash_ = other.fileHash_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFileHashIsMutable();
            fileHash_.addAll(other.fileHash_);
          }
          onChanged();
        }
      } else {
        if (!other.fileHash_.isEmpty()) {
          if (fileHashBuilder_.isEmpty()) {
            fileHashBuilder_.dispose();
            fileHashBuilder_ = null;
            fileHash_ = other.fileHash_;
            bitField0_ = (bitField0_ & ~0x00000001);
            fileHashBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFileHashFieldBuilder()
                    : null;
          } else {
            fileHashBuilder_.addAllMessages(other.fileHash_);
          }
        }
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
      io.grafeas.v1.FileHashes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1.FileHashes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<io.grafeas.v1.Hash> fileHash_ = java.util.Collections.emptyList();

    private void ensureFileHashIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fileHash_ = new java.util.ArrayList<io.grafeas.v1.Hash>(fileHash_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Hash, io.grafeas.v1.Hash.Builder, io.grafeas.v1.HashOrBuilder>
        fileHashBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Hash> getFileHashList() {
      if (fileHashBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fileHash_);
      } else {
        return fileHashBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public int getFileHashCount() {
      if (fileHashBuilder_ == null) {
        return fileHash_.size();
      } else {
        return fileHashBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public io.grafeas.v1.Hash getFileHash(int index) {
      if (fileHashBuilder_ == null) {
        return fileHash_.get(index);
      } else {
        return fileHashBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder setFileHash(int index, io.grafeas.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.set(index, value);
        onChanged();
      } else {
        fileHashBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder setFileHash(int index, io.grafeas.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.set(index, builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(io.grafeas.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.add(value);
        onChanged();
      } else {
        fileHashBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(int index, io.grafeas.v1.Hash value) {
      if (fileHashBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFileHashIsMutable();
        fileHash_.add(index, value);
        onChanged();
      } else {
        fileHashBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(io.grafeas.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.add(builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder addFileHash(int index, io.grafeas.v1.Hash.Builder builderForValue) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.add(index, builderForValue.build());
        onChanged();
      } else {
        fileHashBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder addAllFileHash(java.lang.Iterable<? extends io.grafeas.v1.Hash> values) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, fileHash_);
        onChanged();
      } else {
        fileHashBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder clearFileHash() {
      if (fileHashBuilder_ == null) {
        fileHash_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        fileHashBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public Builder removeFileHash(int index) {
      if (fileHashBuilder_ == null) {
        ensureFileHashIsMutable();
        fileHash_.remove(index);
        onChanged();
      } else {
        fileHashBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public io.grafeas.v1.Hash.Builder getFileHashBuilder(int index) {
      return getFileHashFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public io.grafeas.v1.HashOrBuilder getFileHashOrBuilder(int index) {
      if (fileHashBuilder_ == null) {
        return fileHash_.get(index);
      } else {
        return fileHashBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<? extends io.grafeas.v1.HashOrBuilder> getFileHashOrBuilderList() {
      if (fileHashBuilder_ != null) {
        return fileHashBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fileHash_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public io.grafeas.v1.Hash.Builder addFileHashBuilder() {
      return getFileHashFieldBuilder().addBuilder(io.grafeas.v1.Hash.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public io.grafeas.v1.Hash.Builder addFileHashBuilder(int index) {
      return getFileHashFieldBuilder().addBuilder(index, io.grafeas.v1.Hash.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Collection of file hashes.
     * </pre>
     *
     * <code>repeated .grafeas.v1.Hash file_hash = 1;</code>
     */
    public java.util.List<io.grafeas.v1.Hash.Builder> getFileHashBuilderList() {
      return getFileHashFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            io.grafeas.v1.Hash, io.grafeas.v1.Hash.Builder, io.grafeas.v1.HashOrBuilder>
        getFileHashFieldBuilder() {
      if (fileHashBuilder_ == null) {
        fileHashBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                io.grafeas.v1.Hash, io.grafeas.v1.Hash.Builder, io.grafeas.v1.HashOrBuilder>(
                fileHash_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        fileHash_ = null;
      }
      return fileHashBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.FileHashes)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.FileHashes)
  private static final io.grafeas.v1.FileHashes DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.FileHashes();
  }

  public static io.grafeas.v1.FileHashes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileHashes> PARSER =
      new com.google.protobuf.AbstractParser<FileHashes>() {
        @java.lang.Override
        public FileHashes parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FileHashes(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FileHashes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileHashes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.FileHashes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
