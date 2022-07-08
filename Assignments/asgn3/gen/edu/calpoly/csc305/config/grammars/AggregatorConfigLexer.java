// Generated from /Users/ericzhou/Desktop/CSC_305_2/assignment3-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigLexer.g4 by ANTLR 4.9.1
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
		NAME=6, LOCATION=7, ADDRESS=8, NEWLINE=9, WS=10, COMMENT=11, LINE=12;
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
			"NAME", "LOCATION", "ADDRESS", "NEWLINE", "WS", "COMMENT", "LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16{\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5"+
		"\n]\n\n\3\n\3\n\5\na\n\n\3\13\6\13d\n\13\r\13\16\13e\3\13\3\13\3\f\3\f"+
		"\7\fl\n\f\f\f\16\fo\13\f\3\f\3\f\3\f\3\f\3\r\6\rv\n\r\r\r\16\rw\3\r\3"+
		"\r\3m\2\16\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\4"+
		"\2\3\4\4\2\13\13\"\"\4\2\f\f\17\17\2~\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2"+
		"\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\3\32\3\2\2\2\4\34\3\2\2\2\6!\3\2"+
		"\2\2\b%\3\2\2\2\n-\3\2\2\2\f\65\3\2\2\2\16<\3\2\2\2\20D\3\2\2\2\22P\3"+
		"\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30i\3\2\2\2\32u\3\2\2\2\34\35\7h\2\2\35"+
		"\36\7k\2\2\36\37\7n\2\2\37 \7g\2\2 \5\3\2\2\2!\"\7w\2\2\"#\7t\2\2#$\7"+
		"n\2\2$\7\3\2\2\2%&\7h\2\2&\'\7q\2\2\'(\7t\2\2()\7o\2\2)*\7c\2\2*+\7v\2"+
		"\2+,\7<\2\2,\t\3\2\2\2-.\7p\2\2./\7g\2\2/\60\7y\2\2\60\61\7u\2\2\61\62"+
		"\7c\2\2\62\63\7r\2\2\63\64\7k\2\2\64\13\3\2\2\2\65\66\7u\2\2\66\67\7k"+
		"\2\2\678\7o\2\289\7r\2\29:\7n\2\2:;\7g\2\2;\r\3\2\2\2<=\7p\2\2=>\7c\2"+
		"\2>?\7o\2\2?@\7g\2\2@A\7<\2\2AB\3\2\2\2BC\b\7\2\2C\17\3\2\2\2DE\7n\2\2"+
		"EF\7q\2\2FG\7e\2\2GH\7c\2\2HI\7v\2\2IJ\7k\2\2JK\7q\2\2KL\7p\2\2LM\7<\2"+
		"\2MN\3\2\2\2NO\b\b\2\2O\21\3\2\2\2PQ\7c\2\2QR\7f\2\2RS\7f\2\2ST\7t\2\2"+
		"TU\7g\2\2UV\7u\2\2VW\7u\2\2WX\7<\2\2XY\3\2\2\2YZ\b\t\2\2Z\23\3\2\2\2["+
		"]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^a\7\f\2\2_a\7\17\2\2`\\\3\2"+
		"\2\2`_\3\2\2\2a\25\3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3"+
		"\2\2\2fg\3\2\2\2gh\b\13\3\2h\27\3\2\2\2im\7%\2\2jl\13\2\2\2kj\3\2\2\2"+
		"lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\f\2\2qr\3\2\2\2"+
		"rs\b\f\3\2s\31\3\2\2\2tv\n\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2"+
		"\2xy\3\2\2\2yz\b\r\4\2z\33\3\2\2\2\t\2\3\\`emw\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}