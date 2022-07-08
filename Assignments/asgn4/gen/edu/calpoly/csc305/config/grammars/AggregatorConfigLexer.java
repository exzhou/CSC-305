// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment4-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigLexer.g4 by ANTLR 4.9.1
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
		NAME=6, LOCATION=7, ADDRESS=8, FILTER=9, AND=10, OR=11, LPAREN=12, RPAREN=13, 
		KEYWORD=14, NEWLINE=15, WS=16, COMMENT=17, LINE=18;
	public static final int
		lineMode=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "lineMode"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "FORMAT", "NEWSAPI_FORMAT", "SIMPLE_FORMAT", 
			"NAME", "LOCATION", "ADDRESS", "FILTER", "AND", "OR", "LPAREN", "RPAREN", 
			"KEYWORD", "NEWLINE", "WS", "COMMENT", "LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'file'", "'url'", "'format:'", "'newsapi'", "'simple'", "'name:'", 
			"'location:'", "'address:'", "'filter:'", "'&'", "'|'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "FORMAT", "NEWSAPI_FORMAT", 
			"SIMPLE_FORMAT", "NAME", "LOCATION", "ADDRESS", "FILTER", "AND", "OR", 
			"LPAREN", "RPAREN", "KEYWORD", "NEWLINE", "WS", "COMMENT", "LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u009c\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17y"+
		"\n\17\r\17\16\17z\3\20\5\20~\n\20\3\20\3\20\5\20\u0082\n\20\3\21\6\21"+
		"\u0085\n\21\r\21\16\21\u0086\3\21\3\21\3\22\3\22\7\22\u008d\n\22\f\22"+
		"\16\22\u0090\13\22\3\22\3\22\3\22\3\22\3\23\6\23\u0097\n\23\r\23\16\23"+
		"\u0098\3\23\3\23\3\u008e\2\24\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13"+
		"\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24\4\2\3\5\b\2\f\f\17\17\""+
		"\"((*+~~\4\2\13\13\"\"\4\2\f\f\17\17\2\u00a0\2\4\3\2\2\2\2\6\3\2\2\2\2"+
		"\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2"+
		"\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2"+
		"\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2"+
		"\6-\3\2\2\2\b\61\3\2\2\2\n9\3\2\2\2\fA\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2"+
		"\22\\\3\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30q\3\2\2\2\32s\3\2\2\2\34u\3\2"+
		"\2\2\36x\3\2\2\2 \u0081\3\2\2\2\"\u0084\3\2\2\2$\u008a\3\2\2\2&\u0096"+
		"\3\2\2\2()\7h\2\2)*\7k\2\2*+\7n\2\2+,\7g\2\2,\5\3\2\2\2-.\7w\2\2./\7t"+
		"\2\2/\60\7n\2\2\60\7\3\2\2\2\61\62\7h\2\2\62\63\7q\2\2\63\64\7t\2\2\64"+
		"\65\7o\2\2\65\66\7c\2\2\66\67\7v\2\2\678\7<\2\28\t\3\2\2\29:\7p\2\2:;"+
		"\7g\2\2;<\7y\2\2<=\7u\2\2=>\7c\2\2>?\7r\2\2?@\7k\2\2@\13\3\2\2\2AB\7u"+
		"\2\2BC\7k\2\2CD\7o\2\2DE\7r\2\2EF\7n\2\2FG\7g\2\2G\r\3\2\2\2HI\7p\2\2"+
		"IJ\7c\2\2JK\7o\2\2KL\7g\2\2LM\7<\2\2MN\3\2\2\2NO\b\7\2\2O\17\3\2\2\2P"+
		"Q\7n\2\2QR\7q\2\2RS\7e\2\2ST\7c\2\2TU\7v\2\2UV\7k\2\2VW\7q\2\2WX\7p\2"+
		"\2XY\7<\2\2YZ\3\2\2\2Z[\b\b\2\2[\21\3\2\2\2\\]\7c\2\2]^\7f\2\2^_\7f\2"+
		"\2_`\7t\2\2`a\7g\2\2ab\7u\2\2bc\7u\2\2cd\7<\2\2de\3\2\2\2ef\b\t\2\2f\23"+
		"\3\2\2\2gh\7h\2\2hi\7k\2\2ij\7n\2\2jk\7v\2\2kl\7g\2\2lm\7t\2\2mn\7<\2"+
		"\2n\25\3\2\2\2op\7(\2\2p\27\3\2\2\2qr\7~\2\2r\31\3\2\2\2st\7*\2\2t\33"+
		"\3\2\2\2uv\7+\2\2v\35\3\2\2\2wy\n\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{\37\3\2\2\2|~\7\17\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0082\7\f\2\2\u0080\u0082\7\17\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2"+
		"\u0082!\3\2\2\2\u0083\u0085\t\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\b\21\3\2\u0089#\3\2\2\2\u008a\u008e\7%\2\2\u008b\u008d\13\2\2\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008f\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\f\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\b\22\3\2\u0094%\3\2\2\2\u0095\u0097\n\4\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\23\4\2\u009b\'\3\2\2\2\n\2"+
		"\3z}\u0081\u0086\u008e\u0098\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}