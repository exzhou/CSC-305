package edu.calpoly.csc305;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GroupTicketPriceCalculatorTest {

  @Test
  void mockTestSameAge(){
    final int [] ages = {10, 10};
    TicketPriceCalculator tk = mock(TicketPriceCalculator.class);
    when(tk.computePrice(LocalTime.of(1, 0), 10)).thenReturn(10);

    GroupTicketPriceCalculator gtk = new GroupTicketPriceCalculator(tk);
    assertEquals(gtk.computePrice(LocalTime.of(1, 0), ages), 20);
    verify(tk, times(2)).computePrice(LocalTime.of(1, 0), 10);

  }

  @Test
  void mockTestDifferentAge(){
    final int [] ages = {10, 20, 30, 10};
    TicketPriceCalculator tk2 = mock(TicketPriceCalculator.class);
    when(tk2.computePrice(LocalTime.of(1, 0), 10)).thenReturn(10);
    when(tk2.computePrice(LocalTime.of(1, 0), 20)).thenReturn(20);
    when(tk2.computePrice(LocalTime.of(1, 0), 30)).thenReturn(30);

    GroupTicketPriceCalculator gtk = new GroupTicketPriceCalculator(tk2);
    assertEquals(gtk.computePrice(LocalTime.of(1, 0), ages), 70);
    verify(tk2, times(2)).computePrice(LocalTime.of(1, 0), 10);
    verify(tk2).computePrice(LocalTime.of(1, 0), 20);
    verify(tk2).computePrice(LocalTime.of(1, 0), 30);
  }

}