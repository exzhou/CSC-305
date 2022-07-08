package edu.calpoly.csc305.runner;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.entities.BlockingQueue;
import edu.calpoly.csc305.entities.ProccessorDecorator;
import java.io.IOException;


public class ProccessRunner implements Runnable {

  ProccessorDecorator proccessorDecorator;
  int delay;
  BlockingQueue<Article> queue;

  /**
   * Constructor for creating processorRunner and proccessing article files.
   */
  public ProccessRunner(ProccessorDecorator pr, int delay, BlockingQueue<Article> queue) {
    this.proccessorDecorator = pr;
    this.delay = delay;
    this.queue = queue;
  }


  @Override
  public void run() {
    try {
      for (Article article : proccessorDecorator.filter()) {
        queue.addItem(article);
      }
    } catch (IOException e) {
      e.getMessage();
    }
  }

  /**
   * Method for getting delay field.
   */
  public int getDelay() {
    return delay;
  }
}
