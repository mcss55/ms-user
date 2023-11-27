package com.mcss.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.0)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserReadServiceGrpc {

  private UserReadServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.mcss.grpc.UserReadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mcss.grpc.lib.UserReadRequest,
      com.mcss.grpc.lib.UserReadResponse> getReadUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadUser",
      requestType = com.mcss.grpc.lib.UserReadRequest.class,
      responseType = com.mcss.grpc.lib.UserReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mcss.grpc.lib.UserReadRequest,
      com.mcss.grpc.lib.UserReadResponse> getReadUserMethod() {
    io.grpc.MethodDescriptor<com.mcss.grpc.lib.UserReadRequest, com.mcss.grpc.lib.UserReadResponse> getReadUserMethod;
    if ((getReadUserMethod = UserReadServiceGrpc.getReadUserMethod) == null) {
      synchronized (UserReadServiceGrpc.class) {
        if ((getReadUserMethod = UserReadServiceGrpc.getReadUserMethod) == null) {
          UserReadServiceGrpc.getReadUserMethod = getReadUserMethod =
              io.grpc.MethodDescriptor.<com.mcss.grpc.lib.UserReadRequest, com.mcss.grpc.lib.UserReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcss.grpc.lib.UserReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mcss.grpc.lib.UserReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserReadServiceMethodDescriptorSupplier("ReadUser"))
              .build();
        }
      }
    }
    return getReadUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserReadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserReadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserReadServiceStub>() {
        @java.lang.Override
        public UserReadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserReadServiceStub(channel, callOptions);
        }
      };
    return UserReadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserReadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserReadServiceBlockingStub>() {
        @java.lang.Override
        public UserReadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserReadServiceBlockingStub(channel, callOptions);
        }
      };
    return UserReadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserReadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserReadServiceFutureStub>() {
        @java.lang.Override
        public UserReadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserReadServiceFutureStub(channel, callOptions);
        }
      };
    return UserReadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void readUser(com.mcss.grpc.lib.UserReadRequest request,
        io.grpc.stub.StreamObserver<com.mcss.grpc.lib.UserReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserReadService.
   */
  public static abstract class UserReadServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserReadServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserReadService.
   */
  public static final class UserReadServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserReadServiceStub> {
    private UserReadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserReadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserReadServiceStub(channel, callOptions);
    }

    /**
     */
    public void readUser(com.mcss.grpc.lib.UserReadRequest request,
        io.grpc.stub.StreamObserver<com.mcss.grpc.lib.UserReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserReadService.
   */
  public static final class UserReadServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserReadServiceBlockingStub> {
    private UserReadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserReadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserReadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mcss.grpc.lib.UserReadResponse readUser(com.mcss.grpc.lib.UserReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserReadService.
   */
  public static final class UserReadServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserReadServiceFutureStub> {
    private UserReadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserReadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserReadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mcss.grpc.lib.UserReadResponse> readUser(
        com.mcss.grpc.lib.UserReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_USER:
          serviceImpl.readUser((com.mcss.grpc.lib.UserReadRequest) request,
              (io.grpc.stub.StreamObserver<com.mcss.grpc.lib.UserReadResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReadUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.mcss.grpc.lib.UserReadRequest,
              com.mcss.grpc.lib.UserReadResponse>(
                service, METHODID_READ_USER)))
        .build();
  }

  private static abstract class UserReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserReadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mcss.grpc.lib.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserReadService");
    }
  }

  private static final class UserReadServiceFileDescriptorSupplier
      extends UserReadServiceBaseDescriptorSupplier {
    UserReadServiceFileDescriptorSupplier() {}
  }

  private static final class UserReadServiceMethodDescriptorSupplier
      extends UserReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserReadServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserReadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserReadServiceFileDescriptorSupplier())
              .addMethod(getReadUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
