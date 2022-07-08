package edu.calpoly.csc305.proccessor;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.parser.ParserFormats;
import java.util.List;

public class GenProccessor implements Proccessor {
  ParserFormats parser;

  public GenProccessor(ParserFormats parser) {
    this.parser = parser;
  }


  /**
   * A function that processess the articles in the JSON
   * by calling on the appropriate parser.
   *
   * @return a list of articles
   */
  public List<Article> proccess() {
    return this.parser.parse();
  }

}