package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }


  /**
   * This is a thesaurus class that saves a list of alternative words within a library based on user inputed alternatives.
   */
  public void addAlternatives(String word, String ... alternatives) {
//    if(synonyms.containsValue(word)) {
//      synonyms.remove(word);
//      ArrayList<String> s = new ArrayList<String>();
//      //s.add(word);
//      //
//      s.addAll(Arrays.asList(alternatives));
//      synonyms.put(word, Arrays.asList(alternatives));
//    }
//    else{
//      ArrayList<String> s = new ArrayList<String>();
//      s.add(word);
//      synonyms.put(word, s);
//    }
    if (synonyms.isEmpty() || synonyms.get(word) == null) {
      synonyms.put(word, Arrays.asList(alternatives));
    } else {
      for (String s : alternatives) {
        if (!synonyms.get(word).contains(s)) {
          synonyms.get(word).add(s);
        }
      }
    }
  }


  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
