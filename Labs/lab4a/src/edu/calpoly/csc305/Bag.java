package edu.calpoly.csc305;

import java.util.ArrayList;
import java.util.Optional;

public class Bag implements Multiset {
  ArrayList<Object> elements = new ArrayList<Object>();

  @Override
  public void add(Object element) {
    elements.add(element);
  }

  @Override
  public boolean remove(Object element) {
    return elements.remove(element);

  }

  @Override
  public int size() {
    return elements.size();
  }

  @Override
  public int count(Object element) {
    int count = 0;
    for (Object obj: elements) {
      if(obj.equals(element)){
        count++;
      }
    }
    return count;
  }

  @Override
  public Optional<Object> grab() {
    if(this.size() == 0){
      return Optional.empty();
    }
      Optional<Object> remove = Optional.ofNullable(elements.remove(0));
      return remove;
  }
}
