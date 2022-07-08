package edu.calpoly.csc305;

import java.time.LocalTime;

/**
 * This class is primarily meant as an example of dependency injection and
 * testing with mock objects for the lab exercise. It is not necessarily
 * representative of a real ticking system.
 */
public class GroupTicketPriceCalculator {
  private final TicketPriceCalculator ticketCalculator;

  /**
   * Initialization of the group calculator based on the injected individual
   * ticket calculator.
   *
   * @param ticketCalculator injected dependency to determine individual ticket
   *                         price
   */
  public GroupTicketPriceCalculator(final TicketPriceCalculator ticketCalculator) {
    this.ticketCalculator = ticketCalculator;
  }

  /**
   * Compute total price for a sequence of ages at a specified time.
   *
   * @param scheduledTime schedule time for the ticketed event
   * @param ages ages of the individual attendees in the group
   * @return the total cost in cents
   */
  public int computePrice(final LocalTime scheduledTime, final int[] ages) {
    int total = 0;

    for (int age : ages) {
      total += ticketCalculator.computePrice(scheduledTime, age);
    }

    return total;
  }
}
