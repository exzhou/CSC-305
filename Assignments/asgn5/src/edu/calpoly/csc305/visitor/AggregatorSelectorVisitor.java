package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.composite.AndLeaf;
import edu.calpoly.csc305.composite.FilterComposite;
import edu.calpoly.csc305.composite.OrLeaf;
import edu.calpoly.csc305.composite.WordLeaf;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;

public class AggregatorSelectorVisitor extends AggregatorConfigParserBaseVisitor<FilterComposite> {


  @Override
  public FilterComposite visitFilter(AggregatorConfigParser.FilterContext ctx) {
    if (ctx.selector() != null) {
      return ctx.selector().accept(this);
    } else {
      return null;
    }
  }

  @Override
  public FilterComposite visitAndExpression(AggregatorConfigParser.AndExpressionContext ctx) {
    return new FilterComposite(new AndLeaf(ctx.lft.accept(this), ctx.rht.accept(this)));
  }

  @Override
  public FilterComposite visitOrExpression(AggregatorConfigParser.OrExpressionContext ctx) {
    return new FilterComposite(new OrLeaf(ctx.lft.accept(this), ctx.rht.accept(this)));
  }

  @Override
  public FilterComposite visitNestedExpression(AggregatorConfigParser.NestedExpressionContext ctx) {
    return ctx.selector().accept(this);
  }

  @Override
  public FilterComposite visitKeywordExpression(
      AggregatorConfigParser.KeywordExpressionContext ctx) {
    return new FilterComposite(new WordLeaf(ctx.KEYWORD().toString().trim()));
  }
}
