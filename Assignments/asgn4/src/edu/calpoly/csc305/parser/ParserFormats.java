package edu.calpoly.csc305.parser;

import edu.calpoly.csc305.config.grammars.AggregatorConfigLexer;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.entities.Article;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public interface ParserFormats {

  List<Article> parse();

  void setContent(String content);



  /**
   * Returns a parseTree object from the aggregatorConfigLexer.
   *
   * @return  a parseTree object
   */
  static ParseTree parseFile(String filename, Logger logger) {
    ParseTree parseTree = null;

    try {
      CommonTokenStream tokens = new CommonTokenStream(
          new AggregatorConfigLexer(CharStreams.fromFileName(filename)));
      AggregatorConfigParser parser = new AggregatorConfigParser(tokens);

      if (parser.getNumberOfSyntaxErrors() == 0) {
        parseTree = parser.sources();
      }
    } catch (IOException e) {
      logger.warning(e.getMessage());
    }

    return parseTree;
  }
}
