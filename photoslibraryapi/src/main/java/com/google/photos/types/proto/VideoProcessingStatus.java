// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/types/media_item.proto

package com.google.photos.types.proto;

/**
 *
 *
 * <pre>
 * Processing status of a video being uploaded to Google Photos.
 * </pre>
 *
 * Protobuf enum {@code google.photos.types.VideoProcessingStatus}
 */
public enum VideoProcessingStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Video processing status is unknown.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Video is being processed. The user sees an icon for this
   * video in the Google Photos app; however, it isn't playable yet.
   * </pre>
   *
   * <code>PROCESSING = 1;</code>
   */
  PROCESSING(1),
  /**
   *
   *
   * <pre>
   * Video processing is complete and it is now ready for viewing.
   * </pre>
   *
   * <code>READY = 2;</code>
   */
  READY(2),
  /**
   *
   *
   * <pre>
   * Something has gone wrong and the video has failed to process.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Video processing status is unknown.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Video is being processed. The user sees an icon for this
   * video in the Google Photos app; however, it isn't playable yet.
   * </pre>
   *
   * <code>PROCESSING = 1;</code>
   */
  public static final int PROCESSING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Video processing is complete and it is now ready for viewing.
   * </pre>
   *
   * <code>READY = 2;</code>
   */
  public static final int READY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Something has gone wrong and the video has failed to process.
   * </pre>
   *
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VideoProcessingStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VideoProcessingStatus forNumber(int value) {
    switch (value) {
      case 0:
        return UNSPECIFIED;
      case 1:
        return PROCESSING;
      case 2:
        return READY;
      case 3:
        return FAILED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VideoProcessingStatus>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<VideoProcessingStatus>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VideoProcessingStatus>() {
            public VideoProcessingStatus findValueByNumber(int number) {
              return VideoProcessingStatus.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.photos.types.proto.MediaItemProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final VideoProcessingStatus[] VALUES = values();

  public static VideoProcessingStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VideoProcessingStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.photos.types.VideoProcessingStatus)
}
