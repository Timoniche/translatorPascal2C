// Generated from C:/Users/Timoniche/Desktop/translatorPascal2C/src\Pascal.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, ARRAY=3, BEGIN=4, BOOLEAN=5, CASE=6, CHAR=7, CHR=8, CONST=9, 
		DIV=10, DO=11, DOWNTO=12, ELSE=13, END=14, FILE=15, FOR=16, FUNCTION=17, 
		GOTO=18, IF=19, IN=20, INTEGER=21, LABEL=22, MOD=23, NIL=24, NOT=25, OF=26, 
		OR=27, PACKED=28, PROCEDURE=29, PROGRAM=30, REAL=31, RECORD=32, REPEAT=33, 
		SET=34, THEN=35, TO=36, TYPE=37, UNTIL=38, VAR=39, WHILE=40, WITH=41, 
		PLUS=42, MINUS=43, STAR=44, SLASH=45, ASSIGN=46, COMMA=47, SEMI=48, COLON=49, 
		EQUAL=50, NOT_EQUAL=51, LT=52, LE=53, GE=54, GT=55, LPAREN=56, RPAREN=57, 
		LBRACK=58, LBRACK2=59, RBRACK=60, RBRACK2=61, POINTER=62, AT=63, DOT=64, 
		DOTDOT=65, LCURLY=66, RCURLY=67, UNIT=68, INTERFACE=69, USES=70, STRING=71, 
		IMPLEMENTATION=72, TRUE=73, FALSE=74, WS=75, COMMENT_1=76, COMMENT_2=77, 
		IDENT=78, STRING_LITERAL=79, NUM_INT=80, NUM_REAL=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", 
			"ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", "DIV", "DO", 
			"DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", "PROCEDURE", 
			"PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", 
			"VAR", "WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", "ASSIGN", "COMMA", 
			"SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", 
			"RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", "POINTER", "AT", 
			"DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", "USES", "STRING", 
			"IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", "IDENT", 
			"STRING_LITERAL", "NUM_INT", "NUM_REAL", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "':='", 
			"','", "';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", 
			"')'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", "'..'", "'{'", 
			"'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", 
			"CONST", "DIV", "DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", 
			"GOTO", "IF", "IN", "INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", 
			"PACKED", "PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "SET", 
			"THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", "MINUS", 
			"STAR", "SLASH", "ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", 
			"LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", 
			"RBRACK2", "POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", 
			"INTERFACE", "USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", 
			"COMMENT_1", "COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL"
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



	//    Map<String, String> typesMap = Map.ofEntries(
	//        entry("writeln", "cout"),
	//        entry("read", "cin")
	//    );

	    Map<String, String> typesMap = new HashMap<String, String>() {{
	        put("integer", "int");
	    }};

	    static Map<String, String> varType = new HashMap<>();
	    static ArrayList<String> vars = new ArrayList<>();
	    static ArrayList<String> params = new ArrayList<>();
	    static int indent = 0;
	    static String curFunctionName = "";
	    static String arrSize = "";

	    public static String fixedLengthString(String string, int length) {
	        if (length == 0) return "";
	        return String.format("%1$" + length + "s", string);
	    }

	    public static String getTypesFormat(boolean lnNeeded, boolean refsNeeded) {
	        String ret = "\"";
	        int listSize = params.size();
	        for (int i = 0; i < listSize; i++) {
	            String type = varType.get(params.get(i));
	            //deduction of expressions
	            if (type == null) { ret += "%d"; }
	            else if (type.equals("integer")) {
	                ret += "%d";
	            }
	        }
	        if (lnNeeded) {ret += "\\n"; }
	        if (listSize > 0) ret += "\"";
	        for (int i = 0; i < listSize; i++) {
	            if (refsNeeded) {ret += ", &"; } else {ret += ", ";}
	            ret += params.get(i);
	        }
	        return ret;
	    }


	public PascalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u02a3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\3"+
		"9\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3"+
		"S\3S\3T\3T\3U\3U\3V\3V\3V\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3\\"+
		"\3]\3]\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3a\3a"+
		"\3a\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c"+
		"\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\7g\u025c\ng"+
		"\fg\16g\u025f\13g\3g\3g\3g\3g\3g\3h\3h\7h\u0268\nh\fh\16h\u026b\13h\3"+
		"h\3h\3h\3h\3i\3i\7i\u0273\ni\fi\16i\u0276\13i\3j\3j\3j\3j\7j\u027c\nj"+
		"\fj\16j\u027f\13j\3j\3j\3k\6k\u0284\nk\rk\16k\u0285\3l\6l\u0289\nl\rl"+
		"\16l\u028a\3l\3l\6l\u028f\nl\rl\16l\u0290\3l\5l\u0294\nl\5l\u0296\nl\3"+
		"l\5l\u0299\nl\3m\3m\5m\u029d\nm\3m\6m\u02a0\nm\rm\16m\u02a1\4\u025d\u0269"+
		"\2n\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\4;\5=\6?\7A\bC\tE\nG"+
		"\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26_\27a\30c\31e\32g\33i\34"+
		"k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083)\u0085*\u0087+\u0089,\u008b"+
		"-\u008d.\u008f/\u0091\60\u0093\61\u0095\62\u0097\63\u0099\64\u009b\65"+
		"\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7;\u00a9<\u00ab=\u00ad>\u00af"+
		"?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9D\u00bbE\u00bdF\u00bfG\u00c1H\u00c3"+
		"I\u00c5J\u00c7K\u00c9L\u00cbM\u00cdN\u00cfO\u00d1P\u00d3Q\u00d5R\u00d7"+
		"S\u00d9\2\3\2!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2))\4\2"+
		"--//\2\u0294\2\3\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3"+
		"\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3"+
		"\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2"+
		"\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\3\u00db"+
		"\3\2\2\2\5\u00dd\3\2\2\2\7\u00df\3\2\2\2\t\u00e1\3\2\2\2\13\u00e3\3\2"+
		"\2\2\r\u00e5\3\2\2\2\17\u00e7\3\2\2\2\21\u00e9\3\2\2\2\23\u00eb\3\2\2"+
		"\2\25\u00ed\3\2\2\2\27\u00ef\3\2\2\2\31\u00f1\3\2\2\2\33\u00f3\3\2\2\2"+
		"\35\u00f5\3\2\2\2\37\u00f7\3\2\2\2!\u00f9\3\2\2\2#\u00fb\3\2\2\2%\u00fd"+
		"\3\2\2\2\'\u00ff\3\2\2\2)\u0101\3\2\2\2+\u0103\3\2\2\2-\u0105\3\2\2\2"+
		"/\u0107\3\2\2\2\61\u0109\3\2\2\2\63\u010b\3\2\2\2\65\u010d\3\2\2\2\67"+
		"\u010f\3\2\2\29\u0111\3\2\2\2;\u0115\3\2\2\2=\u011b\3\2\2\2?\u0121\3\2"+
		"\2\2A\u0129\3\2\2\2C\u012e\3\2\2\2E\u0133\3\2\2\2G\u0137\3\2\2\2I\u013d"+
		"\3\2\2\2K\u0141\3\2\2\2M\u0144\3\2\2\2O\u014b\3\2\2\2Q\u0150\3\2\2\2S"+
		"\u0154\3\2\2\2U\u0159\3\2\2\2W\u015d\3\2\2\2Y\u0166\3\2\2\2[\u016b\3\2"+
		"\2\2]\u016e\3\2\2\2_\u0171\3\2\2\2a\u0179\3\2\2\2c\u017f\3\2\2\2e\u0183"+
		"\3\2\2\2g\u0187\3\2\2\2i\u018b\3\2\2\2k\u018e\3\2\2\2m\u0191\3\2\2\2o"+
		"\u0198\3\2\2\2q\u01a2\3\2\2\2s\u01aa\3\2\2\2u\u01af\3\2\2\2w\u01b6\3\2"+
		"\2\2y\u01bd\3\2\2\2{\u01c1\3\2\2\2}\u01c6\3\2\2\2\177\u01c9\3\2\2\2\u0081"+
		"\u01ce\3\2\2\2\u0083\u01d4\3\2\2\2\u0085\u01d8\3\2\2\2\u0087\u01de\3\2"+
		"\2\2\u0089\u01e3\3\2\2\2\u008b\u01e5\3\2\2\2\u008d\u01e7\3\2\2\2\u008f"+
		"\u01e9\3\2\2\2\u0091\u01eb\3\2\2\2\u0093\u01ee\3\2\2\2\u0095\u01f0\3\2"+
		"\2\2\u0097\u01f2\3\2\2\2\u0099\u01f4\3\2\2\2\u009b\u01f6\3\2\2\2\u009d"+
		"\u01f9\3\2\2\2\u009f\u01fb\3\2\2\2\u00a1\u01fe\3\2\2\2\u00a3\u0201\3\2"+
		"\2\2\u00a5\u0203\3\2\2\2\u00a7\u0205\3\2\2\2\u00a9\u0207\3\2\2\2\u00ab"+
		"\u0209\3\2\2\2\u00ad\u020c\3\2\2\2\u00af\u020e\3\2\2\2\u00b1\u0211\3\2"+
		"\2\2\u00b3\u0213\3\2\2\2\u00b5\u0215\3\2\2\2\u00b7\u0217\3\2\2\2\u00b9"+
		"\u021a\3\2\2\2\u00bb\u021c\3\2\2\2\u00bd\u021e\3\2\2\2\u00bf\u0223\3\2"+
		"\2\2\u00c1\u022d\3\2\2\2\u00c3\u0232\3\2\2\2\u00c5\u0239\3\2\2\2\u00c7"+
		"\u0248\3\2\2\2\u00c9\u024d\3\2\2\2\u00cb\u0253\3\2\2\2\u00cd\u0257\3\2"+
		"\2\2\u00cf\u0265\3\2\2\2\u00d1\u0270\3\2\2\2\u00d3\u0277\3\2\2\2\u00d5"+
		"\u0283\3\2\2\2\u00d7\u0288\3\2\2\2\u00d9\u029a\3\2\2\2\u00db\u00dc\7\'"+
		"\2\2\u00dc\4\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\6\3\2\2\2\u00df\u00e0\t"+
		"\3\2\2\u00e0\b\3\2\2\2\u00e1\u00e2\t\4\2\2\u00e2\n\3\2\2\2\u00e3\u00e4"+
		"\t\5\2\2\u00e4\f\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\16\3\2\2\2\u00e7\u00e8"+
		"\t\7\2\2\u00e8\20\3\2\2\2\u00e9\u00ea\t\b\2\2\u00ea\22\3\2\2\2\u00eb\u00ec"+
		"\t\t\2\2\u00ec\24\3\2\2\2\u00ed\u00ee\t\n\2\2\u00ee\26\3\2\2\2\u00ef\u00f0"+
		"\t\13\2\2\u00f0\30\3\2\2\2\u00f1\u00f2\t\f\2\2\u00f2\32\3\2\2\2\u00f3"+
		"\u00f4\t\r\2\2\u00f4\34\3\2\2\2\u00f5\u00f6\t\16\2\2\u00f6\36\3\2\2\2"+
		"\u00f7\u00f8\t\17\2\2\u00f8 \3\2\2\2\u00f9\u00fa\t\20\2\2\u00fa\"\3\2"+
		"\2\2\u00fb\u00fc\t\21\2\2\u00fc$\3\2\2\2\u00fd\u00fe\t\22\2\2\u00fe&\3"+
		"\2\2\2\u00ff\u0100\t\23\2\2\u0100(\3\2\2\2\u0101\u0102\t\24\2\2\u0102"+
		"*\3\2\2\2\u0103\u0104\t\25\2\2\u0104,\3\2\2\2\u0105\u0106\t\26\2\2\u0106"+
		".\3\2\2\2\u0107\u0108\t\27\2\2\u0108\60\3\2\2\2\u0109\u010a\t\30\2\2\u010a"+
		"\62\3\2\2\2\u010b\u010c\t\31\2\2\u010c\64\3\2\2\2\u010d\u010e\t\32\2\2"+
		"\u010e\66\3\2\2\2\u010f\u0110\t\33\2\2\u01108\3\2\2\2\u0111\u0112\5\5"+
		"\3\2\u0112\u0113\5\37\20\2\u0113\u0114\5\13\6\2\u0114:\3\2\2\2\u0115\u0116"+
		"\5\5\3\2\u0116\u0117\5\'\24\2\u0117\u0118\5\'\24\2\u0118\u0119\5\5\3\2"+
		"\u0119\u011a\5\65\33\2\u011a<\3\2\2\2\u011b\u011c\5\7\4\2\u011c\u011d"+
		"\5\r\7\2\u011d\u011e\5\21\t\2\u011e\u011f\5\25\13\2\u011f\u0120\5\37\20"+
		"\2\u0120>\3\2\2\2\u0121\u0122\5\7\4\2\u0122\u0123\5!\21\2\u0123\u0124"+
		"\5!\21\2\u0124\u0125\5\33\16\2\u0125\u0126\5\r\7\2\u0126\u0127\5\5\3\2"+
		"\u0127\u0128\5\37\20\2\u0128@\3\2\2\2\u0129\u012a\5\t\5\2\u012a\u012b"+
		"\5\5\3\2\u012b\u012c\5)\25\2\u012c\u012d\5\r\7\2\u012dB\3\2\2\2\u012e"+
		"\u012f\5\t\5\2\u012f\u0130\5\23\n\2\u0130\u0131\5\5\3\2\u0131\u0132\5"+
		"\'\24\2\u0132D\3\2\2\2\u0133\u0134\5\t\5\2\u0134\u0135\5\23\n\2\u0135"+
		"\u0136\5\'\24\2\u0136F\3\2\2\2\u0137\u0138\5\t\5\2\u0138\u0139\5!\21\2"+
		"\u0139\u013a\5\37\20\2\u013a\u013b\5)\25\2\u013b\u013c\5+\26\2\u013cH"+
		"\3\2\2\2\u013d\u013e\5\13\6\2\u013e\u013f\5\25\13\2\u013f\u0140\5/\30"+
		"\2\u0140J\3\2\2\2\u0141\u0142\5\13\6\2\u0142\u0143\5!\21\2\u0143L\3\2"+
		"\2\2\u0144\u0145\5\13\6\2\u0145\u0146\5!\21\2\u0146\u0147\5\61\31\2\u0147"+
		"\u0148\5\37\20\2\u0148\u0149\5+\26\2\u0149\u014a\5!\21\2\u014aN\3\2\2"+
		"\2\u014b\u014c\5\r\7\2\u014c\u014d\5\33\16\2\u014d\u014e\5)\25\2\u014e"+
		"\u014f\5\r\7\2\u014fP\3\2\2\2\u0150\u0151\5\r\7\2\u0151\u0152\5\37\20"+
		"\2\u0152\u0153\5\13\6\2\u0153R\3\2\2\2\u0154\u0155\5\17\b\2\u0155\u0156"+
		"\5\25\13\2\u0156\u0157\5\33\16\2\u0157\u0158\5\r\7\2\u0158T\3\2\2\2\u0159"+
		"\u015a\5\17\b\2\u015a\u015b\5!\21\2\u015b\u015c\5\'\24\2\u015cV\3\2\2"+
		"\2\u015d\u015e\5\17\b\2\u015e\u015f\5-\27\2\u015f\u0160\5\37\20\2\u0160"+
		"\u0161\5\t\5\2\u0161\u0162\5+\26\2\u0162\u0163\5\25\13\2\u0163\u0164\5"+
		"!\21\2\u0164\u0165\5\37\20\2\u0165X\3\2\2\2\u0166\u0167\5\21\t\2\u0167"+
		"\u0168\5!\21\2\u0168\u0169\5+\26\2\u0169\u016a\5!\21\2\u016aZ\3\2\2\2"+
		"\u016b\u016c\5\25\13\2\u016c\u016d\5\17\b\2\u016d\\\3\2\2\2\u016e\u016f"+
		"\5\25\13\2\u016f\u0170\5\37\20\2\u0170^\3\2\2\2\u0171\u0172\5\25\13\2"+
		"\u0172\u0173\5\37\20\2\u0173\u0174\5+\26\2\u0174\u0175\5\r\7\2\u0175\u0176"+
		"\5\21\t\2\u0176\u0177\5\r\7\2\u0177\u0178\5\'\24\2\u0178`\3\2\2\2\u0179"+
		"\u017a\5\33\16\2\u017a\u017b\5\5\3\2\u017b\u017c\5\7\4\2\u017c\u017d\5"+
		"\r\7\2\u017d\u017e\5\33\16\2\u017eb\3\2\2\2\u017f\u0180\5\35\17\2\u0180"+
		"\u0181\5!\21\2\u0181\u0182\5\13\6\2\u0182d\3\2\2\2\u0183\u0184\5\37\20"+
		"\2\u0184\u0185\5\25\13\2\u0185\u0186\5\33\16\2\u0186f\3\2\2\2\u0187\u0188"+
		"\5\37\20\2\u0188\u0189\5!\21\2\u0189\u018a\5+\26\2\u018ah\3\2\2\2\u018b"+
		"\u018c\5!\21\2\u018c\u018d\5\17\b\2\u018dj\3\2\2\2\u018e\u018f\5!\21\2"+
		"\u018f\u0190\5\'\24\2\u0190l\3\2\2\2\u0191\u0192\5#\22\2\u0192\u0193\5"+
		"\5\3\2\u0193\u0194\5\t\5\2\u0194\u0195\5\31\r\2\u0195\u0196\5\r\7\2\u0196"+
		"\u0197\5\13\6\2\u0197n\3\2\2\2\u0198\u0199\5#\22\2\u0199\u019a\5\'\24"+
		"\2\u019a\u019b\5!\21\2\u019b\u019c\5\t\5\2\u019c\u019d\5\r\7\2\u019d\u019e"+
		"\5\13\6\2\u019e\u019f\5-\27\2\u019f\u01a0\5\'\24\2\u01a0\u01a1\5\r\7\2"+
		"\u01a1p\3\2\2\2\u01a2\u01a3\5#\22\2\u01a3\u01a4\5\'\24\2\u01a4\u01a5\5"+
		"!\21\2\u01a5\u01a6\5\21\t\2\u01a6\u01a7\5\'\24\2\u01a7\u01a8\5\5\3\2\u01a8"+
		"\u01a9\5\35\17\2\u01a9r\3\2\2\2\u01aa\u01ab\5\'\24\2\u01ab\u01ac\5\r\7"+
		"\2\u01ac\u01ad\5\5\3\2\u01ad\u01ae\5\33\16\2\u01aet\3\2\2\2\u01af\u01b0"+
		"\5\'\24\2\u01b0\u01b1\5\r\7\2\u01b1\u01b2\5\t\5\2\u01b2\u01b3\5!\21\2"+
		"\u01b3\u01b4\5\'\24\2\u01b4\u01b5\5\13\6\2\u01b5v\3\2\2\2\u01b6\u01b7"+
		"\5\'\24\2\u01b7\u01b8\5\r\7\2\u01b8\u01b9\5#\22\2\u01b9\u01ba\5\r\7\2"+
		"\u01ba\u01bb\5\5\3\2\u01bb\u01bc\5+\26\2\u01bcx\3\2\2\2\u01bd\u01be\5"+
		")\25\2\u01be\u01bf\5\r\7\2\u01bf\u01c0\5+\26\2\u01c0z\3\2\2\2\u01c1\u01c2"+
		"\5+\26\2\u01c2\u01c3\5\23\n\2\u01c3\u01c4\5\r\7\2\u01c4\u01c5\5\37\20"+
		"\2\u01c5|\3\2\2\2\u01c6\u01c7\5+\26\2\u01c7\u01c8\5!\21\2\u01c8~\3\2\2"+
		"\2\u01c9\u01ca\5+\26\2\u01ca\u01cb\5\65\33\2\u01cb\u01cc\5#\22\2\u01cc"+
		"\u01cd\5\r\7\2\u01cd\u0080\3\2\2\2\u01ce\u01cf\5-\27\2\u01cf\u01d0\5\37"+
		"\20\2\u01d0\u01d1\5+\26\2\u01d1\u01d2\5\25\13\2\u01d2\u01d3\5\33\16\2"+
		"\u01d3\u0082\3\2\2\2\u01d4\u01d5\5/\30\2\u01d5\u01d6\5\5\3\2\u01d6\u01d7"+
		"\5\'\24\2\u01d7\u0084\3\2\2\2\u01d8\u01d9\5\61\31\2\u01d9\u01da\5\23\n"+
		"\2\u01da\u01db\5\25\13\2\u01db\u01dc\5\33\16\2\u01dc\u01dd\5\r\7\2\u01dd"+
		"\u0086\3\2\2\2\u01de\u01df\5\61\31\2\u01df\u01e0\5\25\13\2\u01e0\u01e1"+
		"\5+\26\2\u01e1\u01e2\5\23\n\2\u01e2\u0088\3\2\2\2\u01e3\u01e4\7-\2\2\u01e4"+
		"\u008a\3\2\2\2\u01e5\u01e6\7/\2\2\u01e6\u008c\3\2\2\2\u01e7\u01e8\7,\2"+
		"\2\u01e8\u008e\3\2\2\2\u01e9\u01ea\7\61\2\2\u01ea\u0090\3\2\2\2\u01eb"+
		"\u01ec\7<\2\2\u01ec\u01ed\7?\2\2\u01ed\u0092\3\2\2\2\u01ee\u01ef\7.\2"+
		"\2\u01ef\u0094\3\2\2\2\u01f0\u01f1\7=\2\2\u01f1\u0096\3\2\2\2\u01f2\u01f3"+
		"\7<\2\2\u01f3\u0098\3\2\2\2\u01f4\u01f5\7?\2\2\u01f5\u009a\3\2\2\2\u01f6"+
		"\u01f7\7>\2\2\u01f7\u01f8\7@\2\2\u01f8\u009c\3\2\2\2\u01f9\u01fa\7>\2"+
		"\2\u01fa\u009e\3\2\2\2\u01fb\u01fc\7>\2\2\u01fc\u01fd\7?\2\2\u01fd\u00a0"+
		"\3\2\2\2\u01fe\u01ff\7@\2\2\u01ff\u0200\7?\2\2\u0200\u00a2\3\2\2\2\u0201"+
		"\u0202\7@\2\2\u0202\u00a4\3\2\2\2\u0203\u0204\7*\2\2\u0204\u00a6\3\2\2"+
		"\2\u0205\u0206\7+\2\2\u0206\u00a8\3\2\2\2\u0207\u0208\7]\2\2\u0208\u00aa"+
		"\3\2\2\2\u0209\u020a\7*\2\2\u020a\u020b\7\60\2\2\u020b\u00ac\3\2\2\2\u020c"+
		"\u020d\7_\2\2\u020d\u00ae\3\2\2\2\u020e\u020f\7\60\2\2\u020f\u0210\7+"+
		"\2\2\u0210\u00b0\3\2\2\2\u0211\u0212\7`\2\2\u0212\u00b2\3\2\2\2\u0213"+
		"\u0214\7B\2\2\u0214\u00b4\3\2\2\2\u0215\u0216\7\60\2\2\u0216\u00b6\3\2"+
		"\2\2\u0217\u0218\7\60\2\2\u0218\u0219\7\60\2\2\u0219\u00b8\3\2\2\2\u021a"+
		"\u021b\7}\2\2\u021b\u00ba\3\2\2\2\u021c\u021d\7\177\2\2\u021d\u00bc\3"+
		"\2\2\2\u021e\u021f\5-\27\2\u021f\u0220\5\37\20\2\u0220\u0221\5\25\13\2"+
		"\u0221\u0222\5+\26\2\u0222\u00be\3\2\2\2\u0223\u0224\5\25\13\2\u0224\u0225"+
		"\5\37\20\2\u0225\u0226\5+\26\2\u0226\u0227\5\r\7\2\u0227\u0228\5\'\24"+
		"\2\u0228\u0229\5\17\b\2\u0229\u022a\5\5\3\2\u022a\u022b\5\t\5\2\u022b"+
		"\u022c\5\r\7\2\u022c\u00c0\3\2\2\2\u022d\u022e\5-\27\2\u022e\u022f\5)"+
		"\25\2\u022f\u0230\5\r\7\2\u0230\u0231\5)\25\2\u0231\u00c2\3\2\2\2\u0232"+
		"\u0233\5)\25\2\u0233\u0234\5+\26\2\u0234\u0235\5\'\24\2\u0235\u0236\5"+
		"\25\13\2\u0236\u0237\5\37\20\2\u0237\u0238\5\21\t\2\u0238\u00c4\3\2\2"+
		"\2\u0239\u023a\5\25\13\2\u023a\u023b\5\35\17\2\u023b\u023c\5#\22\2\u023c"+
		"\u023d\5\33\16\2\u023d\u023e\5\r\7\2\u023e\u023f\5\35\17\2\u023f\u0240"+
		"\5\r\7\2\u0240\u0241\5\37\20\2\u0241\u0242\5+\26\2\u0242\u0243\5\5\3\2"+
		"\u0243\u0244\5+\26\2\u0244\u0245\5\25\13\2\u0245\u0246\5!\21\2\u0246\u0247"+
		"\5\37\20\2\u0247\u00c6\3\2\2\2\u0248\u0249\5+\26\2\u0249\u024a\5\'\24"+
		"\2\u024a\u024b\5-\27\2\u024b\u024c\5\r\7\2\u024c\u00c8\3\2\2\2\u024d\u024e"+
		"\5\17\b\2\u024e\u024f\5\5\3\2\u024f\u0250\5\33\16\2\u0250\u0251\5)\25"+
		"\2\u0251\u0252\5\r\7\2\u0252\u00ca\3\2\2\2\u0253\u0254\t\34\2\2\u0254"+
		"\u0255\3\2\2\2\u0255\u0256\bf\2\2\u0256\u00cc\3\2\2\2\u0257\u0258\7*\2"+
		"\2\u0258\u0259\7,\2\2\u0259\u025d\3\2\2\2\u025a\u025c\13\2\2\2\u025b\u025a"+
		"\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7,\2\2\u0261\u0262\7+\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u0264\bg\2\2\u0264\u00ce\3\2\2\2\u0265\u0269"+
		"\7}\2\2\u0266\u0268\13\2\2\2\u0267\u0266\3\2\2\2\u0268\u026b\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u0269\3\2"+
		"\2\2\u026c\u026d\7\177\2\2\u026d\u026e\3\2\2\2\u026e\u026f\bh\2\2\u026f"+
		"\u00d0\3\2\2\2\u0270\u0274\t\35\2\2\u0271\u0273\t\36\2\2\u0272\u0271\3"+
		"\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u00d2\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u027d\7)\2\2\u0278\u0279\7)\2"+
		"\2\u0279\u027c\7)\2\2\u027a\u027c\n\37\2\2\u027b\u0278\3\2\2\2\u027b\u027a"+
		"\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0281\7)\2\2\u0281\u00d4\3\2"+
		"\2\2\u0282\u0284\4\62;\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u00d6\3\2\2\2\u0287\u0289\4\62"+
		";\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0288\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u0298\3\2\2\2\u028c\u028e\7\60\2\2\u028d\u028f\4"+
		"\62;\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\5\u00d9m\2\u0293\u0292"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u028c\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0299\5\u00d9m\2\u0298\u0295"+
		"\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u00d8\3\2\2\2\u029a\u029c\7g\2\2\u029b"+
		"\u029d\t \2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2"+
		"\2\2\u029e\u02a0\4\62;\2\u029f\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u00da\3\2\2\2\20\2\u025d\u0269"+
		"\u0274\u027b\u027d\u0285\u028a\u0290\u0293\u0295\u0298\u029c\u02a1\3\b"+
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