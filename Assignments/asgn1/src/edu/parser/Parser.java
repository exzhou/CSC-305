package edu.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Parser {
  ArrayList<String> readers;
  Logger logger;


  /**
   * Constructs a parser object.
   *
   * @param  readers an array list of Json strings
   * @param logger a logger passed in for logging errors
   *
   */

  public Parser(ArrayList<String> readers, Logger logger) {
    this.readers = readers;
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

  public ArrayList<Article> parse() {

    for (String reader : this.readers) {
      try {
        ObjectMapper mapper = new ObjectMapper(); // create once, reuse
        JsonNode node = mapper.readValue(reader, JsonNode.class);
        JsonNode articleNodes = node.get("articles");

        ArrayList<Article> articles = new ArrayList<>();
        for (JsonNode a : articleNodes) {
          extractArticle(articles, a, logger);
        }
        return articles;
      } catch (Exception e) {
        logger.warning(e.getMessage());
        return new ArrayList<>();
      }
    }
    return new ArrayList<>();
  }


  /**
   * Inserts article objects into an array of articles.
   *
   * @param articles a list of articles to be added to
   * @param node a json node object to be extracted from
   * @param logger a logger object for logging errors
   */
  public static void extractArticle(ArrayList<Article> articles, JsonNode node, Logger logger) {
    if (node.get("title") == null
        || node.get("description") == null
        || node.get("url") == null
        || node.get("publishedAt") == null) {
      logger.warning("Poorly Formatted Article");
    } else {
      Article article = new Article(node.get("title").asText(),
          node.get("description").asText(),
          node.get("url").asText(),
          node.get("publishedAt").asText());
      articles.add(article);
    }
  }
}
