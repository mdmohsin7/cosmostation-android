// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: panacea/aol/v2/topic.proto
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

/// Topic defines a topic type.
struct Panacea_Aol_V2_Topic {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var description_p: String = String()

  var totalRecords: UInt64 = 0

  var totalWriters: UInt64 = 0

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "panacea.aol.v2"

extension Panacea_Aol_V2_Topic: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Topic"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "description"),
    2: .standard(proto: "total_records"),
    3: .standard(proto: "total_writers"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.description_p)
      case 2: try decoder.decodeSingularUInt64Field(value: &self.totalRecords)
      case 3: try decoder.decodeSingularUInt64Field(value: &self.totalWriters)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 1)
    }
    if self.totalRecords != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalRecords, fieldNumber: 2)
    }
    if self.totalWriters != 0 {
      try visitor.visitSingularUInt64Field(value: self.totalWriters, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Panacea_Aol_V2_Topic, rhs: Panacea_Aol_V2_Topic) -> Bool {
    if lhs.description_p != rhs.description_p {return false}
    if lhs.totalRecords != rhs.totalRecords {return false}
    if lhs.totalWriters != rhs.totalWriters {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
