// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package io.provenance.marker.v1;

public interface QueryDenomMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.QueryDenomMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   * @return The metadata.
   */
  cosmos.bank.v1beta1.Bank.Metadata getMetadata();
  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.bank.v1beta1.Bank.MetadataOrBuilder getMetadataOrBuilder();
}