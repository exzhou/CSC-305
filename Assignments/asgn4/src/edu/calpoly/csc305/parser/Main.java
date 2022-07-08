package edu.calpoly.csc305.parser;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.entities.SourceDecorator;
import edu.calpoly.csc305.visitor.AggregatorConfigVisitor;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Main {
  static final String LOGGER = "Parselogger";

  /**
   * A demonstration of the parser class in action.
   *
   * @param args a List of string arguments
   */
  public static void main(String [] args) throws IOException {
    Logger logger = Logger.getLogger(Main.class.toString());
    for (SourceDecorator src : ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger))) {
      List<Article> filteredList = src.filter();
      for (Article a : filteredList) {
        System.out.println(a);
      }
      System.out.println();
    }
  }
}
