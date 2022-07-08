// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment3-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigParser.g4 by ANTLR 4.9.1
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
		NAME=6, LOCATION=7, ADDRESS=8, NEWLINE=9, WS=10, COMMENT=11, LINE=12;
	public static final int
		RULE_sources = 0, RULE_sourceType = 1, RULE_fileSourceType = 2, RULE_urlSourceType = 3, 
		RULE_sourceName = 4, RULE_format = 5, RULE_format_option = 6, RULE_sourceLocation = 7, 
		RULE_sourceAddress = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"sources", "sourceType", "fileSourceType", "urlSourceType", "sourceName", 
			"format", "format_option", "sourceLocation", "sourceAddress"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'file'", "'url'", "'format:'", "'newsapi'", "'simple'", "'name:'", 
			"'location:'", "'address:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "FORMAT", "NEWSAPI_FORMAT", 
			"SIMPLE_FORMAT", "NAME", "LOCATION", "ADDRESS", "NEWLINE", "WS", "COMMENT", 
			"LINE"
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
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FILE_SOURCE_TYPE) | (1L << URL_SOURCE_TYPE) | (1L << NEWLINE))) != 0)) {
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FILE_SOURCE_TYPE:
				case URL_SOURCE_TYPE:
					{
					setState(18);
					sourceType();
					}
					break;
				case NEWLINE:
					{
					setState(19);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
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
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE_SOURCE_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				fileSourceType();
				}
				break;
			case URL_SOURCE_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(FILE_SOURCE_TYPE);
			setState(32);
			match(NEWLINE);
			setState(33);
			sourceName();
			setState(34);
			format();
			setState(35);
			sourceLocation();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(URL_SOURCE_TYPE);
			setState(38);
			match(NEWLINE);
			setState(39);
			sourceName();
			setState(40);
			format();
			setState(41);
			sourceAddress();
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
			setState(43);
			match(NAME);
			setState(44);
			match(LINE);
			setState(45);
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
			setState(47);
			match(FORMAT);
			setState(48);
			format_option();
			setState(49);
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
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWSAPI_FORMAT:
				_localctx = new NewsApiFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(NEWSAPI_FORMAT);
				}
				break;
			case SIMPLE_FORMAT:
				_localctx = new SimpleFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
			setState(55);
			match(LOCATION);
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
			setState(59);
			match(ADDRESS);
			setState(60);
			match(LINE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5"+
		"\b8\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\2\2<\2\30\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b\'\3\2\2\2\n-\3\2\2\2\f"+
		"\61\3\2\2\2\16\67\3\2\2\2\209\3\2\2\2\22=\3\2\2\2\24\27\5\4\3\2\25\27"+
		"\7\13\2\2\26\24\3\2\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35 \5"+
		"\6\4\2\36 \5\b\5\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\7\3\2\2\""+
		"#\7\13\2\2#$\5\n\6\2$%\5\f\7\2%&\5\20\t\2&\7\3\2\2\2\'(\7\4\2\2()\7\13"+
		"\2\2)*\5\n\6\2*+\5\f\7\2+,\5\22\n\2,\t\3\2\2\2-.\7\b\2\2./\7\16\2\2/\60"+
		"\7\13\2\2\60\13\3\2\2\2\61\62\7\5\2\2\62\63\5\16\b\2\63\64\7\13\2\2\64"+
		"\r\3\2\2\2\658\7\6\2\2\668\7\7\2\2\67\65\3\2\2\2\67\66\3\2\2\28\17\3\2"+
		"\2\29:\7\t\2\2:;\7\16\2\2;<\7\13\2\2<\21\3\2\2\2=>\7\n\2\2>?\7\16\2\2"+
		"?@\7\13\2\2@\23\3\2\2\2\6\26\30\37\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}