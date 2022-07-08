package edu.parser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Entry {

  String status;
  int totalResults;
  ArrayList<Article> articles;

  @JsonCreator
  public Entry(@JsonProperty("status") String status, @JsonProperty("totalResults") int totalResults, @JsonProperty("articles") ArrayList<Article> articles) {
    this.status = status;
    this.totalResults = totalResults;
    this.articles = articles;
  }

  public String getStatus() {
    return status;
  }

  public int getTotalResults() {
    return totalResults;
  }

  public ArrayList<Article> getArticles() {
    return articles;
  }
}
