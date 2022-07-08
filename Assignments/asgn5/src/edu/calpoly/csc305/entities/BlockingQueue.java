package edu.calpoly.csc305.entities;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue<T> {
  private final List<T> queue = new LinkedList<>();


  /**
   * Getter method for grabbing an item from the queue.
   */
  public T getItem() throws InterruptedException {
    synchronized (this) {
      while (queue.isEmpty()) {
        this.wait();
      }
      return queue.remove(0);
    }
  }

  /**
   * Method for adding items to the queue.
   */
  public void addItem(T item) {
    synchronized (this) {
      queue.add(item);
      this.notifyAll();
    }
  }

  /**
   * Method to check if queue is empty.
   */
  public boolean isEmpty() {
    synchronized (this) {
      return queue.isEmpty();
    }
  }
}
