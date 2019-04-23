// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/types/date_range.proto

package com.google.photos.types.proto;

/**
 *
 *
 * <pre>
 * Defines a range of dates. Both dates must be of the same format. For more
 * information, see &lt;a href="#Date"&gt;Date&lt;/a&gt;
 * </pre>
 *
 * Protobuf type {@code google.photos.types.DateRange}
 */
public final class DateRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.types.DateRange)
    DateRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DateRange.newBuilder() to construct.
  private DateRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DateRange() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DateRange(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              com.google.type.Date.Builder subBuilder = null;
              if (startDate_ != null) {
                subBuilder = startDate_.toBuilder();
              }
              startDate_ = input.readMessage(com.google.type.Date.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startDate_);
                startDate_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.type.Date.Builder subBuilder = null;
              if (endDate_ != null) {
                subBuilder = endDate_.toBuilder();
              }
              endDate_ = input.readMessage(com.google.type.Date.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endDate_);
                endDate_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.types.proto.DateRangeProto
        .internal_static_google_photos_types_DateRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.types.proto.DateRangeProto
        .internal_static_google_photos_types_DateRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.types.proto.DateRange.class,
            com.google.photos.types.proto.DateRange.Builder.class);
  }

  public static final int START_DATE_FIELD_NUMBER = 1;
  private com.google.type.Date startDate_;
  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  public boolean hasStartDate() {
    return startDate_ != null;
  }
  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  public com.google.type.Date getStartDate() {
    return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
  }
  /**
   *
   *
   * <pre>
   * The start date (included as part of the range) in one of the formats
   * described.
   * </pre>
   *
   * <code>.google.type.Date start_date = 1;</code>
   */
  public com.google.type.DateOrBuilder getStartDateOrBuilder() {
    return getStartDate();
  }

  public static final int END_DATE_FIELD_NUMBER = 2;
  private com.google.type.Date endDate_;
  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  public boolean hasEndDate() {
    return endDate_ != null;
  }
  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  public com.google.type.Date getEndDate() {
    return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
  }
  /**
   *
   *
   * <pre>
   * The end date (included as part of the range). It must be specified in the
   * same format as the start date.
   * </pre>
   *
   * <code>.google.type.Date end_date = 2;</code>
   */
  public com.google.type.DateOrBuilder getEndDateOrBuilder() {
    return getEndDate();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (startDate_ != null) {
      output.writeMessage(1, getStartDate());
    }
    if (endDate_ != null) {
      output.writeMessage(2, getEndDate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startDate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartDate());
    }
    if (endDate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndDate());
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
    if (!(obj instanceof com.google.photos.types.proto.DateRange)) {
      return super.equals(obj);
    }
    com.google.photos.types.proto.DateRange other = (com.google.photos.types.proto.DateRange) obj;

    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate().equals(other.getStartDate())) return false;
    }
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate().equals(other.getEndDate())) return false;
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
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.types.proto.DateRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.types.proto.DateRange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.types.proto.DateRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.types.proto.DateRange parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.photos.types.proto.DateRange prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Defines a range of dates. Both dates must be of the same format. For more
   * information, see &lt;a href="#Date"&gt;Date&lt;/a&gt;
   * </pre>
   *
   * Protobuf type {@code google.photos.types.DateRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.types.DateRange)
      com.google.photos.types.proto.DateRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.types.proto.DateRangeProto
          .internal_static_google_photos_types_DateRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.types.proto.DateRangeProto
          .internal_static_google_photos_types_DateRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.types.proto.DateRange.class,
              com.google.photos.types.proto.DateRange.Builder.class);
    }

    // Construct using com.google.photos.types.proto.DateRange.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (startDateBuilder_ == null) {
        startDate_ = null;
      } else {
        startDate_ = null;
        startDateBuilder_ = null;
      }
      if (endDateBuilder_ == null) {
        endDate_ = null;
      } else {
        endDate_ = null;
        endDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.types.proto.DateRangeProto
          .internal_static_google_photos_types_DateRange_descriptor;
    }

    @java.lang.Override
    public com.google.photos.types.proto.DateRange getDefaultInstanceForType() {
      return com.google.photos.types.proto.DateRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.types.proto.DateRange build() {
      com.google.photos.types.proto.DateRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.types.proto.DateRange buildPartial() {
      com.google.photos.types.proto.DateRange result =
          new com.google.photos.types.proto.DateRange(this);
      if (startDateBuilder_ == null) {
        result.startDate_ = startDate_;
      } else {
        result.startDate_ = startDateBuilder_.build();
      }
      if (endDateBuilder_ == null) {
        result.endDate_ = endDate_;
      } else {
        result.endDate_ = endDateBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.types.proto.DateRange) {
        return mergeFrom((com.google.photos.types.proto.DateRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.types.proto.DateRange other) {
      if (other == com.google.photos.types.proto.DateRange.getDefaultInstance()) return this;
      if (other.hasStartDate()) {
        mergeStartDate(other.getStartDate());
      }
      if (other.hasEndDate()) {
        mergeEndDate(other.getEndDate());
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
      com.google.photos.types.proto.DateRange parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.photos.types.proto.DateRange) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.Date startDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        startDateBuilder_;
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public boolean hasStartDate() {
      return startDateBuilder_ != null || startDate_ != null;
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public com.google.type.Date getStartDate() {
      if (startDateBuilder_ == null) {
        return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
      } else {
        return startDateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public Builder setStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startDate_ = value;
        onChanged();
      } else {
        startDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public Builder setStartDate(com.google.type.Date.Builder builderForValue) {
      if (startDateBuilder_ == null) {
        startDate_ = builderForValue.build();
        onChanged();
      } else {
        startDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public Builder mergeStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (startDate_ != null) {
          startDate_ = com.google.type.Date.newBuilder(startDate_).mergeFrom(value).buildPartial();
        } else {
          startDate_ = value;
        }
        onChanged();
      } else {
        startDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public Builder clearStartDate() {
      if (startDateBuilder_ == null) {
        startDate_ = null;
        onChanged();
      } else {
        startDate_ = null;
        startDateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public com.google.type.Date.Builder getStartDateBuilder() {

      onChanged();
      return getStartDateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    public com.google.type.DateOrBuilder getStartDateOrBuilder() {
      if (startDateBuilder_ != null) {
        return startDateBuilder_.getMessageOrBuilder();
      } else {
        return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
      }
    }
    /**
     *
     *
     * <pre>
     * The start date (included as part of the range) in one of the formats
     * described.
     * </pre>
     *
     * <code>.google.type.Date start_date = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        getStartDateFieldBuilder() {
      if (startDateBuilder_ == null) {
        startDateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getStartDate(), getParentForChildren(), isClean());
        startDate_ = null;
      }
      return startDateBuilder_;
    }

    private com.google.type.Date endDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        endDateBuilder_;
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public boolean hasEndDate() {
      return endDateBuilder_ != null || endDate_ != null;
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public com.google.type.Date getEndDate() {
      if (endDateBuilder_ == null) {
        return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
      } else {
        return endDateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public Builder setEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endDate_ = value;
        onChanged();
      } else {
        endDateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public Builder setEndDate(com.google.type.Date.Builder builderForValue) {
      if (endDateBuilder_ == null) {
        endDate_ = builderForValue.build();
        onChanged();
      } else {
        endDateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public Builder mergeEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (endDate_ != null) {
          endDate_ = com.google.type.Date.newBuilder(endDate_).mergeFrom(value).buildPartial();
        } else {
          endDate_ = value;
        }
        onChanged();
      } else {
        endDateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public Builder clearEndDate() {
      if (endDateBuilder_ == null) {
        endDate_ = null;
        onChanged();
      } else {
        endDate_ = null;
        endDateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public com.google.type.Date.Builder getEndDateBuilder() {

      onChanged();
      return getEndDateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    public com.google.type.DateOrBuilder getEndDateOrBuilder() {
      if (endDateBuilder_ != null) {
        return endDateBuilder_.getMessageOrBuilder();
      } else {
        return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
      }
    }
    /**
     *
     *
     * <pre>
     * The end date (included as part of the range). It must be specified in the
     * same format as the start date.
     * </pre>
     *
     * <code>.google.type.Date end_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        getEndDateFieldBuilder() {
      if (endDateBuilder_ == null) {
        endDateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getEndDate(), getParentForChildren(), isClean());
        endDate_ = null;
      }
      return endDateBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.types.DateRange)
  }

  // @@protoc_insertion_point(class_scope:google.photos.types.DateRange)
  private static final com.google.photos.types.proto.DateRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.types.proto.DateRange();
  }

  public static com.google.photos.types.proto.DateRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DateRange> PARSER =
      new com.google.protobuf.AbstractParser<DateRange>() {
        @java.lang.Override
        public DateRange parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DateRange(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DateRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DateRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.types.proto.DateRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
