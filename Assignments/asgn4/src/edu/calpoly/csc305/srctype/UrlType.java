package edu.calpoly.csc305.srctype;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

public class UrlType implements SrcType {

  private static final String LOGGER = "ParseLogger";
  private String address;
  private String content;

  public UrlType(String address) {
    this.address = address;
    this.content = UrlType.readUrl(address);
  }

  @Override
  public String getSrc() {
    return this.address;
  }

  @Override
  public String getContent() {
    return this.content;
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
}
