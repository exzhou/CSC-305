package edu.calpoly.csc305.entities;

import edu.calpoly.csc305.parser.ParserFormats;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class ProccessorDecorator implements SourceInterface {
  private List<Article> cache = new LinkedList<>();
  SourceDecorator sourceDecorator;


  /**
   * Constructor for creating processorDecorator object.
   */
  public ProccessorDecorator(SourceDecorator sourceDecorator) {
    this.sourceDecorator = sourceDecorator;
  }


  /**
   * Getter method for grabbing format.
   */
  @Override
  public ParserFormats getFormat() {
    return sourceDecorator.getFormat();
  }


  /**
   * Getter method for grabbing delay.
   */
  public int getDelay() {
    return sourceDecorator.getDelay();
  }


  /**
   * Method for creating processor and proccessing article files.
   */
  @Override
  public List<Article> proccess() throws IOException {
    return sourceDecorator.proccess();
  }


  /**
   * Method for setting the sourceDecorator.
   */
  public void setSourceDecorator(SourceDecorator sourceDecorator) {
    this.sourceDecorator = sourceDecorator;
  }


  /**
   * Method for filtering processor and proccessing article files.
   */
  public List<Article> filter() throws IOException {
    List<Article> articles = sourceDecorator.filter();
    for (Article article : articles) {
      if (!cache.contains(article)) {
        if(cache.size() > 20) {
          cache.remove(0);
        }
        cache.add(article);
      } else {
        Logger.getLogger("ParseLogger").warning("DUPLICATE FOUND");
      }
    }
    return cache;
  }
}
