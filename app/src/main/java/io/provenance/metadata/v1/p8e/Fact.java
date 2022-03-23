// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package io.provenance.metadata.v1.p8e;

/**
 * Protobuf type {@code provenance.metadata.v1.p8e.Fact}
 */
public final class Fact extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.p8e.Fact)
    FactOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Fact.newBuilder() to construct.
  private Fact(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Fact() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Fact();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Fact(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            io.provenance.metadata.v1.p8e.Location.Builder subBuilder = null;
            if (dataLocation_ != null) {
              subBuilder = dataLocation_.toBuilder();
            }
            dataLocation_ = input.readMessage(io.provenance.metadata.v1.p8e.Location.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataLocation_);
              dataLocation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Fact_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Fact_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.provenance.metadata.v1.p8e.Fact.class, io.provenance.metadata.v1.p8e.Fact.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_LOCATION_FIELD_NUMBER = 2;
  private io.provenance.metadata.v1.p8e.Location dataLocation_;
  /**
   * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
   * @return Whether the dataLocation field is set.
   */
  @java.lang.Override
  public boolean hasDataLocation() {
    return dataLocation_ != null;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
   * @return The dataLocation.
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.Location getDataLocation() {
    return dataLocation_ == null ? io.provenance.metadata.v1.p8e.Location.getDefaultInstance() : dataLocation_;
  }
  /**
   * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
   */
  @java.lang.Override
  public io.provenance.metadata.v1.p8e.LocationOrBuilder getDataLocationOrBuilder() {
    return getDataLocation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (dataLocation_ != null) {
      output.writeMessage(2, getDataLocation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (dataLocation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataLocation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.provenance.metadata.v1.p8e.Fact)) {
      return super.equals(obj);
    }
    io.provenance.metadata.v1.p8e.Fact other = (io.provenance.metadata.v1.p8e.Fact) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasDataLocation() != other.hasDataLocation()) return false;
    if (hasDataLocation()) {
      if (!getDataLocation()
          .equals(other.getDataLocation())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasDataLocation()) {
      hash = (37 * hash) + DATA_LOCATION_FIELD_NUMBER;
      hash = (53 * hash) + getDataLocation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.provenance.metadata.v1.p8e.Fact parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.provenance.metadata.v1.p8e.Fact prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code provenance.metadata.v1.p8e.Fact}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.p8e.Fact)
      io.provenance.metadata.v1.p8e.FactOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Fact_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Fact_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.provenance.metadata.v1.p8e.Fact.class, io.provenance.metadata.v1.p8e.Fact.Builder.class);
    }

    // Construct using io.provenance.metadata.v1.p8e.Fact.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (dataLocationBuilder_ == null) {
        dataLocation_ = null;
      } else {
        dataLocation_ = null;
        dataLocationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.provenance.metadata.v1.p8e.P8E.internal_static_provenance_metadata_v1_p8e_Fact_descriptor;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Fact getDefaultInstanceForType() {
      return io.provenance.metadata.v1.p8e.Fact.getDefaultInstance();
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Fact build() {
      io.provenance.metadata.v1.p8e.Fact result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.provenance.metadata.v1.p8e.Fact buildPartial() {
      io.provenance.metadata.v1.p8e.Fact result = new io.provenance.metadata.v1.p8e.Fact(this);
      result.name_ = name_;
      if (dataLocationBuilder_ == null) {
        result.dataLocation_ = dataLocation_;
      } else {
        result.dataLocation_ = dataLocationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.provenance.metadata.v1.p8e.Fact) {
        return mergeFrom((io.provenance.metadata.v1.p8e.Fact)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.provenance.metadata.v1.p8e.Fact other) {
      if (other == io.provenance.metadata.v1.p8e.Fact.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasDataLocation()) {
        mergeDataLocation(other.getDataLocation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.provenance.metadata.v1.p8e.Fact parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.provenance.metadata.v1.p8e.Fact) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private io.provenance.metadata.v1.p8e.Location dataLocation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.Location, io.provenance.metadata.v1.p8e.Location.Builder, io.provenance.metadata.v1.p8e.LocationOrBuilder> dataLocationBuilder_;
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     * @return Whether the dataLocation field is set.
     */
    public boolean hasDataLocation() {
      return dataLocationBuilder_ != null || dataLocation_ != null;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     * @return The dataLocation.
     */
    public io.provenance.metadata.v1.p8e.Location getDataLocation() {
      if (dataLocationBuilder_ == null) {
        return dataLocation_ == null ? io.provenance.metadata.v1.p8e.Location.getDefaultInstance() : dataLocation_;
      } else {
        return dataLocationBuilder_.getMessage();
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public Builder setDataLocation(io.provenance.metadata.v1.p8e.Location value) {
      if (dataLocationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataLocation_ = value;
        onChanged();
      } else {
        dataLocationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public Builder setDataLocation(
        io.provenance.metadata.v1.p8e.Location.Builder builderForValue) {
      if (dataLocationBuilder_ == null) {
        dataLocation_ = builderForValue.build();
        onChanged();
      } else {
        dataLocationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public Builder mergeDataLocation(io.provenance.metadata.v1.p8e.Location value) {
      if (dataLocationBuilder_ == null) {
        if (dataLocation_ != null) {
          dataLocation_ =
            io.provenance.metadata.v1.p8e.Location.newBuilder(dataLocation_).mergeFrom(value).buildPartial();
        } else {
          dataLocation_ = value;
        }
        onChanged();
      } else {
        dataLocationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public Builder clearDataLocation() {
      if (dataLocationBuilder_ == null) {
        dataLocation_ = null;
        onChanged();
      } else {
        dataLocation_ = null;
        dataLocationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public io.provenance.metadata.v1.p8e.Location.Builder getDataLocationBuilder() {
      
      onChanged();
      return getDataLocationFieldBuilder().getBuilder();
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    public io.provenance.metadata.v1.p8e.LocationOrBuilder getDataLocationOrBuilder() {
      if (dataLocationBuilder_ != null) {
        return dataLocationBuilder_.getMessageOrBuilder();
      } else {
        return dataLocation_ == null ?
            io.provenance.metadata.v1.p8e.Location.getDefaultInstance() : dataLocation_;
      }
    }
    /**
     * <code>.provenance.metadata.v1.p8e.Location data_location = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.provenance.metadata.v1.p8e.Location, io.provenance.metadata.v1.p8e.Location.Builder, io.provenance.metadata.v1.p8e.LocationOrBuilder> 
        getDataLocationFieldBuilder() {
      if (dataLocationBuilder_ == null) {
        dataLocationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.provenance.metadata.v1.p8e.Location, io.provenance.metadata.v1.p8e.Location.Builder, io.provenance.metadata.v1.p8e.LocationOrBuilder>(
                getDataLocation(),
                getParentForChildren(),
                isClean());
        dataLocation_ = null;
      }
      return dataLocationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.p8e.Fact)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.p8e.Fact)
  private static final io.provenance.metadata.v1.p8e.Fact DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.provenance.metadata.v1.p8e.Fact();
  }

  public static io.provenance.metadata.v1.p8e.Fact getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Fact>
      PARSER = new com.google.protobuf.AbstractParser<Fact>() {
    @java.lang.Override
    public Fact parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Fact(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Fact> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Fact> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.provenance.metadata.v1.p8e.Fact getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
