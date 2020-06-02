// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to remove a list of media items from an album.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest}
 */
public final class BatchRemoveMediaItemsFromAlbumRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest)
    BatchRemoveMediaItemsFromAlbumRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchRemoveMediaItemsFromAlbumRequest.newBuilder() to construct.
  private BatchRemoveMediaItemsFromAlbumRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchRemoveMediaItemsFromAlbumRequest() {
    mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    albumId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchRemoveMediaItemsFromAlbumRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchRemoveMediaItemsFromAlbumRequest(
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
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                mediaItemIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              mediaItemIds_.add(s);
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              albumId_ = s;
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
        mediaItemIds_ = mediaItemIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_BatchRemoveMediaItemsFromAlbumRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_BatchRemoveMediaItemsFromAlbumRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest.class,
            com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest.Builder.class);
  }

  public static final int MEDIA_ITEM_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList mediaItemIds_;
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * removed.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be removed in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   *
   * @return A list containing the mediaItemIds.
   */
  public com.google.protobuf.ProtocolStringList getMediaItemIdsList() {
    return mediaItemIds_;
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * removed.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be removed in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   *
   * @return The count of mediaItemIds.
   */
  public int getMediaItemIdsCount() {
    return mediaItemIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * removed.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be removed in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The mediaItemIds at the given index.
   */
  public java.lang.String getMediaItemIds(int index) {
    return mediaItemIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
   * removed.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be removed in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the mediaItemIds at the given index.
   */
  public com.google.protobuf.ByteString getMediaItemIdsBytes(int index) {
    return mediaItemIds_.getByteString(index);
  }

  public static final int ALBUM_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object albumId_;
  /**
   *
   *
   * <pre>
   * Identifier of the [Album][google.photos.types.Album] that the media
   * items are to be removed from.
   * </pre>
   *
   * <code>string album_id = 2;</code>
   *
   * @return The albumId.
   */
  public java.lang.String getAlbumId() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      albumId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifier of the [Album][google.photos.types.Album] that the media
   * items are to be removed from.
   * </pre>
   *
   * <code>string album_id = 2;</code>
   *
   * @return The bytes for albumId.
   */
  public com.google.protobuf.ByteString getAlbumIdBytes() {
    java.lang.Object ref = albumId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      albumId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < mediaItemIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mediaItemIds_.getRaw(i));
    }
    if (!getAlbumIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, albumId_);
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
      for (int i = 0; i < mediaItemIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(mediaItemIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMediaItemIdsList().size();
    }
    if (!getAlbumIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, albumId_);
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
    if (!(obj
        instanceof com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest other =
        (com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest) obj;

    if (!getMediaItemIdsList().equals(other.getMediaItemIdsList())) return false;
    if (!getAlbumId().equals(other.getAlbumId())) return false;
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
    if (getMediaItemIdsCount() > 0) {
      hash = (37 * hash) + MEDIA_ITEM_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getMediaItemIdsList().hashCode();
    }
    hash = (37 * hash) + ALBUM_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAlbumId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest prototype) {
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
   * Request to remove a list of media items from an album.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest)
      com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchRemoveMediaItemsFromAlbumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchRemoveMediaItemsFromAlbumRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest.class,
              com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest.newBuilder()
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
      mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      albumId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchRemoveMediaItemsFromAlbumRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
        getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest build() {
      com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest buildPartial() {
      com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest result =
          new com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        mediaItemIds_ = mediaItemIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mediaItemIds_ = mediaItemIds_;
      result.albumId_ = albumId_;
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
      if (other
          instanceof com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest) {
        return mergeFrom(
            (com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest other) {
      if (other
          == com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
              .getDefaultInstance()) return this;
      if (!other.mediaItemIds_.isEmpty()) {
        if (mediaItemIds_.isEmpty()) {
          mediaItemIds_ = other.mediaItemIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMediaItemIdsIsMutable();
          mediaItemIds_.addAll(other.mediaItemIds_);
        }
        onChanged();
      }
      if (!other.getAlbumId().isEmpty()) {
        albumId_ = other.albumId_;
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
      com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList mediaItemIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMediaItemIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mediaItemIds_ = new com.google.protobuf.LazyStringArrayList(mediaItemIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @return A list containing the mediaItemIds.
     */
    public com.google.protobuf.ProtocolStringList getMediaItemIdsList() {
      return mediaItemIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @return The count of mediaItemIds.
     */
    public int getMediaItemIdsCount() {
      return mediaItemIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The mediaItemIds at the given index.
     */
    public java.lang.String getMediaItemIds(int index) {
      return mediaItemIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the mediaItemIds at the given index.
     */
    public com.google.protobuf.ByteString getMediaItemIdsBytes(int index) {
      return mediaItemIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The mediaItemIds to set.
     * @return This builder for chaining.
     */
    public Builder setMediaItemIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param value The mediaItemIds to add.
     * @return This builder for chaining.
     */
    public Builder addMediaItemIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param values The mediaItemIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllMediaItemIds(java.lang.Iterable<java.lang.String> values) {
      ensureMediaItemIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mediaItemIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMediaItemIds() {
      mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the [MediaItem][google.photos.types.MediaItem]s to be
     * removed.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be removed in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     *
     * @param value The bytes of the mediaItemIds to add.
     * @return This builder for chaining.
     */
    public Builder addMediaItemIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object albumId_ = "";
    /**
     *
     *
     * <pre>
     * Identifier of the [Album][google.photos.types.Album] that the media
     * items are to be removed from.
     * </pre>
     *
     * <code>string album_id = 2;</code>
     *
     * @return The albumId.
     */
    public java.lang.String getAlbumId() {
      java.lang.Object ref = albumId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        albumId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the [Album][google.photos.types.Album] that the media
     * items are to be removed from.
     * </pre>
     *
     * <code>string album_id = 2;</code>
     *
     * @return The bytes for albumId.
     */
    public com.google.protobuf.ByteString getAlbumIdBytes() {
      java.lang.Object ref = albumId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        albumId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier of the [Album][google.photos.types.Album] that the media
     * items are to be removed from.
     * </pre>
     *
     * <code>string album_id = 2;</code>
     *
     * @param value The albumId to set.
     * @return This builder for chaining.
     */
    public Builder setAlbumId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      albumId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the [Album][google.photos.types.Album] that the media
     * items are to be removed from.
     * </pre>
     *
     * <code>string album_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAlbumId() {

      albumId_ = getDefaultInstance().getAlbumId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier of the [Album][google.photos.types.Album] that the media
     * items are to be removed from.
     * </pre>
     *
     * <code>string album_id = 2;</code>
     *
     * @param value The bytes for albumId to set.
     * @return This builder for chaining.
     */
    public Builder setAlbumIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      albumId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.BatchRemoveMediaItemsFromAlbumRequest)
  private static final com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest();
  }

  public static com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchRemoveMediaItemsFromAlbumRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchRemoveMediaItemsFromAlbumRequest>() {
        @java.lang.Override
        public BatchRemoveMediaItemsFromAlbumRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchRemoveMediaItemsFromAlbumRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchRemoveMediaItemsFromAlbumRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchRemoveMediaItemsFromAlbumRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.BatchRemoveMediaItemsFromAlbumRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
