// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/attribute/v1/query.proto

package io.provenance.attribute.v1;

public interface QueryAttributesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.attribute.v1.QueryAttributesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * account defines the address to query for.
   * </pre>
   *
   * <code>string account = 1;</code>
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   * <pre>
   * account defines the address to query for.
   * </pre>
   *
   * <code>string account = 1;</code>
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString
      getAccountBytes();

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   * @return The pagination.
   */
  cosmos.base.query.v1beta1.Pagination.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 2;</code>
   */
  cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder getPaginationOrBuilder();
}