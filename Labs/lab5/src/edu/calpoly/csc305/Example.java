package edu.calpoly.csc305;

import edu.calpoly.csc305.config.grammars.AggregatorConfigLexer;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import edu.calpoly.csc305.config.visitors.AggregatorEchoVisitor;
import edu.calpoly.csc305.config.visitors.AggregatorNameVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Example {
  /**
   * Demonstration of ANTLR library parsing and tree visiting.
   *
   * @param args sequence of presumed file names
   */
  public static void main(String[] args) {
    Logger logger = Logger.getLogger(Example.class.toString());
    List<ParseTree> parseTrees = parseFiles(args, logger);
    List<String> names = gatherVisitorResults(parseTrees,
        new AggregatorEchoVisitor());

    String output = String.join("\n", names);
    logger.info(output);
  }

  private static List<ParseTree> parseFiles(String[] filenames, Logger logger) {
    List<ParseTree> parseTrees = new ArrayList<>();

    for (String filename : filenames) {
      try {
        CommonTokenStream tokens = new CommonTokenStream(
            new AggregatorConfigLexer(CharStreams.fromFileName(filename)));
        AggregatorConfigParser parser = new AggregatorConfigParser(tokens);
        ParseTree parseTree = parser.sources();

        if (parser.getNumberOfSyntaxErrors() == 0) {
          parseTrees.add(parseTree);
        }
      } catch (IOException e) {
        logger.warning(e.getMessage());
      }
    }

    return parseTrees;
  }

  private static <T> List<T> gatherVisitorResults(List<ParseTree> parseTrees,
      AggregatorConfigParserBaseVisitor<T> visitor) {
    List<T> results = new ArrayList<>();

    for (ParseTree parseTree : parseTrees) {
      results.add(parseTree.accept(visitor));
    }

    return results;
  }
}
