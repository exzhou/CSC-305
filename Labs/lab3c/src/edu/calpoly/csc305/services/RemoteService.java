package edu.calpoly.csc305.services;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

/**
 * An abstraction of a remote service that provides responses selected by
 * date or by keyword.
 * This is only intended as an example for experimenting with mock objects.
 */
public interface RemoteService {
  /**
   * Connects to the remote service.
   *
   * @throws IOException when the connection cannot be established
   */
  void connect() throws IOException;

  /**
   * Retrieves data from the service selected by date.
   *
   * @param date the date of interest for filtering
   * @return list of those strings produced by the service for the given date
   * @throws IOException if the connection fails while retrieving data
   */
  List<String> byDate(LocalDate date) throws IOException;

  /**
   * Disconnects from the remote service.
   *
   * @throws IOException if an error occurs while disconnecting
   */
  void disconnect() throws IOException;
}
