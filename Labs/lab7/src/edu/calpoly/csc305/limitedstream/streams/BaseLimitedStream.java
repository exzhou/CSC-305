package edu.calpoly.csc305.limitedstream.streams;

import edu.calpoly.csc305.limitedstream.iterators.FilterLimitedIterator;
import edu.calpoly.csc305.limitedstream.iterators.LimitLimitedIterator;
import edu.calpoly.csc305.limitedstream.iterators.LimitedIterator;
import edu.calpoly.csc305.limitedstream.iterators.LimitedIteratorAdapter;
import edu.calpoly.csc305.limitedstream.iterators.MapLimitedIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class BaseLimitedStream<T> implements LimitedStream<T> {
  private final LimitedIterator<? extends T> iterator;

  public BaseLimitedStream(Iterator<? extends T> iterator) {
    this.iterator = new LimitedIteratorAdapter<T>(iterator);
  }

  private BaseLimitedStream(LimitedIterator<? extends T> iterator) {
    this.iterator = iterator;
  }

  @Override
  public LimitedStream<T> filter(Predicate<? super T> predicate) {
    return new BaseLimitedStream<>(
      new FilterLimitedIterator<>(predicate, iterator));
  }

  @Override
  public LimitedStream<T> limit(long maxSize) {
    return new BaseLimitedStream<>(new LimitLimitedIterator<>(maxSize, iterator));
  }

  @Override
  public <R> LimitedStream<R> map(Function<? super T, ? extends R> mapper) {
    return new BaseLimitedStream<>(new MapLimitedIterator<>(mapper, iterator));
  }

  @Override
  public long count() {
    int count = 0;
    while(iterator.hasNext()) {
      iterator.next();
      count++;
    }
    return count;
  }

  @Override
  public List<T> asList() {
    ArrayList<T> arrayList = new ArrayList<>();
    while(iterator.hasNext()) {
      arrayList.add(iterator.next());
    }
    return arrayList;
  }
}
