package edu.calpoly.csc305;

import java.util.ArrayList;
import java.util.List;

public class IssueTwo {
  /**
   * Method to illustrate common issue with generics.
   *
   * @param items list to copy
   * @return duplicate of input list
   */
  public <T> List<T> duplicate(List<T> items) {   //Made type into <T> instead of wildcard, that way the type is set when added into list
    List<T> copy = new ArrayList<T>();

    for (Object item : items) {
      copy.add((T) item);
    }

    return copy;
  }
}
