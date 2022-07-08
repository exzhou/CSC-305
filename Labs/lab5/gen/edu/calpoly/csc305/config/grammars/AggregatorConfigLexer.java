// Generated from /Users/ericzhou/Desktop/CSC_305_2/lab5-exzhou/src/edu/calpoly/csc305/config/grammars/AggregatorConfigLexer.g4 by ANTLR 4.9.1
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
		FILE_SOURCE_TYPE=1, URL_SOURCE_TYPE=2, NAME=3, LOCATION=4, ADDRESS=5, 
		NEWLINE=6, WS=7, COMMENT=8, LINE=9;
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
			"FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "NAME", "LOCATION", "ADDRESS", 
			"NEWLINE", "WS", "COMMENT", "LINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'file'", "'url'", "'name:'", "'location:'", "'address:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FILE_SOURCE_TYPE", "URL_SOURCE_TYPE", "NAME", "LOCATION", "ADDRESS", 
			"NEWLINE", "WS", "COMMENT", "LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13^\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\5\7@\n\7\3\7\3\7\5\7D\n\7\3\b\6\bG\n\b\r\b\16\bH"+
		"\3\b\3\b\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\t\3\t\3\t\3\t\3\n\6\nY\n\n"+
		"\r\n\16\nZ\3\n\3\n\3P\2\13\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\4"+
		"\2\3\4\4\2\13\13\"\"\4\2\f\f\17\17\2a\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2"+
		"\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\3"+
		"\24\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b\37\3\2\2\2\n\'\3\2\2\2\f\63\3"+
		"\2\2\2\16C\3\2\2\2\20F\3\2\2\2\22L\3\2\2\2\24X\3\2\2\2\26\27\7h\2\2\27"+
		"\30\7k\2\2\30\31\7n\2\2\31\32\7g\2\2\32\5\3\2\2\2\33\34\7w\2\2\34\35\7"+
		"t\2\2\35\36\7n\2\2\36\7\3\2\2\2\37 \7p\2\2 !\7c\2\2!\"\7o\2\2\"#\7g\2"+
		"\2#$\7<\2\2$%\3\2\2\2%&\b\4\2\2&\t\3\2\2\2\'(\7n\2\2()\7q\2\2)*\7e\2\2"+
		"*+\7c\2\2+,\7v\2\2,-\7k\2\2-.\7q\2\2./\7p\2\2/\60\7<\2\2\60\61\3\2\2\2"+
		"\61\62\b\5\2\2\62\13\3\2\2\2\63\64\7c\2\2\64\65\7f\2\2\65\66\7f\2\2\66"+
		"\67\7t\2\2\678\7g\2\289\7u\2\29:\7u\2\2:;\7<\2\2;<\3\2\2\2<=\b\6\2\2="+
		"\r\3\2\2\2>@\7\17\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AD\7\f\2\2BD\7\17\2"+
		"\2C?\3\2\2\2CB\3\2\2\2D\17\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2"+
		"\2\2HI\3\2\2\2IJ\3\2\2\2JK\b\b\3\2K\21\3\2\2\2LP\7%\2\2MO\13\2\2\2NM\3"+
		"\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\f\2\2TU\3"+
		"\2\2\2UV\b\t\3\2V\23\3\2\2\2WY\n\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z"+
		"[\3\2\2\2[\\\3\2\2\2\\]\b\n\4\2]\25\3\2\2\2\t\2\3?CHPZ\5\7\3\2\b\2\2\6"+
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