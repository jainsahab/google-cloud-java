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
// source: google/cloud/baremetalsolution/v2/nfs_share.proto

package com.google.cloud.baremetalsolution.v2;

public final class NfsShareProto {
  private NfsShareProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_AllowedClient_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_AllowedClient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_NfsShare_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetNfsShareRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetNfsShareRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/baremetalsolution/v2/nfs_"
          + "share.proto\022!google.cloud.baremetalsolut"
          + "ion.v2\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032 google/proto"
          + "buf/field_mask.proto\"\217\007\n\010NfsShare\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\003\022\031\n\014nfs_share_id\030\002 \001(\tB\003\340A\003\022"
          + "@\n\005state\030\003 \001(\01621.google.cloud.baremetals"
          + "olution.v2.NfsShare.State\022<\n\006volume\030\004 \001("
          + "\tB,\372A)\n\'baremetalsolution.googleapis.com"
          + "/Volume\022R\n\017allowed_clients\030\005 \003(\01329.googl"
          + "e.cloud.baremetalsolution.v2.NfsShare.Al"
          + "lowedClient\022G\n\006labels\030\006 \003(\01327.google.clo"
          + "ud.baremetalsolution.v2.NfsShare.LabelsE"
          + "ntry\032\227\002\n\rAllowedClient\022>\n\007network\030\001 \001(\tB"
          + "-\372A*\n(baremetalsolution.googleapis.com/N"
          + "etwork\022\020\n\010share_ip\030\002 \001(\t\022\034\n\024allowed_clie"
          + "nts_cidr\030\003 \001(\t\022W\n\021mount_permissions\030\004 \001("
          + "\0162<.google.cloud.baremetalsolution.v2.Nf"
          + "sShare.MountPermissions\022\021\n\tallow_dev\030\005 \001"
          + "(\010\022\022\n\nallow_suid\030\006 \001(\010\022\026\n\016no_root_squash"
          + "\030\007 \001(\010\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005va"
          + "lue\030\002 \001(\t:\0028\001\"/\n\005State\022\025\n\021STATE_UNSPECIF"
          + "IED\020\000\022\017\n\013PROVISIONED\020\001\"O\n\020MountPermissio"
          + "ns\022!\n\035MOUNT_PERMISSIONS_UNSPECIFIED\020\000\022\010\n"
          + "\004READ\020\001\022\016\n\nREAD_WRITE\020\002:m\352Aj\n)baremetals"
          + "olution.googleapis.com/NFSShare\022=project"
          + "s/{project}/locations/{location}/nfsShar"
          + "es/{nfs_share}\"U\n\022GetNfsShareRequest\022?\n\004"
          + "name\030\001 \001(\tB1\340A\002\372A+\n)baremetalsolution.go"
          + "ogleapis.com/NFSShare\"\210\001\n\024ListNfsSharesR"
          + "equest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!location"
          + "s.googleapis.com/Location\022\021\n\tpage_size\030\002"
          + " \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t"
          + "\"\206\001\n\025ListNfsSharesResponse\022?\n\nnfs_shares"
          + "\030\001 \003(\0132+.google.cloud.baremetalsolution."
          + "v2.NfsShare\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013"
          + "unreachable\030\003 \003(\t\"\215\001\n\025UpdateNfsShareRequ"
          + "est\022C\n\tnfs_share\030\001 \001(\0132+.google.cloud.ba"
          + "remetalsolution.v2.NfsShareB\003\340A\002\022/\n\013upda"
          + "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas"
          + "kB\374\001\n%com.google.cloud.baremetalsolution"
          + ".v2B\rNfsShareProtoP\001ZScloud.google.com/g"
          + "o/baremetalsolution/apiv2/baremetalsolut"
          + "ionpb;baremetalsolutionpb\252\002!Google.Cloud"
          + ".BareMetalSolution.V2\312\002!Google\\Cloud\\Bar"
          + "eMetalSolution\\V2\352\002$Google::Cloud::BareM"
          + "etalSolution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_NfsShare_descriptor,
            new java.lang.String[] {
              "Name", "NfsShareId", "State", "Volume", "AllowedClients", "Labels",
            });
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_AllowedClient_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_NfsShare_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_AllowedClient_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_NfsShare_AllowedClient_descriptor,
            new java.lang.String[] {
              "Network",
              "ShareIp",
              "AllowedClientsCidr",
              "MountPermissions",
              "AllowDev",
              "AllowSuid",
              "NoRootSquash",
            });
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_LabelsEntry_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_NfsShare_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_baremetalsolution_v2_NfsShare_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_NfsShare_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetNfsShareRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetNfsShareRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetNfsShareRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListNfsSharesResponse_descriptor,
            new java.lang.String[] {
              "NfsShares", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_UpdateNfsShareRequest_descriptor,
            new java.lang.String[] {
              "NfsShare", "UpdateMask",
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
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
