package edu.calpoly.csc305.entities;

import edu.calpoly.csc305.parser.ParserFormats;
import edu.calpoly.csc305.proccessor.Proccessor;
import edu.calpoly.csc305.srctype.SrcType;
import java.io.IOException;
import java.util.List;


/**
 * Class representing a source object. Each source has a name and an id field that can be null.
 */
public class Source {
  public final SrcType type;
  public final String name;
  private ParserFormats format;
  public final String location;


  /**
   * Constructs a source object.
   *
   * @param  type a String representing the type of the source
   * @param  name a String representing the name field
   * @param  format a String representing the format field
   */
  public Source(SrcType type, String name, ParserFormats format) {
    this.type = type;
    this.name = name;
    this.format = format;
    this.location = this.type.getSrc();
  }

  public ParserFormats getFormat() {
    return format;
  }


  /**
   * Method for creating processor and proccessing article files.
   */
  public List<Article> proccess() throws IOException {
    format.setContent(type.getContent());
    Proccessor proccessor = new Proccessor(format);
    return proccessor.proccess();
  }
}
