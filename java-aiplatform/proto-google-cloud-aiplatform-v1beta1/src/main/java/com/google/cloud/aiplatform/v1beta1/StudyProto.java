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
// source: google/cloud/aiplatform/v1beta1/study.proto

package com.google.cloud.aiplatform.v1beta1;

public final class StudyProto {
  private StudyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Study_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Study_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Trial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Trial_WebAccessUrisEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Trial_WebAccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_SafetyMetricConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_SafetyMetricConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_DecayCurveAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MedianAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MedianAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexStopConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexStopConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_TransferLearningConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_TransferLearningConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/study."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\036google/protobuf/dura"
          + "tion.proto\032\034google/protobuf/struct.proto"
          + "\032\037google/protobuf/timestamp.proto\"\270\003\n\005St"
          + "udy\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002"
          + " \001(\tB\003\340A\002\022C\n\nstudy_spec\030\003 \001(\0132*.google.c"
          + "loud.aiplatform.v1beta1.StudySpecB\003\340A\002\022@"
          + "\n\005state\030\004 \001(\0162,.google.cloud.aiplatform."
          + "v1beta1.Study.StateB\003\340A\003\0224\n\013create_time\030"
          + "\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\034"
          + "\n\017inactive_reason\030\006 \001(\tB\003\340A\003\"G\n\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\014\n\010INAC"
          + "TIVE\020\002\022\r\n\tCOMPLETED\020\003:]\352AZ\n\037aiplatform.g"
          + "oogleapis.com/Study\0227projects/{project}/"
          + "locations/{location}/studies/{study}\"\351\007\n"
          + "\005Trial\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\017\n\002id\030\002 \001(\tB\003\340"
          + "A\003\022@\n\005state\030\003 \001(\0162,.google.cloud.aiplatf"
          + "orm.v1beta1.Trial.StateB\003\340A\003\022I\n\nparamete"
          + "rs\030\004 \003(\01320.google.cloud.aiplatform.v1bet"
          + "a1.Trial.ParameterB\003\340A\003\022L\n\021final_measure"
          + "ment\030\005 \001(\0132,.google.cloud.aiplatform.v1b"
          + "eta1.MeasurementB\003\340A\003\022G\n\014measurements\030\006 "
          + "\003(\0132,.google.cloud.aiplatform.v1beta1.Me"
          + "asurementB\003\340A\003\0223\n\nstart_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0221\n\010end_time\030"
          + "\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\026"
          + "\n\tclient_id\030\t \001(\tB\003\340A\003\022\036\n\021infeasible_rea"
          + "son\030\n \001(\tB\003\340A\003\022?\n\ncustom_job\030\013 \001(\tB+\340A\003\372"
          + "A%\n#aiplatform.googleapis.com/CustomJob\022"
          + "W\n\017web_access_uris\030\014 \003(\01329.google.cloud."
          + "aiplatform.v1beta1.Trial.WebAccessUrisEn"
          + "tryB\003\340A\003\032R\n\tParameter\022\031\n\014parameter_id\030\001 "
          + "\001(\tB\003\340A\003\022*\n\005value\030\002 \001(\0132\026.google.protobu"
          + "f.ValueB\003\340A\003\0324\n\022WebAccessUrisEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"f\n\005State\022\025\n\021S"
          + "TATE_UNSPECIFIED\020\000\022\r\n\tREQUESTED\020\001\022\n\n\006ACT"
          + "IVE\020\002\022\014\n\010STOPPING\020\003\022\r\n\tSUCCEEDED\020\004\022\016\n\nIN"
          + "FEASIBLE\020\005:l\352Ai\n\037aiplatform.googleapis.c"
          + "om/Trial\022Fprojects/{project}/locations/{"
          + "location}/studies/{study}/trials/{trial}"
          + "\"\244!\n\tStudySpec\022o\n\031decay_curve_stopping_s"
          + "pec\030\004 \001(\0132J.google.cloud.aiplatform.v1be"
          + "ta1.StudySpec.DecayCurveAutomatedStoppin"
          + "gSpecH\000\022p\n\036median_automated_stopping_spe"
          + "c\030\005 \001(\0132F.google.cloud.aiplatform.v1beta"
          + "1.StudySpec.MedianAutomatedStoppingSpecH"
          + "\000\022]\n\022convex_stop_config\030\010 \001(\0132;.google.c"
          + "loud.aiplatform.v1beta1.StudySpec.Convex"
          + "StopConfigB\002\030\001H\000\022p\n\036convex_automated_sto"
          + "pping_spec\030\t \001(\0132F.google.cloud.aiplatfo"
          + "rm.v1beta1.StudySpec.ConvexAutomatedStop"
          + "pingSpecH\000\022K\n\007metrics\030\001 \003(\01325.google.clo"
          + "ud.aiplatform.v1beta1.StudySpec.MetricSp"
          + "ecB\003\340A\002\022Q\n\nparameters\030\002 \003(\01328.google.clo"
          + "ud.aiplatform.v1beta1.StudySpec.Paramete"
          + "rSpecB\003\340A\002\022G\n\talgorithm\030\003 \001(\01624.google.c"
          + "loud.aiplatform.v1beta1.StudySpec.Algori"
          + "thm\022V\n\021observation_noise\030\006 \001(\0162;.google."
          + "cloud.aiplatform.v1beta1.StudySpec.Obser"
          + "vationNoise\022g\n\032measurement_selection_typ"
          + "e\030\007 \001(\0162C.google.cloud.aiplatform.v1beta"
          + "1.StudySpec.MeasurementSelectionType\022c\n\030"
          + "transfer_learning_config\030\n \001(\0132A.google."
          + "cloud.aiplatform.v1beta1.StudySpec.Trans"
          + "ferLearningConfig\032\267\003\n\nMetricSpec\022\026\n\tmetr"
          + "ic_id\030\001 \001(\tB\003\340A\002\022Q\n\004goal\030\002 \001(\0162>.google."
          + "cloud.aiplatform.v1beta1.StudySpec.Metri"
          + "cSpec.GoalTypeB\003\340A\002\022d\n\rsafety_config\030\003 \001"
          + "(\0132H.google.cloud.aiplatform.v1beta1.Stu"
          + "dySpec.MetricSpec.SafetyMetricConfigH\000\210\001"
          + "\001\032\202\001\n\022SafetyMetricConfig\022\030\n\020safety_thres"
          + "hold\030\001 \001(\001\022-\n desired_min_safe_trials_fr"
          + "action\030\002 \001(\001H\000\210\001\001B#\n!_desired_min_safe_t"
          + "rials_fraction\"A\n\010GoalType\022\031\n\025GOAL_TYPE_"
          + "UNSPECIFIED\020\000\022\014\n\010MAXIMIZE\020\001\022\014\n\010MINIMIZE\020"
          + "\002B\020\n\016_safety_config\032\200\017\n\rParameterSpec\022e\n"
          + "\021double_value_spec\030\002 \001(\0132H.google.cloud."
          + "aiplatform.v1beta1.StudySpec.ParameterSp"
          + "ec.DoubleValueSpecH\000\022g\n\022integer_value_sp"
          + "ec\030\003 \001(\0132I.google.cloud.aiplatform.v1bet"
          + "a1.StudySpec.ParameterSpec.IntegerValueS"
          + "pecH\000\022o\n\026categorical_value_spec\030\004 \001(\0132M."
          + "google.cloud.aiplatform.v1beta1.StudySpe"
          + "c.ParameterSpec.CategoricalValueSpecH\000\022i"
          + "\n\023discrete_value_spec\030\005 \001(\0132J.google.clo"
          + "ud.aiplatform.v1beta1.StudySpec.Paramete"
          + "rSpec.DiscreteValueSpecH\000\022\031\n\014parameter_i"
          + "d\030\001 \001(\tB\003\340A\002\022V\n\nscale_type\030\006 \001(\0162B.googl"
          + "e.cloud.aiplatform.v1beta1.StudySpec.Par"
          + "ameterSpec.ScaleType\022v\n\033conditional_para"
          + "meter_specs\030\n \003(\0132Q.google.cloud.aiplatf"
          + "orm.v1beta1.StudySpec.ParameterSpec.Cond"
          + "itionalParameterSpec\032o\n\017DoubleValueSpec\022"
          + "\026\n\tmin_value\030\001 \001(\001B\003\340A\002\022\026\n\tmax_value\030\002 \001"
          + "(\001B\003\340A\002\022\032\n\rdefault_value\030\004 \001(\001H\000\210\001\001B\020\n\016_"
          + "default_value\032p\n\020IntegerValueSpec\022\026\n\tmin"
          + "_value\030\001 \001(\003B\003\340A\002\022\026\n\tmax_value\030\002 \001(\003B\003\340A"
          + "\002\022\032\n\rdefault_value\030\004 \001(\003H\000\210\001\001B\020\n\016_defaul"
          + "t_value\032Y\n\024CategoricalValueSpec\022\023\n\006value"
          + "s\030\001 \003(\tB\003\340A\002\022\032\n\rdefault_value\030\003 \001(\tH\000\210\001\001"
          + "B\020\n\016_default_value\032V\n\021DiscreteValueSpec\022"
          + "\023\n\006values\030\001 \003(\001B\003\340A\002\022\032\n\rdefault_value\030\003 "
          + "\001(\001H\000\210\001\001B\020\n\016_default_value\032\271\005\n\030Condition"
          + "alParameterSpec\022\212\001\n\026parent_discrete_valu"
          + "es\030\002 \001(\0132h.google.cloud.aiplatform.v1bet"
          + "a1.StudySpec.ParameterSpec.ConditionalPa"
          + "rameterSpec.DiscreteValueConditionH\000\022\200\001\n"
          + "\021parent_int_values\030\003 \001(\0132c.google.cloud."
          + "aiplatform.v1beta1.StudySpec.ParameterSp"
          + "ec.ConditionalParameterSpec.IntValueCond"
          + "itionH\000\022\220\001\n\031parent_categorical_values\030\004 "
          + "\001(\0132k.google.cloud.aiplatform.v1beta1.St"
          + "udySpec.ParameterSpec.ConditionalParamet"
          + "erSpec.CategoricalValueConditionH\000\022U\n\016pa"
          + "rameter_spec\030\001 \001(\01328.google.cloud.aiplat"
          + "form.v1beta1.StudySpec.ParameterSpecB\003\340A"
          + "\002\032-\n\026DiscreteValueCondition\022\023\n\006values\030\001 "
          + "\003(\001B\003\340A\002\032(\n\021IntValueCondition\022\023\n\006values\030"
          + "\001 \003(\003B\003\340A\002\0320\n\031CategoricalValueCondition\022"
          + "\023\n\006values\030\001 \003(\tB\003\340A\002B\030\n\026parent_value_con"
          + "dition\"n\n\tScaleType\022\032\n\026SCALE_TYPE_UNSPEC"
          + "IFIED\020\000\022\025\n\021UNIT_LINEAR_SCALE\020\001\022\022\n\016UNIT_L"
          + "OG_SCALE\020\002\022\032\n\026UNIT_REVERSE_LOG_SCALE\020\003B\026"
          + "\n\024parameter_value_spec\032?\n\037DecayCurveAuto"
          + "matedStoppingSpec\022\034\n\024use_elapsed_duratio"
          + "n\030\001 \001(\010\032;\n\033MedianAutomatedStoppingSpec\022\034"
          + "\n\024use_elapsed_duration\030\001 \001(\010\032\366\001\n\033ConvexA"
          + "utomatedStoppingSpec\022\026\n\016max_step_count\030\001"
          + " \001(\003\022\026\n\016min_step_count\030\002 \001(\003\022\035\n\025min_meas"
          + "urement_count\030\003 \001(\003\022$\n\034learning_rate_par"
          + "ameter_name\030\004 \001(\t\022\034\n\024use_elapsed_duratio"
          + "n\030\005 \001(\010\022&\n\031update_all_stopped_trials\030\006 \001"
          + "(\010H\000\210\001\001B\034\n\032_update_all_stopped_trials\032\235\001"
          + "\n\020ConvexStopConfig\022\025\n\rmax_num_steps\030\001 \001("
          + "\003\022\025\n\rmin_num_steps\030\002 \001(\003\022\034\n\024autoregressi"
          + "ve_order\030\003 \001(\003\022$\n\034learning_rate_paramete"
          + "r_name\030\004 \001(\t\022\023\n\013use_seconds\030\005 \001(\010:\002\030\001\032[\n"
          + "\026TransferLearningConfig\022!\n\031disable_trans"
          + "fer_learning\030\001 \001(\010\022\036\n\021prior_study_names\030"
          + "\002 \003(\tB\003\340A\003\"J\n\tAlgorithm\022\031\n\025ALGORITHM_UNS"
          + "PECIFIED\020\000\022\017\n\013GRID_SEARCH\020\002\022\021\n\rRANDOM_SE"
          + "ARCH\020\003\"H\n\020ObservationNoise\022!\n\035OBSERVATIO"
          + "N_NOISE_UNSPECIFIED\020\000\022\007\n\003LOW\020\001\022\010\n\004HIGH\020\002"
          + "\"r\n\030MeasurementSelectionType\022*\n&MEASUREM"
          + "ENT_SELECTION_TYPE_UNSPECIFIED\020\000\022\024\n\020LAST"
          + "_MEASUREMENT\020\001\022\024\n\020BEST_MEASUREMENT\020\002B\031\n\027"
          + "automated_stopping_spec\"\341\001\n\013Measurement\022"
          + "8\n\020elapsed_duration\030\001 \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\003\022\027\n\nstep_count\030\002 \001(\003B\003\340"
          + "A\003\022I\n\007metrics\030\003 \003(\01323.google.cloud.aipla"
          + "tform.v1beta1.Measurement.MetricB\003\340A\003\0324\n"
          + "\006Metric\022\026\n\tmetric_id\030\001 \001(\tB\003\340A\003\022\022\n\005value"
          + "\030\002 \001(\001B\003\340A\003B\341\001\n#com.google.cloud.aiplatf"
          + "orm.v1beta1B\nStudyProtoP\001ZCcloud.google."
          + "com/go/aiplatform/apiv1beta1/aiplatformp"
          + "b;aiplatformpb\252\002\037Google.Cloud.AIPlatform"
          + ".V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1bet"
          + "a1\352\002\"Google::Cloud::AIPlatform::V1beta1b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Study_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Study_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Study_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "StudySpec", "State", "CreateTime", "InactiveReason",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Trial_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "State",
              "Parameters",
              "FinalMeasurement",
              "Measurements",
              "StartTime",
              "EndTime",
              "ClientId",
              "InfeasibleReason",
              "CustomJob",
              "WebAccessUris",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor,
            new java.lang.String[] {
              "ParameterId", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Trial_WebAccessUrisEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Trial_WebAccessUrisEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Trial_WebAccessUrisEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor,
            new java.lang.String[] {
              "DecayCurveStoppingSpec",
              "MedianAutomatedStoppingSpec",
              "ConvexStopConfig",
              "ConvexAutomatedStoppingSpec",
              "Metrics",
              "Parameters",
              "Algorithm",
              "ObservationNoise",
              "MeasurementSelectionType",
              "TransferLearningConfig",
              "AutomatedStoppingSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor,
            new java.lang.String[] {
              "MetricId", "Goal", "SafetyConfig", "SafetyConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_SafetyMetricConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_SafetyMetricConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_SafetyMetricConfig_descriptor,
            new java.lang.String[] {
              "SafetyThreshold", "DesiredMinSafeTrialsFraction", "DesiredMinSafeTrialsFraction",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor,
            new java.lang.String[] {
              "DoubleValueSpec",
              "IntegerValueSpec",
              "CategoricalValueSpec",
              "DiscreteValueSpec",
              "ParameterId",
              "ScaleType",
              "ConditionalParameterSpecs",
              "ParameterValueSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor,
            new java.lang.String[] {
              "Values", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor,
            new java.lang.String[] {
              "Values", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor,
            new java.lang.String[] {
              "ParentDiscreteValues",
              "ParentIntValues",
              "ParentCategoricalValues",
              "ParameterSpec",
              "ParentValueCondition",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_DecayCurveAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "UseElapsedDuration",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MedianAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MedianAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MedianAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "UseElapsedDuration",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "MaxStepCount",
              "MinStepCount",
              "MinMeasurementCount",
              "LearningRateParameterName",
              "UseElapsedDuration",
              "UpdateAllStoppedTrials",
              "UpdateAllStoppedTrials",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexStopConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexStopConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ConvexStopConfig_descriptor,
            new java.lang.String[] {
              "MaxNumSteps",
              "MinNumSteps",
              "AutoregressiveOrder",
              "LearningRateParameterName",
              "UseSeconds",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_TransferLearningConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(6);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_TransferLearningConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_TransferLearningConfig_descriptor,
            new java.lang.String[] {
              "DisableTransferLearning", "PriorStudyNames",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor,
            new java.lang.String[] {
              "ElapsedDuration", "StepCount", "Metrics",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor,
            new java.lang.String[] {
              "MetricId", "Value",
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
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
