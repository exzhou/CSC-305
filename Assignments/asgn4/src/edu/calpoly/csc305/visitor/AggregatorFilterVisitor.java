package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.composite.FilterComposite;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import java.util.logging.Logger;

public class AggregatorFilterVisitor extends AggregatorConfigParserBaseVisitor<FilterComposite> {

  private final Logger logger;

  public AggregatorFilterVisitor(Logger logger) {
    this.logger = logger;
  }

  @Override
  public FilterComposite visitFilter(AggregatorConfigParser.FilterContext ctx) {

    if (ctx.selector() != null) {
      AggregatorConfigParser.SelectorContext selectorContext = ctx.selector();
      AggregatorSelectorVisitor filterVisitor = new AggregatorSelectorVisitor();

      return new FilterComposite(selectorContext.accept(filterVisitor));
    } else {
      logger.warning("Empty Filter");
      return null;
    }

  }



}
