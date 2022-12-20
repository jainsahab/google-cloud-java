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
// source: google/cloud/secretmanager/v1/resources.proto

package com.google.cloud.secretmanager.v1;

public interface ReplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.secretmanager.v1.Replication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will automatically be
   * replicated without any restrictions.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.Automatic automatic = 1;</code>
   *
   * @return Whether the automatic field is set.
   */
  boolean hasAutomatic();
  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will automatically be
   * replicated without any restrictions.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.Automatic automatic = 1;</code>
   *
   * @return The automatic.
   */
  com.google.cloud.secretmanager.v1.Replication.Automatic getAutomatic();
  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will automatically be
   * replicated without any restrictions.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.Automatic automatic = 1;</code>
   */
  com.google.cloud.secretmanager.v1.Replication.AutomaticOrBuilder getAutomaticOrBuilder();

  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will only be
   * replicated into the locations specified.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.UserManaged user_managed = 2;</code>
   *
   * @return Whether the userManaged field is set.
   */
  boolean hasUserManaged();
  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will only be
   * replicated into the locations specified.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.UserManaged user_managed = 2;</code>
   *
   * @return The userManaged.
   */
  com.google.cloud.secretmanager.v1.Replication.UserManaged getUserManaged();
  /**
   *
   *
   * <pre>
   * The [Secret][google.cloud.secretmanager.v1.Secret] will only be
   * replicated into the locations specified.
   * </pre>
   *
   * <code>.google.cloud.secretmanager.v1.Replication.UserManaged user_managed = 2;</code>
   */
  com.google.cloud.secretmanager.v1.Replication.UserManagedOrBuilder getUserManagedOrBuilder();

  public com.google.cloud.secretmanager.v1.Replication.ReplicationCase getReplicationCase();
}
