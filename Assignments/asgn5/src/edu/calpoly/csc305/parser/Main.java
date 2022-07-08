package edu.calpoly.csc305.parser;

import edu.calpoly.csc305.entities.Article;
import edu.calpoly.csc305.entities.BlockingQueue;
import edu.calpoly.csc305.entities.SourceDecorator;
import edu.calpoly.csc305.entities.ProccessorDecorator;
import edu.calpoly.csc305.runner.PrintRunner;
import edu.calpoly.csc305.runner.ProccessRunner;
import edu.calpoly.csc305.visitor.AggregatorConfigVisitor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Main {
  static final String LOGGER = "Parselogger";

  /**
   * A demonstration of the parser class in action.
   *
   * @param args a List of string arguments
   */
  public static void main(String [] args) throws InterruptedException {
    //ArrayList<ProccessRunner> proccessRunners = new ArrayList<>();
    BlockingQueue<Article> queue = new BlockingQueue<>();
    Logger logger = Logger.getLogger(Main.class.toString());
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(Runtime
        .getRuntime()
        .availableProcessors());
    for (SourceDecorator src : ParserFormats.parseFile(args[0], logger)
        .accept(new AggregatorConfigVisitor(logger))) {
      ProccessorDecorator proccessorDecorator = new ProccessorDecorator(src);
      ProccessRunner proccessRunner =
          new ProccessRunner(proccessorDecorator, src.getDelay(), queue);
      scheduler.schedule(proccessRunner,  proccessRunner.getDelay(), TimeUnit.MILLISECONDS);
      //proccessRunners.add(proccessRunner);
    }
    PrintRunner printRunner = new PrintRunner(queue);
    scheduler.schedule(printRunner, 0, TimeUnit.MILLISECONDS);
    scheduler.awaitTermination(1000, TimeUnit.MILLISECONDS);
    scheduler.shutdown();
  }
}
