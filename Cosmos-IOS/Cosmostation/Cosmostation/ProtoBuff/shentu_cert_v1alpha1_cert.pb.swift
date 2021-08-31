// DO NOT EDIT.
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: shentu/cert/v1alpha1/cert.proto
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

enum Shentu_Cert_V1alpha1_CertificateType: SwiftProtobuf.Enum {
  typealias RawValue = Int
  case certTypeUnspecified // = 0
  case certTypeCompilation // = 1
  case certTypeAuditing // = 2
  case certTypeProof // = 3
  case certTypeOracleOperator // = 4
  case certTypeShieldPoolCreator // = 5
  case certTypeIdentity // = 6
  case certTypeGeneral // = 7
  case UNRECOGNIZED(Int)

  init() {
    self = .certTypeUnspecified
  }

  init?(rawValue: Int) {
    switch rawValue {
    case 0: self = .certTypeUnspecified
    case 1: self = .certTypeCompilation
    case 2: self = .certTypeAuditing
    case 3: self = .certTypeProof
    case 4: self = .certTypeOracleOperator
    case 5: self = .certTypeShieldPoolCreator
    case 6: self = .certTypeIdentity
    case 7: self = .certTypeGeneral
    default: self = .UNRECOGNIZED(rawValue)
    }
  }

  var rawValue: Int {
    switch self {
    case .certTypeUnspecified: return 0
    case .certTypeCompilation: return 1
    case .certTypeAuditing: return 2
    case .certTypeProof: return 3
    case .certTypeOracleOperator: return 4
    case .certTypeShieldPoolCreator: return 5
    case .certTypeIdentity: return 6
    case .certTypeGeneral: return 7
    case .UNRECOGNIZED(let i): return i
    }
  }

}

#if swift(>=4.2)

extension Shentu_Cert_V1alpha1_CertificateType: CaseIterable {
  // The compiler won't synthesize support with the UNRECOGNIZED case.
  static var allCases: [Shentu_Cert_V1alpha1_CertificateType] = [
    .certTypeUnspecified,
    .certTypeCompilation,
    .certTypeAuditing,
    .certTypeProof,
    .certTypeOracleOperator,
    .certTypeShieldPoolCreator,
    .certTypeIdentity,
    .certTypeGeneral,
  ]
}

#endif  // swift(>=4.2)

struct Shentu_Cert_V1alpha1_Certifier {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var alias: String = String()

