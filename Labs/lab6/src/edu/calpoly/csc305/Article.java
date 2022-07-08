package edu.calpoly.csc305;

import com.google.common.collect.ImmutableMap;

public interface Article {
  /**
   * Access the Article's description.
   *
   * @return article description
   */
  String description();

  /**
   * Access the Article's title.
   *
   * @return article title
   */
  String title();

  /**
   * Access the Article's url as a String.
   *
   * @return article url
   */
  String url();

  /**
   * Access the Article's time of publication as a String.
   *
   * @return article publication time
   */
  String publishedAt();

  /**
   * Access the collection of the Article's optional attributes.
   *
   * @return collection of optional attributes
   */
  ImmutableMap<String, String> optionalAttributes();
}
