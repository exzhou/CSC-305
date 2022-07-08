package edu.calpoly.csc305.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.calpoly.csc305.entities.ProccessorDecorator;
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
   * Testing acquring a delay field from article.
   */
  @Test
  void testDelayAcquired() {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    assertEquals(10, sourceDecorators.get(0).getDelay());
  }

  /**
   * Testing acquring from a zero delay field from article.
   */
  @Test
  void testDelayZero() {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    assertEquals(0, sourceDecorators.get(1).getDelay());
  }

  /**
   * Testing acquring from an empty delay field from article.
   */
  @Test
  void testDelayEmpty() {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    assertEquals(0, sourceDecorators.get(2).getDelay());
  }

  /**
   * Testing filtering a duplicate article.
   */
  @Test
  void testFilterDuplicate() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    ProccessorDecorator pd = new ProccessorDecorator(sourceDecorators.get(2));
    assertEquals(sourceDecorators.get(2).filter().size() - 1, pd.filter().size());
  }

  /**
   * Testing filtering mutliple duplicate articles.
   */
  @Test
  void testFilterDuplicates() throws IOException {
    setUp();
    String [] args = {FILE};
    List<SourceDecorator> sourceDecorators = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    ProccessorDecorator pd = new ProccessorDecorator(sourceDecorators.get(3));
    assertEquals(sourceDecorators.get(3).filter().size() - 2, pd.filter().size());
  }
}