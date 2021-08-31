//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: shentu/oracle/v1alpha1/tx.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import SwiftProtobuf


/// Msg defines the shield Msg service.
///
/// Usage: instantiate `Shentu_Oracle_V1alpha1_MsgClient`, then call methods of this protocol to make API calls.
internal protocol Shentu_Oracle_V1alpha1_MsgClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Shentu_Oracle_V1alpha1_MsgClientInterceptorFactoryProtocol? { get }

  func createOperator(
    _ request: Shentu_Oracle_V1alpha1_MsgCreateOperator,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgCreateOperator, Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse>

  func removeOperator(
    _ request: Shentu_Oracle_V1alpha1_MsgRemoveOperator,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgRemoveOperator, Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse>

  func addCollateral(
    _ request: Shentu_Oracle_V1alpha1_MsgAddCollateral,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgAddCollateral, Shentu_Oracle_V1alpha1_MsgAddCollateralResponse>

  func reduceCollateral(
    _ request: Shentu_Oracle_V1alpha1_MsgReduceCollateral,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgReduceCollateral, Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse>

  func withdrawReward(
    _ request: Shentu_Oracle_V1alpha1_MsgWithdrawReward,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgWithdrawReward, Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse>

  func createTask(
    _ request: Shentu_Oracle_V1alpha1_MsgCreateTask,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgCreateTask, Shentu_Oracle_V1alpha1_MsgCreateTaskResponse>

  func taskResponse(
    _ request: Shentu_Oracle_V1alpha1_MsgTaskResponse,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgTaskResponse, Shentu_Oracle_V1alpha1_MsgTaskResponseResponse>

  func deleteTask(
    _ request: Shentu_Oracle_V1alpha1_MsgDeleteTask,
    callOptions: CallOptions?
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgDeleteTask, Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse>
}

extension Shentu_Oracle_V1alpha1_MsgClientProtocol {
  internal var serviceName: String {
    return "shentu.oracle.v1alpha1.Msg"
  }

  /// Unary call to CreateOperator
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateOperator.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createOperator(
    _ request: Shentu_Oracle_V1alpha1_MsgCreateOperator,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgCreateOperator, Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/CreateOperator",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateOperatorInterceptors() ?? []
    )
  }

  /// Unary call to RemoveOperator
  ///
  /// - Parameters:
  ///   - request: Request to send to RemoveOperator.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func removeOperator(
    _ request: Shentu_Oracle_V1alpha1_MsgRemoveOperator,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgRemoveOperator, Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/RemoveOperator",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeRemoveOperatorInterceptors() ?? []
    )
  }

  /// Unary call to AddCollateral
  ///
  /// - Parameters:
  ///   - request: Request to send to AddCollateral.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func addCollateral(
    _ request: Shentu_Oracle_V1alpha1_MsgAddCollateral,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgAddCollateral, Shentu_Oracle_V1alpha1_MsgAddCollateralResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/AddCollateral",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeAddCollateralInterceptors() ?? []
    )
  }

  /// Unary call to ReduceCollateral
  ///
  /// - Parameters:
  ///   - request: Request to send to ReduceCollateral.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func reduceCollateral(
    _ request: Shentu_Oracle_V1alpha1_MsgReduceCollateral,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgReduceCollateral, Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/ReduceCollateral",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeReduceCollateralInterceptors() ?? []
    )
  }

  /// Unary call to WithdrawReward
  ///
  /// - Parameters:
  ///   - request: Request to send to WithdrawReward.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func withdrawReward(
    _ request: Shentu_Oracle_V1alpha1_MsgWithdrawReward,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgWithdrawReward, Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/WithdrawReward",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeWithdrawRewardInterceptors() ?? []
    )
  }

  /// Unary call to CreateTask
  ///
  /// - Parameters:
  ///   - request: Request to send to CreateTask.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func createTask(
    _ request: Shentu_Oracle_V1alpha1_MsgCreateTask,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgCreateTask, Shentu_Oracle_V1alpha1_MsgCreateTaskResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/CreateTask",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeCreateTaskInterceptors() ?? []
    )
  }

  /// Unary call to TaskResponse
  ///
  /// - Parameters:
  ///   - request: Request to send to TaskResponse.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func taskResponse(
    _ request: Shentu_Oracle_V1alpha1_MsgTaskResponse,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgTaskResponse, Shentu_Oracle_V1alpha1_MsgTaskResponseResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/TaskResponse",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeTaskResponseInterceptors() ?? []
    )
  }

  /// Unary call to DeleteTask
  ///
  /// - Parameters:
  ///   - request: Request to send to DeleteTask.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func deleteTask(
    _ request: Shentu_Oracle_V1alpha1_MsgDeleteTask,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Shentu_Oracle_V1alpha1_MsgDeleteTask, Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse> {
    return self.makeUnaryCall(
      path: "/shentu.oracle.v1alpha1.Msg/DeleteTask",
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeDeleteTaskInterceptors() ?? []
    )
  }
}

