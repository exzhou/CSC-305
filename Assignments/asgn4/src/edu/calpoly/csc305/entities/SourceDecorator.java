package edu.calpoly.csc305.entities;

import edu.calpoly.csc305.composite.FilterComponent;
import edu.calpoly.csc305.parser.ParserFormats;
import edu.calpoly.csc305.proccessor.FilterProccessor;
import edu.calpoly.csc305.proccessor.GenProccessor;
import java.io.IOException;
import java.util.List;


/**
 * Class representing a source decorator object.
 * Each source has a name and an id field that can be null.
 * This decorator adds filtering proccess to articles.
 */
public class SourceDecorator implements SourceInterface {
  public final Source source;
  private FilterComponent filterComponent;

  /**
   * Constructs a source object.
   *
   * @param source a source object wrapped by our decorator
   */
  public SourceDecorator(Source source) {
    this.source = source;
  }


  /**
   * Getter method for grabbing format.
   */
  @Override
  public ParserFormats getFormat() {
    return this.source.getFormat();
  }


  /**
   * Setter method for filter field.
   */
  public void setFilter(FilterComponent filterComponent) {
    this.filterComponent = filterComponent;
  }

  /**
   * Getter method for grabbing filter.
   */
  public FilterComponent getFilter() {
    return this.filterComponent;
  }


  /**
   * Method for creating processor and proccessing article files.
   */
  @Override
  public List<Article> proccess() throws IOException {
    return this.source.proccess();
  }


  /**
   * Method for filtering article files.
   */
  public List<Article> filter() throws IOException {
    this.source.getFormat().setContent(this.source.type.getContent());
    GenProccessor genProccessor = new GenProccessor(this.source.getFormat());
    if (this.filterComponent != null) {
      FilterProccessor filterProccessor = new FilterProccessor(genProccessor, this.filterComponent);
      return filterProccessor.proccess();
    } else {
      return genProccessor.proccess();
    }
  }
}
