// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/aol/v2/record.proto
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

/// Record defines a record type.
struct Panacea_Aol_V2_Record {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: Data = SwiftProtobuf.Internal.emptyData

  var value: Data = SwiftProtobuf.Internal.emptyData

  var nanoTimestamp: Int64 = 0

  var writerAddress: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.aol.v2"

extension Panacea_Aol_V2_Record: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Record"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
    3: .standard(proto: "nano_timestamp"),
    4: .standard(proto: "writer_address"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularBytesField(value: &self.key)
      case 2: try decoder.decodeSingularBytesField(value: &self.value)
      case 3: try decoder.decodeSingularInt64Field(value: &self.nanoTimestamp)
      case 4: try decoder.decodeSingularStringField(value: &self.writerAddress)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularBytesField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularBytesField(value: self.value, fieldNumber: 2)
    }
    if self.nanoTimestamp != 0 {
      try visitor.visitSingularInt64Field(value: self.nanoTimestamp, fieldNumber: 3)
    }
    if !self.writerAddress.isEmpty {
      try visitor.visitSingularStringField(value: self.writerAddress, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_Record, rhs: Panacea_Aol_V2_Record) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.nanoTimestamp != rhs.nanoTimestamp {return false}
    if lhs.writerAddress != rhs.writerAddress {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
