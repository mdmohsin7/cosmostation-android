// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package io.provenance.metadata.v1.p8e;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.p8e.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   * @return Whether the ref field is set.
   */
  boolean hasRef();
  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   * @return The ref.
   */
  io.provenance.metadata.v1.p8e.ProvenanceReference getRef();
  /**
   * <code>.provenance.metadata.v1.p8e.ProvenanceReference ref = 1;</code>
   */
  io.provenance.metadata.v1.p8e.ProvenanceReferenceOrBuilder getRefOrBuilder();

  /**
   * <code>string classname = 2;</code>
   * @return The classname.
   */
  java.lang.String getClassname();
  /**
   * <code>string classname = 2;</code>
   * @return The bytes for classname.
   */
  com.google.protobuf.ByteString
      getClassnameBytes();
}