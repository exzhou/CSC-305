package edu.proccessor;

import edu.parser.Article;
import edu.parser.Parser;
import java.io.Reader;
import java.util.List;

public class Proccessor {
  Parser parser;
  Reader reader;

  public Proccessor(Parser parser, Reader reader) {
    this.parser = parser;
    this.reader = reader;
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