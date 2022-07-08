package edu.calpoly.csc305.composite;

import edu.calpoly.csc305.entities.Article;


public class AndLeaf implements FilterComponent {

  final FilterComponent lft;
  final FilterComponent rht;

  public AndLeaf(FilterComponent lft, FilterComponent rht) {
    this.lft = lft;
    this.rht = rht;
  }

  @Override
  public boolean applyFilter(Article article) {
    return (lft.applyFilter(article) && rht.applyFilter(article));
  }
}
