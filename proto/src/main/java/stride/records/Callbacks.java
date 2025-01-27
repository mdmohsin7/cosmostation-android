// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/records/callbacks.proto

package stride.records;

public final class Callbacks {
  private Callbacks() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TransferCallbackOrBuilder extends
      // @@protoc_insertion_point(interface_extends:stride.records.TransferCallback)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 deposit_record_id = 1;</code>
     * @return The depositRecordId.
     */
    long getDepositRecordId();
  }
  /**
   * <pre>
   * ---------------------- Transfer Callback ---------------------- //
   * </pre>
   *
   * Protobuf type {@code stride.records.TransferCallback}
   */
  public static final class TransferCallback extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:stride.records.TransferCallback)
      TransferCallbackOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TransferCallback.newBuilder() to construct.
    private TransferCallback(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TransferCallback() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TransferCallback();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TransferCallback(
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
            case 8: {

              depositRecordId_ = input.readUInt64();
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
      return stride.records.Callbacks.internal_static_stride_records_TransferCallback_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stride.records.Callbacks.internal_static_stride_records_TransferCallback_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stride.records.Callbacks.TransferCallback.class, stride.records.Callbacks.TransferCallback.Builder.class);
    }

    public static final int DEPOSIT_RECORD_ID_FIELD_NUMBER = 1;
    private long depositRecordId_;
    /**
     * <code>uint64 deposit_record_id = 1;</code>
     * @return The depositRecordId.
     */
    @java.lang.Override
    public long getDepositRecordId() {
      return depositRecordId_;
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
      if (depositRecordId_ != 0L) {
        output.writeUInt64(1, depositRecordId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (depositRecordId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, depositRecordId_);
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
      if (!(obj instanceof stride.records.Callbacks.TransferCallback)) {
        return super.equals(obj);
      }
      stride.records.Callbacks.TransferCallback other = (stride.records.Callbacks.TransferCallback) obj;

      if (getDepositRecordId()
          != other.getDepositRecordId()) return false;
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
      hash = (37 * hash) + DEPOSIT_RECORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDepositRecordId());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static stride.records.Callbacks.TransferCallback parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static stride.records.Callbacks.TransferCallback parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static stride.records.Callbacks.TransferCallback parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static stride.records.Callbacks.TransferCallback parseFrom(
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
    public static Builder newBuilder(stride.records.Callbacks.TransferCallback prototype) {
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
     * <pre>
     * ---------------------- Transfer Callback ---------------------- //
     * </pre>
     *
     * Protobuf type {@code stride.records.TransferCallback}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:stride.records.TransferCallback)
        stride.records.Callbacks.TransferCallbackOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return stride.records.Callbacks.internal_static_stride_records_TransferCallback_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return stride.records.Callbacks.internal_static_stride_records_TransferCallback_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                stride.records.Callbacks.TransferCallback.class, stride.records.Callbacks.TransferCallback.Builder.class);
      }

      // Construct using stride.records.Callbacks.TransferCallback.newBuilder()
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
        depositRecordId_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return stride.records.Callbacks.internal_static_stride_records_TransferCallback_descriptor;
      }

      @java.lang.Override
      public stride.records.Callbacks.TransferCallback getDefaultInstanceForType() {
        return stride.records.Callbacks.TransferCallback.getDefaultInstance();
      }

      @java.lang.Override
      public stride.records.Callbacks.TransferCallback build() {
        stride.records.Callbacks.TransferCallback result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public stride.records.Callbacks.TransferCallback buildPartial() {
        stride.records.Callbacks.TransferCallback result = new stride.records.Callbacks.TransferCallback(this);
        result.depositRecordId_ = depositRecordId_;
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
        if (other instanceof stride.records.Callbacks.TransferCallback) {
          return mergeFrom((stride.records.Callbacks.TransferCallback)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(stride.records.Callbacks.TransferCallback other) {
        if (other == stride.records.Callbacks.TransferCallback.getDefaultInstance()) return this;
        if (other.getDepositRecordId() != 0L) {
          setDepositRecordId(other.getDepositRecordId());
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
        stride.records.Callbacks.TransferCallback parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (stride.records.Callbacks.TransferCallback) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long depositRecordId_ ;
      /**
       * <code>uint64 deposit_record_id = 1;</code>
       * @return The depositRecordId.
       */
      @java.lang.Override
      public long getDepositRecordId() {
        return depositRecordId_;
      }
      /**
       * <code>uint64 deposit_record_id = 1;</code>
       * @param value The depositRecordId to set.
       * @return This builder for chaining.
       */
      public Builder setDepositRecordId(long value) {
        
        depositRecordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 deposit_record_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDepositRecordId() {
        
        depositRecordId_ = 0L;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:stride.records.TransferCallback)
    }

    // @@protoc_insertion_point(class_scope:stride.records.TransferCallback)
    private static final stride.records.Callbacks.TransferCallback DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new stride.records.Callbacks.TransferCallback();
    }

    public static stride.records.Callbacks.TransferCallback getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TransferCallback>
        PARSER = new com.google.protobuf.AbstractParser<TransferCallback>() {
      @java.lang.Override
      public TransferCallback parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TransferCallback(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TransferCallback> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TransferCallback> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public stride.records.Callbacks.TransferCallback getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stride_records_TransferCallback_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_records_TransferCallback_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036stride/records/callbacks.proto\022\016stride" +
      ".records\"-\n\020TransferCallback\022\031\n\021deposit_" +
      "record_id\030\001 \001(\004B2Z0github.com/Stride-Lab" +
      "s/stride/v5/x/records/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_stride_records_TransferCallback_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_records_TransferCallback_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_records_TransferCallback_descriptor,
        new java.lang.String[] { "DepositRecordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
