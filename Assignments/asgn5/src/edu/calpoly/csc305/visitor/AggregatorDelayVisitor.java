package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;

public class AggregatorDelayVisitor extends AggregatorConfigParserBaseVisitor<String> {

  @Override
  public String visitDelay(AggregatorConfigParser.DelayContext ctx) {
    if (ctx.NUM() == null) {
      return "0";
    }
    return ctx.NUM().toString();
  }
}
