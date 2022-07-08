package edu.calpoly.csc305.limitedstream.iterators;

import edu.calpoly.csc305.limitedstream.streams.BaseLimitedStream;
import edu.calpoly.csc305.limitedstream.streams.LimitedStream;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilterLimitedIterator<T> implements LimitedIterator<T> {
  private final Predicate<? super T> predicate;
  private final LimitedIterator<? extends T> iterator;
  private T nextElement;

  /**
   * Builds a filtering limited iterator based on the provided predicate.
   *
   * @param predicate filtering condition
   * @param iterator underlying iterator
   */
  public FilterLimitedIterator(Predicate<? super T> predicate,
                               LimitedIterator<? extends T> iterator) {
    this.predicate = predicate;
    this.iterator = iterator;
    findNext();
  }

  @Override
  public boolean hasNext() {
    return nextElement != null;
  }

  @Override
  public T next() {
    T nextElementTemp = nextElement;
    nextElement = null;
    findNext();
    return nextElementTemp;
  }

  /**
   * Sets instance variable 'nextElement' to the next element from the
   * underlying iterator that satisfies the predicate or null, if there
   * is no such element.
   */
  private void findNext() {
    while (nextElement == null && iterator.hasNext()) {
      T presumedNext = iterator.next();
      if (predicate.test(presumedNext)) {
        nextElement = presumedNext;
      }
    }
  }
}
