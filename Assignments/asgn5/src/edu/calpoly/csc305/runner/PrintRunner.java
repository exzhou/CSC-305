package edu.calpoly.csc305.runner;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.entities.BlockingQueue;

public class PrintRunner implements Runnable {
  BlockingQueue<Article> queue;

  public PrintRunner(BlockingQueue<Article> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    try {
      while (Thread.currentThread().isAlive()) {
        System.out.println(this.queue.getItem());
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
