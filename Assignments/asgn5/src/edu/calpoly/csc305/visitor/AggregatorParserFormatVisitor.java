package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import edu.calpoly.csc305.parser.CompParser;
import edu.calpoly.csc305.parser.ParserFormats;
import edu.calpoly.csc305.parser.SimpleParser;
import java.util.logging.Logger;

public class AggregatorParserFormatVisitor
    extends AggregatorConfigParserBaseVisitor<ParserFormats> {

  private final Logger logger;

  public AggregatorParserFormatVisitor(Logger logger) {
    this.logger = logger;
  }

  @Override
  public ParserFormats visitFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx) {
    return ctx.format().accept(this);
  }

  @Override
  public ParserFormats visitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx) {
    return ctx.format().accept(this);
  }

  @Override
  public ParserFormats visitFormat(AggregatorConfigParser.FormatContext ctx) {
    return ctx.format_option().accept(this);
  }

  @Override public ParserFormats visitSimpleFormat(AggregatorConfigParser.SimpleFormatContext ctx) {
    return new SimpleParser(ctx.toString(), logger);
  }

  @Override public ParserFormats visitNewsApiFormat(
      AggregatorConfigParser.NewsApiFormatContext ctx) {
    return new CompParser(ctx.toString(), logger);
  }
}
