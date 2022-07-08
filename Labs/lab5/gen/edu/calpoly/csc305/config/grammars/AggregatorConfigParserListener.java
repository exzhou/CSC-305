// Generated from /Users/ericzhou/Desktop/CSC_305_2/lab5-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigParser.g4 by ANTLR 4.9.1
package edu.calpoly.csc305.config.grammars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AggregatorConfigParser}.
 */
public interface AggregatorConfigParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#sources}.
	 * @param ctx the parse tree
	 */
	void enterSources(AggregatorConfigParser.SourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#sources}.
	 * @param ctx the parse tree
	 */
	void exitSources(AggregatorConfigParser.SourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#sourceType}.
	 * @param ctx the parse tree
	 */
	void enterSourceType(AggregatorConfigParser.SourceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#sourceType}.
	 * @param ctx the parse tree
	 */
	void exitSourceType(AggregatorConfigParser.SourceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#fileSourceType}.
	 * @param ctx the parse tree
	 */
	void enterFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#fileSourceType}.
	 * @param ctx the parse tree
	 */
	void exitFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#urlSourceType}.
	 * @param ctx the parse tree
	 */
	void enterUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#urlSourceType}.
	 * @param ctx the parse tree
	 */
	void exitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#sourceName}.
	 * @param ctx the parse tree
	 */
	void enterSourceName(AggregatorConfigParser.SourceNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#sourceName}.
	 * @param ctx the parse tree
	 */
	void exitSourceName(AggregatorConfigParser.SourceNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#sourceLocation}.
	 * @param ctx the parse tree
	 */
	void enterSourceLocation(AggregatorConfigParser.SourceLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#sourceLocation}.
	 * @param ctx the parse tree
	 */
	void exitSourceLocation(AggregatorConfigParser.SourceLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregatorConfigParser#sourceAddress}.
	 * @param ctx the parse tree
	 */
	void enterSourceAddress(AggregatorConfigParser.SourceAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregatorConfigParser#sourceAddress}.
	 * @param ctx the parse tree
	 */
	void exitSourceAddress(AggregatorConfigParser.SourceAddressContext ctx);
}