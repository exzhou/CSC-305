package edu.calpoly.csc305.srctype;

import java.io.IOException;

public interface SrcType {

  String getContent() throws IOException;

  String getSrc();
}
