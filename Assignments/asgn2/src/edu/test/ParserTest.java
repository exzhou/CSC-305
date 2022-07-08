package edu.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import edu.parser.Article;
import edu.parser.CompParser;
import edu.parser.Main;
import edu.parser.Parser;
import edu.parser.SimpleParser;
import edu.proccessor.Proccessor;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ParserTest {
  static final String LOGGER = "Parselogger";
  static final String SIMPLE = "simple.json";
  static final String SIMPLE_URL = "http://users.csc.calpoly.edu/~akeen/courses/csc305/simple.json";
  static final String SIMPLE_FILE = "inputs/simple.json";
  static final String FILE = "inputs/newsapi.json";


  /**
   * Method for setting up testing enviornments.
   */
  @BeforeEach
  void setUp() {
    Logger logger = Logger.getLogger(ParserTest.class.getName() + ".parserTest");
    logger.setUseParentHandlers(false);
    CustomHandler handler = new CustomHandler();
    logger.addHandler(handler);
  }


  /**
   * Testing parsing on normal file article description fields.
   */
  @Test
  void parseNormalFileDescription() throws IOException {
    setUp();
    Parser parser;
    String [] args = {FILE};
    String description = "The coronavirus pandemic has brought countries to a standstill. "
        + "Meanwhile, vaccinations have already "
        + "started in some countries as cases continue to rise. Follow here for the latest.";
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      ArrayList<Article> articles = (ArrayList<Article>) proccessor.proccess();
      assertEquals(description, articles.get(0).getDescription());
    }
  }

  /**
   * Testing parsing on normal file article date fields.
   */
  @Test
  void parseNormalFileDate() throws IOException {
    setUp();
    Parser parser;
    String [] args = {FILE};
    String date = "2021-03-24T22:32:00Z";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals((LocalDateTime.parse(date, DateTimeFormatter.ISO_OFFSET_DATE_TIME)),
        articles.get(0).getDate());
  }

  /**
   * Testing parsing on normal file article url fields.
   */
  @Test
  void parseNormalFileUrl() throws IOException {
    setUp();
    Parser parser;
    String [] args = {FILE};
    String url = "https://www.cnn.com/world/live-news/coronavirus-pandemic-vaccine-updates-03-24-21/index.html";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals(url, articles.get(0).getUrl());
  }

  /**
   * Testing parsing on simple file article description fields.
   */
  @Test
  void parseSimpleFileDescription() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_FILE};
    String description = "Extend Assignment #1 "
        + "to support multiple sources and to introduce source processor.";
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      ArrayList<Article> articles = (ArrayList<Article>) proccessor.proccess();
      assertEquals(description, articles.get(0).getDescription());
    }
  }

  /**
   * Testing parsing on simple file article date fields.
   */
  @Test
  void parseSimpleFileDate() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_FILE};
    String date = "2021-04-16 09:53:23.709229";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals(LocalDateTime.parse(date,
        DateTimeFormatter.ofPattern("y-M-d H:m:s[.SSSSSS]")),
        articles.get(0).getDate());
  }

  /**
   * Testing parsing on simple file article url fields.
   */
  @Test
  void parseSimpleFileUrl() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_FILE};
    String url = "https://canvas.calpoly.edu/courses/55411/assignments/274503";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals(url, articles.get(0).getUrl());
  }




  /**
   * Testing parsing on simple file article description fields.
   */
  @Test
  void parseSimpleUrlDescription() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_URL};
    String description = "Alternate.";
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      ArrayList<Article> articles = (ArrayList<Article>) proccessor.proccess();
      assertEquals(description, articles.get(0).getDescription());
    }
  }

  /**
   * Testing parsing on simple file article date fields.
   */
  @Test
  void parseSimpleUrlDate() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_URL};
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals("2021-06-12T18:00:30.102233",
        articles.get(0).getDate().toString());
  }

  /**
   * Testing parsing on simple file article url fields.
   */
  @Test
  void parseSimpleUrlUrl() throws IOException {
    setUp();
    Parser parser;
    String [] args = {SIMPLE_URL};
    String url = SIMPLE_URL;
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertEquals(url, articles.get(0).getUrl());
  }





  /**
   * Testing parsing article title fields with bad json sources.
   */
  @Test
  void parseBadTitle() throws IOException {
    setUp();
    Parser parser;
    String [] args = {FILE};
    String badDescription = "It's macOS 11 now, but the DNA is the same.";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertNotEquals(badDescription, articles.get(0).getDescription());
  }

  /**
   * Testing parsing article url fields with bad json sources.
   */
  @Test
  void parseBadUrl() throws IOException {
    setUp();
    Parser parser;
    String [] args = {FILE};
    String badDescription = "The bloc is tightening export rules in a bid to speed up "
        + "its disappointing Covid inoculation campaign and stem political criticism.";
    ArrayList<Article> articles = new ArrayList<>();
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains(SIMPLE)) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      articles = (ArrayList<Article>) proccessor.proccess();
    }
    assertNotEquals(badDescription, articles.get(5).getDescription());
  }
}