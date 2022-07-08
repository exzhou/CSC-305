// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment3-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigParser.g4 by ANTLR 4.9.1
package edu.calpoly.csc305.config.grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AggregatorConfigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AggregatorConfigParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSources(AggregatorConfigParser.SourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#sourceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceType(AggregatorConfigParser.SourceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#fileSourceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSourceType(AggregatorConfigParser.FileSourceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#urlSourceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlSourceType(AggregatorConfigParser.UrlSourceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#sourceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceName(AggregatorConfigParser.SourceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat(AggregatorConfigParser.FormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewsApiFormat}
	 * labeled alternative in {@link AggregatorConfigParser#format_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewsApiFormat(AggregatorConfigParser.NewsApiFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleFormat}
	 * labeled alternative in {@link AggregatorConfigParser#format_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFormat(AggregatorConfigParser.SimpleFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#sourceLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceLocation(AggregatorConfigParser.SourceLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregatorConfigParser#sourceAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceAddress(AggregatorConfigParser.SourceAddressContext ctx);
}