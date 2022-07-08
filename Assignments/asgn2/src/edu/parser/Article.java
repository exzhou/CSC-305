package edu.parser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;



/**
 * Class representing an Article object. Each article is required to have a
 * title, description, url, and description. The other attributes are not
 * neccesary but get stored if they are found while parsing through the JSON.
 */

public class Article {

  String title;
  String description;
  LocalDateTime date;
  String url;
  @JsonIgnore
  Source source;


  /**
   * Constructs an article object.
   *
   * @param  title a String representing the title field
   * @param  description a String representing the description field
   * @param  url a String representing the url field
   * @param  date a LocalDateTime representing the date field
   */
  @JsonCreator
  public Article(@JsonProperty("title") String title,
                 @JsonProperty("description") String description,
                 @JsonProperty("url") String url,
                 @JsonProperty("date") LocalDateTime date) {
    this.title = title;
    this.description = description;
    this.date = date;
    this.url = url;
  }

  /**
   * Sets the source field in an article object.
   *
   * @param src A source object to be injected
   */
  public void setSource(Source src) {
    this.source = src;
  }

  /**
   * Returns the title field of Article.
   *
   * @return  a String field title
   */
  public Source getSource() {
    return source;
  }


  /**
   * Returns the title field of Article.
   *
   * @return  a String field title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Returns the description field of Article.
   *
   * @return  a String field description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Returns the date field of Article.
   *
   * @return  a LocalDateTime field date
   */
  public LocalDateTime getDate() {
    return date;
  }

  /**
   * Returns the url field of Article.
   *
   * @return  a String field url
   */
  public String getUrl() {
    return url;
  }


  /**
   * Returns a string formatted representation of an Article.
   *
   * @return  a String representation of article
   */
  @Override
  public String toString() {
    return "Article: "
      + title + '\n'
      + "Description: '" + description + "\'\n"
      + "Date: '" + date + "\'\n"
      + "Url: '" + url + "\'\n";
  }
}
