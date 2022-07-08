package edu.calpoly.csc305.visitor;

import edu.calpoly.csc305.config.grammars.AggregatorConfigParser;
import edu.calpoly.csc305.config.grammars.AggregatorConfigParserBaseVisitor;
import edu.calpoly.csc305.srctype.FileType;
import edu.calpoly.csc305.srctype.SrcType;
import edu.calpoly.csc305.srctype.UrlType;

public class AggregatorTypeVisitor extends AggregatorConfigParserBaseVisitor<SrcType> {


  @Override
  public SrcType visitFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx) {
    return new FileType(ctx.sourceLocation().LINE().toString().trim());
  }

  @Override
  public SrcType visitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx) {
    return new UrlType(ctx.sourceAddress().LINE().toString().trim());
  }

  @Override
  public SrcType visitSourceLocation(AggregatorConfigParser.SourceLocationContext ctx) {
    return ctx.accept(this);
  }

  @Override
  public SrcType visitSourceAddress(AggregatorConfigParser.SourceAddressContext ctx) {
    return ctx.accept(this);
  }
}
