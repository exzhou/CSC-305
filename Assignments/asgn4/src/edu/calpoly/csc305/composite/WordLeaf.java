package edu.calpoly.csc305.composite;

import edu.calpoly.csc305.entities.Article;

public class WordLeaf implements FilterComponent {
  public final String word;

  public WordLeaf(String word) {
    this.word = word.toLowerCase();
  }

  @Override
  public boolean applyFilter(Article article) {
    return (article.getTitle().toLowerCase().contains(word)
        || article.getDescription().toLowerCase().contains(word)
        || article.getUrl().toLowerCase().contains(word)
        || article.getDate().toString().toLowerCase().contains(word));
  }

  public String getWord() {
    return this.word;
  }
}
