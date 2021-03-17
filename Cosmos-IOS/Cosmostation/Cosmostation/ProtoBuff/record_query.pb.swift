// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: record/query.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

/// QueryRecordRequest is the request type for the Query/Record RPC method
struct Irismod_Record_QueryRecordRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var recordID: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// QueryRecordResponse is the response type for the Query/Record RPC method
struct Irismod_Record_QueryRecordResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var record: Irismod_Record_Record {
    get {return _record ?? Irismod_Record_Record()}
    set {_record = newValue}
  }
  /// Returns true if `record` has been explicitly set.
  var hasRecord: Bool {return self._record != nil}
  /// Clears the value of `record`. Subsequent reads from it will return its default value.
  mutating func clearRecord() {self._record = nil}

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _record: Irismod_Record_Record? = nil
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "irismod.record"

extension Irismod_Record_QueryRecordRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryRecordRequest"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "record_id"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.recordID)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.recordID.isEmpty {
      try visitor.visitSingularStringField(value: self.recordID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Record_QueryRecordRequest, rhs: Irismod_Record_QueryRecordRequest) -> Bool {
    if lhs.recordID != rhs.recordID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Irismod_Record_QueryRecordResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".QueryRecordResponse"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "record"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._record)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._record {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Irismod_Record_QueryRecordResponse, rhs: Irismod_Record_QueryRecordResponse) -> Bool {
    if lhs._record != rhs._record {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}