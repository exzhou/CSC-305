package edu.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Main {


  /**
   * A demonstration of the parser class in action.
   *
   * @param args a List of string arguments
   */
  public static void main(String [] args) throws IOException {
    ArrayList<String> readers = new ArrayList<>();
    for (String arg : args) {
      String content = read(arg);
      readers.add(content);
    }
    Parser parser = new Parser(readers, Logger.getLogger("Parselogger"));
    ArrayList<Article> articles = parser.parse();
    for (Article article : articles) {
      System.out.println(article);
    }
  }

  /**
   * A function for reading a sources content into a string.
   *
   * @param arg a string argument from args
   */
  public static String read(String arg) throws IOException {
    Path path = Paths.get(arg);
    StringBuilder sb = new StringBuilder();
    try (Stream<String> stream = Files.lines(path)) {
      stream.forEach(s -> sb.append(s).append("\n"));

    } catch (IOException ex) {
      // Handle exception
    }
    return sb.toString();
  }
}
