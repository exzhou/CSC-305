package edu.calpoly.csc305.proccessor;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.parser.ParserFormats;
import java.util.List;

public class Proccessor {
  ParserFormats parser;

  public Proccessor(ParserFormats parser) {
    this.parser = parser;
  }


  /**
   * A function that processess the articles in the JSON
   * by calling on the appropriate parser.
   *
   * @return a list of articles
   */
  public List<Article> proccess() {
    List<Article> articles = this.parser.parse();
    System.out.println("\nArticles:");
    for (Article article : articles) {
      System.out.println(article);
    }
    return articles;
  }

}