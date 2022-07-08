package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import java.util.ArrayList;
import java.util.List;

public class AggregatorNameVisitor extends AggregatorConfigParserBaseVisitor<String> {


  @Override
  public String visitSources(AggregatorConfigParser.SourcesContext ctx) {
    List<String> sourceNames = new ArrayList<>();
    for (AggregatorConfigParser.SourceTypeContext sourceType : ctx.sourceType()) {
      sourceNames.add(sourceType.accept(this));
    }
    return String.join("\n", sourceNames);
  }


  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#fileSourceType}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx) {
    return ctx.sourceName().accept(this);
  }

  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#urlSourceType}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx) {
    return ctx.sourceName().accept(this);
  }

  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#sourceName}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitSourceName(AggregatorConfigParser.SourceNameContext ctx) {
    return ctx.LINE().toString().trim();
  }
}
