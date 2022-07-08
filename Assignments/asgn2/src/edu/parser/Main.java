package edu.parser;

import edu.proccessor.Proccessor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Main {
  static final String LOGGER = "Parselogger";


  /**
   * A demonstration of the parser class in action.
   *
   * @param args a List of string arguments
   */
  public static void main(String [] args) throws IOException {
    Parser parser;
    for (String arg : args) {
      Reader reader = new StringReader(arg);
      String content = Main.getContent(reader);
      if (!arg.contains("simple.json")) {
        parser = new CompParser(content, Logger.getLogger(LOGGER));
      } else {
        parser = new SimpleParser(content, Logger.getLogger(LOGGER));
      }
      Proccessor proccessor = new Proccessor(parser, reader);
      proccessor.proccess();
    }
  }

  /**
   * A function for reading a readers content into a string.
   *
   * @param reader a reader from the args
   */
  public static String getContent(Reader reader) throws IOException {
    String src = Main.readSrc(reader);
    String content;
    File file = new File(src);
    if (file.exists()) {
      content = readFile(src);
    } else {
      content = readUrl(src);
    }
    return content;
  }


  /**
   * A function for reading a urls content into a string.
   *
   * @param src a string argument from args
   */
  private static String readUrl(String src) {
    StringBuilder content = new StringBuilder();
    try {
      URL url = new URL(src);
      URLConnection urlConnection = url.openConnection();
      BufferedReader bufferedReader = new BufferedReader(
          new InputStreamReader(urlConnection.getInputStream()));
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        content.append(line + "\n");
      }
      bufferedReader.close();
    } catch (Exception e) {
      Logger.getLogger(LOGGER).warning(e.getMessage());
    }
    return content.toString();
  }


  /**
   * A function for reading a files content into a string.
   *
   * @param src a string argument from args
   */
  public static String readFile(String src) throws IOException {
    Path path = Paths.get(src);
    StringBuilder sb = new StringBuilder();
    try (Stream<String> stream = Files.lines(path)) {
      stream.forEach(s -> sb.append(s).append("\n"));

    } catch (IOException ex) {
      Logger.getLogger(LOGGER).warning(ex.getMessage());
    }
    return sb.toString();
  }


  /**
   * A function for reading a reader src into a string name.
   *
   * @param reader a Reader object from command line args
   */
  public static String readSrc(Reader reader) throws IOException {
    String line = "";
    StringBuilder sb = new StringBuilder();
    try {
      BufferedReader bufferedReader = new BufferedReader(reader);
      while ((line = bufferedReader.readLine()) != null) {
        sb.append(line);
      }
      reader.close();
      bufferedReader.close();
      return sb.toString();
    } catch (IOException e) {
      Logger.getLogger(LOGGER).warning(e.getMessage());
      return "";
    }
  }
}