internal protocol Shentu_Oracle_V1alpha1_MsgClientInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when invoking 'createOperator'.
  func makeCreateOperatorInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgCreateOperator, Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse>]

  /// - Returns: Interceptors to use when invoking 'removeOperator'.
  func makeRemoveOperatorInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgRemoveOperator, Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse>]

  /// - Returns: Interceptors to use when invoking 'addCollateral'.
  func makeAddCollateralInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgAddCollateral, Shentu_Oracle_V1alpha1_MsgAddCollateralResponse>]

  /// - Returns: Interceptors to use when invoking 'reduceCollateral'.
  func makeReduceCollateralInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgReduceCollateral, Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse>]

  /// - Returns: Interceptors to use when invoking 'withdrawReward'.
  func makeWithdrawRewardInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgWithdrawReward, Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse>]

  /// - Returns: Interceptors to use when invoking 'createTask'.
  func makeCreateTaskInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgCreateTask, Shentu_Oracle_V1alpha1_MsgCreateTaskResponse>]

  /// - Returns: Interceptors to use when invoking 'taskResponse'.
  func makeTaskResponseInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgTaskResponse, Shentu_Oracle_V1alpha1_MsgTaskResponseResponse>]

  /// - Returns: Interceptors to use when invoking 'deleteTask'.
  func makeDeleteTaskInterceptors() -> [ClientInterceptor<Shentu_Oracle_V1alpha1_MsgDeleteTask, Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse>]
}

internal final class Shentu_Oracle_V1alpha1_MsgClient: Shentu_Oracle_V1alpha1_MsgClientProtocol {
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Shentu_Oracle_V1alpha1_MsgClientInterceptorFactoryProtocol?

  /// Creates a client for the shentu.oracle.v1alpha1.Msg service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Shentu_Oracle_V1alpha1_MsgClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

/// Msg defines the shield Msg service.
///
/// To build a server, implement a class that conforms to this protocol.
internal protocol Shentu_Oracle_V1alpha1_MsgProvider: CallHandlerProvider {
  var interceptors: Shentu_Oracle_V1alpha1_MsgServerInterceptorFactoryProtocol? { get }

