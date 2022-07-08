package edu.calpoly.csc305.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.calpoly.csc305.entities.Article;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SimpleParser implements ParserFormats {
  String content;
  Logger logger;


  /**
   * Constructs a parser object.
   *
   * @param  content a string containing contents of input
   * @param logger a logger passed in for logging errors
   *
   */
  public SimpleParser(String content, Logger logger) {
    this.content = content;
    this.logger = logger;
  }

  /**
   * Constructs a parser object.
   *
   * @param logger a logger passed in for logging errors
   *
   */
  public SimpleParser(Logger logger) {
    this.content = "empty";
    this.logger = logger;
  }


  /**
   * Returns a list of Article objects created by parsing through the input JSON node object.
   * Any null filled attributes neccesary for an article will be ignored by the parser and
   * not added to the return list. The parser further adds on any additional attributes that
   * may exist in the article that are not required by the client but may be of value in furture
   * iterations.
   *
   * @return  a List of Article objects
   */
  @Override
  public ArrayList<Article> parse() {
    JsonNode node;
    try {
      ObjectMapper mapper = new ObjectMapper(); // create once, reuse
      node = mapper.readValue(content, JsonNode.class);
      ArrayList<Article> articles = new ArrayList<>();
      extractArticle(articles, node, logger);
      return articles;
    } catch (Exception e) {
      logger.warning(e.getMessage());
      return new ArrayList<>();
    }
  }


  /**
   * Inserts article objects into an array of articles.
   *
   * @param articles a list of articles to be added to
   * @param node a json node object to be extracted from
   * @param logger a logger object for logging errors
   */
  public static void extractArticle(List<Article> articles, JsonNode node, Logger logger) {

    if (node.get("title") == null
        || node.get("description") == null
        || node.get("url") == null
        || node.get("publishedAt") == null) {
      logger.warning("Poorly Formatted Article");
    } else {
      Article article = new Article(node.get("title").asText(),
          node.get("description").asText(),
          node.get("url").asText(),
          LocalDateTime.parse(node.get("publishedAt").asText(),
          DateTimeFormatter.ofPattern("y-M-d H:m:s[.SSSSSS]")));
      articles.add(article);
    }
  }


  /**
   * Inserts article objects into an array of articles.
   *
   * @param content a string of content to be parsed.
   */
  public  void setContent(String content) {
    this.content = content;

  }
}
