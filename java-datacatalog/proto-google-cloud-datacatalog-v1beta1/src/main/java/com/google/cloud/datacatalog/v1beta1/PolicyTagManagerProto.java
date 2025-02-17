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
// source: google/cloud/datacatalog/v1beta1/policytagmanager.proto

package com.google.cloud.datacatalog.v1beta1;

public final class PolicyTagManagerProto {
  private PolicyTagManagerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_Taxonomy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_Taxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_PolicyTag_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_PolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_DeleteTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_DeleteTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_UpdateTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_UpdateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_GetTaxonomyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_GetTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_DeletePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_DeletePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datacatalog_v1beta1_GetPolicyTagRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1beta1_GetPolicyTagRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/datacatalog/v1beta1/polic"
          + "ytagmanager.proto\022 google.cloud.datacata"
          + "log.v1beta1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/resource"
          + ".proto\0321google/cloud/datacatalog/v1beta1"
          + "/timestamps.proto\032\036google/iam/v1/iam_pol"
          + "icy.proto\032\032google/iam/v1/policy.proto\032\033g"
          + "oogle/protobuf/empty.proto\032 google/proto"
          + "buf/field_mask.proto\"\343\002\n\010Taxonomy\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022"
          + "\030\n\013description\030\003 \001(\tB\003\340A\001\022Z\n\026activated_p"
          + "olicy_types\030\006 \003(\01625.google.cloud.datacat"
          + "alog.v1beta1.Taxonomy.PolicyTypeB\003\340A\001\"J\n"
          + "\nPolicyType\022\033\n\027POLICY_TYPE_UNSPECIFIED\020\000"
          + "\022\037\n\033FINE_GRAINED_ACCESS_CONTROL\020\001:g\352Ad\n#"
          + "datacatalog.googleapis.com/Taxonomy\022=pro"
          + "jects/{project}/locations/{location}/tax"
          + "onomies/{taxonomy}\"\214\002\n\tPolicyTag\022\021\n\004name"
          + "\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023"
          + "\n\013description\030\003 \001(\t\022\031\n\021parent_policy_tag"
          + "\030\004 \001(\t\022\036\n\021child_policy_tags\030\005 \003(\tB\003\340A\003:\200"
          + "\001\352A}\n$datacatalog.googleapis.com/PolicyT"
          + "ag\022Uprojects/{project}/locations/{locati"
          + "on}/taxonomies/{taxonomy}/policyTags/{po"
          + "licy_tag}\"\222\001\n\025CreateTaxonomyRequest\022;\n\006p"
          + "arent\030\001 \001(\tB+\340A\002\372A%\022#datacatalog.googlea"
          + "pis.com/Taxonomy\022<\n\010taxonomy\030\002 \001(\0132*.goo"
          + "gle.cloud.datacatalog.v1beta1.Taxonomy\"R"
          + "\n\025DeleteTaxonomyRequest\0229\n\004name\030\001 \001(\tB+\340"
          + "A\002\372A%\n#datacatalog.googleapis.com/Taxono"
          + "my\"\206\001\n\025UpdateTaxonomyRequest\022<\n\010taxonomy"
          + "\030\001 \001(\0132*.google.cloud.datacatalog.v1beta"
          + "1.Taxonomy\022/\n\013update_mask\030\002 \001(\0132\032.google"
          + ".protobuf.FieldMask\"{\n\025ListTaxonomiesReq"
          + "uest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#datacatalo"
          + "g.googleapis.com/Taxonomy\022\021\n\tpage_size\030\002"
          + " \001(\005\022\022\n\npage_token\030\003 \001(\t\"q\n\026ListTaxonomi"
          + "esResponse\022>\n\ntaxonomies\030\001 \003(\0132*.google."
          + "cloud.datacatalog.v1beta1.Taxonomy\022\027\n\017ne"
          + "xt_page_token\030\002 \001(\t\"O\n\022GetTaxonomyReques"
          + "t\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#datacatalog.goo"
          + "gleapis.com/Taxonomy\"\227\001\n\026CreatePolicyTag"
          + "Request\022<\n\006parent\030\001 \001(\tB,\340A\002\372A&\022$datacat"
          + "alog.googleapis.com/PolicyTag\022?\n\npolicy_"
          + "tag\030\002 \001(\0132+.google.cloud.datacatalog.v1b"
          + "eta1.PolicyTag\"T\n\026DeletePolicyTagRequest"
          + "\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$datacatalog.goog"
          + "leapis.com/PolicyTag\"\212\001\n\026UpdatePolicyTag"
          + "Request\022?\n\npolicy_tag\030\001 \001(\0132+.google.clo"
          + "ud.datacatalog.v1beta1.PolicyTag\022/\n\013upda"
          + "te_mask\030\002 \001(\0132\032.google.protobuf.FieldMas"
          + "k\"|\n\025ListPolicyTagsRequest\022<\n\006parent\030\001 \001"
          + "(\tB,\340A\002\372A&\022$datacatalog.googleapis.com/P"
          + "olicyTag\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"s\n\026ListPolicyTagsResponse\022@\n\013pol"
          + "icy_tags\030\001 \003(\0132+.google.cloud.datacatalo"
          + "g.v1beta1.PolicyTag\022\027\n\017next_page_token\030\002"
          + " \001(\t\"Q\n\023GetPolicyTagRequest\022:\n\004name\030\001 \001("
          + "\tB,\340A\002\372A&\n$datacatalog.googleapis.com/Po"
          + "licyTag2\345\026\n\020PolicyTagManager\022\316\001\n\016CreateT"
          + "axonomy\0227.google.cloud.datacatalog.v1bet"
          + "a1.CreateTaxonomyRequest\032*.google.cloud."
          + "datacatalog.v1beta1.Taxonomy\"W\202\323\344\223\002?\"3/v"
          + "1beta1/{parent=projects/*/locations/*}/t"
          + "axonomies:\010taxonomy\332A\017parent,taxonomy\022\245\001"
          + "\n\016DeleteTaxonomy\0227.google.cloud.datacata"
          + "log.v1beta1.DeleteTaxonomyRequest\032\026.goog"
          + "le.protobuf.Empty\"B\202\323\344\223\0025*3/v1beta1/{nam"
          + "e=projects/*/locations/*/taxonomies/*}\332A"
          + "\004name\022\320\001\n\016UpdateTaxonomy\0227.google.cloud."
          + "datacatalog.v1beta1.UpdateTaxonomyReques"
          + "t\032*.google.cloud.datacatalog.v1beta1.Tax"
          + "onomy\"Y\202\323\344\223\002H2</v1beta1/{taxonomy.name=p"
          + "rojects/*/locations/*/taxonomies/*}:\010tax"
          + "onomy\332A\010taxonomy\022\311\001\n\016ListTaxonomies\0227.go"
          + "ogle.cloud.datacatalog.v1beta1.ListTaxon"
          + "omiesRequest\0328.google.cloud.datacatalog."
          + "v1beta1.ListTaxonomiesResponse\"D\202\323\344\223\0025\0223"
          + "/v1beta1/{parent=projects/*/locations/*}"
          + "/taxonomies\332A\006parent\022\263\001\n\013GetTaxonomy\0224.g"
          + "oogle.cloud.datacatalog.v1beta1.GetTaxon"
          + "omyRequest\032*.google.cloud.datacatalog.v1"
          + "beta1.Taxonomy\"B\202\323\344\223\0025\0223/v1beta1/{name=p"
          + "rojects/*/locations/*/taxonomies/*}\332A\004na"
          + "me\022\342\001\n\017CreatePolicyTag\0228.google.cloud.da"
          + "tacatalog.v1beta1.CreatePolicyTagRequest"
          + "\032+.google.cloud.datacatalog.v1beta1.Poli"
          + "cyTag\"h\202\323\344\223\002N\"@/v1beta1/{parent=projects"
          + "/*/locations/*/taxonomies/*}/policyTags:"
          + "\npolicy_tag\332A\021parent,policy_tag\022\264\001\n\017Dele"
          + "tePolicyTag\0228.google.cloud.datacatalog.v"
          + "1beta1.DeletePolicyTagRequest\032\026.google.p"
          + "rotobuf.Empty\"O\202\323\344\223\002B*@/v1beta1/{name=pr"
          + "ojects/*/locations/*/taxonomies/*/policy"
          + "Tags/*}\332A\004name\022\346\001\n\017UpdatePolicyTag\0228.goo"
          + "gle.cloud.datacatalog.v1beta1.UpdatePoli"
          + "cyTagRequest\032+.google.cloud.datacatalog."
          + "v1beta1.PolicyTag\"l\202\323\344\223\002Y2K/v1beta1/{pol"
          + "icy_tag.name=projects/*/locations/*/taxo"
          + "nomies/*/policyTags/*}:\npolicy_tag\332A\npol"
          + "icy_tag\022\326\001\n\016ListPolicyTags\0227.google.clou"
          + "d.datacatalog.v1beta1.ListPolicyTagsRequ"
          + "est\0328.google.cloud.datacatalog.v1beta1.L"
          + "istPolicyTagsResponse\"Q\202\323\344\223\002B\022@/v1beta1/"
          + "{parent=projects/*/locations/*/taxonomie"
          + "s/*}/policyTags\332A\006parent\022\303\001\n\014GetPolicyTa"
          + "g\0225.google.cloud.datacatalog.v1beta1.Get"
          + "PolicyTagRequest\032+.google.cloud.datacata"
          + "log.v1beta1.PolicyTag\"O\202\323\344\223\002B\022@/v1beta1/"
          + "{name=projects/*/locations/*/taxonomies/"
          + "*/policyTags/*}\332A\004name\022\364\001\n\014GetIamPolicy\022"
          + "\".google.iam.v1.GetIamPolicyRequest\032\025.go"
          + "ogle.iam.v1.Policy\"\250\001\202\323\344\223\002\241\001\"D/v1beta1/{"
          + "resource=projects/*/locations/*/taxonomi"
          + "es/*}:getIamPolicy:\001*ZV\"Q/v1beta1/{resou"
          + "rce=projects/*/locations/*/taxonomies/*/"
          + "policyTags/*}:getIamPolicy:\001*\022\364\001\n\014SetIam"
          + "Policy\022\".google.iam.v1.SetIamPolicyReque"
          + "st\032\025.google.iam.v1.Policy\"\250\001\202\323\344\223\002\241\001\"D/v1"
          + "beta1/{resource=projects/*/locations/*/t"
          + "axonomies/*}:setIamPolicy:\001*ZV\"Q/v1beta1"
          + "/{resource=projects/*/locations/*/taxono"
          + "mies/*/policyTags/*}:setIamPolicy:\001*\022\240\002\n"
          + "\022TestIamPermissions\022(.google.iam.v1.Test"
          + "IamPermissionsRequest\032).google.iam.v1.Te"
          + "stIamPermissionsResponse\"\264\001\202\323\344\223\002\255\001\"J/v1b"
          + "eta1/{resource=projects/*/locations/*/ta"
          + "xonomies/*}:testIamPermissions:\001*Z\\\"W/v1"
          + "beta1/{resource=projects/*/locations/*/t"
          + "axonomies/*/policyTags/*}:testIamPermiss"
          + "ions:\001*\032N\312A\032datacatalog.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\366\001\n$com.google.cloud.datacatalog"
          + ".v1beta1B\025PolicyTagManagerProtoP\001ZFcloud"
          + ".google.com/go/datacatalog/apiv1beta1/da"
          + "tacatalogpb;datacatalogpb\370\001\001\252\002 Google.Cl"
          + "oud.DataCatalog.V1Beta1\312\002 Google\\Cloud\\D"
          + "ataCatalog\\V1beta1\352\002#Google::Cloud::Data"
          + "Catalog::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datacatalog.v1beta1.Timestamps.getDescriptor(),
              com.google.iam.v1.IamPolicyProto.getDescriptor(),
              com.google.iam.v1.PolicyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_datacatalog_v1beta1_Taxonomy_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1beta1_Taxonomy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_Taxonomy_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "ActivatedPolicyTypes",
            });
    internal_static_google_cloud_datacatalog_v1beta1_PolicyTag_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1beta1_PolicyTag_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_PolicyTag_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "ParentPolicyTag", "ChildPolicyTags",
            });
    internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_CreateTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Taxonomy",
            });
    internal_static_google_cloud_datacatalog_v1beta1_DeleteTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1beta1_DeleteTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_DeleteTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1beta1_UpdateTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1beta1_UpdateTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_UpdateTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Taxonomy", "UpdateMask",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ListTaxonomiesResponse_descriptor,
            new java.lang.String[] {
              "Taxonomies", "NextPageToken",
            });
    internal_static_google_cloud_datacatalog_v1beta1_GetTaxonomyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datacatalog_v1beta1_GetTaxonomyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_GetTaxonomyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_CreatePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PolicyTag",
            });
    internal_static_google_cloud_datacatalog_v1beta1_DeletePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datacatalog_v1beta1_DeletePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_DeletePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_UpdatePolicyTagRequest_descriptor,
            new java.lang.String[] {
              "PolicyTag", "UpdateMask",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_ListPolicyTagsResponse_descriptor,
            new java.lang.String[] {
              "PolicyTags", "NextPageToken",
            });
    internal_static_google_cloud_datacatalog_v1beta1_GetPolicyTagRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datacatalog_v1beta1_GetPolicyTagRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datacatalog_v1beta1_GetPolicyTagRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1beta1.Timestamps.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
