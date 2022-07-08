package edu.calpoly.csc305;

import edu.calpoly.csc305.services.RemoteService;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Example aggregator for testing lab.
 */
public class DataAggregator {

  RemoteService rm;
  LocalDate[] dates;

  public DataAggregator(RemoteService rm, LocalDate... dates){
    this.rm = rm;
    this.dates = dates;
  }

  /**
   * Retrieves data from a remote service for multiple dates.
   *
   * @param dates dates for data of interest.
   * @param remoteService a remoteService object dependecy injection.
   * @return list of retrieved entries for specified dates
   * @throws IOException if communication error occurs
   */
  public List<String> aggregateDates(RemoteService remoteService, LocalDate... dates)
      throws IOException {
    remoteService.connect();

    List<String> results = new ArrayList<>();
    for (LocalDate date : dates) {
      results.addAll(remoteService.byDate(date));
    }

    remoteService.disconnect();

    return results;
  }
}
