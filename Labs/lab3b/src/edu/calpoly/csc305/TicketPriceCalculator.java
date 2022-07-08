package edu.calpoly.csc305;

import java.time.LocalTime;

/**
 * Abstraction of ticket price calculators.
 */
public interface TicketPriceCalculator {
  /**
   * Compute the price of a single ticket for a showing at the specified time
   * and for a customer of the specified age.
   *
   * @param scheduledTime time of the showing
   * @param age attendee age
   * @return return the computed price in cents
   */
  int computePrice(final LocalTime scheduledTime, final int age);
}
