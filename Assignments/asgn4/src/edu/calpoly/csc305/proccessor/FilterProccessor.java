package edu.calpoly.csc305.proccessor;

import edu.calpoly.csc305.composite.FilterComponent;
import edu.calpoly.csc305.entities.Article;
import java.util.ArrayList;
import java.util.List;

public class FilterProccessor implements Proccessor {

  Proccessor proccessor;
  FilterComponent filterComponent;

  public FilterProccessor(Proccessor proccessor, FilterComponent filterComponent) {
    this.proccessor = proccessor;
    this.filterComponent = filterComponent;
  }


  /**
   * A function that processess the articles in the JSON
   * by calling on the appropriate parser.
   *
   * @return a list of articles
   */
  public List<Article> proccess() {
    List<Article> articles = this.proccessor.proccess();
    List<Article> filteredArticles = new ArrayList<>();
    for (Article article : articles) {
      if (this.filterComponent.applyFilter(article)) {
        filteredArticles.add(article);
      }
    }
    return filteredArticles;
  }

}
