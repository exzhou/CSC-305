package edu.calpoly.csc305.config.visitors;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class AggregatorEchoVisitor
  extends AggregatorConfigParserBaseVisitor<String> {
  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#sources}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
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
    StringBuilder st = new StringBuilder();
    st.append("file");
    st.append("\n");
    st.append(ctx.sourceName().accept(this));
    st.append("\n");
    st.append(ctx.sourceLocation().accept(this));
    st.append("\n");
    return st.toString();
  }

  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#urlSourceType}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx) {
    StringBuilder st = new StringBuilder();
    st.append("url");
    st.append("\n");
    st.append(ctx.sourceName().accept(this));
    st.append("\n");
    st.append(ctx.sourceAddress().accept(this));
    st.append("\n");
    return st.toString();
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


  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#sourceLocation}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitSourceLocation(AggregatorConfigParser.SourceLocationContext ctx) {
    return ctx.LINE().toString().trim();
  }

  /**
   * Visit a parse tree produced by {@link AggregatorConfigParser#sourceAddress}.
   *
   * @param ctx the parse tree
   * @return the visitor result
   */
  @Override
  public String visitSourceAddress(AggregatorConfigParser.SourceAddressContext ctx) {
    return ctx.LINE().toString().trim();
  }

//  /**
//   * Visit a parse tree produced by {@link AggregatorConfigParser#sourceAddress}.
//   *
//   * @param ctx the parse tree
//   * @return the visitor result
//   */
//  @Override
//  public String visitSourceType(AggregatorConfigParser.SourceTypeContext ctx) {
//    return ctx.Line()
//  }
}
