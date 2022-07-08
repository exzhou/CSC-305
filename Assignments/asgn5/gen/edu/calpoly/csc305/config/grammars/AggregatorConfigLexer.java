// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment5-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigLexer.g4 by ANTLR 4.9.1
package edu.calpoly.csc305.config.grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AggregatorConfigLexer extends Lexer {
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
		lineMode=1, filterMode=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "lineMode", "filterMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "FORMAT", "NEWSAPI_FORMAT", "SIMPLE_FORMAT", 
			"NAME", "LOCATION", "ADDRESS", "FILTER", "DELAY", "NUM", "NEWLINE", "WS", 
			"COMMENT", "LINE", "AND", "OR", "LPAREN", "RPAREN", "KEYWORD", "NL", 
			"SPACE"
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


	public AggregatorConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AggregatorConfigLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00c3\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0083\n\f\r\f\16\f\u0084"+
		"\3\r\5\r\u0088\n\r\3\r\3\r\5\r\u008c\n\r\3\16\6\16\u008f\n\16\r\16\16"+
		"\16\u0090\3\16\3\16\3\17\3\17\7\17\u0097\n\17\f\17\16\17\u009a\13\17\3"+
		"\17\3\17\3\17\3\17\3\20\6\20\u00a1\n\20\r\20\16\20\u00a2\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25\u00b0\n\25\r\25\16\25\u00b1"+
		"\3\26\5\26\u00b5\n\26\3\26\3\26\5\26\u00b9\n\26\3\26\3\26\3\27\6\27\u00be"+
		"\n\27\r\27\16\27\u00bf\3\27\3\27\3\u0098\2\30\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\5\2\3\4\6\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\b\2\f\f\17\17\""+
		"\"((*+~~\2\u00ca\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\4"+
		"#\3\2\2\2\4%\3\2\2\2\4\'\3\2\2\2\4)\3\2\2\2\4+\3\2\2\2\4-\3\2\2\2\4/\3"+
		"\2\2\2\5\61\3\2\2\2\7\66\3\2\2\2\t:\3\2\2\2\13B\3\2\2\2\rJ\3\2\2\2\17"+
		"Q\3\2\2\2\21Y\3\2\2\2\23e\3\2\2\2\25p\3\2\2\2\27z\3\2\2\2\31\u0082\3\2"+
		"\2\2\33\u008b\3\2\2\2\35\u008e\3\2\2\2\37\u0094\3\2\2\2!\u00a0\3\2\2\2"+
		"#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ac\3\2\2\2+\u00af\3"+
		"\2\2\2-\u00b8\3\2\2\2/\u00bd\3\2\2\2\61\62\7h\2\2\62\63\7k\2\2\63\64\7"+
		"n\2\2\64\65\7g\2\2\65\6\3\2\2\2\66\67\7w\2\2\678\7t\2\289\7n\2\29\b\3"+
		"\2\2\2:;\7h\2\2;<\7q\2\2<=\7t\2\2=>\7o\2\2>?\7c\2\2?@\7v\2\2@A\7<\2\2"+
		"A\n\3\2\2\2BC\7p\2\2CD\7g\2\2DE\7y\2\2EF\7u\2\2FG\7c\2\2GH\7r\2\2HI\7"+
		"k\2\2I\f\3\2\2\2JK\7u\2\2KL\7k\2\2LM\7o\2\2MN\7r\2\2NO\7n\2\2OP\7g\2\2"+
		"P\16\3\2\2\2QR\7p\2\2RS\7c\2\2ST\7o\2\2TU\7g\2\2UV\7<\2\2VW\3\2\2\2WX"+
		"\b\7\2\2X\20\3\2\2\2YZ\7n\2\2Z[\7q\2\2[\\\7e\2\2\\]\7c\2\2]^\7v\2\2^_"+
		"\7k\2\2_`\7q\2\2`a\7p\2\2ab\7<\2\2bc\3\2\2\2cd\b\b\2\2d\22\3\2\2\2ef\7"+
		"c\2\2fg\7f\2\2gh\7f\2\2hi\7t\2\2ij\7g\2\2jk\7u\2\2kl\7u\2\2lm\7<\2\2m"+
		"n\3\2\2\2no\b\t\2\2o\24\3\2\2\2pq\7h\2\2qr\7k\2\2rs\7n\2\2st\7v\2\2tu"+
		"\7g\2\2uv\7t\2\2vw\7<\2\2wx\3\2\2\2xy\b\n\3\2y\26\3\2\2\2z{\7f\2\2{|\7"+
		"g\2\2|}\7n\2\2}~\7c\2\2~\177\7{\2\2\177\u0080\7<\2\2\u0080\30\3\2\2\2"+
		"\u0081\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\32\3\2\2\2\u0086\u0088\7\17\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\7\f"+
		"\2\2\u008a\u008c\7\17\2\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\34\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093"+
		"\b\16\4\2\u0093\36\3\2\2\2\u0094\u0098\7%\2\2\u0095\u0097\13\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\f\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\b\17\4\2\u009e \3\2\2\2\u009f\u00a1\n\4\2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\20\5\2\u00a5\"\3\2\2\2\u00a6"+
		"\u00a7\7(\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7~\2\2\u00a9&\3\2\2\2\u00aa\u00ab"+
		"\7*\2\2\u00ab(\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad*\3\2\2\2\u00ae\u00b0\n"+
		"\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2,\3\2\2\2\u00b3\u00b5\7\17\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\7\f\2\2\u00b7\u00b9"+
		"\7\17\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\b\26\5\2\u00bb.\3\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\b\27\4\2\u00c2\60\3\2\2\2\17\2\3\4\u0084\u0087"+
		"\u008b\u0090\u0098\u00a2\u00b1\u00b4\u00b8\u00bf\6\7\3\2\7\4\2\b\2\2\6"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}