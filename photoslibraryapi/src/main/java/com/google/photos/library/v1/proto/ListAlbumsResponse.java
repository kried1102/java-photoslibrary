// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * List of albums requested.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.ListAlbumsResponse}
 */
public final class ListAlbumsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.ListAlbumsResponse)
    ListAlbumsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAlbumsResponse.newBuilder() to construct.
  private ListAlbumsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAlbumsResponse() {
    albums_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAlbumsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListAlbumsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                albums_ = new java.util.ArrayList<com.google.photos.types.proto.Album>();
                mutable_bitField0_ |= 0x00000001;
              }
              albums_.add(
                  input.readMessage(
                      com.google.photos.types.proto.Album.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
        albums_ = java.util.Collections.unmodifiableList(albums_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ListAlbumsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_ListAlbumsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.ListAlbumsResponse.class,
            com.google.photos.library.v1.proto.ListAlbumsResponse.Builder.class);
  }

  public static final int ALBUMS_FIELD_NUMBER = 1;
  private java.util.List<com.google.photos.types.proto.Album> albums_;
  /**
   *
   *
   * <pre>
   * Output only. List of albums shown in the Albums tab of the user's Google
   * Photos app.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album albums = 1;</code>
   */
  public java.util.List<com.google.photos.types.proto.Album> getAlbumsList() {
    return albums_;
  }
  /**
   *
   *
   * <pre>
   * Output only. List of albums shown in the Albums tab of the user's Google
   * Photos app.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album albums = 1;</code>
   */
  public java.util.List<? extends com.google.photos.types.proto.AlbumOrBuilder>
      getAlbumsOrBuilderList() {
    return albums_;
  }
  /**
   *
   *
   * <pre>
   * Output only. List of albums shown in the Albums tab of the user's Google
   * Photos app.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album albums = 1;</code>
   */
  public int getAlbumsCount() {
    return albums_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. List of albums shown in the Albums tab of the user's Google
   * Photos app.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album albums = 1;</code>
   */
  public com.google.photos.types.proto.Album getAlbums(int index) {
    return albums_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. List of albums shown in the Albums tab of the user's Google
   * Photos app.
   * </pre>
   *
   * <code>repeated .google.photos.types.Album albums = 1;</code>
   */
  public com.google.photos.types.proto.AlbumOrBuilder getAlbumsOrBuilder(int index) {
    return albums_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Output only. Token to use to get the next set of albums. Populated if
   * there are more albums to retrieve for this request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Token to use to get the next set of albums. Populated if
   * there are more albums to retrieve for this request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < albums_.size(); i++) {
      output.writeMessage(1, albums_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < albums_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, albums_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.photos.library.v1.proto.ListAlbumsResponse)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.ListAlbumsResponse other =
        (com.google.photos.library.v1.proto.ListAlbumsResponse) obj;

    if (!getAlbumsList().equals(other.getAlbumsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getAlbumsCount() > 0) {
      hash = (37 * hash) + ALBUMS_FIELD_NUMBER;
      hash = (53 * hash) + getAlbumsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse parseFrom(
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
      com.google.photos.library.v1.proto.ListAlbumsResponse prototype) {
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
   * List of albums requested.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.ListAlbumsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.ListAlbumsResponse)
      com.google.photos.library.v1.proto.ListAlbumsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListAlbumsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListAlbumsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.ListAlbumsResponse.class,
              com.google.photos.library.v1.proto.ListAlbumsResponse.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.ListAlbumsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAlbumsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (albumsBuilder_ == null) {
        albums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        albumsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_ListAlbumsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListAlbumsResponse getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.ListAlbumsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListAlbumsResponse build() {
      com.google.photos.library.v1.proto.ListAlbumsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.ListAlbumsResponse buildPartial() {
      com.google.photos.library.v1.proto.ListAlbumsResponse result =
          new com.google.photos.library.v1.proto.ListAlbumsResponse(this);
      int from_bitField0_ = bitField0_;
      if (albumsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          albums_ = java.util.Collections.unmodifiableList(albums_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.albums_ = albums_;
      } else {
        result.albums_ = albumsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.photos.library.v1.proto.ListAlbumsResponse) {
        return mergeFrom((com.google.photos.library.v1.proto.ListAlbumsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.ListAlbumsResponse other) {
      if (other == com.google.photos.library.v1.proto.ListAlbumsResponse.getDefaultInstance())
        return this;
      if (albumsBuilder_ == null) {
        if (!other.albums_.isEmpty()) {
          if (albums_.isEmpty()) {
            albums_ = other.albums_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAlbumsIsMutable();
            albums_.addAll(other.albums_);
          }
          onChanged();
        }
      } else {
        if (!other.albums_.isEmpty()) {
          if (albumsBuilder_.isEmpty()) {
            albumsBuilder_.dispose();
            albumsBuilder_ = null;
            albums_ = other.albums_;
            bitField0_ = (bitField0_ & ~0x00000001);
            albumsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAlbumsFieldBuilder()
                    : null;
          } else {
            albumsBuilder_.addAllMessages(other.albums_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.photos.library.v1.proto.ListAlbumsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.ListAlbumsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.photos.types.proto.Album> albums_ =
        java.util.Collections.emptyList();

    private void ensureAlbumsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        albums_ = new java.util.ArrayList<com.google.photos.types.proto.Album>(albums_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.photos.types.proto.Album,
            com.google.photos.types.proto.Album.Builder,
            com.google.photos.types.proto.AlbumOrBuilder>
        albumsBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public java.util.List<com.google.photos.types.proto.Album> getAlbumsList() {
      if (albumsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(albums_);
      } else {
        return albumsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public int getAlbumsCount() {
      if (albumsBuilder_ == null) {
        return albums_.size();
      } else {
        return albumsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public com.google.photos.types.proto.Album getAlbums(int index) {
      if (albumsBuilder_ == null) {
        return albums_.get(index);
      } else {
        return albumsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder setAlbums(int index, com.google.photos.types.proto.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.set(index, value);
        onChanged();
      } else {
        albumsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder setAlbums(
        int index, com.google.photos.types.proto.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.set(index, builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder addAlbums(com.google.photos.types.proto.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.add(value);
        onChanged();
      } else {
        albumsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder addAlbums(int index, com.google.photos.types.proto.Album value) {
      if (albumsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAlbumsIsMutable();
        albums_.add(index, value);
        onChanged();
      } else {
        albumsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder addAlbums(com.google.photos.types.proto.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.add(builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder addAlbums(
        int index, com.google.photos.types.proto.Album.Builder builderForValue) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.add(index, builderForValue.build());
        onChanged();
      } else {
        albumsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder addAllAlbums(
        java.lang.Iterable<? extends com.google.photos.types.proto.Album> values) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, albums_);
        onChanged();
      } else {
        albumsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder clearAlbums() {
      if (albumsBuilder_ == null) {
        albums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        albumsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public Builder removeAlbums(int index) {
      if (albumsBuilder_ == null) {
        ensureAlbumsIsMutable();
        albums_.remove(index);
        onChanged();
      } else {
        albumsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public com.google.photos.types.proto.Album.Builder getAlbumsBuilder(int index) {
      return getAlbumsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public com.google.photos.types.proto.AlbumOrBuilder getAlbumsOrBuilder(int index) {
      if (albumsBuilder_ == null) {
        return albums_.get(index);
      } else {
        return albumsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public java.util.List<? extends com.google.photos.types.proto.AlbumOrBuilder>
        getAlbumsOrBuilderList() {
      if (albumsBuilder_ != null) {
        return albumsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(albums_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public com.google.photos.types.proto.Album.Builder addAlbumsBuilder() {
      return getAlbumsFieldBuilder()
          .addBuilder(com.google.photos.types.proto.Album.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public com.google.photos.types.proto.Album.Builder addAlbumsBuilder(int index) {
      return getAlbumsFieldBuilder()
          .addBuilder(index, com.google.photos.types.proto.Album.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. List of albums shown in the Albums tab of the user's Google
     * Photos app.
     * </pre>
     *
     * <code>repeated .google.photos.types.Album albums = 1;</code>
     */
    public java.util.List<com.google.photos.types.proto.Album.Builder> getAlbumsBuilderList() {
      return getAlbumsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.photos.types.proto.Album,
            com.google.photos.types.proto.Album.Builder,
            com.google.photos.types.proto.AlbumOrBuilder>
        getAlbumsFieldBuilder() {
      if (albumsBuilder_ == null) {
        albumsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.photos.types.proto.Album,
                com.google.photos.types.proto.Album.Builder,
                com.google.photos.types.proto.AlbumOrBuilder>(
                albums_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        albums_ = null;
      }
      return albumsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Token to use to get the next set of albums. Populated if
     * there are more albums to retrieve for this request.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.ListAlbumsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.ListAlbumsResponse)
  private static final com.google.photos.library.v1.proto.ListAlbumsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.ListAlbumsResponse();
  }

  public static com.google.photos.library.v1.proto.ListAlbumsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAlbumsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAlbumsResponse>() {
        @java.lang.Override
        public ListAlbumsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListAlbumsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListAlbumsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAlbumsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.ListAlbumsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
