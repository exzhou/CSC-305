package edu.calpoly.csc305.composite;

import edu.calpoly.csc305.entities.Article;

public class FilterComposite implements FilterComponent {
  public final FilterComponent filterComponent;

  public FilterComposite(FilterComponent filterComponent) {
    this.filterComponent = filterComponent;
  }

  @Override
  public boolean applyFilter(Article article) {
    return this.filterComponent.applyFilter(article);
  }

  @Override
  public String toString() {
    return filterComponent.getClass().toString();
  }
}
