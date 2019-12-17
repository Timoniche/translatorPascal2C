// Generated from C:/Users/Timoniche/Desktop/translatorPascal2C/src\Pascal.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_procedureOrFunction = 2, RULE_procedure = 3, 
		RULE_function = 4, RULE_formalParameterList = 5, RULE_argsDeclaration = 6, 
		RULE_compoundStatement = 7, RULE_variableDeclarationPart = 8, RULE_variableDeclaration = 9, 
		RULE_identifierList = 10, RULE_type = 11, RULE_arrayType = 12, RULE_identifier = 13, 
		RULE_statements = 14, RULE_statement = 15, RULE_simpleStatement = 16, 
		RULE_assignmentStatement = 17, RULE_procedureStatement = 18, RULE_parameterList = 19, 
		RULE_emptyStatement = 20, RULE_structuredStatement = 21, RULE_ifStatement = 22, 
		RULE_forStatement = 23, RULE_forList = 24, RULE_initialValue = 25, RULE_finalValue = 26, 
		RULE_expression = 27, RULE_relationaloperator = 28, RULE_simpleExpression = 29, 
		RULE_additiveoperator = 30, RULE_term = 31, RULE_multiplicativeoperator = 32, 
		RULE_signedFactor = 33, RULE_factor = 34, RULE_variable = 35, RULE_bool = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "procedureOrFunction", "procedure", "function", "formalParameterList", 
			"argsDeclaration", "compoundStatement", "variableDeclarationPart", "variableDeclaration", 
			"identifierList", "type", "arrayType", "identifier", "statements", "statement", 
			"simpleStatement", "assignmentStatement", "procedureStatement", "parameterList", 
			"emptyStatement", "structuredStatement", "ifStatement", "forStatement", 
			"forList", "initialValue", "finalValue", "expression", "relationaloperator", 
			"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
			"signedFactor", "factor", "variable", "bool"
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

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("#include <stdio.h>"); 
			setState(75);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext main;
		public TerminalNode DOT() { return getToken(PascalParser.DOT, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureOrFunctionContext> procedureOrFunction() {
			return getRuleContexts(ProcedureOrFunctionContext.class);
		}
		public ProcedureOrFunctionContext procedureOrFunction(int i) {
			return getRuleContext(ProcedureOrFunctionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION) | (1L << PROCEDURE) | (1L << VAR))) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(77);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(78);
					procedureOrFunction();
					setState(79);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			((BlockContext)_localctx).main = compoundStatement();
			setState(87);
			match(DOT);

			        String indentBraces = fixedLengthString("", indent - 4);
			        System.out.println(indentBraces + "int main()");
			        System.out.println(indentBraces + "{");
			        System.out.print(((BlockContext)_localctx).main.ret);
			        System.out.println(indentBraces + "    return 0;");
			        System.out.println(indentBraces + "}");
			        indent -= 4;
			    
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

	public static class ProcedureOrFunctionContext extends ParserRuleContext {
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProcedureOrFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureOrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureOrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureOrFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionContext procedureOrFunction() throws RecognitionException {
		ProcedureOrFunctionContext _localctx = new ProcedureOrFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedureOrFunction);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				procedure();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				function();
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

	public static class ProcedureContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public FormalParameterListContext formalParameterList;
		public CompoundStatementContext compoundStatement;
		public TerminalNode PROCEDURE() { return getToken(PascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String list = "";
			setState(95);
			match(PROCEDURE);
			setState(96);
			((ProcedureContext)_localctx).identifier = identifier();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(97);
				((ProcedureContext)_localctx).formalParameterList = formalParameterList();
				list = ((ProcedureContext)_localctx).formalParameterList.ret; 
				}
			}

			setState(102);
			match(SEMI);
			setState(103);
			((ProcedureContext)_localctx).compoundStatement = compoundStatement();

			        String indentBraces = fixedLengthString("", indent - 4);
			        System.out.println(indentBraces + "void " +
			            (((ProcedureContext)_localctx).identifier!=null?_input.getText(((ProcedureContext)_localctx).identifier.start,((ProcedureContext)_localctx).identifier.stop):null) + " (" + list + ")");
			        System.out.println(indentBraces + "{");
			        System.out.print(((ProcedureContext)_localctx).compoundStatement.ret);
			        System.out.println(indentBraces + "}");
			        indent -= 4;
			   
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

	public static class FunctionContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public FormalParameterListContext formalParameterList;
		public TypeContext type;
		public CompoundStatementContext compoundStatement;
		public TerminalNode FUNCTION() { return getToken(PascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PascalParser.SEMI, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String list = "";
			setState(107);
			match(FUNCTION);
			setState(108);
			((FunctionContext)_localctx).identifier = identifier();
			 curFunctionName = (((FunctionContext)_localctx).identifier!=null?_input.getText(((FunctionContext)_localctx).identifier.start,((FunctionContext)_localctx).identifier.stop):null); 
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(110);
				((FunctionContext)_localctx).formalParameterList = formalParameterList();
				list = ((FunctionContext)_localctx).formalParameterList.ret; 
				}
			}

			setState(115);
			match(COLON);
			setState(116);
			((FunctionContext)_localctx).type = type();
			setState(117);
			match(SEMI);
			setState(118);
			((FunctionContext)_localctx).compoundStatement = compoundStatement();

			        String indentBraces = fixedLengthString("", indent - 4);
			        System.out.println(indentBraces + typesMap.get((((FunctionContext)_localctx).type!=null?_input.getText(((FunctionContext)_localctx).type.start,((FunctionContext)_localctx).type.stop):null)) + ' ' +
			                    (((FunctionContext)_localctx).identifier!=null?_input.getText(((FunctionContext)_localctx).identifier.start,((FunctionContext)_localctx).identifier.stop):null) + " (" + list + ")");
			        System.out.println(indentBraces + "{");
			        System.out.print(((FunctionContext)_localctx).compoundStatement.ret);
			        System.out.println(indentBraces + "}");
			        indent -= 4;
			   
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public String ret = "";
		public ArgsDeclarationContext argsDeclaration;
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public List<ArgsDeclarationContext> argsDeclaration() {
			return getRuleContexts(ArgsDeclarationContext.class);
		}
		public ArgsDeclarationContext argsDeclaration(int i) {
			return getRuleContext(ArgsDeclarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LPAREN);
			setState(122);
			((FormalParameterListContext)_localctx).argsDeclaration = argsDeclaration();

			       _localctx.ret += ((FormalParameterListContext)_localctx).argsDeclaration.ret;
			       //_localctx.ret += '(' + ((FormalParameterListContext)_localctx).argsDeclaration.ret;
			   
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(124);
				match(SEMI);
				setState(125);
				((FormalParameterListContext)_localctx).argsDeclaration = argsDeclaration();

				       _localctx.ret += ((FormalParameterListContext)_localctx).argsDeclaration.ret;
				   
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(RPAREN);
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

	public static class ArgsDeclarationContext extends ParserRuleContext {
		public String ret = "";
		public TypeContext type;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterArgsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitArgsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitArgsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsDeclarationContext argsDeclaration() throws RecognitionException {
		ArgsDeclarationContext _localctx = new ArgsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			identifierList();
			setState(136);
			match(COLON);
			setState(137);
			((ArgsDeclarationContext)_localctx).type = type();

			        if (vars.size() > 0) {
			            varType.put(vars.get(0), (((ArgsDeclarationContext)_localctx).type!=null?_input.getText(((ArgsDeclarationContext)_localctx).type.start,((ArgsDeclarationContext)_localctx).type.stop):null));
			            _localctx.ret += typesMap.get((((ArgsDeclarationContext)_localctx).type!=null?_input.getText(((ArgsDeclarationContext)_localctx).type.start,((ArgsDeclarationContext)_localctx).type.stop):null)) + ' ' + vars.get(0);
			        }
			        for (int i = 1; i < vars.size(); i++) {
			            varType.put(vars.get(i), (((ArgsDeclarationContext)_localctx).type!=null?_input.getText(((ArgsDeclarationContext)_localctx).type.start,((ArgsDeclarationContext)_localctx).type.stop):null));
			            _localctx.ret += ", " + typesMap.get((((ArgsDeclarationContext)_localctx).type!=null?_input.getText(((ArgsDeclarationContext)_localctx).type.start,((ArgsDeclarationContext)_localctx).type.stop):null)) + ' ' + vars.get(i);
			        }
			        vars.clear();
			      
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public String ret = "";
		public StatementsContext statements;
		public TerminalNode BEGIN() { return getToken(PascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(PascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(BEGIN);
			setState(141);
			((CompoundStatementContext)_localctx).statements = statements();
			setState(142);
			match(END);

			       _localctx.ret += ((CompoundStatementContext)_localctx).statements.trCode;
			   
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration;
		public TerminalNode VAR() { return getToken(PascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(VAR);
			setState(146);
			((VariableDeclarationPartContext)_localctx).variableDeclaration = variableDeclaration();

			       System.out.println(((VariableDeclarationPartContext)_localctx).variableDeclaration.ret);
			   
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					match(SEMI);
					setState(149);
					((VariableDeclarationPartContext)_localctx).variableDeclaration = variableDeclaration();

					       System.out.println(((VariableDeclarationPartContext)_localctx).variableDeclaration.ret);
					   
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(157);
			match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public String ret = "";
		public ArrayTypeContext arrayType;
		public TypeContext type;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PascalParser.COLON, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				identifierList();
				setState(160);
				match(COLON);
				setState(161);
				((VariableDeclarationContext)_localctx).arrayType = arrayType();

				            if (vars.size() > 0) {
				                _localctx.ret += typesMap.get(((VariableDeclarationContext)_localctx).arrayType.ret) + ' ' + vars.get(0);
				            }
				            for (int i = 1; i < vars.size(); i++) {
				                _localctx.ret += ", " + vars.get(i);
				            }
				            if (vars.size() > 0) {
				                _localctx.ret += "[" + arrSize + "]" + ';';
				            }
				            vars.clear();
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				identifierList();
				setState(165);
				match(COLON);
				setState(166);
				((VariableDeclarationContext)_localctx).type = type();

				        if (vars.size() > 0) {
				            varType.put(vars.get(0), (((VariableDeclarationContext)_localctx).type!=null?_input.getText(((VariableDeclarationContext)_localctx).type.start,((VariableDeclarationContext)_localctx).type.stop):null));
				            _localctx.ret += typesMap.get((((VariableDeclarationContext)_localctx).type!=null?_input.getText(((VariableDeclarationContext)_localctx).type.start,((VariableDeclarationContext)_localctx).type.stop):null)) + ' ' + vars.get(0);
				        }
				        for (int i = 1; i < vars.size(); i++) {
				            varType.put(vars.get(i), (((VariableDeclarationContext)_localctx).type!=null?_input.getText(((VariableDeclarationContext)_localctx).type.start,((VariableDeclarationContext)_localctx).type.stop):null));
				            _localctx.ret += ", " + vars.get(i);
				        }
				        if (vars.size() > 0) {
				            _localctx.ret += ';';
				        }
				        vars.clear();
				      
				}
				break;
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			((IdentifierListContext)_localctx).identifier = identifier();

			     vars.add((((IdentifierListContext)_localctx).identifier!=null?_input.getText(((IdentifierListContext)_localctx).identifier.start,((IdentifierListContext)_localctx).identifier.stop):null));
			   
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				((IdentifierListContext)_localctx).identifier = identifier();
				 vars.add((((IdentifierListContext)_localctx).identifier!=null?_input.getText(((IdentifierListContext)_localctx).identifier.start,((IdentifierListContext)_localctx).identifier.stop):null)); 
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TypeContext extends ParserRuleContext {
		public String ret = "";
		public IdentifierContext identifier;
		public ArrayTypeContext arrayType;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(PascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(PascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(PascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(PascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(PascalParser.STRING, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((TypeContext)_localctx).identifier = identifier();
				 ((TypeContext)_localctx).ret =  (((TypeContext)_localctx).identifier!=null?_input.getText(((TypeContext)_localctx).identifier.start,((TypeContext)_localctx).identifier.stop):null); 
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
					{
					setState(185);
					match(CHAR);
					}
					break;
				case BOOLEAN:
					{
					setState(186);
					match(BOOLEAN);
					}
					break;
				case INTEGER:
					{
					setState(187);
					match(INTEGER);
					((TypeContext)_localctx).ret =  "integer";
					}
					break;
				case REAL:
					{
					setState(189);
					match(REAL);
					}
					break;
				case STRING:
					{
					setState(190);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				((TypeContext)_localctx).arrayType = arrayType();
				((TypeContext)_localctx).ret =  ((TypeContext)_localctx).arrayType.ret; 
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public String ret = "";
		public Token fst;
		public Token snd;
		public TypeContext type;
		public TerminalNode ARRAY() { return getToken(PascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PascalParser.LBRACK, 0); }
		public TerminalNode DOTDOT() { return getToken(PascalParser.DOTDOT, 0); }
		public TerminalNode RBRACK() { return getToken(PascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(PascalParser.OF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(PascalParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(PascalParser.NUM_INT, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ARRAY);
			setState(199);
			match(LBRACK);
			setState(200);
			((ArrayTypeContext)_localctx).fst = match(NUM_INT);
			setState(201);
			match(DOTDOT);
			setState(202);
			((ArrayTypeContext)_localctx).snd = match(NUM_INT);
			setState(203);
			match(RBRACK);
			setState(204);
			match(OF);
			setState(205);
			((ArrayTypeContext)_localctx).type = type();

			       arrSize = (((ArrayTypeContext)_localctx).snd!=null?((ArrayTypeContext)_localctx).snd.getText():null) + "-" + (((ArrayTypeContext)_localctx).fst!=null?((ArrayTypeContext)_localctx).fst.getText():null);
			       ((ArrayTypeContext)_localctx).ret =  ((ArrayTypeContext)_localctx).type.ret;
			   
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(PascalParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(IDENT);
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

	public static class StatementsContext extends ParserRuleContext {
		public String trCode;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(PascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 indent += 4; 
			setState(211);
			((StatementsContext)_localctx).statement = statement();
			 ((StatementsContext)_localctx).trCode =  ((StatementsContext)_localctx).statement.trCode; 
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(213);
				match(SEMI);
				setState(214);
				((StatementsContext)_localctx).statement = statement();

				   _localctx.trCode += "\n";
				   _localctx.trCode += ((StatementsContext)_localctx).statement.trCode;
				   
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public String trCode = "";
		public SimpleStatementContext simpleStatement;
		public StructuredStatementContext structuredStatement;
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case SEMI:
			case AT:
			case IDENT:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				((StatementContext)_localctx).simpleStatement = simpleStatement();
				 ((StatementContext)_localctx).trCode =  ((StatementContext)_localctx).simpleStatement.trCode; 
				}
				break;
			case BEGIN:
			case FOR:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				((StatementContext)_localctx).structuredStatement = structuredStatement();
				 ((StatementContext)_localctx).trCode =  ((StatementContext)_localctx).structuredStatement.ret; 
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public String trCode = "";
		public AssignmentStatementContext assignmentStatement;
		public ProcedureStatementContext procedureStatement;
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleStatement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((SimpleStatementContext)_localctx).assignmentStatement = assignmentStatement();
				 ((SimpleStatementContext)_localctx).trCode =  ((SimpleStatementContext)_localctx).assignmentStatement.trCode; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((SimpleStatementContext)_localctx).procedureStatement = procedureStatement();
				 ((SimpleStatementContext)_localctx).trCode =  ((SimpleStatementContext)_localctx).procedureStatement.trCode; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				emptyStatement();
				}
				break;
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public String trCode = "";
		public VariableContext variable;
		public ExpressionContext expression;
		public ProcedureStatementContext procedureStatement;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			((AssignmentStatementContext)_localctx).variable = variable();
			setState(240);
			match(ASSIGN);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(241);
				((AssignmentStatementContext)_localctx).expression = expression();

				    if ((((AssignmentStatementContext)_localctx).variable!=null?_input.getText(((AssignmentStatementContext)_localctx).variable.start,((AssignmentStatementContext)_localctx).variable.stop):null).equals(curFunctionName)) {
				        ((AssignmentStatementContext)_localctx).trCode =  fixedLengthString("", indent) + "return " + ((AssignmentStatementContext)_localctx).expression.ret + ';';
				    } else {
				        ((AssignmentStatementContext)_localctx).trCode =  fixedLengthString("", indent) + (((AssignmentStatementContext)_localctx).variable!=null?_input.getText(((AssignmentStatementContext)_localctx).variable.start,((AssignmentStatementContext)_localctx).variable.stop):null) + " = "
				        + ((AssignmentStatementContext)_localctx).expression.ret + ';';
				    }
				    
				}
				break;
			case 2:
				{
				setState(244);
				((AssignmentStatementContext)_localctx).procedureStatement = procedureStatement();
				 ((AssignmentStatementContext)_localctx).trCode =  fixedLengthString("", indent) + (((AssignmentStatementContext)_localctx).variable!=null?_input.getText(((AssignmentStatementContext)_localctx).variable.start,((AssignmentStatementContext)_localctx).variable.stop):null) + " = "
				    + ((AssignmentStatementContext)_localctx).procedureStatement.trCode.substring(indent); 
				}
				break;
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public String trCode = "";
		public IdentifierContext identifier;
		public ParameterListContext parameterList;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((ProcedureStatementContext)_localctx).identifier = identifier();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(250);
				match(LPAREN);
				setState(251);
				((ProcedureStatementContext)_localctx).parameterList = parameterList();
				setState(252);
				match(RPAREN);
				}
			}


			     _localctx.trCode += fixedLengthString("", indent);
			     String funName = (((ProcedureStatementContext)_localctx).identifier!=null?_input.getText(((ProcedureStatementContext)_localctx).identifier.start,((ProcedureStatementContext)_localctx).identifier.stop):null);
			     int listSize = params.size();
			     switch(funName) {
			         //read(a, b) -> scanf("%d%d", &a, &b);
			         case "read":
			            _localctx.trCode += "scanf(";
			            _localctx.trCode += getTypesFormat(false, true);
			            _localctx.trCode += ");";
			            break;
			         //writeln(a + b) -> printf("%d\n", a + b);
			         case "writeln":
			            _localctx.trCode += "printf(";
			            _localctx.trCode += getTypesFormat(true, false);
			            _localctx.trCode += ");";
			            break;
			         default:
			            _localctx.trCode += funName + '(' + (((ProcedureStatementContext)_localctx).parameterList!=null?_input.getText(((ProcedureStatementContext)_localctx).parameterList.start,((ProcedureStatementContext)_localctx).parameterList.stop):null) + ");";
			            break;
			     }
			     params.clear();
			   
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

	public static class ParameterListContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			((ParameterListContext)_localctx).expression = expression();
			 params.add((((ParameterListContext)_localctx).expression!=null?_input.getText(((ParameterListContext)_localctx).expression.start,((ParameterListContext)_localctx).expression.stop):null)); 
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				((ParameterListContext)_localctx).expression = expression();
				 params.add((((ParameterListContext)_localctx).expression!=null?_input.getText(((ParameterListContext)_localctx).expression.start,((ParameterListContext)_localctx).expression.stop):null)); 
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public String ret = "";
		public IfStatementContext ifStatement;
		public ForStatementContext forStatement;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structuredStatement);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				compoundStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((StructuredStatementContext)_localctx).ifStatement = ifStatement();
				 ((StructuredStatementContext)_localctx).ret =  ((StructuredStatementContext)_localctx).ifStatement.ret; 
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				((StructuredStatementContext)_localctx).forStatement = forStatement();
				 ((StructuredStatementContext)_localctx).ret =  ((StructuredStatementContext)_localctx).forStatement.ret; 
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

	public static class IfStatementContext extends ParserRuleContext {
		public String ret = "";
		public ExpressionContext expression;
		public StatementContext fst;
		public StatementContext snd;
		public TerminalNode IF() { return getToken(PascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 indent += 4; 
			setState(281);
			match(IF);
			setState(282);
			((IfStatementContext)_localctx).expression = expression();
			setState(283);
			match(THEN);
			setState(284);
			((IfStatementContext)_localctx).fst = statement();

			   _localctx.ret += fixedLengthString("", indent - 4) + "if" + " (" + ((IfStatementContext)_localctx).expression.ret + ") {\n" +
			   ((IfStatementContext)_localctx).fst.trCode + '\n' + fixedLengthString("", indent - 4) + "}";
			   
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(286);
				match(ELSE);
				setState(287);
				((IfStatementContext)_localctx).snd = statement();

				   _localctx.ret += " else {\n" + ((IfStatementContext)_localctx).snd.trCode + '\n' + fixedLengthString("", indent - 4) + "}";
				   
				}
				break;
			}
			 indent -= 4; 
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

	public static class ForStatementContext extends ParserRuleContext {
		public String ret = "";
		public IdentifierContext identifier;
		public ForListContext forList;
		public StatementContext statement;
		public TerminalNode FOR() { return getToken(PascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(PascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(FOR);
			setState(295);
			((ForStatementContext)_localctx).identifier = identifier();

			       indent += 4;
			       _localctx.ret += fixedLengthString("", indent - 4) + "for (" + typesMap.get(varType.get((((ForStatementContext)_localctx).identifier!=null?_input.getText(((ForStatementContext)_localctx).identifier.start,((ForStatementContext)_localctx).identifier.stop):null))) +
			       ' ' + (((ForStatementContext)_localctx).identifier!=null?_input.getText(((ForStatementContext)_localctx).identifier.start,((ForStatementContext)_localctx).identifier.stop):null);
			   
			setState(297);
			match(ASSIGN);
			setState(298);
			((ForStatementContext)_localctx).forList = forList();

			       _localctx.ret += " = " + ((ForStatementContext)_localctx).forList.ret + " > " + (((ForStatementContext)_localctx).identifier!=null?_input.getText(((ForStatementContext)_localctx).identifier.start,((ForStatementContext)_localctx).identifier.stop):null) + "; " +
			       (((ForStatementContext)_localctx).identifier!=null?_input.getText(((ForStatementContext)_localctx).identifier.start,((ForStatementContext)_localctx).identifier.stop):null) + "++)\n";
			   
			setState(300);
			match(DO);
			setState(301);
			((ForStatementContext)_localctx).statement = statement();

			       _localctx.ret += fixedLengthString("", indent - 4) + "{\n" + ((ForStatementContext)_localctx).statement.trCode + "\n" +
			       fixedLengthString("", indent - 4) + "}";
			       indent -= 4;
			   
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

	public static class ForListContext extends ParserRuleContext {
		public String ret = "";
		public InitialValueContext initialValue;
		public FinalValueContext finalValue;
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(PascalParser.TO, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((ForListContext)_localctx).initialValue = initialValue();
			setState(305);
			match(TO);
			setState(306);
			((ForListContext)_localctx).finalValue = finalValue();

			       _localctx.ret += (((ForListContext)_localctx).initialValue!=null?_input.getText(((ForListContext)_localctx).initialValue.start,((ForListContext)_localctx).initialValue.stop):null) + "; " + (((ForListContext)_localctx).finalValue!=null?_input.getText(((ForListContext)_localctx).finalValue.start,((ForListContext)_localctx).finalValue.stop):null);
			   
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expression();
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public String ret = "";
		public SimpleExpressionContext simpleExpression;
		public RelationaloperatorContext relationaloperator;
		public ExpressionContext expression;
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			((ExpressionContext)_localctx).simpleExpression = simpleExpression();
			 _localctx.ret += (((ExpressionContext)_localctx).simpleExpression!=null?_input.getText(((ExpressionContext)_localctx).simpleExpression.start,((ExpressionContext)_localctx).simpleExpression.stop):null); 
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(315);
				((ExpressionContext)_localctx).relationaloperator = relationaloperator();

				       _localctx.ret += ((ExpressionContext)_localctx).relationaloperator.ret;
				   
				setState(317);
				((ExpressionContext)_localctx).expression = expression();
				 _localctx.ret += (((ExpressionContext)_localctx).expression!=null?_input.getText(((ExpressionContext)_localctx).expression.start,((ExpressionContext)_localctx).expression.stop):null); 
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

	public static class RelationaloperatorContext extends ParserRuleContext {
		public String ret = "";
		public TerminalNode EQUAL() { return getToken(PascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(PascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(PascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(PascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(PascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(PascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(PascalParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitRelationaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitRelationaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_relationaloperator);
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(EQUAL);
				 ((RelationaloperatorContext)_localctx).ret =  "=="; 
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(NOT_EQUAL);
				 ((RelationaloperatorContext)_localctx).ret =  "!="; 
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(LT);
				 ((RelationaloperatorContext)_localctx).ret =  "<"; 
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(LE);
				 ((RelationaloperatorContext)_localctx).ret =  "<="; 
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(GE);
				 ((RelationaloperatorContext)_localctx).ret =  ">="; 
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 6);
				{
				setState(332);
				match(GT);
				 ((RelationaloperatorContext)_localctx).ret =  ">"; 
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
				match(IN);
				 ((RelationaloperatorContext)_localctx).ret =  "IN"; 
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			term();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(339);
				additiveoperator();
				setState(340);
				simpleExpression();
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

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(PascalParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitAdditiveoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitAdditiveoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			signedFactor();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(347);
				multiplicativeoperator();
				setState(348);
				term();
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

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(PascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(PascalParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitMultiplicativeoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitMultiplicativeoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PascalParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(354);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(357);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PascalParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(PascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case IDENT:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(LPAREN);
				setState(361);
				expression();
				setState(362);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(NOT);
				setState(365);
				factor();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				bool();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PascalParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode NUM_INT() { return getToken(PascalParser.NUM_INT, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PascalParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PascalParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PascalParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PascalParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(PascalParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(PascalParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(PascalParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(PascalParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PascalParser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(PascalParser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(PascalParser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(369);
				match(AT);
				setState(370);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(371);
				identifier();
				}
				break;
			case NUM_INT:
				{
				setState(372);
				match(NUM_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (LBRACK - 58)) | (1L << (LBRACK2 - 58)) | (1L << (POINTER - 58)) | (1L << (DOT - 58)))) != 0)) {
				{
				setState(400);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(375);
					match(LBRACK);
					setState(376);
					expression();
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						expression();
						}
						}
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(384);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(386);
					match(LBRACK2);
					setState(387);
					expression();
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(388);
						match(COMMA);
						setState(389);
						expression();
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(395);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(397);
					match(DOT);
					setState(398);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(399);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PascalParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PascalVisitor ) return ((PascalVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u019a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3T\n"+
		"\3\f\3\16\3W\13\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4_\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5g\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16"+
		"\7\u0086\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00c2\n\r\3\r\3\r\3\r\5\r\u00c7\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00dc\n\20\f\20\16\20\u00df\13\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f0"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fa\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0101\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u010b\n\25\f\25\16\25\u010e\13\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0119\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0125\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0143\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0153\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0159\n\37\3 \3 \3!\3!\3!\3!\5!\u0161\n!\3\"\3\"\3#\5#\u0166"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0172\n$\3%\3%\3%\3%\5%\u0178\n%"+
		"\3%\3%\3%\3%\7%\u017e\n%\f%\16%\u0181\13%\3%\3%\3%\3%\3%\3%\7%\u0189\n"+
		"%\f%\16%\u018c\13%\3%\3%\3%\3%\3%\7%\u0193\n%\f%\16%\u0196\13%\3&\3&\3"+
		"&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJ\2\6\5\2\3\3\35\35,-\6\2\4\4\f\f\31\31./\3\2,-\3\2KL\2\u01a2\2"+
		"L\3\2\2\2\4U\3\2\2\2\6^\3\2\2\2\b`\3\2\2\2\nl\3\2\2\2\f{\3\2\2\2\16\u0089"+
		"\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00c6\3\2\2\2\32\u00c8\3\2\2\2\34\u00d2\3\2\2\2\36\u00d4\3\2"+
		"\2\2 \u00e6\3\2\2\2\"\u00ef\3\2\2\2$\u00f1\3\2\2\2&\u00fb\3\2\2\2(\u0104"+
		"\3\2\2\2*\u010f\3\2\2\2,\u0118\3\2\2\2.\u011a\3\2\2\2\60\u0128\3\2\2\2"+
		"\62\u0132\3\2\2\2\64\u0137\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u0152"+
		"\3\2\2\2<\u0154\3\2\2\2>\u015a\3\2\2\2@\u015c\3\2\2\2B\u0162\3\2\2\2D"+
		"\u0165\3\2\2\2F\u0171\3\2\2\2H\u0177\3\2\2\2J\u0197\3\2\2\2LM\b\2\1\2"+
		"MN\5\4\3\2N\3\3\2\2\2OT\5\22\n\2PQ\5\6\4\2QR\7\62\2\2RT\3\2\2\2SO\3\2"+
		"\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\5\20"+
		"\t\2YZ\7B\2\2Z[\b\3\1\2[\5\3\2\2\2\\_\5\b\5\2]_\5\n\6\2^\\\3\2\2\2^]\3"+
		"\2\2\2_\7\3\2\2\2`a\b\5\1\2ab\7\37\2\2bf\5\34\17\2cd\5\f\7\2de\b\5\1\2"+
		"eg\3\2\2\2fc\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\62\2\2ij\5\20\t\2jk\b\5\1"+
		"\2k\t\3\2\2\2lm\b\6\1\2mn\7\23\2\2no\5\34\17\2os\b\6\1\2pq\5\f\7\2qr\b"+
		"\6\1\2rt\3\2\2\2sp\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\63\2\2vw\5\30\r\2w"+
		"x\7\62\2\2xy\5\20\t\2yz\b\6\1\2z\13\3\2\2\2{|\7:\2\2|}\5\16\b\2}\u0084"+
		"\b\7\1\2~\177\7\62\2\2\177\u0080\5\16\b\2\u0080\u0081\b\7\1\2\u0081\u0083"+
		"\3\2\2\2\u0082~\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7;"+
		"\2\2\u0088\r\3\2\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\63\2\2\u008b\u008c"+
		"\5\30\r\2\u008c\u008d\b\b\1\2\u008d\17\3\2\2\2\u008e\u008f\7\6\2\2\u008f"+
		"\u0090\5\36\20\2\u0090\u0091\7\20\2\2\u0091\u0092\b\t\1\2\u0092\21\3\2"+
		"\2\2\u0093\u0094\7)\2\2\u0094\u0095\5\24\13\2\u0095\u009c\b\n\1\2\u0096"+
		"\u0097\7\62\2\2\u0097\u0098\5\24\13\2\u0098\u0099\b\n\1\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\62"+
		"\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\63\2\2\u00a3"+
		"\u00a4\5\32\16\2\u00a4\u00a5\b\13\1\2\u00a5\u00ac\3\2\2\2\u00a6\u00a7"+
		"\5\26\f\2\u00a7\u00a8\7\63\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\b\13\1"+
		"\2\u00aa\u00ac\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\25"+
		"\3\2\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00b5\b\f\1\2\u00af\u00b0\7\61\2"+
		"\2\u00b0\u00b1\5\34\17\2\u00b1\u00b2\b\f\1\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\5\34\17\2\u00b9"+
		"\u00ba\b\r\1\2\u00ba\u00c7\3\2\2\2\u00bb\u00c2\7\t\2\2\u00bc\u00c2\7\7"+
		"\2\2\u00bd\u00be\7\27\2\2\u00be\u00c2\b\r\1\2\u00bf\u00c2\7!\2\2\u00c0"+
		"\u00c2\7I\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3"+
		"\u00c4\5\32\16\2\u00c4\u00c5\b\r\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00b8\3"+
		"\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\31\3\2\2\2\u00c8"+
		"\u00c9\7\5\2\2\u00c9\u00ca\7<\2\2\u00ca\u00cb\7R\2\2\u00cb\u00cc\7C\2"+
		"\2\u00cc\u00cd\7R\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d0"+
		"\5\30\r\2\u00d0\u00d1\b\16\1\2\u00d1\33\3\2\2\2\u00d2\u00d3\7P\2\2\u00d3"+
		"\35\3\2\2\2\u00d4\u00d5\b\20\1\2\u00d5\u00d6\5 \21\2\u00d6\u00dd\b\20"+
		"\1\2\u00d7\u00d8\7\62\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\b\20\1\2\u00da"+
		"\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\37\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\5\"\22\2\u00e1\u00e2\b\21\1\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\5,\27\2"+
		"\u00e4\u00e5\b\21\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3"+
		"\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9\5$\23\2\u00e9\u00ea\b\22\1\2\u00ea"+
		"\u00f0\3\2\2\2\u00eb\u00ec\5&\24\2\u00ec\u00ed\b\22\1\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00f0\5*\26\2\u00ef\u00e8\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f2\5H%\2\u00f2\u00f9\7\60\2\2\u00f3"+
		"\u00f4\58\35\2\u00f4\u00f5\b\23\1\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\5"+
		"&\24\2\u00f7\u00f8\b\23\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f6\3\2\2\2\u00fa%\3\2\2\2\u00fb\u0100\5\34\17\2\u00fc\u00fd\7:\2\2"+
		"\u00fd\u00fe\5(\25\2\u00fe\u00ff\7;\2\2\u00ff\u0101\3\2\2\2\u0100\u00fc"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b\24\1\2"+
		"\u0103\'\3\2\2\2\u0104\u0105\58\35\2\u0105\u010c\b\25\1\2\u0106\u0107"+
		"\7\61\2\2\u0107\u0108\58\35\2\u0108\u0109\b\25\1\2\u0109\u010b\3\2\2\2"+
		"\u010a\u0106\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d)\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"+\3\2\2\2\u0111\u0119\5\20\t\2\u0112\u0113\5.\30\2\u0113\u0114\b\27\1"+
		"\2\u0114\u0119\3\2\2\2\u0115\u0116\5\60\31\2\u0116\u0117\b\27\1\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2"+
		"\2\2\u0119-\3\2\2\2\u011a\u011b\b\30\1\2\u011b\u011c\7\25\2\2\u011c\u011d"+
		"\58\35\2\u011d\u011e\7%\2\2\u011e\u011f\5 \21\2\u011f\u0124\b\30\1\2\u0120"+
		"\u0121\7\17\2\2\u0121\u0122\5 \21\2\u0122\u0123\b\30\1\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\b\30\1\2\u0127/\3\2\2\2\u0128\u0129\7\22\2\2\u0129\u012a\5\34\17"+
		"\2\u012a\u012b\b\31\1\2\u012b\u012c\7\60\2\2\u012c\u012d\5\62\32\2\u012d"+
		"\u012e\b\31\1\2\u012e\u012f\7\r\2\2\u012f\u0130\5 \21\2\u0130\u0131\b"+
		"\31\1\2\u0131\61\3\2\2\2\u0132\u0133\5\64\33\2\u0133\u0134\7&\2\2\u0134"+
		"\u0135\5\66\34\2\u0135\u0136\b\32\1\2\u0136\63\3\2\2\2\u0137\u0138\58"+
		"\35\2\u0138\65\3\2\2\2\u0139\u013a\58\35\2\u013a\67\3\2\2\2\u013b\u013c"+
		"\5<\37\2\u013c\u0142\b\35\1\2\u013d\u013e\5:\36\2\u013e\u013f\b\35\1\2"+
		"\u013f\u0140\58\35\2\u0140\u0141\b\35\1\2\u0141\u0143\3\2\2\2\u0142\u013d"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0145\7\64\2\2\u0145"+
		"\u0153\b\36\1\2\u0146\u0147\7\65\2\2\u0147\u0153\b\36\1\2\u0148\u0149"+
		"\7\66\2\2\u0149\u0153\b\36\1\2\u014a\u014b\7\67\2\2\u014b\u0153\b\36\1"+
		"\2\u014c\u014d\78\2\2\u014d\u0153\b\36\1\2\u014e\u014f\79\2\2\u014f\u0153"+
		"\b\36\1\2\u0150\u0151\7\26\2\2\u0151\u0153\b\36\1\2\u0152\u0144\3\2\2"+
		"\2\u0152\u0146\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014c"+
		"\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u0150\3\2\2\2\u0153;\3\2\2\2\u0154"+
		"\u0158\5@!\2\u0155\u0156\5> \2\u0156\u0157\5<\37\2\u0157\u0159\3\2\2\2"+
		"\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159=\3\2\2\2\u015a\u015b\t"+
		"\2\2\2\u015b?\3\2\2\2\u015c\u0160\5D#\2\u015d\u015e\5B\"\2\u015e\u015f"+
		"\5@!\2\u015f\u0161\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"A\3\2\2\2\u0162\u0163\t\3\2\2\u0163C\3\2\2\2\u0164\u0166\t\4\2\2\u0165"+
		"\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5F"+
		"$\2\u0168E\3\2\2\2\u0169\u0172\5H%\2\u016a\u016b\7:\2\2\u016b\u016c\5"+
		"8\35\2\u016c\u016d\7;\2\2\u016d\u0172\3\2\2\2\u016e\u016f\7\33\2\2\u016f"+
		"\u0172\5F$\2\u0170\u0172\5J&\2\u0171\u0169\3\2\2\2\u0171\u016a\3\2\2\2"+
		"\u0171\u016e\3\2\2\2\u0171\u0170\3\2\2\2\u0172G\3\2\2\2\u0173\u0174\7"+
		"A\2\2\u0174\u0178\5\34\17\2\u0175\u0178\5\34\17\2\u0176\u0178\7R\2\2\u0177"+
		"\u0173\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u0194\3\2"+
		"\2\2\u0179\u017a\7<\2\2\u017a\u017f\58\35\2\u017b\u017c\7\61\2\2\u017c"+
		"\u017e\58\35\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\7>\2\2\u0183\u0193\3\2\2\2\u0184\u0185\7=\2\2\u0185\u018a\58\35"+
		"\2\u0186\u0187\7\61\2\2\u0187\u0189\58\35\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7?\2\2\u018e\u0193\3\2\2\2\u018f"+
		"\u0190\7B\2\2\u0190\u0193\5\34\17\2\u0191\u0193\7@\2\2\u0192\u0179\3\2"+
		"\2\2\u0192\u0184\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0191\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195I\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u0198\t\5\2\2\u0198K\3\2\2\2 SU^fs\u0084\u009c"+
		"\u00ab\u00b5\u00c1\u00c6\u00dd\u00e6\u00ef\u00f9\u0100\u010c\u0118\u0124"+
		"\u0142\u0152\u0158\u0160\u0165\u0171\u0177\u017f\u018a\u0192\u0194";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}