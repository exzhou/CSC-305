package edu.calpoly.csc305.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.Objects;


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


  /**
   * Returns a string formatted representation of an Article.
   *
   * @param o an object to be compared with
   *
   * @return  a boolean representing whether the parameter is equal to itself.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Article article = (Article) o;
    return Objects.equals(title, article.title) && Objects.equals(description, article.description) && Objects.equals(date, article.date) && Objects.equals(url, article.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, date, url);
  }
}
