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
// source: google/cloud/tasks/v2beta2/target.proto

package com.google.cloud.tasks.v2beta2;

public final class TargetProto {
  private TargetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_PullTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/tasks/v2beta2/target.prot"
          + "o\022\032google.cloud.tasks.v2beta2\"\014\n\nPullTar"
          + "get\"+\n\013PullMessage\022\017\n\007payload\030\001 \001(\014\022\013\n\003t"
          + "ag\030\002 \001(\t\"h\n\023AppEngineHttpTarget\022Q\n\033app_e"
          + "ngine_routing_override\030\001 \001(\0132,.google.cl"
          + "oud.tasks.v2beta2.AppEngineRouting\"\304\002\n\024A"
          + "ppEngineHttpRequest\022;\n\013http_method\030\001 \001(\016"
          + "2&.google.cloud.tasks.v2beta2.HttpMethod"
          + "\022H\n\022app_engine_routing\030\002 \001(\0132,.google.cl"
          + "oud.tasks.v2beta2.AppEngineRouting\022\024\n\014re"
          + "lative_url\030\003 \001(\t\022N\n\007headers\030\004 \003(\0132=.goog"
          + "le.cloud.tasks.v2beta2.AppEngineHttpRequ"
          + "est.HeadersEntry\022\017\n\007payload\030\005 \001(\014\032.\n\014Hea"
          + "dersEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"T\n\020AppEngineRouting\022\017\n\007service\030\001 \001(\t\022\017"
          + "\n\007version\030\002 \001(\t\022\020\n\010instance\030\003 \001(\t\022\014\n\004hos"
          + "t\030\004 \001(\t*[\n\nHttpMethod\022\033\n\027HTTP_METHOD_UNS"
          + "PECIFIED\020\000\022\010\n\004POST\020\001\022\007\n\003GET\020\002\022\010\n\004HEAD\020\003\022"
          + "\007\n\003PUT\020\004\022\n\n\006DELETE\020\005Be\n\036com.google.cloud"
          + ".tasks.v2beta2B\013TargetProtoP\001Z4cloud.goo"
          + "gle.com/go/tasks/apiv2beta2/taskspb;task"
          + "spbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_tasks_v2beta2_PullTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_PullTarget_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_tasks_v2beta2_PullMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_PullMessage_descriptor,
            new java.lang.String[] {
              "Payload", "Tag",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpTarget_descriptor,
            new java.lang.String[] {
              "AppEngineRoutingOverride",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor,
            new java.lang.String[] {
              "HttpMethod", "AppEngineRouting", "RelativeUrl", "Headers", "Payload",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor =
        internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineHttpRequest_HeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_tasks_v2beta2_AppEngineRouting_descriptor,
            new java.lang.String[] {
              "Service", "Version", "Instance", "Host",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
