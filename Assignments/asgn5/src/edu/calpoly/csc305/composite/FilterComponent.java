package edu.calpoly.csc305.composite;

import edu.calpoly.csc305.entities.Article;

public interface FilterComponent {
  boolean applyFilter(Article article);
}
