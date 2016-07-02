package com.my.tutorial;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CommonDump.proto

public final class MyProtoBuf {
  private MyProtoBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CommonDumpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:wtable.common.dump.CommonDump)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint32 tableId = 1;</code>
     */
    boolean hasTableId();
    /**
     * <code>optional uint32 tableId = 1;</code>
     */
    int getTableId();

    /**
     * <code>optional uint32 colSpace = 2;</code>
     */
    boolean hasColSpace();
    /**
     * <code>optional uint32 colSpace = 2;</code>
     */
    int getColSpace();

    /**
     * <code>optional bytes rowKey = 3;</code>
     */
    boolean hasRowKey();
    /**
     * <code>optional bytes rowKey = 3;</code>
     */
    com.google.protobuf.ByteString getRowKey();

    /**
     * <code>optional bytes colKey = 4;</code>
     */
    boolean hasColKey();
    /**
     * <code>optional bytes colKey = 4;</code>
     */
    com.google.protobuf.ByteString getColKey();

    /**
     * <code>optional bytes value = 5;</code>
     */
    boolean hasValue();
    /**
     * <code>optional bytes value = 5;</code>
     */
    com.google.protobuf.ByteString getValue();

    /**
     * <code>optional int64 score = 6;</code>
     */
    boolean hasScore();
    /**
     * <code>optional int64 score = 6;</code>
     */
    long getScore();

    /**
     * <code>optional uint32 ttl = 7;</code>
     */
    boolean hasTtl();
    /**
     * <code>optional uint32 ttl = 7;</code>
     */
    int getTtl();
  }
  /**
   * Protobuf type {@code wtable.common.dump.CommonDump}
   */
  public static final class CommonDump extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:wtable.common.dump.CommonDump)
      CommonDumpOrBuilder {
    // Use CommonDump.newBuilder() to construct.
    private CommonDump(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CommonDump(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CommonDump defaultInstance;
    public static CommonDump getDefaultInstance() {
      return defaultInstance;
    }

    public CommonDump getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CommonDump(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              tableId_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              colSpace_ = input.readUInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              rowKey_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              colKey_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              value_ = input.readBytes();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              score_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              ttl_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MyProtoBuf.internal_static_wtable_common_dump_CommonDump_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MyProtoBuf.internal_static_wtable_common_dump_CommonDump_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MyProtoBuf.CommonDump.class, MyProtoBuf.CommonDump.Builder.class);
    }

    public static com.google.protobuf.Parser<CommonDump> PARSER =
        new com.google.protobuf.AbstractParser<CommonDump>() {
      public CommonDump parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CommonDump(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CommonDump> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TABLEID_FIELD_NUMBER = 1;
    private int tableId_;
    /**
     * <code>optional uint32 tableId = 1;</code>
     */
    public boolean hasTableId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 tableId = 1;</code>
     */
    public int getTableId() {
      return tableId_;
    }

    public static final int COLSPACE_FIELD_NUMBER = 2;
    private int colSpace_;
    /**
     * <code>optional uint32 colSpace = 2;</code>
     */
    public boolean hasColSpace() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 colSpace = 2;</code>
     */
    public int getColSpace() {
      return colSpace_;
    }

    public static final int ROWKEY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString rowKey_;
    /**
     * <code>optional bytes rowKey = 3;</code>
     */
    public boolean hasRowKey() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes rowKey = 3;</code>
     */
    public com.google.protobuf.ByteString getRowKey() {
      return rowKey_;
    }

    public static final int COLKEY_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString colKey_;
    /**
     * <code>optional bytes colKey = 4;</code>
     */
    public boolean hasColKey() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes colKey = 4;</code>
     */
    public com.google.protobuf.ByteString getColKey() {
      return colKey_;
    }

    public static final int VALUE_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString value_;
    /**
     * <code>optional bytes value = 5;</code>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional bytes value = 5;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }

    public static final int SCORE_FIELD_NUMBER = 6;
    private long score_;
    /**
     * <code>optional int64 score = 6;</code>
     */
    public boolean hasScore() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int64 score = 6;</code>
     */
    public long getScore() {
      return score_;
    }

    public static final int TTL_FIELD_NUMBER = 7;
    private int ttl_;
    /**
     * <code>optional uint32 ttl = 7;</code>
     */
    public boolean hasTtl() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint32 ttl = 7;</code>
     */
    public int getTtl() {
      return ttl_;
    }

    private void initFields() {
      tableId_ = 0;
      colSpace_ = 0;
      rowKey_ = com.google.protobuf.ByteString.EMPTY;
      colKey_ = com.google.protobuf.ByteString.EMPTY;
      value_ = com.google.protobuf.ByteString.EMPTY;
      score_ = 0L;
      ttl_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, tableId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, colSpace_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, rowKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, colKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, value_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, score_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(7, ttl_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, tableId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, colSpace_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, rowKey_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, colKey_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, value_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, score_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, ttl_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static MyProtoBuf.CommonDump parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MyProtoBuf.CommonDump parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MyProtoBuf.CommonDump parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MyProtoBuf.CommonDump parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MyProtoBuf.CommonDump parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MyProtoBuf.CommonDump parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MyProtoBuf.CommonDump parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MyProtoBuf.CommonDump parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MyProtoBuf.CommonDump parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MyProtoBuf.CommonDump parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MyProtoBuf.CommonDump prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code wtable.common.dump.CommonDump}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:wtable.common.dump.CommonDump)
        MyProtoBuf.CommonDumpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MyProtoBuf.internal_static_wtable_common_dump_CommonDump_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MyProtoBuf.internal_static_wtable_common_dump_CommonDump_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MyProtoBuf.CommonDump.class, MyProtoBuf.CommonDump.Builder.class);
      }

      // Construct using WTableDump.CommonDump.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        tableId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        colSpace_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rowKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        colKey_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        value_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000010);
        score_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        ttl_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MyProtoBuf.internal_static_wtable_common_dump_CommonDump_descriptor;
      }

      public MyProtoBuf.CommonDump getDefaultInstanceForType() {
        return MyProtoBuf.CommonDump.getDefaultInstance();
      }

      public MyProtoBuf.CommonDump build() {
        MyProtoBuf.CommonDump result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MyProtoBuf.CommonDump buildPartial() {
        MyProtoBuf.CommonDump result = new MyProtoBuf.CommonDump(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tableId_ = tableId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.colSpace_ = colSpace_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.rowKey_ = rowKey_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.colKey_ = colKey_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.value_ = value_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.score_ = score_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.ttl_ = ttl_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MyProtoBuf.CommonDump) {
          return mergeFrom((MyProtoBuf.CommonDump)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MyProtoBuf.CommonDump other) {
        if (other == MyProtoBuf.CommonDump.getDefaultInstance()) return this;
        if (other.hasTableId()) {
          setTableId(other.getTableId());
        }
        if (other.hasColSpace()) {
          setColSpace(other.getColSpace());
        }
        if (other.hasRowKey()) {
          setRowKey(other.getRowKey());
        }
        if (other.hasColKey()) {
          setColKey(other.getColKey());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        if (other.hasScore()) {
          setScore(other.getScore());
        }
        if (other.hasTtl()) {
          setTtl(other.getTtl());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        MyProtoBuf.CommonDump parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MyProtoBuf.CommonDump) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tableId_ ;
      /**
       * <code>optional uint32 tableId = 1;</code>
       */
      public boolean hasTableId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint32 tableId = 1;</code>
       */
      public int getTableId() {
        return tableId_;
      }
      /**
       * <code>optional uint32 tableId = 1;</code>
       */
      public Builder setTableId(int value) {
        bitField0_ |= 0x00000001;
        tableId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 tableId = 1;</code>
       */
      public Builder clearTableId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tableId_ = 0;
        onChanged();
        return this;
      }

      private int colSpace_ ;
      /**
       * <code>optional uint32 colSpace = 2;</code>
       */
      public boolean hasColSpace() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint32 colSpace = 2;</code>
       */
      public int getColSpace() {
        return colSpace_;
      }
      /**
       * <code>optional uint32 colSpace = 2;</code>
       */
      public Builder setColSpace(int value) {
        bitField0_ |= 0x00000002;
        colSpace_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 colSpace = 2;</code>
       */
      public Builder clearColSpace() {
        bitField0_ = (bitField0_ & ~0x00000002);
        colSpace_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString rowKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes rowKey = 3;</code>
       */
      public boolean hasRowKey() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes rowKey = 3;</code>
       */
      public com.google.protobuf.ByteString getRowKey() {
        return rowKey_;
      }
      /**
       * <code>optional bytes rowKey = 3;</code>
       */
      public Builder setRowKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        rowKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes rowKey = 3;</code>
       */
      public Builder clearRowKey() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rowKey_ = getDefaultInstance().getRowKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString colKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes colKey = 4;</code>
       */
      public boolean hasColKey() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bytes colKey = 4;</code>
       */
      public com.google.protobuf.ByteString getColKey() {
        return colKey_;
      }
      /**
       * <code>optional bytes colKey = 4;</code>
       */
      public Builder setColKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        colKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes colKey = 4;</code>
       */
      public Builder clearColKey() {
        bitField0_ = (bitField0_ & ~0x00000008);
        colKey_ = getDefaultInstance().getColKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes value = 5;</code>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional bytes value = 5;</code>
       */
      public com.google.protobuf.ByteString getValue() {
        return value_;
      }
      /**
       * <code>optional bytes value = 5;</code>
       */
      public Builder setValue(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes value = 5;</code>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000010);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }

      private long score_ ;
      /**
       * <code>optional int64 score = 6;</code>
       */
      public boolean hasScore() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int64 score = 6;</code>
       */
      public long getScore() {
        return score_;
      }
      /**
       * <code>optional int64 score = 6;</code>
       */
      public Builder setScore(long value) {
        bitField0_ |= 0x00000020;
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 score = 6;</code>
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000020);
        score_ = 0L;
        onChanged();
        return this;
      }

      private int ttl_ ;
      /**
       * <code>optional uint32 ttl = 7;</code>
       */
      public boolean hasTtl() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint32 ttl = 7;</code>
       */
      public int getTtl() {
        return ttl_;
      }
      /**
       * <code>optional uint32 ttl = 7;</code>
       */
      public Builder setTtl(int value) {
        bitField0_ |= 0x00000040;
        ttl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint32 ttl = 7;</code>
       */
      public Builder clearTtl() {
        bitField0_ = (bitField0_ & ~0x00000040);
        ttl_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:wtable.common.dump.CommonDump)
    }

    static {
      defaultInstance = new CommonDump(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:wtable.common.dump.CommonDump)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wtable_common_dump_CommonDump_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_wtable_common_dump_CommonDump_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020CommonDump.proto\022\022wtable.common.dump\"z" +
      "\n\nCommonDump\022\017\n\007tableId\030\001 \001(\r\022\020\n\010colSpac" +
      "e\030\002 \001(\r\022\016\n\006rowKey\030\003 \001(\014\022\016\n\006colKey\030\004 \001(\014\022" +
      "\r\n\005value\030\005 \001(\014\022\r\n\005score\030\006 \001(\003\022\013\n\003ttl\030\007 \001" +
      "(\rB\020\n\000B\nWTableDumpH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_wtable_common_dump_CommonDump_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wtable_common_dump_CommonDump_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_wtable_common_dump_CommonDump_descriptor,
        new java.lang.String[] { "TableId", "ColSpace", "RowKey", "ColKey", "Value", "Score", "Ttl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
