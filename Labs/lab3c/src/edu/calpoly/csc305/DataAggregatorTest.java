package edu.calpoly.csc305;

import edu.calpoly.csc305.services.RemoteService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class DataAggregatorTest {

  @Test
  void TestDataAggregatorDependency() throws IOException {
    LocalDate[] dates = {LocalDate.of(1,1,1), LocalDate.of(1,1,1)};
    RemoteService rm = mock(RemoteService.class);
    String [] res = {"1"};
    when(rm.byDate(LocalDate.of(1, 1, 1))).thenReturn(Arrays.asList(res));

    DataAggregator da = new DataAggregator(rm, dates);
    assertEquals(da.aggregateDates(da.rm , da.dates), Arrays.asList(new String[]{"1", "1"}));

    verify(rm, times(2)).byDate(LocalDate.of(1,1,1));
  }

  @Test
  void TestDataAggregatorException() throws IOException, DateTimeException{
    LocalDate[] dates = {LocalDate.of(1,1,1)};
    RemoteService rm = mock(RemoteService.class);
    when(rm.byDate(LocalDate.of(1, 1,1))).thenThrow(IOException.class);
    DataAggregator da = new DataAggregator(rm, dates);

    assertThrows(IOException.class, () -> {
      da.aggregateDates(rm, dates);
      System.out.println("Exception Found: IOException");
    });
  }

}