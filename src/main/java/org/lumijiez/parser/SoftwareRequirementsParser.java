// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/SoftwareRequirements.g4 by ANTLR 4.13.1
package org.lumijiez.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SoftwareRequirementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, STRING=23, DESCRIPTION=24, 
		WS=25, INT=26, FLOAT=27, LPAREN=28, RPAREN=29, COLON=30, SEMICOLON=31, 
		COMMA=32, LBRACE=33, RBRACE=34, TILDE=35, EXCLAM=36;
	public static final int
		RULE_program = 0, RULE_program_body = 1, RULE_requirementSpec = 2, RULE_req_specification = 3, 
		RULE_result_specification = 4, RULE_predicate = 5, RULE_expression = 6, 
		RULE_term = 7, RULE_logical_op = 8, RULE_functionSpec = 9, RULE_functionBody = 10, 
		RULE_input_types = 11, RULE_return_types = 12, RULE_specification = 13, 
		RULE_variable = 14, RULE_importance = 15, RULE_type = 16, RULE_access_modifiers = 17, 
		RULE_description = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_body", "requirementSpec", "req_specification", "result_specification", 
			"predicate", "expression", "term", "logical_op", "functionSpec", "functionBody", 
			"input_types", "return_types", "specification", "variable", "importance", 
			"type", "access_modifiers", "description"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'@'", "'result'", "'=>'", "'&&'", "'||'", "'return'", 
			"'[]'", "'critical'", "'optional'", "'INT'", "'FLOAT'", "'DOUBLE'", "'STRING'", 
			"'BOOLEAN'", "'CHAR'", "'VOID'", "'public'", "'protected'", "'private'", 
			"'default'", null, null, null, null, null, null, "'('", "')'", "':'", 
			"';'", "','", "'{'", "'}'", "'~'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "STRING", 
			"DESCRIPTION", "WS", "INT", "FLOAT", "LPAREN", "RPAREN", "COLON", "SEMICOLON", 
			"COMMA", "LBRACE", "RBRACE", "TILDE", "EXCLAM"
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
	public String getGrammarFileName() { return "SoftwareRequirements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SoftwareRequirementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(SoftwareRequirementsParser.LBRACE, 0); }
		public Program_bodyContext program_body() {
			return getRuleContext(Program_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SoftwareRequirementsParser.RBRACE, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(38);
				description();
				}
			}

			setState(41);
			match(T__0);
			setState(42);
			match(ID);
			setState(43);
			match(LBRACE);
			setState(44);
			program_body();
			setState(45);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Program_bodyContext extends ParserRuleContext {
		public List<RequirementSpecContext> requirementSpec() {
			return getRuleContexts(RequirementSpecContext.class);
		}
		public RequirementSpecContext requirementSpec(int i) {
			return getRuleContext(RequirementSpecContext.class,i);
		}
		public List<FunctionSpecContext> functionSpec() {
			return getRuleContexts(FunctionSpecContext.class);
		}
		public FunctionSpecContext functionSpec(int i) {
			return getRuleContext(FunctionSpecContext.class,i);
		}
		public Program_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterProgram_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitProgram_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitProgram_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_bodyContext program_body() throws RecognitionException {
		Program_bodyContext _localctx = new Program_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(47);
					requirementSpec();
					}
					break;
				case 2:
					{
					setState(48);
					functionSpec();
					}
					break;
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 24905216L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(SoftwareRequirementsParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SoftwareRequirementsParser.RBRACE, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public List<Req_specificationContext> req_specification() {
			return getRuleContexts(Req_specificationContext.class);
		}
		public Req_specificationContext req_specification(int i) {
			return getRuleContext(Req_specificationContext.class,i);
		}
		public List<Result_specificationContext> result_specification() {
			return getRuleContexts(Result_specificationContext.class);
		}
		public Result_specificationContext result_specification(int i) {
			return getRuleContext(Result_specificationContext.class,i);
		}
		public RequirementSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterRequirementSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitRequirementSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitRequirementSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementSpecContext requirementSpec() throws RecognitionException {
		RequirementSpecContext _localctx = new RequirementSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_requirementSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(53);
				description();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(56);
				importance();
				}
			}

			setState(59);
			match(ID);
			setState(60);
			match(LBRACE);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1540L) != 0)) {
				{
				{
				setState(61);
				req_specification();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(67);
				result_specification();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Req_specificationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SoftwareRequirementsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SoftwareRequirementsParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public List<Logical_opContext> logical_op() {
			return getRuleContexts(Logical_opContext.class);
		}
		public Logical_opContext logical_op(int i) {
			return getRuleContext(Logical_opContext.class,i);
		}
		public Req_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_req_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterReq_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitReq_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitReq_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Req_specificationContext req_specification() throws RecognitionException {
		Req_specificationContext _localctx = new Req_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_req_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(75);
				importance();
				}
			}

			setState(78);
			match(T__1);
			setState(79);
			match(ID);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(80);
				logical_op();
				setState(81);
				match(ID);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Result_specificationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public Result_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterResult_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitResult_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitResult_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_specificationContext result_specification() throws RecognitionException {
		Result_specificationContext _localctx = new Result_specificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_result_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__2);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(91);
				importance();
				}
			}

			setState(94);
			match(ID);
			setState(95);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			expression();
			setState(98);
			match(T__3);
			setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Logical_opContext> logical_op() {
			return getRuleContexts(Logical_opContext.class);
		}
		public Logical_opContext logical_op(int i) {
			return getRuleContext(Logical_opContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			term();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(102);
				logical_op();
				setState(103);
				term();
				}
				}
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SoftwareRequirementsParser.LBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SoftwareRequirementsParser.RBRACE, 0); }
		public TerminalNode STRING() { return getToken(SoftwareRequirementsParser.STRING, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(LBRACE);
				setState(111);
				expression();
				setState(112);
				match(RBRACE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_opContext extends ParserRuleContext {
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitLogical_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitLogical_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SoftwareRequirementsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SoftwareRequirementsParser.RPAREN, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public Access_modifiersContext access_modifiers() {
			return getRuleContext(Access_modifiersContext.class,0);
		}
		public Input_typesContext input_types() {
			return getRuleContext(Input_typesContext.class,0);
		}
		public FunctionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterFunctionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitFunctionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitFunctionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecContext functionSpec() throws RecognitionException {
		FunctionSpecContext _localctx = new FunctionSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(119);
				description();
				}
			}

			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(122);
				importance();
				}
			}

			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				setState(125);
				access_modifiers();
				}
			}

			setState(128);
			match(ID);
			setState(129);
			match(LPAREN);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 260096L) != 0)) {
				{
				setState(130);
				input_types();
				}
			}

			setState(133);
			match(RPAREN);
			setState(134);
			functionBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SoftwareRequirementsParser.LBRACE, 0); }
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SoftwareRequirementsParser.RBRACE, 0); }
		public List<SpecificationContext> specification() {
			return getRuleContexts(SpecificationContext.class);
		}
		public SpecificationContext specification(int i) {
			return getRuleContext(SpecificationContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACE);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(137);
				specification();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			return_types();
			setState(144);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_typesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SoftwareRequirementsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SoftwareRequirementsParser.COMMA, i);
		}
		public Input_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterInput_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitInput_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitInput_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_typesContext input_types() throws RecognitionException {
		Input_typesContext _localctx = new Input_typesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_input_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			variable();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				variable();
				}
				}
				setState(153);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_typesContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SoftwareRequirementsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SoftwareRequirementsParser.COMMA, i);
		}
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterReturn_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitReturn_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitReturn_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_return_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__6);
			setState(155);
			variable();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(156);
				match(COMMA);
				setState(157);
				variable();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public TerminalNode COLON() { return getToken(SoftwareRequirementsParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(SoftwareRequirementsParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
			setState(166);
			match(ID);
			setState(167);
			match(COLON);
			setState(168);
			match(STRING);
			setState(169);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(172);
				match(T__7);
				}
			}

			setState(175);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportanceContext extends ParserRuleContext {
		public ImportanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterImportance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitImportance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitImportance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportanceContext importance() throws RecognitionException {
		ImportanceContext _localctx = new ImportanceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_importance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260096L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Access_modifiersContext extends ParserRuleContext {
		public Access_modifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterAccess_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitAccess_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitAccess_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifiersContext access_modifiers() throws RecognitionException {
		Access_modifiersContext _localctx = new Access_modifiersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_access_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode DESCRIPTION() { return getToken(SoftwareRequirementsParser.DESCRIPTION, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DESCRIPTION);
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
		"\u0004\u0001$\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"2\b\u0001\u000b\u0001\f\u00013\u0001\u0002\u0003\u00027\b\u0002\u0001"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0005\u0002E\b\u0002"+
		"\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003"+
		"M\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003T\b\u0003\n\u0003\f\u0003W\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006j\b\u0006\n\u0006\f\u0006"+
		"m\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007t\b\u0007\u0001\b\u0001\b\u0001\t\u0003\ty\b\t\u0001\t\u0003"+
		"\t|\b\t\u0001\t\u0003\t\u007f\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0084"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u008b\b\n\n\n\f\n"+
		"\u008e\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0096\b\u000b\n\u000b\f\u000b\u0099\t\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u009f\b\f\n\f\f\f\u00a2\t\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ae\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0004\u0001\u0000"+
		"\u0005\u0006\u0001\u0000\t\n\u0001\u0000\u000b\u0011\u0001\u0000\u0012"+
		"\u0015\u00ba\u0000\'\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000"+
		"\u0000\u00046\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\b"+
		"Z\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000"+
		"\u0000\u000es\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012"+
		"x\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000\u0000\u0000\u0016\u0092"+
		"\u0001\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00a5"+
		"\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e\u00b1"+
		"\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00b5\u0001"+
		"\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000&(\u0003$\u0012\u0000"+
		"\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0005\u0001\u0000\u0000*+\u0005\u0016\u0000\u0000+,\u0005!\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-.\u0005\"\u0000\u0000.\u0001\u0001\u0000"+
		"\u0000\u0000/2\u0003\u0004\u0002\u000002\u0003\u0012\t\u00001/\u0001\u0000"+
		"\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000"+
		"\u000057\u0003$\u0012\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u00008:\u0003\u001e\u000f\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005"+
		"\u0016\u0000\u0000<@\u0005!\u0000\u0000=?\u0003\u0006\u0003\u0000>=\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AF\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CE\u0003\b\u0004\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\"\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KM\u0003\u001e\u000f\u0000LK\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\u0002\u0000"+
		"\u0000OU\u0005\u0016\u0000\u0000PQ\u0003\u0010\b\u0000QR\u0005\u0016\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005\u001f\u0000\u0000"+
		"Y\u0007\u0001\u0000\u0000\u0000Z\\\u0005\u0003\u0000\u0000[]\u0003\u001e"+
		"\u000f\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0005\u0016\u0000\u0000_`\u0005\u001f\u0000\u0000"+
		"`\t\u0001\u0000\u0000\u0000ab\u0003\f\u0006\u0000bc\u0005\u0004\u0000"+
		"\u0000cd\u0003\f\u0006\u0000d\u000b\u0001\u0000\u0000\u0000ek\u0003\u000e"+
		"\u0007\u0000fg\u0003\u0010\b\u0000gh\u0003\u000e\u0007\u0000hj\u0001\u0000"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\r\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000no\u0005!\u0000\u0000op\u0003\f\u0006\u0000"+
		"pq\u0005\"\u0000\u0000qt\u0001\u0000\u0000\u0000rt\u0005\u0017\u0000\u0000"+
		"sn\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u000f\u0001\u0000"+
		"\u0000\u0000uv\u0007\u0000\u0000\u0000v\u0011\u0001\u0000\u0000\u0000"+
		"wy\u0003$\u0012\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y{\u0001\u0000\u0000\u0000z|\u0003\u001e\u000f\u0000{z\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}\u007f\u0003"+
		"\"\u0011\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0016\u0000\u0000"+
		"\u0081\u0083\u0005\u001c\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000"+
		"\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u001d\u0000\u0000"+
		"\u0086\u0087\u0003\u0014\n\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088"+
		"\u008c\u0005!\u0000\u0000\u0089\u008b\u0003\u001a\r\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0003\u0018\f\u0000\u0090\u0091\u0005\"\u0000\u0000\u0091\u0015\u0001"+
		"\u0000\u0000\u0000\u0092\u0097\u0003\u001c\u000e\u0000\u0093\u0094\u0005"+
		" \u0000\u0000\u0094\u0096\u0003\u001c\u000e\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0017\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0007"+
		"\u0000\u0000\u009b\u00a0\u0003\u001c\u000e\u0000\u009c\u009d\u0005 \u0000"+
		"\u0000\u009d\u009f\u0003\u001c\u000e\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001f\u0000"+
		"\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0002\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0016\u0000\u0000\u00a7\u00a8\u0005\u001e\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0017\u0000\u0000\u00a9\u00aa\u0005\u001f\u0000"+
		"\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003 \u0010\u0000"+
		"\u00ac\u00ae\u0005\b\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\u0016\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0007\u0001\u0000\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0007\u0002\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0007\u0003\u0000\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u0018\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u0014\'1369@FLU\\ks"+
		"x{~\u0083\u008c\u0097\u00a0\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}