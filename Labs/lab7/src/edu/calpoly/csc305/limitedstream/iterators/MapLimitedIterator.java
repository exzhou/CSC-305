package edu.calpoly.csc305.limitedstream.iterators;

import edu.calpoly.csc305.limitedstream.streams.BaseLimitedStream;
import edu.calpoly.csc305.limitedstream.streams.LimitedStream;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;

public class MapLimitedIterator<R,T> implements LimitedIterator<R> {
  private final Function<? super T, ? extends R> mapper;
  private final LimitedIterator<? extends T> iterator;
  private T nextElement;

  /**
   * Builds a filtering limited iterator based on the provided predicate.
   *
   * @param mapper mapping condition
   * @param iterator underlying iterator
   */
  public MapLimitedIterator(Function<? super T, ? extends R> mapper,
                            LimitedIterator<? extends T> iterator) {
    this.mapper = mapper;
    this.iterator = iterator;
  }

  @Override
  public boolean hasNext() {
    return iterator.hasNext();
  }

  @Override
  public R next() {
    if(hasNext()) {
      return mapper.apply(iterator.next());
    }
    return null;
  }
}
