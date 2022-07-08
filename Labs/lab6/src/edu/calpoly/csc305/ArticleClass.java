package edu.calpoly.csc305;

import com.google.common.collect.ImmutableMap;

public class ArticleClass implements Article{

  private final String description;
  private final String title;
  private final String date;
  private final String url;
  private ImmutableMap<String, String> map;

  public ArticleClass(Builder builder)
  {
    this.description = builder.description;
    this.title = builder.title;
    this.date = builder.date;
    this.url = builder.url;
    this.map = builder.map;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String title() {
    return title;
  }

  @Override
  public String url() {
    return url;
  }

  @Override
  public String publishedAt() {
    return date;
  }

  @Override
  public ImmutableMap<String, String> optionalAttributes() {
    return map;
  }

  public static class Builder {

    private String description;
    private String title;
    private String date;
    private String url;
    private ImmutableMap<String, String> map;

    public static Builder newInstance()
    {
      return new Builder();
    }

    private Builder() {}


    public Builder addToMap(String key, String val) {
      this.map = new ImmutableMap.Builder<String, String>()
        .putAll(this.map)
        .put(key, val)
        .build();
      return this;
    }

    public Builder setImmutableMap() {
      this.map = new ImmutableMap.Builder<String, String>().build();
      return this;
    }

    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder setUrl(String url) {
      this.url = url;
      return this;
    }

    public Builder setDate(String date) {
      this.date = date;
      return this;
    }

    public ArticleClass build() {
      if(description == null){
        throw new IllegalArgumentException("description");
      }
      if(title == null){
        throw new IllegalArgumentException("title");
      }
      if(url == null){
        throw new IllegalArgumentException("url");
      }
      if(date == null){
        throw new IllegalArgumentException("date");
      }
      return new ArticleClass(this);
    }
  }
}
