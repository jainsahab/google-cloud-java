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

public final class IoProto {
  private IoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AvroSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CsvSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CsvSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CsvDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CsvDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TFRecordDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ContainerRegistryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ContainerRegistryDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/aiplatform/v1/io.proto\022\032g"
          + "oogle.cloud.aiplatform.v1\032\037google/api/fi"
          + "eld_behavior.proto\032\034google/api/annotatio"
          + "ns.proto\"L\n\nAvroSource\022>\n\ngcs_source\030\001 \001"
          + "(\0132%.google.cloud.aiplatform.v1.GcsSourc"
          + "eB\003\340A\002\"K\n\tCsvSource\022>\n\ngcs_source\030\001 \001(\0132"
          + "%.google.cloud.aiplatform.v1.GcsSourceB\003"
          + "\340A\002\"\036\n\tGcsSource\022\021\n\004uris\030\001 \003(\tB\003\340A\002\"0\n\016G"
          + "csDestination\022\036\n\021output_uri_prefix\030\001 \001(\t"
          + "B\003\340A\002\"(\n\016BigQuerySource\022\026\n\tinput_uri\030\001 \001"
          + "(\tB\003\340A\002\".\n\023BigQueryDestination\022\027\n\noutput"
          + "_uri\030\001 \001(\tB\003\340A\002\"Z\n\016CsvDestination\022H\n\017gcs"
          + "_destination\030\001 \001(\0132*.google.cloud.aiplat"
          + "form.v1.GcsDestinationB\003\340A\002\"_\n\023TFRecordD"
          + "estination\022H\n\017gcs_destination\030\001 \001(\0132*.go"
          + "ogle.cloud.aiplatform.v1.GcsDestinationB"
          + "\003\340A\002\"7\n\034ContainerRegistryDestination\022\027\n\n"
          + "output_uri\030\001 \001(\tB\003\340A\002B\313\001\n\036com.google.clo"
          + "ud.aiplatform.v1B\007IoProtoP\001ZDgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/aiplatf"
          + "orm/v1;aiplatform\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_AvroSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_AvroSource_descriptor,
            new java.lang.String[] {
              "GcsSource",
            });
    internal_static_google_cloud_aiplatform_v1_CsvSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CsvSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CsvSource_descriptor,
            new java.lang.String[] {
              "GcsSource",
            });
    internal_static_google_cloud_aiplatform_v1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GcsSource_descriptor,
            new java.lang.String[] {
              "Uris",
            });
    internal_static_google_cloud_aiplatform_v1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUriPrefix",
            });
    internal_static_google_cloud_aiplatform_v1_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BigQuerySource_descriptor,
            new java.lang.String[] {
              "InputUri",
            });
    internal_static_google_cloud_aiplatform_v1_BigQueryDestination_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    internal_static_google_cloud_aiplatform_v1_CsvDestination_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_CsvDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CsvDestination_descriptor,
            new java.lang.String[] {
              "GcsDestination",
            });
    internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_TFRecordDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TFRecordDestination_descriptor,
            new java.lang.String[] {
              "GcsDestination",
            });
    internal_static_google_cloud_aiplatform_v1_ContainerRegistryDestination_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_ContainerRegistryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ContainerRegistryDestination_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