  func createOperator(request: Shentu_Oracle_V1alpha1_MsgCreateOperator, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse>

  func removeOperator(request: Shentu_Oracle_V1alpha1_MsgRemoveOperator, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse>

  func addCollateral(request: Shentu_Oracle_V1alpha1_MsgAddCollateral, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgAddCollateralResponse>

  func reduceCollateral(request: Shentu_Oracle_V1alpha1_MsgReduceCollateral, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse>

  func withdrawReward(request: Shentu_Oracle_V1alpha1_MsgWithdrawReward, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse>

  func createTask(request: Shentu_Oracle_V1alpha1_MsgCreateTask, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgCreateTaskResponse>

  func taskResponse(request: Shentu_Oracle_V1alpha1_MsgTaskResponse, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgTaskResponseResponse>

  func deleteTask(request: Shentu_Oracle_V1alpha1_MsgDeleteTask, context: StatusOnlyCallContext) -> EventLoopFuture<Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse>
}

extension Shentu_Oracle_V1alpha1_MsgProvider {
  internal var serviceName: Substring { return "shentu.oracle.v1alpha1.Msg" }

  /// Determines, calls and returns the appropriate request handler, depending on the request's method.
  /// Returns nil for methods not handled by this service.
  internal func handle(
    method name: Substring,
    context: CallHandlerContext
  ) -> GRPCServerHandlerProtocol? {
    switch name {
    case "CreateOperator":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgCreateOperator>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse>(),
        interceptors: self.interceptors?.makeCreateOperatorInterceptors() ?? [],
        userFunction: self.createOperator(request:context:)
      )

    case "RemoveOperator":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgRemoveOperator>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse>(),
        interceptors: self.interceptors?.makeRemoveOperatorInterceptors() ?? [],
        userFunction: self.removeOperator(request:context:)
      )

    case "AddCollateral":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgAddCollateral>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgAddCollateralResponse>(),
        interceptors: self.interceptors?.makeAddCollateralInterceptors() ?? [],
        userFunction: self.addCollateral(request:context:)
      )

    case "ReduceCollateral":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgReduceCollateral>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse>(),
        interceptors: self.interceptors?.makeReduceCollateralInterceptors() ?? [],
        userFunction: self.reduceCollateral(request:context:)
      )

    case "WithdrawReward":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgWithdrawReward>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse>(),
        interceptors: self.interceptors?.makeWithdrawRewardInterceptors() ?? [],
        userFunction: self.withdrawReward(request:context:)
      )

    case "CreateTask":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgCreateTask>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgCreateTaskResponse>(),
        interceptors: self.interceptors?.makeCreateTaskInterceptors() ?? [],
        userFunction: self.createTask(request:context:)
      )

    case "TaskResponse":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgTaskResponse>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgTaskResponseResponse>(),
        interceptors: self.interceptors?.makeTaskResponseInterceptors() ?? [],
        userFunction: self.taskResponse(request:context:)
      )

    case "DeleteTask":
      return UnaryServerHandler(
        context: context,
        requestDeserializer: ProtobufDeserializer<Shentu_Oracle_V1alpha1_MsgDeleteTask>(),
        responseSerializer: ProtobufSerializer<Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse>(),
        interceptors: self.interceptors?.makeDeleteTaskInterceptors() ?? [],
        userFunction: self.deleteTask(request:context:)
      )

    default:
      return nil
    }
  }
}

internal protocol Shentu_Oracle_V1alpha1_MsgServerInterceptorFactoryProtocol {

  /// - Returns: Interceptors to use when handling 'createOperator'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateOperatorInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgCreateOperator, Shentu_Oracle_V1alpha1_MsgCreateOperatorResponse>]

  /// - Returns: Interceptors to use when handling 'removeOperator'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeRemoveOperatorInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgRemoveOperator, Shentu_Oracle_V1alpha1_MsgRemoveOperatorResponse>]

  /// - Returns: Interceptors to use when handling 'addCollateral'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeAddCollateralInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgAddCollateral, Shentu_Oracle_V1alpha1_MsgAddCollateralResponse>]

  /// - Returns: Interceptors to use when handling 'reduceCollateral'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeReduceCollateralInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgReduceCollateral, Shentu_Oracle_V1alpha1_MsgReduceCollateralResponse>]

  /// - Returns: Interceptors to use when handling 'withdrawReward'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeWithdrawRewardInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgWithdrawReward, Shentu_Oracle_V1alpha1_MsgWithdrawRewardResponse>]

  /// - Returns: Interceptors to use when handling 'createTask'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeCreateTaskInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgCreateTask, Shentu_Oracle_V1alpha1_MsgCreateTaskResponse>]

  /// - Returns: Interceptors to use when handling 'taskResponse'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeTaskResponseInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgTaskResponse, Shentu_Oracle_V1alpha1_MsgTaskResponseResponse>]

  /// - Returns: Interceptors to use when handling 'deleteTask'.
  ///   Defaults to calling `self.makeInterceptors()`.
  func makeDeleteTaskInterceptors() -> [ServerInterceptor<Shentu_Oracle_V1alpha1_MsgDeleteTask, Shentu_Oracle_V1alpha1_MsgDeleteTaskResponse>]
}
