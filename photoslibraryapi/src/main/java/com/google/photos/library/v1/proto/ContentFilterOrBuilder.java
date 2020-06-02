// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface ContentFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.ContentFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of categories to be included in the media item search results.
   * The items in the set are ORed. There's a maximum of 10
   * `includedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory included_content_categories = 1;
   * </code>
   *
   * @return A list containing the includedContentCategories.
   */
  java.util.List<com.google.photos.library.v1.proto.ContentCategory>
      getIncludedContentCategoriesList();
  /**
   *
   *
   * <pre>
   * The set of categories to be included in the media item search results.
   * The items in the set are ORed. There's a maximum of 10
   * `includedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory included_content_categories = 1;
   * </code>
   *
   * @return The count of includedContentCategories.
   */
  int getIncludedContentCategoriesCount();
  /**
   *
   *
   * <pre>
   * The set of categories to be included in the media item search results.
   * The items in the set are ORed. There's a maximum of 10
   * `includedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory included_content_categories = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The includedContentCategories at the given index.
   */
  com.google.photos.library.v1.proto.ContentCategory getIncludedContentCategories(int index);
  /**
   *
   *
   * <pre>
   * The set of categories to be included in the media item search results.
   * The items in the set are ORed. There's a maximum of 10
   * `includedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory included_content_categories = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for includedContentCategories.
   */
  java.util.List<java.lang.Integer> getIncludedContentCategoriesValueList();
  /**
   *
   *
   * <pre>
   * The set of categories to be included in the media item search results.
   * The items in the set are ORed. There's a maximum of 10
   * `includedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory included_content_categories = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of includedContentCategories at the given index.
   */
  int getIncludedContentCategoriesValue(int index);

  /**
   *
   *
   * <pre>
   * The set of categories which are not to be included in the media item search
   * results. The items in the set are ORed. There's a maximum of 10
   * `excludedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory excluded_content_categories = 2;
   * </code>
   *
   * @return A list containing the excludedContentCategories.
   */
  java.util.List<com.google.photos.library.v1.proto.ContentCategory>
      getExcludedContentCategoriesList();
  /**
   *
   *
   * <pre>
   * The set of categories which are not to be included in the media item search
   * results. The items in the set are ORed. There's a maximum of 10
   * `excludedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory excluded_content_categories = 2;
   * </code>
   *
   * @return The count of excludedContentCategories.
   */
  int getExcludedContentCategoriesCount();
  /**
   *
   *
   * <pre>
   * The set of categories which are not to be included in the media item search
   * results. The items in the set are ORed. There's a maximum of 10
   * `excludedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory excluded_content_categories = 2;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The excludedContentCategories at the given index.
   */
  com.google.photos.library.v1.proto.ContentCategory getExcludedContentCategories(int index);
  /**
   *
   *
   * <pre>
   * The set of categories which are not to be included in the media item search
   * results. The items in the set are ORed. There's a maximum of 10
   * `excludedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory excluded_content_categories = 2;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for excludedContentCategories.
   */
  java.util.List<java.lang.Integer> getExcludedContentCategoriesValueList();
  /**
   *
   *
   * <pre>
   * The set of categories which are not to be included in the media item search
   * results. The items in the set are ORed. There's a maximum of 10
   * `excludedContentCategories` per request.
   * </pre>
   *
   * <code>repeated .google.photos.library.v1.ContentCategory excluded_content_categories = 2;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of excludedContentCategories at the given index.
   */
  int getExcludedContentCategoriesValue(int index);
}