  var proposer: String = String()

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_CompilationContent {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var compiler: String = String()

  var bytecodeHash: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_Certificate {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var certificateID: UInt64 = 0

  var content: Google_Protobuf2_Any {
    get {return _content ?? Google_Protobuf2_Any()}
    set {_content = newValue}
  }
  /// Returns true if `content` has been explicitly set.
  var hasContent: Bool {return self._content != nil}
  /// Clears the value of `content`. Subsequent reads from it will return its default value.
  mutating func clearContent() {self._content = nil}

  var compilationContent: Shentu_Cert_V1alpha1_CompilationContent {
    get {return _compilationContent ?? Shentu_Cert_V1alpha1_CompilationContent()}
    set {_compilationContent = newValue}
  }
  /// Returns true if `compilationContent` has been explicitly set.
  var hasCompilationContent: Bool {return self._compilationContent != nil}
  /// Clears the value of `compilationContent`. Subsequent reads from it will return its default value.
  mutating func clearCompilationContent() {self._compilationContent = nil}

  var description_p: String = String()

  var certifier: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _content: Google_Protobuf2_Any? = nil
  fileprivate var _compilationContent: Shentu_Cert_V1alpha1_CompilationContent? = nil
}

/// Library is a type for certified libraries.
struct Shentu_Cert_V1alpha1_Library {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var address: String = String()

  var publisher: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_Compilation {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_Auditing {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_Proof {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_OracleOperator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_ShieldPoolCreator {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_Identity {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_General {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var content: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

/// Platform is a genesis type for certified platform of a validator
struct Shentu_Cert_V1alpha1_Platform {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var validatorPubkey: Google_Protobuf2_Any {
    get {return _validatorPubkey ?? Google_Protobuf2_Any()}
    set {_validatorPubkey = newValue}
  }
  /// Returns true if `validatorPubkey` has been explicitly set.
  var hasValidatorPubkey: Bool {return self._validatorPubkey != nil}
  /// Clears the value of `validatorPubkey`. Subsequent reads from it will return its default value.
  mutating func clearValidatorPubkey() {self._validatorPubkey = nil}

  var description_p: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}

  fileprivate var _validatorPubkey: Google_Protobuf2_Any? = nil
}

/// CertifierUpdateProposal adds or removes a certifier
struct Shentu_Cert_V1alpha1_CertifierUpdateProposal {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var title: String = String()

  var proposer: String = String()

  var alias: String = String()

  var certifier: String = String()

  var description_p: String = String()

  var addOrRemove: Bool = false

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

struct Shentu_Cert_V1alpha1_KVPair {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  var key: String = String()

  var value: String = String()

  var unknownFields = SwiftProtobuf.UnknownStorage()

  init() {}
}

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "shentu.cert.v1alpha1"

extension Shentu_Cert_V1alpha1_CertificateType: SwiftProtobuf._ProtoNameProviding {
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    0: .same(proto: "CERT_TYPE_UNSPECIFIED"),
    1: .same(proto: "CERT_TYPE_COMPILATION"),
    2: .same(proto: "CERT_TYPE_AUDITING"),
    3: .same(proto: "CERT_TYPE_PROOF"),
    4: .same(proto: "CERT_TYPE_ORACLE_OPERATOR"),
    5: .same(proto: "CERT_TYPE_SHIELD_POOL_CREATOR"),
    6: .same(proto: "CERT_TYPE_IDENTITY"),
    7: .same(proto: "CERT_TYPE_GENERAL"),
  ]
}

extension Shentu_Cert_V1alpha1_Certifier: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Certifier"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "alias"),
    3: .same(proto: "proposer"),
    4: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.address)
      case 2: try decoder.decodeSingularStringField(value: &self.alias)
      case 3: try decoder.decodeSingularStringField(value: &self.proposer)
      case 4: try decoder.decodeSingularStringField(value: &self.description_p)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.alias.isEmpty {
      try visitor.visitSingularStringField(value: self.alias, fieldNumber: 2)
    }
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Certifier, rhs: Shentu_Cert_V1alpha1_Certifier) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.alias != rhs.alias {return false}
    if lhs.proposer != rhs.proposer {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_CompilationContent: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CompilationContent"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "compiler"),
    2: .standard(proto: "bytecode_hash"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.compiler)
      case 2: try decoder.decodeSingularStringField(value: &self.bytecodeHash)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.compiler.isEmpty {
      try visitor.visitSingularStringField(value: self.compiler, fieldNumber: 1)
    }
    if !self.bytecodeHash.isEmpty {
      try visitor.visitSingularStringField(value: self.bytecodeHash, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_CompilationContent, rhs: Shentu_Cert_V1alpha1_CompilationContent) -> Bool {
    if lhs.compiler != rhs.compiler {return false}
    if lhs.bytecodeHash != rhs.bytecodeHash {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Certificate: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Certificate"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "certificate_id"),
    2: .same(proto: "content"),
    3: .standard(proto: "compilation_content"),
    4: .same(proto: "description"),
    5: .same(proto: "certifier"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularUInt64Field(value: &self.certificateID)
      case 2: try decoder.decodeSingularMessageField(value: &self._content)
      case 3: try decoder.decodeSingularMessageField(value: &self._compilationContent)
      case 4: try decoder.decodeSingularStringField(value: &self.description_p)
      case 5: try decoder.decodeSingularStringField(value: &self.certifier)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.certificateID != 0 {
      try visitor.visitSingularUInt64Field(value: self.certificateID, fieldNumber: 1)
    }
    if let v = self._content {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
    }
    if let v = self._compilationContent {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 4)
    }
    if !self.certifier.isEmpty {
      try visitor.visitSingularStringField(value: self.certifier, fieldNumber: 5)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Certificate, rhs: Shentu_Cert_V1alpha1_Certificate) -> Bool {
    if lhs.certificateID != rhs.certificateID {return false}
    if lhs._content != rhs._content {return false}
    if lhs._compilationContent != rhs._compilationContent {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.certifier != rhs.certifier {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Library: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Library"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "address"),
    2: .same(proto: "publisher"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.address)
      case 2: try decoder.decodeSingularStringField(value: &self.publisher)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.address.isEmpty {
      try visitor.visitSingularStringField(value: self.address, fieldNumber: 1)
    }
    if !self.publisher.isEmpty {
      try visitor.visitSingularStringField(value: self.publisher, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Library, rhs: Shentu_Cert_V1alpha1_Library) -> Bool {
    if lhs.address != rhs.address {return false}
    if lhs.publisher != rhs.publisher {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Compilation: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Compilation"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Compilation, rhs: Shentu_Cert_V1alpha1_Compilation) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Auditing: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Auditing"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Auditing, rhs: Shentu_Cert_V1alpha1_Auditing) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Proof: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Proof"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Proof, rhs: Shentu_Cert_V1alpha1_Proof) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_OracleOperator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".OracleOperator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_OracleOperator, rhs: Shentu_Cert_V1alpha1_OracleOperator) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_ShieldPoolCreator: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".ShieldPoolCreator"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_ShieldPoolCreator, rhs: Shentu_Cert_V1alpha1_ShieldPoolCreator) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Identity: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Identity"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Identity, rhs: Shentu_Cert_V1alpha1_Identity) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_General: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".General"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.content)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_General, rhs: Shentu_Cert_V1alpha1_General) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_Platform: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".Platform"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "validator_pubkey"),
    2: .same(proto: "description"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularMessageField(value: &self._validatorPubkey)
      case 2: try decoder.decodeSingularStringField(value: &self.description_p)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if let v = self._validatorPubkey {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_Platform, rhs: Shentu_Cert_V1alpha1_Platform) -> Bool {
    if lhs._validatorPubkey != rhs._validatorPubkey {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_CertifierUpdateProposal: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".CertifierUpdateProposal"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "title"),
    2: .same(proto: "proposer"),
    3: .same(proto: "alias"),
    4: .same(proto: "certifier"),
    5: .same(proto: "description"),
    6: .standard(proto: "add_or_remove"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.title)
      case 2: try decoder.decodeSingularStringField(value: &self.proposer)
      case 3: try decoder.decodeSingularStringField(value: &self.alias)
      case 4: try decoder.decodeSingularStringField(value: &self.certifier)
      case 5: try decoder.decodeSingularStringField(value: &self.description_p)
      case 6: try decoder.decodeSingularBoolField(value: &self.addOrRemove)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.title.isEmpty {
      try visitor.visitSingularStringField(value: self.title, fieldNumber: 1)
    }
    if !self.proposer.isEmpty {
      try visitor.visitSingularStringField(value: self.proposer, fieldNumber: 2)
    }
    if !self.alias.isEmpty {
      try visitor.visitSingularStringField(value: self.alias, fieldNumber: 3)
    }
    if !self.certifier.isEmpty {
      try visitor.visitSingularStringField(value: self.certifier, fieldNumber: 4)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 5)
    }
    if self.addOrRemove != false {
      try visitor.visitSingularBoolField(value: self.addOrRemove, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_CertifierUpdateProposal, rhs: Shentu_Cert_V1alpha1_CertifierUpdateProposal) -> Bool {
    if lhs.title != rhs.title {return false}
    if lhs.proposer != rhs.proposer {return false}
    if lhs.alias != rhs.alias {return false}
    if lhs.certifier != rhs.certifier {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.addOrRemove != rhs.addOrRemove {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Shentu_Cert_V1alpha1_KVPair: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  static let protoMessageName: String = _protobuf_package + ".KVPair"
  static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "key"),
    2: .same(proto: "value"),
  ]

  mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      switch fieldNumber {
      case 1: try decoder.decodeSingularStringField(value: &self.key)
      case 2: try decoder.decodeSingularStringField(value: &self.value)
      default: break
      }
    }
  }

  func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.key.isEmpty {
      try visitor.visitSingularStringField(value: self.key, fieldNumber: 1)
    }
    if !self.value.isEmpty {
      try visitor.visitSingularStringField(value: self.value, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  static func ==(lhs: Shentu_Cert_V1alpha1_KVPair, rhs: Shentu_Cert_V1alpha1_KVPair) -> Bool {
    if lhs.key != rhs.key {return false}
    if lhs.value != rhs.value {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
