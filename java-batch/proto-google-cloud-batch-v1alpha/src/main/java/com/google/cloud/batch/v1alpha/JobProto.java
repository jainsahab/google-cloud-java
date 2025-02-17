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
// source: google/cloud/batch/v1alpha/job.proto

package com.google.cloud.batch.v1alpha;

public final class JobProto {
  private JobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobDependency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ResourceUsage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ResourceUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_JobNotification_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ServiceAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/batch/v1alpha/job.proto\022\032"
          + "google.cloud.batch.v1alpha\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\032%google/cloud/batch/v1alpha/task."
          + "proto\032\036google/protobuf/duration.proto\032\037g"
          + "oogle/protobuf/timestamp.proto\"\323\007\n\003Job\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 \001(\tB\003\340A\003\022\020\n\010p"
          + "riority\030\003 \001(\003\022?\n\013task_groups\030\004 \003(\0132%.goo"
          + "gle.cloud.batch.v1alpha.TaskGroupB\003\340A\002\022K"
          + "\n\021scheduling_policy\030\005 \001(\01620.google.cloud"
          + ".batch.v1alpha.Job.SchedulingPolicy\022?\n\014d"
          + "ependencies\030\006 \003(\0132).google.cloud.batch.v"
          + "1alpha.JobDependency\022G\n\021allocation_polic"
          + "y\030\007 \001(\0132,.google.cloud.batch.v1alpha.All"
          + "ocationPolicy\022;\n\006labels\030\010 \003(\0132+.google.c"
          + "loud.batch.v1alpha.Job.LabelsEntry\022:\n\006st"
          + "atus\030\t \001(\0132%.google.cloud.batch.v1alpha."
          + "JobStatusB\003\340A\003\022E\n\014notification\030\n \001(\0132+.g"
          + "oogle.cloud.batch.v1alpha.JobNotificatio"
          + "nB\002\030\001\0224\n\013create_time\030\013 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\014 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022;\n\013log"
          + "s_policy\030\r \001(\0132&.google.cloud.batch.v1al"
          + "pha.LogsPolicy\022B\n\rnotifications\030\016 \003(\0132+."
          + "google.cloud.batch.v1alpha.JobNotificati"
          + "on\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\"N\n\020SchedulingPolicy\022!\n\035SCHEDUL"
          + "ING_POLICY_UNSPECIFIED\020\000\022\027\n\023AS_SOON_AS_P"
          + "OSSIBLE\020\001:Q\352AN\n\030batch.googleapis.com/Job"
          + "\0222projects/{project}/locations/{location"
          + "}/jobs/{job}\"\261\001\n\nLogsPolicy\022G\n\013destinati"
          + "on\030\001 \001(\01622.google.cloud.batch.v1alpha.Lo"
          + "gsPolicy.Destination\022\021\n\tlogs_path\030\002 \001(\t\""
          + "G\n\013Destination\022\033\n\027DESTINATION_UNSPECIFIE"
          + "D\020\000\022\021\n\rCLOUD_LOGGING\020\001\022\010\n\004PATH\020\002\"\371\001\n\rJob"
          + "Dependency\022C\n\005items\030\001 \003(\01324.google.cloud"
          + ".batch.v1alpha.JobDependency.ItemsEntry\032"
          + "\\\n\nItemsEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001("
          + "\0162..google.cloud.batch.v1alpha.JobDepend"
          + "ency.Type:\0028\001\"E\n\004Type\022\024\n\020TYPE_UNSPECIFIE"
          + "D\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n\006FAILED\020\002\022\014\n\010FINISH"
          + "ED\020\003\"\353\007\n\tJobStatus\022:\n\005state\030\001 \001(\0162+.goog"
          + "le.cloud.batch.v1alpha.JobStatus.State\022>"
          + "\n\rstatus_events\030\002 \003(\0132\'.google.cloud.bat"
          + "ch.v1alpha.StatusEvent\022J\n\013task_groups\030\004 "
          + "\003(\01325.google.cloud.batch.v1alpha.JobStat"
          + "us.TaskGroupsEntry\022/\n\014run_duration\030\005 \001(\013"
          + "2\031.google.protobuf.Duration\022A\n\016resource_"
          + "usage\030\006 \001(\0132).google.cloud.batch.v1alpha"
          + ".ResourceUsage\032\333\001\n\016InstanceStatus\022\024\n\014mac"
          + "hine_type\030\001 \001(\t\022Z\n\022provisioning_model\030\002 "
          + "\001(\0162>.google.cloud.batch.v1alpha.Allocat"
          + "ionPolicy.ProvisioningModel\022\021\n\ttask_pack"
          + "\030\003 \001(\003\022D\n\tboot_disk\030\004 \001(\01321.google.cloud"
          + ".batch.v1alpha.AllocationPolicy.Disk\032\334\001\n"
          + "\017TaskGroupStatus\022Q\n\006counts\030\001 \003(\0132A.googl"
          + "e.cloud.batch.v1alpha.JobStatus.TaskGrou"
          + "pStatus.CountsEntry\022G\n\tinstances\030\002 \003(\01324"
          + ".google.cloud.batch.v1alpha.JobStatus.In"
          + "stanceStatus\032-\n\013CountsEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\003:\0028\001\032h\n\017TaskGroupsEntry\022\013"
          + "\n\003key\030\001 \001(\t\022D\n\005value\030\002 \001(\01325.google.clou"
          + "d.batch.v1alpha.JobStatus.TaskGroupStatu"
          + "s:\0028\001\"{\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n"
          + "\006QUEUED\020\001\022\r\n\tSCHEDULED\020\002\022\013\n\007RUNNING\020\003\022\r\n"
          + "\tSUCCEEDED\020\004\022\n\n\006FAILED\020\005\022\030\n\024DELETION_IN_"
          + "PROGRESS\020\006\"#\n\rResourceUsage\022\022\n\ncore_hour"
          + "s\030\001 \001(\001\"\220\003\n\017JobNotification\022\024\n\014pubsub_to"
          + "pic\030\001 \001(\t\022D\n\007message\030\002 \001(\01323.google.clou"
          + "d.batch.v1alpha.JobNotification.Message\032"
          + "\323\001\n\007Message\022>\n\004type\030\001 \001(\01620.google.cloud"
          + ".batch.v1alpha.JobNotification.Type\022B\n\rn"
          + "ew_job_state\030\002 \001(\0162+.google.cloud.batch."
          + "v1alpha.JobStatus.State\022D\n\016new_task_stat"
          + "e\030\003 \001(\0162,.google.cloud.batch.v1alpha.Tas"
          + "kStatus.State\"K\n\004Type\022\024\n\020TYPE_UNSPECIFIE"
          + "D\020\000\022\025\n\021JOB_STATE_CHANGED\020\001\022\026\n\022TASK_STATE"
          + "_CHANGED\020\002\"\355\017\n\020AllocationPolicy\022M\n\010locat"
          + "ion\030\001 \001(\0132;.google.cloud.batch.v1alpha.A"
          + "llocationPolicy.LocationPolicy\022Q\n\010instan"
          + "ce\030\002 \001(\0132;.google.cloud.batch.v1alpha.Al"
          + "locationPolicy.InstancePolicyB\002\030\001\022X\n\tins"
          + "tances\030\010 \003(\0132E.google.cloud.batch.v1alph"
          + "a.AllocationPolicy.InstancePolicyOrTempl"
          + "ate\022\036\n\022instance_templates\030\003 \003(\tB\002\030\001\022_\n\023p"
          + "rovisioning_models\030\004 \003(\0162>.google.cloud."
          + "batch.v1alpha.AllocationPolicy.Provision"
          + "ingModelB\002\030\001\022!\n\025service_account_email\030\005 "
          + "\001(\tB\002\030\001\022C\n\017service_account\030\t \001(\0132*.googl"
          + "e.cloud.batch.v1alpha.ServiceAccount\022H\n\006"
          + "labels\030\006 \003(\01328.google.cloud.batch.v1alph"
          + "a.AllocationPolicy.LabelsEntry\022K\n\007networ"
          + "k\030\007 \001(\0132:.google.cloud.batch.v1alpha.All"
          + "ocationPolicy.NetworkPolicy\032E\n\016LocationP"
          + "olicy\022\031\n\021allowed_locations\030\001 \003(\t\022\030\n\020deni"
          + "ed_locations\030\002 \003(\t\032q\n\004Disk\022\017\n\005image\030\004 \001("
          + "\tH\000\022\022\n\010snapshot\030\005 \001(\tH\000\022\014\n\004type\030\001 \001(\t\022\017\n"
          + "\007size_gb\030\002 \001(\003\022\026\n\016disk_interface\030\006 \001(\tB\r"
          + "\n\013data_source\032\217\001\n\014AttachedDisk\022E\n\010new_di"
          + "sk\030\001 \001(\01321.google.cloud.batch.v1alpha.Al"
          + "locationPolicy.DiskH\000\022\027\n\rexisting_disk\030\002"
          + " \001(\tH\000\022\023\n\013device_name\030\003 \001(\tB\n\n\010attached\032"
          + "K\n\013Accelerator\022\014\n\004type\030\001 \001(\t\022\r\n\005count\030\002 "
          + "\001(\003\022\037\n\023install_gpu_drivers\030\003 \001(\010B\002\030\001\032\264\003\n"
          + "\016InstancePolicy\022!\n\025allowed_machine_types"
          + "\030\001 \003(\tB\002\030\001\022\024\n\014machine_type\030\002 \001(\t\022\030\n\020min_"
          + "cpu_platform\030\003 \001(\t\022Z\n\022provisioning_model"
          + "\030\004 \001(\0162>.google.cloud.batch.v1alpha.Allo"
          + "cationPolicy.ProvisioningModel\022N\n\014accele"
          + "rators\030\005 \003(\01328.google.cloud.batch.v1alph"
          + "a.AllocationPolicy.Accelerator\022D\n\tboot_d"
          + "isk\030\010 \001(\01321.google.cloud.batch.v1alpha.A"
          + "llocationPolicy.Disk\022H\n\005disks\030\006 \003(\01329.go"
          + "ogle.cloud.batch.v1alpha.AllocationPolic"
          + "y.AttachedDisk\022\023\n\013reservation\030\007 \001(\t\032\266\001\n\030"
          + "InstancePolicyOrTemplate\022M\n\006policy\030\001 \001(\013"
          + "2;.google.cloud.batch.v1alpha.Allocation"
          + "Policy.InstancePolicyH\000\022\033\n\021instance_temp"
          + "late\030\002 \001(\tH\000\022\033\n\023install_gpu_drivers\030\003 \001("
          + "\010B\021\n\017policy_template\032W\n\020NetworkInterface"
          + "\022\017\n\007network\030\001 \001(\t\022\022\n\nsubnetwork\030\002 \001(\t\022\036\n"
          + "\026no_external_ip_address\030\003 \001(\010\032j\n\rNetwork"
          + "Policy\022Y\n\022network_interfaces\030\001 \003(\0132=.goo"
          + "gle.cloud.batch.v1alpha.AllocationPolicy"
          + ".NetworkInterface\032-\n\013LabelsEntry\022\013\n\003key\030"
          + "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\021Provisioning"
          + "Model\022\"\n\036PROVISIONING_MODEL_UNSPECIFIED\020"
          + "\000\022\014\n\010STANDARD\020\001\022\010\n\004SPOT\020\002\022\017\n\013PREEMPTIBLE"
          + "\020\003\"\351\005\n\tTaskGroup\022\021\n\004name\030\001 \001(\tB\003\340A\003\022<\n\tt"
          + "ask_spec\030\003 \001(\0132$.google.cloud.batch.v1al"
          + "pha.TaskSpecB\003\340A\002\022\022\n\ntask_count\030\004 \001(\003\022\023\n"
          + "\013parallelism\030\005 \001(\003\022Q\n\021scheduling_policy\030"
          + "\006 \001(\01626.google.cloud.batch.v1alpha.TaskG"
          + "roup.SchedulingPolicy\022G\n\021allocation_poli"
          + "cy\030\007 \001(\0132,.google.cloud.batch.v1alpha.Al"
          + "locationPolicy\022A\n\006labels\030\010 \003(\01321.google."
          + "cloud.batch.v1alpha.TaskGroup.LabelsEntr"
          + "y\022B\n\021task_environments\030\t \003(\0132\'.google.cl"
          + "oud.batch.v1alpha.Environment\022\033\n\023task_co"
          + "unt_per_node\030\n \001(\003\022\032\n\022require_hosts_file"
          + "\030\013 \001(\010\022\026\n\016permissive_ssh\030\014 \001(\010\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"N\n"
          + "\020SchedulingPolicy\022!\n\035SCHEDULING_POLICY_U"
          + "NSPECIFIED\020\000\022\027\n\023AS_SOON_AS_POSSIBLE\020\001:o\352"
          + "Al\n\036batch.googleapis.com/TaskGroup\022Jproj"
          + "ects/{project}/locations/{location}/jobs"
          + "/{job}/taskGroups/{task_group}\"/\n\016Servic"
          + "eAccount\022\r\n\005email\030\001 \001(\t\022\016\n\006scopes\030\002 \003(\tB"
          + "\302\001\n\036com.google.cloud.batch.v1alphaB\010JobP"
          + "rotoP\001Z4cloud.google.com/go/batch/apiv1a"
          + "lpha/batchpb;batchpb\242\002\003GCB\252\002\032Google.Clou"
          + "d.Batch.V1Alpha\312\002\032Google\\Cloud\\Batch\\V1a"
          + "lpha\352\002\035Google::Cloud::Batch::V1alphab\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.TaskProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Priority",
              "TaskGroups",
              "SchedulingPolicy",
              "Dependencies",
              "AllocationPolicy",
              "Labels",
              "Status",
              "Notification",
              "CreateTime",
              "UpdateTime",
              "LogsPolicy",
              "Notifications",
            });
    internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_Job_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_LogsPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_LogsPolicy_descriptor,
            new java.lang.String[] {
              "Destination", "LogsPath",
            });
    internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_JobDependency_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor,
            new java.lang.String[] {
              "Items",
            });
    internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobDependency_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobDependency_ItemsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_JobStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor,
            new java.lang.String[] {
              "State", "StatusEvents", "TaskGroups", "RunDuration", "ResourceUsage",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_InstanceStatus_descriptor,
            new java.lang.String[] {
              "MachineType", "ProvisioningModel", "TaskPack", "BootDisk",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor,
            new java.lang.String[] {
              "Counts", "Instances",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupStatus_CountsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobStatus_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobStatus_TaskGroupsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_ResourceUsage_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_ResourceUsage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ResourceUsage_descriptor,
            new java.lang.String[] {
              "CoreHours",
            });
    internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_JobNotification_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor,
            new java.lang.String[] {
              "PubsubTopic", "Message",
            });
    internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor =
        internal_static_google_cloud_batch_v1alpha_JobNotification_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_JobNotification_Message_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_JobNotification_Message_descriptor,
            new java.lang.String[] {
              "Type", "NewJobState", "NewTaskState",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor,
            new java.lang.String[] {
              "Location",
              "Instance",
              "Instances",
              "InstanceTemplates",
              "ProvisioningModels",
              "ServiceAccountEmail",
              "ServiceAccount",
              "Labels",
              "Network",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LocationPolicy_descriptor,
            new java.lang.String[] {
              "AllowedLocations", "DeniedLocations",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Disk_descriptor,
            new java.lang.String[] {
              "Image", "Snapshot", "Type", "SizeGb", "DiskInterface", "DataSource",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_AttachedDisk_descriptor,
            new java.lang.String[] {
              "NewDisk", "ExistingDisk", "DeviceName", "Attached",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_Accelerator_descriptor,
            new java.lang.String[] {
              "Type", "Count", "InstallGpuDrivers",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicy_descriptor,
            new java.lang.String[] {
              "AllowedMachineTypes",
              "MachineType",
              "MinCpuPlatform",
              "ProvisioningModel",
              "Accelerators",
              "BootDisk",
              "Disks",
              "Reservation",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_InstancePolicyOrTemplate_descriptor,
            new java.lang.String[] {
              "Policy", "InstanceTemplate", "InstallGpuDrivers", "PolicyTemplate",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkInterface_descriptor,
            new java.lang.String[] {
              "Network", "Subnetwork", "NoExternalIpAddress",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(7);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_NetworkPolicy_descriptor,
            new java.lang.String[] {
              "NetworkInterfaces",
            });
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_AllocationPolicy_descriptor
            .getNestedTypes()
            .get(8);
    internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_AllocationPolicy_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_TaskGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor,
            new java.lang.String[] {
              "Name",
              "TaskSpec",
              "TaskCount",
              "Parallelism",
              "SchedulingPolicy",
              "AllocationPolicy",
              "Labels",
              "TaskEnvironments",
              "TaskCountPerNode",
              "RequireHostsFile",
              "PermissiveSsh",
            });
    internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor =
        internal_static_google_cloud_batch_v1alpha_TaskGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_TaskGroup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1alpha_ServiceAccount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ServiceAccount_descriptor,
            new java.lang.String[] {
              "Email", "Scopes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.TaskProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
