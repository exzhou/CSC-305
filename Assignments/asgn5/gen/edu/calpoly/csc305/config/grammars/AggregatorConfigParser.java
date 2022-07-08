// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment5-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigParser.g4 by ANTLR 4.9.1
package edu.calpoly.csc305.config.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AggregatorConfigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FILE_SOURCE_TYPE=1, URL_SOURCE_TYPE=2, FORMAT=3, NEWSAPI_FORMAT=4, SIMPLE_FORMAT=5, 
		NAME=6, LOCATION=7, ADDRESS=8, FILTER=9, DELAY=10, NUM=11, NEWLINE=12, 
		WS=13, COMMENT=14, LINE=15, AND=16, OR=17, LPAREN=18, RPAREN=19, KEYWORD=20, 
		NL=21, SPACE=22;
	public static final int
		RULE_sources = 0, RULE_sourceType = 1, RULE_fileSourceType = 2, RULE_urlSourceType = 3, 
		RULE_sourceName = 4, RULE_format = 5, RULE_format_option = 6, RULE_sourceLocation = 7, 
		RULE_sourceAddress = 8, RULE_filter = 9, RULE_selector = 10, RULE_delay = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"sources", "sourceType", "fileSourceType", "urlSourceType", "sourceName", 
			"format", "format_option", "sourceLocation", "sourceAddress", "filter", 
			"selector", "delay"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'file'", "'url'", "'format:'", "'newsapi'", "'simple'", "'name:'", 
			"'location:'", "'address:'", "'filter:'", "'delay:'", null, null, null, 
			null, null, "'&'", "'|'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "FORMAT", "NEWSAPI_FORMAT", 
			"SIMPLE_FORMAT", "NAME", "LOCATION", "ADDRESS", "FILTER", "DELAY", "NUM", 
			"NEWLINE", "WS", "COMMENT", "LINE", "AND", "OR", "LPAREN", "RPAREN", 
			"KEYWORD", "NL", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AggregatorConfigParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AggregatorConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourcesContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AggregatorConfigParser.EOF, 0); }
		public List<SourceTypeContext> sourceType() {
			return getRuleContexts(SourceTypeContext.class);
		}
		public SourceTypeContext sourceType(int i) {
			return getRuleContext(SourceTypeContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AggregatorConfigParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AggregatorConfigParser.NEWLINE, i);
		}
		public SourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourcesContext sources() throws RecognitionException {
		SourcesContext _localctx = new SourcesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE_SOURCE_TYPE) | (1L << URL_SOURCE_TYPE) | (1L << NEWLINE))) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILE_SOURCE_TYPE:
				case URL_SOURCE_TYPE:
					{
					setState(24);
					sourceType();
					}
					break;
				case NEWLINE:
					{
					setState(25);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceTypeContext extends ParserRuleContext {
		public FileSourceTypeContext fileSourceType() {
			return getRuleContext(FileSourceTypeContext.class,0);
		}
		public UrlSourceTypeContext urlSourceType() {
			return getRuleContext(UrlSourceTypeContext.class,0);
		}
		public SourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSourceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSourceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSourceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceTypeContext sourceType() throws RecognitionException {
		SourceTypeContext _localctx = new SourceTypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceType);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE_SOURCE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				fileSourceType();
				}
				break;
			case URL_SOURCE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				urlSourceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileSourceTypeContext extends ParserRuleContext {
		public TerminalNode FILE_SOURCE_TYPE() { return getToken(AggregatorConfigParser.FILE_SOURCE_TYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public SourceLocationContext sourceLocation() {
			return getRuleContext(SourceLocationContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public FileSourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileSourceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterFileSourceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitFileSourceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitFileSourceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileSourceTypeContext fileSourceType() throws RecognitionException {
		FileSourceTypeContext _localctx = new FileSourceTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fileSourceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(FILE_SOURCE_TYPE);
			setState(38);
			match(NEWLINE);
			setState(39);
			sourceName();
			setState(40);
			format();
			setState(41);
			sourceLocation();
			setState(42);
			filter();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELAY) {
				{
				setState(43);
				delay();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlSourceTypeContext extends ParserRuleContext {
		public TerminalNode URL_SOURCE_TYPE() { return getToken(AggregatorConfigParser.URL_SOURCE_TYPE, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public FormatContext format() {
			return getRuleContext(FormatContext.class,0);
		}
		public SourceAddressContext sourceAddress() {
			return getRuleContext(SourceAddressContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public UrlSourceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlSourceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterUrlSourceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitUrlSourceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitUrlSourceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlSourceTypeContext urlSourceType() throws RecognitionException {
		UrlSourceTypeContext _localctx = new UrlSourceTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_urlSourceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(URL_SOURCE_TYPE);
			setState(47);
			match(NEWLINE);
			setState(48);
			sourceName();
			setState(49);
			format();
			setState(50);
			sourceAddress();
			setState(51);
			filter();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELAY) {
				{
				setState(52);
				delay();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AggregatorConfigParser.NAME, 0); }
		public TerminalNode LINE() { return getToken(AggregatorConfigParser.LINE, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public SourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSourceName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSourceName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceNameContext sourceName() throws RecognitionException {
		SourceNameContext _localctx = new SourceNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(NAME);
			setState(56);
			match(LINE);
			setState(57);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(AggregatorConfigParser.FORMAT, 0); }
		public Format_optionContext format_option() {
			return getRuleContext(Format_optionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public FormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormatContext format() throws RecognitionException {
		FormatContext _localctx = new FormatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(FORMAT);
			setState(60);
			format_option();
			setState(61);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Format_optionContext extends ParserRuleContext {
		public Format_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_format_option; }
	 
		public Format_optionContext() { }
		public void copyFrom(Format_optionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NewsApiFormatContext extends Format_optionContext {
		public TerminalNode NEWSAPI_FORMAT() { return getToken(AggregatorConfigParser.NEWSAPI_FORMAT, 0); }
		public NewsApiFormatContext(Format_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterNewsApiFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitNewsApiFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitNewsApiFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleFormatContext extends Format_optionContext {
		public TerminalNode SIMPLE_FORMAT() { return getToken(AggregatorConfigParser.SIMPLE_FORMAT, 0); }
		public SimpleFormatContext(Format_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSimpleFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSimpleFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSimpleFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Format_optionContext format_option() throws RecognitionException {
		Format_optionContext _localctx = new Format_optionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_format_option);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWSAPI_FORMAT:
				_localctx = new NewsApiFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(NEWSAPI_FORMAT);
				}
				break;
			case SIMPLE_FORMAT:
				_localctx = new SimpleFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(SIMPLE_FORMAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceLocationContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(AggregatorConfigParser.LOCATION, 0); }
		public TerminalNode LINE() { return getToken(AggregatorConfigParser.LINE, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public SourceLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSourceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSourceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSourceLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceLocationContext sourceLocation() throws RecognitionException {
		SourceLocationContext _localctx = new SourceLocationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sourceLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LOCATION);
			setState(68);
			match(LINE);
			setState(69);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceAddressContext extends ParserRuleContext {
		public TerminalNode ADDRESS() { return getToken(AggregatorConfigParser.ADDRESS, 0); }
		public TerminalNode LINE() { return getToken(AggregatorConfigParser.LINE, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public SourceAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterSourceAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitSourceAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitSourceAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceAddressContext sourceAddress() throws RecognitionException {
		SourceAddressContext _localctx = new SourceAddressContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sourceAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ADDRESS);
			setState(72);
			match(LINE);
			setState(73);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(AggregatorConfigParser.FILTER, 0); }
		public TerminalNode NL() { return getToken(AggregatorConfigParser.NL, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FILTER);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==KEYWORD) {
				{
				setState(76);
				selector(0);
				}
			}

			setState(79);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
	 
		public SelectorContext() { }
		public void copyFrom(SelectorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NestedExpressionContext extends SelectorContext {
		public TerminalNode LPAREN() { return getToken(AggregatorConfigParser.LPAREN, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AggregatorConfigParser.RPAREN, 0); }
		public NestedExpressionContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterNestedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitNestedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitNestedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends SelectorContext {
		public SelectorContext lft;
		public SelectorContext rht;
		public TerminalNode AND() { return getToken(AggregatorConfigParser.AND, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public AndExpressionContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KeywordExpressionContext extends SelectorContext {
		public TerminalNode KEYWORD() { return getToken(AggregatorConfigParser.KEYWORD, 0); }
		public KeywordExpressionContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterKeywordExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitKeywordExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitKeywordExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends SelectorContext {
		public SelectorContext lft;
		public SelectorContext rht;
		public TerminalNode OR() { return getToken(AggregatorConfigParser.OR, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public OrExpressionContext(SelectorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		return selector(0);
	}

	private SelectorContext selector(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SelectorContext _localctx = new SelectorContext(_ctx, _parentState);
		SelectorContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_selector, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEYWORD:
				{
				_localctx = new KeywordExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(KEYWORD);
				}
				break;
			case LPAREN:
				{
				_localctx = new NestedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(LPAREN);
				setState(84);
				selector(0);
				setState(85);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(95);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(new SelectorContext(_parentctx, _parentState));
						((AndExpressionContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_selector);
						setState(89);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(90);
						match(AND);
						setState(91);
						((AndExpressionContext)_localctx).rht = selector(3);
						}
						break;
					case 2:
						{
						_localctx = new OrExpressionContext(new SelectorContext(_parentctx, _parentState));
						((OrExpressionContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_selector);
						setState(92);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(93);
						match(OR);
						setState(94);
						((OrExpressionContext)_localctx).rht = selector(2);
						}
						break;
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DelayContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(AggregatorConfigParser.DELAY, 0); }
		public TerminalNode NUM() { return getToken(AggregatorConfigParser.NUM, 0); }
		public TerminalNode NEWLINE() { return getToken(AggregatorConfigParser.NEWLINE, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AggregatorConfigParserListener ) ((AggregatorConfigParserListener)listener).exitDelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AggregatorConfigParserVisitor ) return ((AggregatorConfigParserVisitor<? extends T>)visitor).visitDelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_delay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DELAY);
			setState(101);
			match(NUM);
			setState(102);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return selector_sempred((SelectorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean selector_sempred(SelectorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3\5\3&"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\58\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\bD\n\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13P\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fZ\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\fb\n\f\f\f\16\fe\13\f\3\r\3"+
		"\r\3\r\3\r\3\r\2\3\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2h\2\36\3\2"+
		"\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\n9\3\2\2\2\f=\3\2\2\2\16C\3\2"+
		"\2\2\20E\3\2\2\2\22I\3\2\2\2\24M\3\2\2\2\26Y\3\2\2\2\30f\3\2\2\2\32\35"+
		"\5\4\3\2\33\35\7\16\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2"+
		"#&\5\6\4\2$&\5\b\5\2%#\3\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\7\3\2\2()\7\16"+
		"\2\2)*\5\n\6\2*+\5\f\7\2+,\5\20\t\2,.\5\24\13\2-/\5\30\r\2.-\3\2\2\2."+
		"/\3\2\2\2/\7\3\2\2\2\60\61\7\4\2\2\61\62\7\16\2\2\62\63\5\n\6\2\63\64"+
		"\5\f\7\2\64\65\5\22\n\2\65\67\5\24\13\2\668\5\30\r\2\67\66\3\2\2\2\67"+
		"8\3\2\2\28\t\3\2\2\29:\7\b\2\2:;\7\21\2\2;<\7\16\2\2<\13\3\2\2\2=>\7\5"+
		"\2\2>?\5\16\b\2?@\7\16\2\2@\r\3\2\2\2AD\7\6\2\2BD\7\7\2\2CA\3\2\2\2CB"+
		"\3\2\2\2D\17\3\2\2\2EF\7\t\2\2FG\7\21\2\2GH\7\16\2\2H\21\3\2\2\2IJ\7\n"+
		"\2\2JK\7\21\2\2KL\7\16\2\2L\23\3\2\2\2MO\7\13\2\2NP\5\26\f\2ON\3\2\2\2"+
		"OP\3\2\2\2PQ\3\2\2\2QR\7\27\2\2R\25\3\2\2\2ST\b\f\1\2TZ\7\26\2\2UV\7\24"+
		"\2\2VW\5\26\f\2WX\7\25\2\2XZ\3\2\2\2YS\3\2\2\2YU\3\2\2\2Zc\3\2\2\2[\\"+
		"\f\4\2\2\\]\7\22\2\2]b\5\26\f\5^_\f\3\2\2_`\7\23\2\2`b\5\26\f\4a[\3\2"+
		"\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\27\3\2\2\2ec\3\2\2\2fg\7"+
		"\f\2\2gh\7\r\2\2hi\7\16\2\2i\31\3\2\2\2\f\34\36%.\67COYac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}