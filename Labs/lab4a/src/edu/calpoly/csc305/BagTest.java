package edu.calpoly.csc305;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {


  @Test
  void testSizeEmpty() {
    Bag bag = new Bag();
    assertEquals(0, bag.size());
  }

  @Test
  void testSizeAddOne() {
    Bag bag = new Bag();
    bag.add(1);
    assertEquals(1, bag.size());
  }

  @Test
  void testSizeAddTwo() {
    Bag bag = new Bag();
    bag.add(1);
    assertEquals(1, bag.size());
    bag.add(1);
    assertEquals(2, bag.size());
  }

  @Test
  void testSizeRemove() {
    Bag bag = new Bag();
    bag.add(1);
    assertEquals(1, bag.size());
    bag.remove(1);
    assertEquals(0, bag.size());
  }

  @Test
  void testSizeCount() {
    Bag bag = new Bag();
    bag.add(1);
    assertEquals(1, bag.size());
    assertEquals(1, bag.count(1));
    bag.add(1);
    assertEquals(2, bag.size());
    assertEquals(2, bag.count(1));
  }

  @Test
  void testSizeGrab() {
    Bag bag = new Bag();
    bag.add("1");
    Optional op = bag.grab();

    assertEquals("1", op.get());
  }

}