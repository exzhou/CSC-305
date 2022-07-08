package test;

import edu.calpoly.csc305.Article;
import edu.calpoly.csc305.ArticleClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArticleClassTest {

  @Test
  public void testDescription(){
    ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setTitle("Title").setDate("Date").setUrl("Url").build();
    assertEquals("Description", article.description());
  }

  @Test
  public void testTitle(){
    ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setTitle("Title").setDate("Date").setUrl("Url").build();
    assertEquals("Title", article.title());
  }

  @Test
  public void testDate(){
    ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setTitle("Title").setDate("Date").setUrl("Url").build();
    assertEquals("Date", article.publishedAt());
  }

  @Test
  public void testUrl(){
    ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setTitle("Title").setDate("Date").setUrl("Url").build();
    assertEquals("Url", article.url());
  }

  @Test
  public void testBadDescription(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      ArticleClass article = ArticleClass.Builder.newInstance().setTitle("Title").setDate("Date").setUrl("Url").build();
    });
  }

  @Test
  public void testBadDTitle(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setDate("Date").setUrl("Url").build();
    });
  }

  @Test
  public void testBadDUrl(){
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setDate("Date").setDescription("Description").build();
    });
  }

  @Test
  public void testMap(){
    ArticleClass article = ArticleClass.Builder.newInstance().setDescription("Description").setTitle("Title").setDate("Date").setUrl("Url").setImmutableMap().addToMap("key", "val").build();
    System.out.println(article.optionalAttributes().get("key"));
    assertEquals("val", article.optionalAttributes().get("key"));
  }

}