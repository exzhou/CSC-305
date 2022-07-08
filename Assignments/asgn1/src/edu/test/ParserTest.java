import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.parser.Article;
import edu.parser.CustomHandler;
import edu.parser.Main;
import edu.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ParserTest {


  /**
   * Method for setting up testing enviornments
   */
  @BeforeEach
  void setUp() {
    Logger logger = Logger.getLogger(ParserTest.class.getName() + ".parserTest");
    logger.setUseParentHandlers(false);
    CustomHandler handler = new CustomHandler();
    logger.addHandler(handler);
  }

//  /**
//   * Testing parsing article title fields
//   */
//  @Test
//  void parseExampleTitle() throws IOException {
//    setUp();
//    ArrayList<Article> articles = new ArrayList<>();
//    String title = "The latest on the coronavirus pandemic and vaccines: Live updates - CNN";
//    ArrayList<String> readers = new ArrayList<>();
//    String s = "1";
//    readers.add(s);
//    //readers.add("TEST2");
//
//    ObjectMapper mapper = mock(ObjectMapper.class);
//
//    //ObjectMapper mapper = new ObjectMapper();
//    JsonNode node = mock(JsonNode.class);
//    JsonNode articleNodes = mock(JsonNode.class);
//    Article a = new Article("Title", "Description", "Url", "2021-03-24T21:39:00Z");
//    ArrayList<JsonNode> nodes = new ArrayList<>();
//    nodes.add(node);
//
//    when(mapper.readValue(s, JsonNode.class)).thenReturn(node);
//    when(node.get("articles")).thenReturn(articleNodes);
//    for(JsonNode n : articleNodes) {
//      when(Parser.extractArticle(n, Logger.getLogger("Parselogger"))).thenReturn(a);
//    }
//
//    when(a.getTitle()).thenReturn("Test Title");
////
////    when(node.get("title")).thenReturn(node);
////    when(node.get("description")).thenReturn(node);
////    when(node.get("publishedAt")).thenReturn(node);
////    when(node.get("url")).thenReturn(node);
////    when(node.get("title").asText()).thenReturn("Test Title");
////    when(node.get("description").asText()).thenReturn("");
////    when(node.get("publishedAt").asText()).thenReturn("");
////    when(node.get("url").asText()).thenReturn("");
//
//
//    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
//    articles = parser.parse();
//    assertEquals("Test Title", articles.get(0).getTitle());
//  }

  /**
   * Testing parsing article description fields
   */
  @Test
  void parseExampleDescription() throws IOException {
    setUp();
    ArrayList<Article> articles = new ArrayList<>();
    String description = "The coronavirus pandemic has brought countries to a standstill. Meanwhile, vaccinations have already started in some countries as cases continue to rise. Follow here for the latest.";
    String [] args = {"inputs/example.json"};
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      readers.add(Main.read(arg));
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    articles = parser.parse();
    assertEquals(description, articles.get(0).getDescription());
  }

  /**
   * Testing parsing article date fields
   */
  @Test
  void parseExampleDate() throws IOException {
    setUp();
    ArrayList<Article> articles = new ArrayList<>();
    String dateString = "2021-03-24T22:32:00Z";
    String [] args = {"inputs/example.json"};
    LocalDateTime date = LocalDateTime.parse(dateString,
      DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      readers.add(Main.read(arg));
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    articles = parser.parse();
    assertEquals(date, articles.get(0).getDate());
  }

  /**
   * Testing parsing article url fields
   */
  @Test
  void parseExampleUrl() throws IOException {
    setUp();
    ArrayList<Article> articles = new ArrayList<>();
    String url = "https://www.cnn.com/world/live-news/coronavirus-pandemic-vaccine-updates-03-24-21/index.html";
    String [] args = {"inputs/example.json"};
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      readers.add(Main.read(arg));
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    articles = parser.parse();
    assertEquals(url, articles.get(0).getUrl());
  }

  /**
   * Testing parsing article title fields with bad json sources
   */
  @Test
  void parseBadTitle() throws IOException {
    setUp();
    String badDescription = "It's macOS 11 now, but the DNA is the same.";
    String [] args = {"inputs/bad.json"};
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      readers.add(Main.read(arg));
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    assertNotEquals(badDescription , parser.parse().get(0).getDescription());
  }

//  @Test
//  void parseBadDescription() throws FileNotFoundException {
//    Logger logger = Logger.getLogger(edu.calpoly.csc.ParserTest.class.getName() + ".parserTest");
//    logger.setUseParentHandlers(false);
//    CustomHandler handler = new CustomHandler();
//    logger.addHandler(handler);
//    String badTitle = "It's macOS 11 now, but the DNA is the same.";
//    String [] args = {"inputs/bad.json"};
//    assertNotEquals(badTitle , Parser.parse(args, Logger.getLogger("Parselogger")).get(0).getTitle());
//  }

//  @Test
//  void parseBadDate() throws FileNotFoundException {
//    Logger logger = Logger.getLogger(edu.calpoly.csc.ParserTest.class.getName() + ".parserTest");
//    logger.setUseParentHandlers(false);
//    CustomHandler handler = new CustomHandler();
//    logger.addHandler(handler);
//    ArrayList<Article> articles = new ArrayList<>();
//    String dateString = "2021-03-24T22:32:00Z";
//    String [] args = {"inputs/bad.json"};
//    LocalDateTime date = LocalDateTime.parse(dateString,
//      DateTimeFormatter.ISO_OFFSET_DATE_TIME);
//    articles = Parser.parse(args, Logger.getLogger("Parselogger"));
//    assertEquals(date, articles.get(0).date);
//  }


  /**
   * Testing parsing article url fields with bad json sources
   */
  @Test
  void parseBadUrl() throws IOException {
    setUp();
    String badDescription = "The bloc is tightening export rules in a bid to speed up its disappointing Covid inoculation campaign and stem political criticism.";
    String [] args = {"inputs/bad.json"};
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      readers.add(Main.read(arg));
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    assertNotEquals(badDescription , parser.parse().get(6).getDescription());
  }
}