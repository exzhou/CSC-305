package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import edu.calpoly.csc305.entities.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AggregatorConfigVisitor extends AggregatorConfigParserBaseVisitor<List<Source>> {
  private final Logger logger;

  public AggregatorConfigVisitor(Logger logger) {
    this.logger = logger;
  }

  @Override
  public List<Source> visitSources(AggregatorConfigParser.SourcesContext ctx) {
    List<Source> sources = new ArrayList<>();
    AggregatorTypeVisitor typeVisitor = new AggregatorTypeVisitor();
    AggregatorNameVisitor nameVisitor = new AggregatorNameVisitor();
    AggregatorParserFormatVisitor formatVisitor = new AggregatorParserFormatVisitor(logger);

    for (AggregatorConfigParser.SourceTypeContext srcType : ctx.sourceType()) {
      sources.add(new Source(
          srcType.accept(typeVisitor),
          srcType.accept(nameVisitor),
          srcType.accept(formatVisitor)
      ));
    }

    return sources;
  }


}
