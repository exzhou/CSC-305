package edu.calpoly.csc305;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class MovieTicketPriceCalculatorTest {

  private static final int STANDARD_PRICE_CENTS = 2700;
  private static final int MATINEE_PRICE_CENTS = 2400;
  private static final int CHILD_DISCOUNT_CENTS = 300;
  private static final int SENIOR_DISCOUNT_CENTS = 400;
  private final MovieTicketPriceCalculator movieTicketPriceCalculator = new MovieTicketPriceCalculator(LocalTime.of(8,0), LocalTime.of(14,0), 10, 60);

  @Test
  void standardPriceTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(7, 0), 30), STANDARD_PRICE_CENTS);
  }

  @Test
  void discountPriceYouthTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(7, 0), 10), STANDARD_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }

  @Test
  void discountPriceYouthEdgeTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(7, 0), 9), STANDARD_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }

  @Test
  void discountPriceSeniorTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(7, 0), 60), STANDARD_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }

  @Test
  void discountPriceSeniorEdgeTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(7, 0), 61), STANDARD_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }

  @Test
  void matineePriceTimeTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(10, 0), 30), MATINEE_PRICE_CENTS);
  }

  @Test
  void matineePriceYouthTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(10, 0), 10), MATINEE_PRICE_CENTS - CHILD_DISCOUNT_CENTS);
  }

  @Test
  void matineePriceSeniorTest(){
    assertEquals(movieTicketPriceCalculator.computePrice(LocalTime.of(10, 0), 60), MATINEE_PRICE_CENTS - SENIOR_DISCOUNT_CENTS);
  }

}