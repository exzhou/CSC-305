package edu.test;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CustomHandler extends Handler {


  /**
   * A method for publishing log record messages.
   *
   * @param re a LogRecord object.
   */
  @Override
  public void publish(LogRecord re) {
    re.getMessage();
  }


  @Override
  public void flush() {
    //empty for now, until functionality is instructed
  }

  @Override
  public void close() throws SecurityException {
    //empty for now, until functionality is instructed
  }
}
