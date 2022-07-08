package edu.calpoly.csc305.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.calpoly.csc305.entities.Source;
import edu.calpoly.csc305.parser.CompParser;
import edu.calpoly.csc305.parser.ParserFormats;
import edu.calpoly.csc305.parser.SimpleParser;
import edu.calpoly.csc305.srctype.FileType;
import edu.calpoly.csc305.srctype.UrlType;
import edu.calpoly.csc305.visitor.AggregatorConfigVisitor;
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
   * Testing parsing a file type source and checking a fileType source proccessor was created.
   */
  @Test
  void parseFileTypeSource() {
    setUp();
    String [] args = {FILE};
    List<Source> sources = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    Source source = sources.get(0);
    assertEquals(source.type.getClass(), FileType.class);
  }


  /**
   * Testing parsing a url type source and checking a urlType source proccessor was created.
   */
  @Test
  void parseUrlTypeSource() {
    setUp();
    String [] args = {FILE};
    List<Source> sources = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    Source source = sources.get(1);
    assertEquals(source.type.getClass(), UrlType.class);
  }

  /**
   * Testing parsing a newsapi format source and checking a newsapi format proccessor was created.
   */
  @Test
  void parseCompFormatSource() {
    setUp();
    String [] args = {FILE};
    List<Source> sources = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    Source source = sources.get(0);
    assertEquals(source.getFormat().getClass(), CompParser.class);
  }


  /**
   * Testing parsing a simple format source and checking a simple format proccessor was created.
   */
  @Test
  void parseSimpleFormatSource() {
    setUp();
    String [] args = {FILE};
    List<Source> sources = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    Source source = sources.get(2);
    assertEquals(source.getFormat().getClass(), SimpleParser.class);
  }

  /**
   * Testing parsing a simple format url source and checking a simple format url proccessor was
   * created.
   */
  @Test
  void parseSimpleFormatUrlSource() {
    setUp();
    String [] args = {FILE};
    List<Source> sources = ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger));
    Source source = sources.get(3);
    assertEquals(UrlType.class, source.type.getClass());
    assertEquals(SimpleParser.class, source.getFormat().getClass());
  }

  ///**
// //   * Testing parsing on normal file article date fields.
// //   */
//  @Test
//  void parseNormalFileDate() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {FILE};
//    String date = "2021-03-24T22:32:00Z";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals((LocalDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME)),
//        articles.get(0).getDate());
//  }
//
//  /**
//   * Testing parsing on normal file article url fields.
//   */
//  @Test
//  void parseNormalFileUrl() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {FILE};
//    String url = "https://www.cnn.com/world/live-news/coronavirus-pandemic-vaccine-updates-03-24-21/index.html";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals(url, articles.get(0).getUrl());
//  }
//
//  /**
//   * Testing parsing on simple file article description fields.
//   */
//  @Test
//  void parseSimpleFileDescription() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_FILE};
//    String description = "Extend Assignment #1 "
//        + "to support multiple sources and to introduce source processor.";
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      ArrayList<Article> articles = (ArrayList<Article>) proccessor.proccess();
//      assertEquals(description, articles.get(0).getDescription());
//    }
//  }
//
//  /**
//   * Testing parsing on simple file article date fields.
//   */
//  @Test
//  void parseSimpleFileDate() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_FILE};
//    String date = "2021-04-16 09:53:23.709229";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals(LocalDateTime.parse(date,
//        DateTimeFormatter.ofPattern("y-M-d H:m:s[.SSSSSS]")),
//        articles.get(0).getDate());
//  }
//
//  /**
//   * Testing parsing on simple file article url fields.
//   */
//  @Test
//  void parseSimpleFileUrl() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_FILE};
//    String url = "https://canvas.calpoly.edu/courses/55411/assignments/274503";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals(url, articles.get(0).getUrl());
//  }
//
//
//
//
//  /**
//   * Testing parsing on simple file article description fields.
//   */
//  @Test
//  void parseSimpleUrlDescription() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_URL};
//    String description = "Alternate.";
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      ArrayList<Article> articles = (ArrayList<Article>) proccessor.proccess();
//      assertEquals(description, articles.get(0).getDescription());
//    }
//  }
//
//  /**
//   * Testing parsing on simple file article date fields.
//   */
//  @Test
//  void parseSimpleUrlDate() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_URL};
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals("2021-06-12T18:00:30.102233",
//        articles.get(0).getDate().toString());
//  }
//
//  /**
//   * Testing parsing on simple file article url fields.
//   */
//  @Test
//  void parseSimpleUrlUrl() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {SIMPLE_URL};
//    String url = SIMPLE_URL;
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertEquals(url, articles.get(0).getUrl());
//  }
//
//
//
//
//
//  /**
//   * Testing parsing article title fields with bad json sources.
//   */
//  @Test
//  void parseBadTitle() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {FILE};
//    String badDescription = "It's macOS 11 now, but the DNA is the same.";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertNotEquals(badDescription, articles.get(0).getDescription());
//  }
//
//  /**
//   * Testing parsing article url fields with bad json sources.
//   */
//  @Test
//  void parseBadUrl() throws IOException {
//    setUp();
//    ParserFormats parser;
//    String [] args = {FILE};
//    String badDescription = "The bloc is tightening export rules in a bid to speed up "
//        + "its disappointing Covid inoculation campaign and stem political criticism.";
//    ArrayList<Article> articles = new ArrayList<>();
//    for (String arg : args) {
//      Reader reader = new StringReader(arg);
//      String content = Main.getContent(reader);
//      if (!arg.contains(SIMPLE)) {
//        parser = new CompParser(content, Logger.getLogger(LOGGER));
//      } else {
//        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
//      }
//      Proccessor proccessor = new Proccessor(parser, reader);
//      articles = (ArrayList<Article>) proccessor.proccess();
//    }
//    assertNotEquals(badDescription, articles.get(5).getDescription());
//  }
}