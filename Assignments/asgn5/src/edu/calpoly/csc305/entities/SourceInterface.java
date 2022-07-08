package edu.calpoly.csc305.entities;

import edu.calpoly.csc305.parser.ParserFormats;
import java.io.IOException;
import java.util.List;

public interface SourceInterface {
  ParserFormats getFormat();

  List<Article> proccess() throws IOException;
}
