// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * This filter defines the type of media items to be returned, for example,
 * videos or photos. All the specified media types are treated as an OR when
 * used together.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.MediaTypeFilter}
 */
public final class MediaTypeFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.MediaTypeFilter)
    MediaTypeFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MediaTypeFilter.newBuilder() to construct.
  private MediaTypeFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MediaTypeFilter() {
    mediaTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MediaTypeFilter(
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
          case 8:
            {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mediaTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              mediaTypes_.add(rawValue);
              break;
            }
          case 10:
            {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  mediaTypes_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000001;
                }
                mediaTypes_.add(rawValue);
              }
              input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        mediaTypes_ = java.util.Collections.unmodifiableList(mediaTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_MediaTypeFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_MediaTypeFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.MediaTypeFilter.class,
            com.google.photos.library.v1.proto.MediaTypeFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The set of media types that can be searched for.
   * </pre>
   *
   * Protobuf enum {@code google.photos.library.v1.MediaTypeFilter.MediaType}
   */
  public enum MediaType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Treated as if no filters are applied. All media types are included.
     * </pre>
     *
     * <code>ALL_MEDIA = 0;</code>
     */
    ALL_MEDIA(0),
    /**
     *
     *
     * <pre>
     * All media items that are considered videos.
     * This also includes movies the user has created using the Google Photos
     * app.
     * </pre>
     *
     * <code>VIDEO = 1;</code>
     */
    VIDEO(1),
    /**
     *
     *
     * <pre>
     * All media items that are considered photos. This includes .bmp, .gif,
     * .ico, .jpg (and other spellings), .tiff, .webp and special photo types
     * such as iOS live photos, Android motion photos, panoramas, photospheres.
     * </pre>
     *
     * <code>PHOTO = 2;</code>
     */
    PHOTO(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Treated as if no filters are applied. All media types are included.
     * </pre>
     *
     * <code>ALL_MEDIA = 0;</code>
     */
    public static final int ALL_MEDIA_VALUE = 0;
    /**
     *
     *
     * <pre>
     * All media items that are considered videos.
     * This also includes movies the user has created using the Google Photos
     * app.
     * </pre>
     *
     * <code>VIDEO = 1;</code>
     */
    public static final int VIDEO_VALUE = 1;
    /**
     *
     *
     * <pre>
     * All media items that are considered photos. This includes .bmp, .gif,
     * .ico, .jpg (and other spellings), .tiff, .webp and special photo types
     * such as iOS live photos, Android motion photos, panoramas, photospheres.
     * </pre>
     *
     * <code>PHOTO = 2;</code>
     */
    public static final int PHOTO_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static MediaType valueOf(int value) {
      return forNumber(value);
    }

    public static MediaType forNumber(int value) {
      switch (value) {
        case 0:
          return ALL_MEDIA;
        case 1:
          return VIDEO;
        case 2:
          return PHOTO;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MediaType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MediaType>() {
          public MediaType findValueByNumber(int number) {
            return MediaType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.photos.library.v1.proto.MediaTypeFilter.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final MediaType[] VALUES = values();

    public static MediaType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.photos.library.v1.MediaTypeFilter.MediaType)
  }

  public static final int MEDIA_TYPES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> mediaTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>
      mediaTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>() {
            public com.google.photos.library.v1.proto.MediaTypeFilter.MediaType convert(
                java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.photos.library.v1.proto.MediaTypeFilter.MediaType result =
                  com.google.photos.library.v1.proto.MediaTypeFilter.MediaType.valueOf(from);
              return result == null
                  ? com.google.photos.library.v1.proto.MediaTypeFilter.MediaType.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  public java.util.List<com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>
      getMediaTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>(
        mediaTypes_, mediaTypes_converter_);
  }
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  public int getMediaTypesCount() {
    return mediaTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  public com.google.photos.library.v1.proto.MediaTypeFilter.MediaType getMediaTypes(int index) {
    return mediaTypes_converter_.convert(mediaTypes_.get(index));
  }
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  public java.util.List<java.lang.Integer> getMediaTypesValueList() {
    return mediaTypes_;
  }
  /**
   *
   *
   * <pre>
   * The types of media items to be included. This field should be populated
   * with only one media type. If you specify multiple media types, it results
   * in an error.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
   */
  public int getMediaTypesValue(int index) {
    return mediaTypes_.get(index);
  }

  private int mediaTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getMediaTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(mediaTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < mediaTypes_.size(); i++) {
      output.writeEnumNoTag(mediaTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < mediaTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(mediaTypes_.get(i));
      }
      size += dataSize;
      if (!getMediaTypesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      mediaTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.photos.library.v1.proto.MediaTypeFilter)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.MediaTypeFilter other =
        (com.google.photos.library.v1.proto.MediaTypeFilter) obj;

    if (!mediaTypes_.equals(other.mediaTypes_)) return false;
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
    if (getMediaTypesCount() > 0) {
      hash = (37 * hash) + MEDIA_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + mediaTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter parseFrom(
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

  public static Builder newBuilder(com.google.photos.library.v1.proto.MediaTypeFilter prototype) {
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
   * This filter defines the type of media items to be returned, for example,
   * videos or photos. All the specified media types are treated as an OR when
   * used together.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.MediaTypeFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.MediaTypeFilter)
      com.google.photos.library.v1.proto.MediaTypeFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaTypeFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaTypeFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.MediaTypeFilter.class,
              com.google.photos.library.v1.proto.MediaTypeFilter.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.MediaTypeFilter.newBuilder()
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
      mediaTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_MediaTypeFilter_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaTypeFilter getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.MediaTypeFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaTypeFilter build() {
      com.google.photos.library.v1.proto.MediaTypeFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.MediaTypeFilter buildPartial() {
      com.google.photos.library.v1.proto.MediaTypeFilter result =
          new com.google.photos.library.v1.proto.MediaTypeFilter(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mediaTypes_ = java.util.Collections.unmodifiableList(mediaTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mediaTypes_ = mediaTypes_;
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
      if (other instanceof com.google.photos.library.v1.proto.MediaTypeFilter) {
        return mergeFrom((com.google.photos.library.v1.proto.MediaTypeFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.MediaTypeFilter other) {
      if (other == com.google.photos.library.v1.proto.MediaTypeFilter.getDefaultInstance())
        return this;
      if (!other.mediaTypes_.isEmpty()) {
        if (mediaTypes_.isEmpty()) {
          mediaTypes_ = other.mediaTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMediaTypesIsMutable();
          mediaTypes_.addAll(other.mediaTypes_);
        }
        onChanged();
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
      com.google.photos.library.v1.proto.MediaTypeFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.MediaTypeFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<java.lang.Integer> mediaTypes_ = java.util.Collections.emptyList();

    private void ensureMediaTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mediaTypes_ = new java.util.ArrayList<java.lang.Integer>(mediaTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public java.util.List<com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>
        getMediaTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>(
          mediaTypes_, mediaTypes_converter_);
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public int getMediaTypesCount() {
      return mediaTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public com.google.photos.library.v1.proto.MediaTypeFilter.MediaType getMediaTypes(int index) {
      return mediaTypes_converter_.convert(mediaTypes_.get(index));
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder setMediaTypes(
        int index, com.google.photos.library.v1.proto.MediaTypeFilter.MediaType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaTypesIsMutable();
      mediaTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder addMediaTypes(
        com.google.photos.library.v1.proto.MediaTypeFilter.MediaType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaTypesIsMutable();
      mediaTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder addAllMediaTypes(
        java.lang.Iterable<? extends com.google.photos.library.v1.proto.MediaTypeFilter.MediaType>
            values) {
      ensureMediaTypesIsMutable();
      for (com.google.photos.library.v1.proto.MediaTypeFilter.MediaType value : values) {
        mediaTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder clearMediaTypes() {
      mediaTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public java.util.List<java.lang.Integer> getMediaTypesValueList() {
      return java.util.Collections.unmodifiableList(mediaTypes_);
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public int getMediaTypesValue(int index) {
      return mediaTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder setMediaTypesValue(int index, int value) {
      ensureMediaTypesIsMutable();
      mediaTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder addMediaTypesValue(int value) {
      ensureMediaTypesIsMutable();
      mediaTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The types of media items to be included. This field should be populated
     * with only one media type. If you specify multiple media types, it results
     * in an error.
     * </pre>
     *
     * <code>repeated .google.photos.library.v1.MediaTypeFilter.MediaType media_types = 1;</code>
     */
    public Builder addAllMediaTypesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureMediaTypesIsMutable();
      for (int value : values) {
        mediaTypes_.add(value);
      }
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.MediaTypeFilter)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.MediaTypeFilter)
  private static final com.google.photos.library.v1.proto.MediaTypeFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.MediaTypeFilter();
  }

  public static com.google.photos.library.v1.proto.MediaTypeFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaTypeFilter> PARSER =
      new com.google.protobuf.AbstractParser<MediaTypeFilter>() {
        @java.lang.Override
        public MediaTypeFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MediaTypeFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MediaTypeFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaTypeFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.MediaTypeFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
