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
// source: google/cloud/baremetalsolution/v2/volume.proto

package com.google.cloud.baremetalsolution.v2;

public final class VolumeProto {
  private VolumeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Volume_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Volume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Volume_SnapshotReservationDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Volume_SnapshotReservationDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Volume_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Volume_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListVolumesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListVolumesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListVolumesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListVolumesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResizeVolumeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResizeVolumeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/baremetalsolution/v2/volu"
          + "me.proto\022!google.cloud.baremetalsolution"
          + ".v2\032\037google/api/field_behavior.proto\032\031go"
          + "ogle/api/resource.proto\032 google/protobuf"
          + "/field_mask.proto\"\313\t\n\006Volume\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\003\022\n\n\002id\030\013 \001(\t\022K\n\014storage_type\030\002 \001("
          + "\01625.google.cloud.baremetalsolution.v2.Vo"
          + "lume.StorageType\022>\n\005state\030\003 \001(\0162/.google"
          + ".cloud.baremetalsolution.v2.Volume.State"
          + "\022\032\n\022requested_size_gib\030\004 \001(\003\022\030\n\020current_"
          + "size_gib\030\005 \001(\003\022\032\n\022emergency_size_gib\030\016 \001"
          + "(\003\022\033\n\023auto_grown_size_gib\030\006 \001(\003\022\033\n\023remai"
          + "ning_space_gib\030\007 \001(\003\022h\n\033snapshot_reserva"
          + "tion_detail\030\010 \001(\0132C.google.cloud.baremet"
          + "alsolution.v2.Volume.SnapshotReservation"
          + "Detail\022k\n\035snapshot_auto_delete_behavior\030"
          + "\t \001(\0162D.google.cloud.baremetalsolution.v"
          + "2.Volume.SnapshotAutoDeleteBehavior\022E\n\006l"
          + "abels\030\014 \003(\01325.google.cloud.baremetalsolu"
          + "tion.v2.Volume.LabelsEntry\022\030\n\020snapshot_e"
          + "nabled\030\r \001(\010\022\020\n\003pod\030\017 \001(\tB\003\340A\005\032\242\001\n\031Snaps"
          + "hotReservationDetail\022\032\n\022reserved_space_g"
          + "ib\030\001 \001(\003\022#\n\033reserved_space_used_percent\030"
          + "\002 \001(\005\022$\n\034reserved_space_remaining_gib\030\003 "
          + "\001(\003\022\036\n\026reserved_space_percent\030\004 \001(\005\032-\n\013L"
          + "abelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002"
          + "8\001\"=\n\013StorageType\022\034\n\030STORAGE_TYPE_UNSPEC"
          + "IFIED\020\000\022\007\n\003SSD\020\001\022\007\n\003HDD\020\002\"E\n\005State\022\025\n\021ST"
          + "ATE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY"
          + "\020\002\022\014\n\010DELETING\020\003\"}\n\032SnapshotAutoDeleteBe"
          + "havior\022-\n)SNAPSHOT_AUTO_DELETE_BEHAVIOR_"
          + "UNSPECIFIED\020\000\022\014\n\010DISABLED\020\001\022\020\n\014OLDEST_FI"
          + "RST\020\002\022\020\n\014NEWEST_FIRST\020\003:f\352Ac\n\'baremetals"
          + "olution.googleapis.com/Volume\0228projects/"
          + "{project}/locations/{location}/volumes/{"
          + "volume}\"Q\n\020GetVolumeRequest\022=\n\004name\030\001 \001("
          + "\tB/\340A\002\372A)\n\'baremetalsolution.googleapis."
          + "com/Volume\"\206\001\n\022ListVolumesRequest\0229\n\006par"
          + "ent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis."
          + "com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_"
          + "token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\"\177\n\023ListVolum"
          + "esResponse\022:\n\007volumes\030\001 \003(\0132).google.clo"
          + "ud.baremetalsolution.v2.Volume\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"\206\001\n"
          + "\023UpdateVolumeRequest\022>\n\006volume\030\001 \001(\0132).g"
          + "oogle.cloud.baremetalsolution.v2.VolumeB"
          + "\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.proto"
          + "buf.FieldMask\"h\n\023ResizeVolumeRequest\022?\n\006"
          + "volume\030\001 \001(\tB/\340A\002\372A)\n\'baremetalsolution."
          + "googleapis.com/Volume\022\020\n\010size_gib\030\002 \001(\003B"
          + "\372\001\n%com.google.cloud.baremetalsolution.v"
          + "2B\013VolumeProtoP\001ZScloud.google.com/go/ba"
          + "remetalsolution/apiv2/baremetalsolutionp"
          + "b;baremetalsolutionpb\252\002!Google.Cloud.Bar"
          + "eMetalSolution.V2\312\002!Google\\Cloud\\BareMet"
          + "alSolution\\V2\352\002$Google::Cloud::BareMetal"
          + "Solution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_Volume_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Volume_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Volume_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "StorageType",
              "State",
              "RequestedSizeGib",
              "CurrentSizeGib",
              "EmergencySizeGib",
              "AutoGrownSizeGib",
              "RemainingSpaceGib",
              "SnapshotReservationDetail",
              "SnapshotAutoDeleteBehavior",
              "Labels",
              "SnapshotEnabled",
              "Pod",
            });
    internal_static_google_cloud_baremetalsolution_v2_Volume_SnapshotReservationDetail_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_Volume_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Volume_SnapshotReservationDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Volume_SnapshotReservationDetail_descriptor,
            new java.lang.String[] {
              "ReservedSpaceGib",
              "ReservedSpaceUsedPercent",
              "ReservedSpaceRemainingGib",
              "ReservedSpacePercent",
            });
    internal_static_google_cloud_baremetalsolution_v2_Volume_LabelsEntry_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_Volume_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_Volume_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Volume_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetVolumeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListVolumesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListVolumesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListVolumesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListVolumesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListVolumesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListVolumesResponse_descriptor,
            new java.lang.String[] {
              "Volumes", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_UpdateVolumeRequest_descriptor,
            new java.lang.String[] {
              "Volume", "UpdateMask",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResizeVolumeRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_baremetalsolution_v2_ResizeVolumeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResizeVolumeRequest_descriptor,
            new java.lang.String[] {
              "Volume", "SizeGib",
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
