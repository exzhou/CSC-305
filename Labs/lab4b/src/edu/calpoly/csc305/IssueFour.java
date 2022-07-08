package edu.calpoly.csc305;

import java.util.ArrayList;
import java.util.List;

public class IssueFour {
  /*
    You will need to update these methods to accomplish the intended task (there
    are a few ways to do this) and update the tests based on your solution.
   */

  public String buildString(List<?> strings) {
    StringBuilder builder = new StringBuilder();

    for (Object string : strings) {
      if(string.getClass() == String.class) {     //Set up class if statment check, String Class check
        builder.append(String.format("string: %s\n", string));   //String class return statement
      }
      else if(string.getClass() == Integer.class) {
        builder.append(String.format("integer: %s\n", string));   //Integer class return statement
      }
    }

    return builder.toString();
  }


//  public String buildString(List<Number> integers) {
//    StringBuilder builder = new StringBuilder();
//
//    for (Number integer : integers) {
//      builder.append(String.format("integer: %s\n", integer));
//    }
//
//    return builder.toString();
//  }
}
