package edu.calpoly.csc305;

import java.util.List;

public class IssueThree {

  private final IssueThreeData data;

  public IssueThree(IssueThreeData data) {
    this.data = data;
  }

  public int count() {
    List<? super String> strings = (List<? super String>) data.strings();

    if (strings.get(0).equals("hello")) {
      // You can remove this if statement.
      // It is just here to demonstrate that strings can be extracted
      // from the list.
    }

    strings.add("zoinks");
    strings.set(0, "nope");

    return strings.size();
  }
}
