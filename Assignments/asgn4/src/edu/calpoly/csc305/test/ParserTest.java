package edu.calpoly.csc305.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.entities.SourceDecorator;
import edu.calpoly.csc305.parser.ParserFormats;
import edu.calpoly.csc305.visitor.AggregatorConfigVisitor;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ParserTest {
  static final String FILE = "inputs/config";
  static final Logger logger = Logger.getLogger(ParserTest.class.getName() + ".parserTest");


  /**
   * Method for setting up testing enviornments.
   */
  @BeforeEach
  void setUp() {
    logger.setUseParentHandlers(false);
    CustomHandler handler = new CustomHandler();
    logger.addHandler(handler);
  }


  /**
   * Testing filtering a source with no filter expression.
   */
  @Test
  void filterExpressionEmpty() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(0);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(20, filteredArticles.size());
  }


  /**
   * Testing filtering a source by key expression with no articles.
   */
  @Test
  void filterExpressionNone() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(1);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(0, filteredArticles.size());
  }


  /**
   * Testing filtering a source by key expression with one articles.
   */
  @Test
  void filterExpressionOne() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(2);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }


  /**
   * Testing filtering a source by key expression with multiple articles.
   */
  @Test
  void filterExpressionMulti() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(3);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(20, filteredArticles.size());
  }


  /**
   * Testing filtering a source by an and expression.
   */
  @Test
  void filterExpressionAnd() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(4);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }

  /**
   * Testing filtering a source by an or expression.
   */
  @Test
  void filterExpressionOr() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(5);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(2, filteredArticles.size());
  }


  /**
   * Testing filtering a source by a nested expression.
   */
  @Test
  void filterExpressionNested() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(6);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by empty expression.
   */
  @Test
  void filterExpressionSimpleEmpty() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(7);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by an expression with no articles.
   */
  @Test
  void filterExpressionSimpleNone() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(8);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(0, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by a nested expression.
   */
  @Test
  void filterExpressionSimpleNested() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(9);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by empty expression.
   */
  @Test
  void filterExpressionUrlEmpty() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(10);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by empty expression.
   */
  @Test
  void filterExpressionUrlNone() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(11);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(0, filteredArticles.size());
  }

  /**
   * Testing filtering a simple source by empty expression.
   */
  @Test
  void filterExpressionUrlNested() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
      .accept(new AggregatorConfigVisitor(logger));
    SourceDecorator sourceDecorator = sourceDecorators.get(12);
    List<Article> filteredArticles = sourceDecorator.filter();
    assertEquals(1, filteredArticles.size());
  }
}