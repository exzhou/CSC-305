package edu.parser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Class representing a source object. Each source has a name and an id field that can be null.
 */
public class Source {
  String id;
  String name;


  /**
   * Constructs a source object.
   *
   * @param  id a String representing the id field
   * @param  name a String representing the name field
   */
  @JsonCreator
  public Source(@JsonProperty("id") String id, @JsonProperty("name") String name) {
    this.id = id;
    this.name = name;
  }
}
