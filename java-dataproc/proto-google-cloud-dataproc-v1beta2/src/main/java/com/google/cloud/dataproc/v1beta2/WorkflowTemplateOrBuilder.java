// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface WorkflowTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.WorkflowTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The template id.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Required. The template id.
   * The id must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and hyphens (-). Cannot begin or end with underscore
   * or hyphen. Must consist of between 3 and 50 characters.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Output only. The "resource name" of the template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The "resource name" of the template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Used to perform a consistent read-modify-write.
   * This field should be left blank for a `CreateWorkflowTemplate` request. It
   * is required for an `UpdateWorkflowTemplate` request, and must match the
   * current server version. A typical update template flow would fetch the
   * current template with a `GetWorkflowTemplate` request, which will return
   * the current template with the `version` field filled in with the
   * current server version. The user updates other fields in the template,
   * then returns it as part of the `UpdateWorkflowTemplate` request.
   * </pre>
   *
   * <code>int32 version = 3;</code>
   */
  int getVersion();

  /**
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time template was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time template was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. The labels to associate with this template. These labels
   * will be propagated to all jobs and clusters created by the workflow
   * instance.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * No more than 32 labels can be associated with a template.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement placement = 7;</code>
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement placement = 7;</code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement getPlacement();
  /**
   * <pre>
   * Required. WorkflowTemplate scheduling information.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacement placement = 7;</code>
   */
  com.google.cloud.dataproc.v1beta2.WorkflowTemplatePlacementOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.OrderedJob jobs = 8;</code>
   */
  java.util.List<com.google.cloud.dataproc.v1beta2.OrderedJob> 
      getJobsList();
  /**
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.OrderedJob jobs = 8;</code>
   */
  com.google.cloud.dataproc.v1beta2.OrderedJob getJobs(int index);
  /**
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.OrderedJob jobs = 8;</code>
   */
  int getJobsCount();
  /**
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.OrderedJob jobs = 8;</code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1beta2.OrderedJobOrBuilder> 
      getJobsOrBuilderList();
  /**
   * <pre>
   * Required. The Directed Acyclic Graph of Jobs to submit.
   * </pre>
   *
   * <code>repeated .google.cloud.dataproc.v1beta2.OrderedJob jobs = 8;</code>
   */
  com.google.cloud.dataproc.v1beta2.OrderedJobOrBuilder getJobsOrBuilder(
      int index);
}
