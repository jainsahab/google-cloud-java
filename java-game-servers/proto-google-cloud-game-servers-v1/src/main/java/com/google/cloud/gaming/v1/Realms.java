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
// source: google/cloud/gaming/v1/realms.proto

package com.google.cloud.gaming.v1;

public final class Realms {
  private Realms() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListRealmsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListRealmsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_ListRealmsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_ListRealmsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_GetRealmRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_GetRealmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_CreateRealmRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_CreateRealmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_DeleteRealmRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_DeleteRealmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_UpdateRealmRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_UpdateRealmRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewRealmUpdateRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewRealmUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_PreviewRealmUpdateResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_PreviewRealmUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_Realm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_Realm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gaming_v1_Realm_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gaming_v1_Realm_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n#google/cloud/gaming/v1/realms.proto\022\026g"
          + "oogle.cloud.gaming.v1\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\032#google/cloud/gaming/v1/common.proto\032 "
          + "google/protobuf/field_mask.proto\032\037google"
          + "/protobuf/timestamp.proto\"\253\001\n\021ListRealms"
          + "Request\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!gameser"
          + "vices.googleapis.com/Realm\022\026\n\tpage_size\030"
          + "\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006f"
          + "ilter\030\004 \001(\tB\003\340A\001\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\""
          + "q\n\022ListRealmsResponse\022-\n\006realms\030\001 \003(\0132\035."
          + "google.cloud.gaming.v1.Realm\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"J\n\017Ge"
          + "tRealmRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!gam"
          + "eservices.googleapis.com/Realm\"\231\001\n\022Creat"
          + "eRealmRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\022!g"
          + "ameservices.googleapis.com/Realm\022\025\n\010real"
          + "m_id\030\002 \001(\tB\003\340A\002\0221\n\005realm\030\003 \001(\0132\035.google."
          + "cloud.gaming.v1.RealmB\003\340A\002\"M\n\022DeleteReal"
          + "mRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!gameserv"
          + "ices.googleapis.com/Realm\"}\n\022UpdateRealm"
          + "Request\0221\n\005realm\030\001 \001(\0132\035.google.cloud.ga"
          + "ming.v1.RealmB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMaskB\003\340A\002\"\273\001\n\031Pre"
          + "viewRealmUpdateRequest\0221\n\005realm\030\001 \001(\0132\035."
          + "google.cloud.gaming.v1.RealmB\003\340A\002\0224\n\013upd"
          + "ate_mask\030\002 \001(\0132\032.google.protobuf.FieldMa"
          + "skB\003\340A\002\0225\n\014preview_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\001\"e\n\032PreviewRealmUp"
          + "dateResponse\022\014\n\004etag\030\002 \001(\t\0229\n\014target_sta"
          + "te\030\003 \001(\0132#.google.cloud.gaming.v1.Target"
          + "State\"\206\003\n\005Realm\022\014\n\004name\030\001 \001(\t\0224\n\013create_"
          + "time\030\002 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\0224\n\013update_time\030\003 \001(\0132\032.google.protob"
          + "uf.TimestampB\003\340A\003\0229\n\006labels\030\004 \003(\0132).goog"
          + "le.cloud.gaming.v1.Realm.LabelsEntry\022\026\n\t"
          + "time_zone\030\006 \001(\tB\003\340A\002\022\014\n\004etag\030\007 \001(\t\022\023\n\013de"
          + "scription\030\010 \001(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:^\352A[\n!gameservice"
          + "s.googleapis.com/Realm\0226projects/{projec"
          + "t}/locations/{location}/realms/{realm}BR"
          + "\n\032com.google.cloud.gaming.v1P\001Z2cloud.go"
          + "ogle.com/go/gaming/apiv1/gamingpb;gaming"
          + "pbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gaming.v1.Common.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gaming_v1_ListRealmsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gaming_v1_ListRealmsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListRealmsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gaming_v1_ListRealmsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gaming_v1_ListRealmsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_ListRealmsResponse_descriptor,
            new java.lang.String[] {
              "Realms", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gaming_v1_GetRealmRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gaming_v1_GetRealmRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_GetRealmRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_CreateRealmRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gaming_v1_CreateRealmRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_CreateRealmRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RealmId", "Realm",
            });
    internal_static_google_cloud_gaming_v1_DeleteRealmRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gaming_v1_DeleteRealmRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_DeleteRealmRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gaming_v1_UpdateRealmRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gaming_v1_UpdateRealmRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_UpdateRealmRequest_descriptor,
            new java.lang.String[] {
              "Realm", "UpdateMask",
            });
    internal_static_google_cloud_gaming_v1_PreviewRealmUpdateRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gaming_v1_PreviewRealmUpdateRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewRealmUpdateRequest_descriptor,
            new java.lang.String[] {
              "Realm", "UpdateMask", "PreviewTime",
            });
    internal_static_google_cloud_gaming_v1_PreviewRealmUpdateResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gaming_v1_PreviewRealmUpdateResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_PreviewRealmUpdateResponse_descriptor,
            new java.lang.String[] {
              "Etag", "TargetState",
            });
    internal_static_google_cloud_gaming_v1_Realm_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gaming_v1_Realm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_Realm_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "UpdateTime", "Labels", "TimeZone", "Etag", "Description",
            });
    internal_static_google_cloud_gaming_v1_Realm_LabelsEntry_descriptor =
        internal_static_google_cloud_gaming_v1_Realm_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gaming_v1_Realm_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gaming_v1_Realm_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gaming.v1.Common.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
