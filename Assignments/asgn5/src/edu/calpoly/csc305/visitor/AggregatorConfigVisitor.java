package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.composite.FilterComposite;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import edu.calpoly.csc305.entities.Source;
import edu.calpoly.csc305.entities.SourceDecorator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AggregatorConfigVisitor
    extends AggregatorConfigParserBaseVisitor<List<SourceDecorator>> {
  private final Logger logger;

  public AggregatorConfigVisitor(Logger logger) {
    this.logger = logger;
  }

  @Override
  public List<SourceDecorator> visitSources(AggregatorConfigParser.SourcesContext ctx) {
    List<Source> sources = new ArrayList<>();
    int delay;
    List<SourceDecorator> sourceDecorators = new ArrayList<>();
    AggregatorTypeVisitor typeVisitor = new AggregatorTypeVisitor();
    AggregatorNameVisitor nameVisitor = new AggregatorNameVisitor();
    AggregatorParserFormatVisitor formatVisitor = new AggregatorParserFormatVisitor(logger);
    AggregatorFilterVisitor filterVisitor = new AggregatorFilterVisitor(logger);
    AggregatorDelayVisitor delayVisitor = new AggregatorDelayVisitor();

    for (AggregatorConfigParser.SourceTypeContext srcType : ctx.sourceType()) {
      Source src = new Source(
          srcType.accept(typeVisitor),
          srcType.accept(nameVisitor),
          srcType.accept(formatVisitor));

      FilterComposite filterComposite = srcType.accept(filterVisitor);
      String parseInt = srcType.accept(delayVisitor);
      SourceDecorator sourceDecorator = new SourceDecorator(src);
      if (parseInt != null) {
        delay = Integer.parseInt(parseInt);
        sourceDecorator.setDelay(delay);
      }
      if (filterComposite != null) {
        sourceDecorator.setFilter(filterComposite);
      }
      sourceDecorators.add(sourceDecorator);
      sources.add(src);
    }
    return sourceDecorators;
  }
}
