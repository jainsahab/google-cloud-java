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
package com.google.cloud.advisorynotifications.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 *
 * <pre>
 * Service to manage Security and Privacy Notifications.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/advisorynotifications/v1/service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdvisoryNotificationsServiceGrpc {

  private AdvisoryNotificationsServiceGrpc() {}

  public static final String SERVICE_NAME =
      "google.cloud.advisorynotifications.v1.AdvisoryNotificationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.advisorynotifications.v1.ListNotificationsRequest,
          com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
      getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.google.cloud.advisorynotifications.v1.ListNotificationsRequest.class,
      responseType = com.google.cloud.advisorynotifications.v1.ListNotificationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.advisorynotifications.v1.ListNotificationsRequest,
          com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
      getListNotificationsMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.advisorynotifications.v1.ListNotificationsRequest,
            com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
        getListNotificationsMethod;
    if ((getListNotificationsMethod = AdvisoryNotificationsServiceGrpc.getListNotificationsMethod)
        == null) {
      synchronized (AdvisoryNotificationsServiceGrpc.class) {
        if ((getListNotificationsMethod =
                AdvisoryNotificationsServiceGrpc.getListNotificationsMethod)
            == null) {
          AdvisoryNotificationsServiceGrpc.getListNotificationsMethod =
              getListNotificationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.advisorynotifications.v1.ListNotificationsRequest,
                          com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.advisorynotifications.v1.ListNotificationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.advisorynotifications.v1.ListNotificationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AdvisoryNotificationsServiceMethodDescriptorSupplier(
                              "ListNotifications"))
                      .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.advisorynotifications.v1.GetNotificationRequest,
          com.google.cloud.advisorynotifications.v1.Notification>
      getGetNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotification",
      requestType = com.google.cloud.advisorynotifications.v1.GetNotificationRequest.class,
      responseType = com.google.cloud.advisorynotifications.v1.Notification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.cloud.advisorynotifications.v1.GetNotificationRequest,
          com.google.cloud.advisorynotifications.v1.Notification>
      getGetNotificationMethod() {
    io.grpc.MethodDescriptor<
            com.google.cloud.advisorynotifications.v1.GetNotificationRequest,
            com.google.cloud.advisorynotifications.v1.Notification>
        getGetNotificationMethod;
    if ((getGetNotificationMethod = AdvisoryNotificationsServiceGrpc.getGetNotificationMethod)
        == null) {
      synchronized (AdvisoryNotificationsServiceGrpc.class) {
        if ((getGetNotificationMethod = AdvisoryNotificationsServiceGrpc.getGetNotificationMethod)
            == null) {
          AdvisoryNotificationsServiceGrpc.getGetNotificationMethod =
              getGetNotificationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.advisorynotifications.v1.GetNotificationRequest,
                          com.google.cloud.advisorynotifications.v1.Notification>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotification"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.advisorynotifications.v1.GetNotificationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.advisorynotifications.v1.Notification
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new AdvisoryNotificationsServiceMethodDescriptorSupplier(
                              "GetNotification"))
                      .build();
        }
      }
    }
    return getGetNotificationMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static AdvisoryNotificationsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceStub>() {
          @java.lang.Override
          public AdvisoryNotificationsServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AdvisoryNotificationsServiceStub(channel, callOptions);
          }
        };
    return AdvisoryNotificationsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdvisoryNotificationsServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceBlockingStub>() {
          @java.lang.Override
          public AdvisoryNotificationsServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AdvisoryNotificationsServiceBlockingStub(channel, callOptions);
          }
        };
    return AdvisoryNotificationsServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static AdvisoryNotificationsServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<AdvisoryNotificationsServiceFutureStub>() {
          @java.lang.Override
          public AdvisoryNotificationsServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new AdvisoryNotificationsServiceFutureStub(channel, callOptions);
          }
        };
    return AdvisoryNotificationsServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Service to manage Security and Privacy Notifications.
   * </pre>
   */
  public abstract static class AdvisoryNotificationsServiceImplBase
      implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Lists notifications under a given parent.
     * </pre>
     */
    public void listNotifications(
        com.google.cloud.advisorynotifications.v1.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getListNotificationsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a notification.
     * </pre>
     */
    public void getNotification(
        com.google.cloud.advisorynotifications.v1.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.advisorynotifications.v1.Notification>
            responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetNotificationMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListNotificationsMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.advisorynotifications.v1.ListNotificationsRequest,
                      com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>(
                      this, METHODID_LIST_NOTIFICATIONS)))
          .addMethod(
              getGetNotificationMethod(),
              io.grpc.stub.ServerCalls.asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.advisorynotifications.v1.GetNotificationRequest,
                      com.google.cloud.advisorynotifications.v1.Notification>(
                      this, METHODID_GET_NOTIFICATION)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Service to manage Security and Privacy Notifications.
   * </pre>
   */
  public static final class AdvisoryNotificationsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AdvisoryNotificationsServiceStub> {
    private AdvisoryNotificationsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvisoryNotificationsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvisoryNotificationsServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists notifications under a given parent.
     * </pre>
     */
    public void listNotifications(
        com.google.cloud.advisorynotifications.v1.ListNotificationsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a notification.
     * </pre>
     */
    public void getNotification(
        com.google.cloud.advisorynotifications.v1.GetNotificationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.advisorynotifications.v1.Notification>
            responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Service to manage Security and Privacy Notifications.
   * </pre>
   */
  public static final class AdvisoryNotificationsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdvisoryNotificationsServiceBlockingStub> {
    private AdvisoryNotificationsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvisoryNotificationsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvisoryNotificationsServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists notifications under a given parent.
     * </pre>
     */
    public com.google.cloud.advisorynotifications.v1.ListNotificationsResponse listNotifications(
        com.google.cloud.advisorynotifications.v1.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a notification.
     * </pre>
     */
    public com.google.cloud.advisorynotifications.v1.Notification getNotification(
        com.google.cloud.advisorynotifications.v1.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Service to manage Security and Privacy Notifications.
   * </pre>
   */
  public static final class AdvisoryNotificationsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdvisoryNotificationsServiceFutureStub> {
    private AdvisoryNotificationsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdvisoryNotificationsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdvisoryNotificationsServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists notifications under a given parent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>
        listNotifications(
            com.google.cloud.advisorynotifications.v1.ListNotificationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a notification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.advisorynotifications.v1.Notification>
        getNotification(com.google.cloud.advisorynotifications.v1.GetNotificationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NOTIFICATIONS = 0;
  private static final int METHODID_GET_NOTIFICATION = 1;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AdvisoryNotificationsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AdvisoryNotificationsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications(
              (com.google.cloud.advisorynotifications.v1.ListNotificationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.advisorynotifications.v1.ListNotificationsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_NOTIFICATION:
          serviceImpl.getNotification(
              (com.google.cloud.advisorynotifications.v1.GetNotificationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.advisorynotifications.v1.Notification>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class AdvisoryNotificationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdvisoryNotificationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.advisorynotifications.v1.ServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AdvisoryNotificationsService");
    }
  }

  private static final class AdvisoryNotificationsServiceFileDescriptorSupplier
      extends AdvisoryNotificationsServiceBaseDescriptorSupplier {
    AdvisoryNotificationsServiceFileDescriptorSupplier() {}
  }

  private static final class AdvisoryNotificationsServiceMethodDescriptorSupplier
      extends AdvisoryNotificationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AdvisoryNotificationsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdvisoryNotificationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new AdvisoryNotificationsServiceFileDescriptorSupplier())
                      .addMethod(getListNotificationsMethod())
                      .addMethod(getGetNotificationMethod())
                      .build();
        }
      }
    }
    return result;
  }
}
