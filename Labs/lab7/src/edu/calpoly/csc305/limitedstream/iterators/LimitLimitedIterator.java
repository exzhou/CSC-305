package edu.calpoly.csc305.limitedstream.iterators;

import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class LimitLimitedIterator<T> implements LimitedIterator<T> {
  private int count = 0;
  private long size;
  private final LimitedIterator<? extends T> iterator;
  private T nextElement;

  /**
   * Builds a filtering limited iterator based on the provided predicate.
   *
   * @param size filtering condition
   * @param iterator underlying iterator
   */
  public LimitLimitedIterator(long size, LimitedIterator<? extends T> iterator) {
    this.size = size;
    this.iterator = iterator;
  }

  @Override
  public boolean hasNext() {
    return (iterator.hasNext() && count < size);
  }

  @Override
  public T next() {
    findNext();
    if(iterator.hasNext()){
      T tempNext = nextElement;
      nextElement = null;
      return tempNext;
    }
    return null;
  }

  /**
   * Sets instance variable 'nextElement' to the next element from the
   * underlying iterator that satisfies the predicate or null, if there
   * is no such element.
   */
  private void findNext() {
    while (nextElement == null && this.count < size && iterator.hasNext()) {
      T presumedNext = iterator.next();
      nextElement = presumedNext;
      this.count++;
    }
  }
}

