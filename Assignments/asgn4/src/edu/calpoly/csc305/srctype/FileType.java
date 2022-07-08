package edu.calpoly.csc305.srctype;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FileType implements SrcType {

  private static final String LOGGER = "ParseLogger";
  private String content;
  private String location;

  public FileType(String location) {
    this.location = location;
    this.content = readFile(location);
  }

  @Override
  public String getContent() {
    return content;
  }

  @Override
  public String getSrc() {
    return this.location;
  }

  /**
   * A function for reading a files content into a string.
   *
   * @param src a string argument from args
   */
  public static String readFile(String src) {
    Path path = Paths.get(src);
    StringBuilder sb = new StringBuilder();
    try (Stream<String> stream = Files.lines(path)) {
      stream.forEach(s -> sb.append(s).append("\n"));

    } catch (IOException ex) {
      Logger.getLogger(LOGGER).warning(ex.getMessage());
    }
    return sb.toString();
  }
}
