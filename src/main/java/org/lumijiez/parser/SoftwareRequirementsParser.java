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
		ID=18, STRING=19, DESCRIPTION=20, WS=21, INT=22, FLOAT=23, LPAREN=24, 
		RPAREN=25, COLON=26, SEMICOLON=27, COMMA=28, LBRACE=29, RBRACE=30, TILDE=31, 
		EXCLAM=32;
	public static final int
		RULE_program = 0, RULE_requirementSpec = 1, RULE_description = 2, RULE_predicate = 3, 
		RULE_expression = 4, RULE_term = 5, RULE_logical_op = 6, RULE_functionSpec = 7, 
		RULE_access_modifier = 8, RULE_return_types = 9, RULE_return = 10, RULE_parameter_list = 11, 
		RULE_parameter = 12, RULE_type = 13, RULE_access_modifiers = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "requirementSpec", "description", "predicate", "expression", 
			"term", "logical_op", "functionSpec", "access_modifier", "return_types", 
			"return", "parameter_list", "parameter", "type", "access_modifiers"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'=>'", "'&&'", "'||'", "'()'", "'Access '", "'Return'", "'INT'", 
			"'FLOAT'", "'DOUBLE'", "'STRING'", "'BOOLEAN'", "'CHAR'", "'VOID'", "'PUBLIC'", 
			"'PROTECTED'", "'PRIVATE'", "'DEFAULT'", null, null, null, null, null, 
			null, "'('", "')'", "':'", "';'", "','", "'{'", "'}'", "'~'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "STRING", "DESCRIPTION", "WS", 
			"INT", "FLOAT", "LPAREN", "RPAREN", "COLON", "SEMICOLON", "COMMA", "LBRACE", 
			"RBRACE", "TILDE", "EXCLAM"
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
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30);
					requirementSpec();
					}
					break;
				case 2:
					{
					setState(31);
					functionSpec();
					}
					break;
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==EXCLAM );
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
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public TerminalNode EXCLAM() { return getToken(SoftwareRequirementsParser.EXCLAM, 0); }
		public TerminalNode COLON() { return getToken(SoftwareRequirementsParser.COLON, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
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
		enterRule(_localctx, 2, RULE_requirementSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAM) {
				{
				setState(36);
				match(EXCLAM);
				}
			}

			setState(39);
			match(ID);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(40);
				match(COLON);
				setState(41);
				description();
				}
			}

			setState(44);
			predicate();
			setState(45);
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
		enterRule(_localctx, 4, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		enterRule(_localctx, 6, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			expression();
			setState(50);
			match(T__0);
			setState(51);
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
		enterRule(_localctx, 8, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			term();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				{
				setState(54);
				logical_op();
				setState(55);
				term();
				}
				}
				setState(61);
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
		enterRule(_localctx, 10, RULE_term);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(LBRACE);
				setState(63);
				expression();
				setState(64);
				match(RBRACE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
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
		enterRule(_localctx, 12, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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
		public TerminalNode COLON() { return getToken(SoftwareRequirementsParser.COLON, 0); }
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SoftwareRequirementsParser.LBRACE, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SoftwareRequirementsParser.RBRACE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public TerminalNode EXCLAM() { return getToken(SoftwareRequirementsParser.EXCLAM, 0); }
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public Access_modifierContext access_modifier() {
			return getRuleContext(Access_modifierContext.class,0);
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
		enterRule(_localctx, 14, RULE_functionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAM) {
				{
				setState(71);
				match(EXCLAM);
				}
			}

			setState(74);
			match(ID);
			setState(75);
			match(T__3);
			setState(76);
			match(COLON);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(77);
				description();
				}
			}

			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(80);
				access_modifier();
				}
			}

			setState(83);
			return_types();
			setState(84);
			match(LBRACE);
			setState(85);
			parameter_list();
			setState(86);
			match(RBRACE);
			setState(87);
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
	public static class Access_modifierContext extends ParserRuleContext {
		public Access_modifiersContext access_modifiers() {
			return getRuleContext(Access_modifiersContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SoftwareRequirementsParser.SEMICOLON, 0); }
		public Access_modifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterAccess_modifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitAccess_modifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitAccess_modifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifierContext access_modifier() throws RecognitionException {
		Access_modifierContext _localctx = new Access_modifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_access_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__4);
			setState(90);
			access_modifiers();
			setState(91);
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
	public static class Return_typesContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SoftwareRequirementsParser.LPAREN, 0); }
		public List<ReturnContext> return_() {
			return getRuleContexts(ReturnContext.class);
		}
		public ReturnContext return_(int i) {
			return getRuleContext(ReturnContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(SoftwareRequirementsParser.RPAREN, 0); }
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
		enterRule(_localctx, 18, RULE_return_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__5);
			setState(94);
			match(LPAREN);
			setState(95);
			return_();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				return_();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(RPAREN);
			setState(104);
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
	public static class ReturnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SoftwareRequirementsParser.ID, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			type();
			setState(107);
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
	public static class Parameter_listContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SoftwareRequirementsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SoftwareRequirementsParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			parameter();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				parameter();
				}
				}
				setState(116);
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
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(SoftwareRequirementsParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SoftwareRequirementsParser.STRING, i);
		}
		public TerminalNode COLON() { return getToken(SoftwareRequirementsParser.COLON, 0); }
		public TerminalNode INT() { return getToken(SoftwareRequirementsParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SoftwareRequirementsParser.FLOAT, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SoftwareRequirementsListener ) ((SoftwareRequirementsListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SoftwareRequirementsVisitor ) return ((SoftwareRequirementsVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(STRING);
			setState(118);
			match(COLON);
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13107200L) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16256L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_access_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
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
		"\u0004\u0001 ~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000\u0004"+
		"\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0001\u0003\u0001&\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004:\b\u0004\n\u0004\f\u0004=\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005D\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007I\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007O\b\u0007\u0001\u0007\u0003\u0007"+
		"R\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\tc\b\t\n\t\f\tf\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bq\b\u000b\n"+
		"\u000b\f\u000bt\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004"+
		"\u0001\u0000\u0002\u0003\u0002\u0000\u0013\u0013\u0016\u0017\u0001\u0000"+
		"\u0007\r\u0001\u0000\u000e\u0011y\u0000 \u0001\u0000\u0000\u0000\u0002"+
		"%\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u00061\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\nC\u0001\u0000\u0000\u0000"+
		"\fE\u0001\u0000\u0000\u0000\u000eH\u0001\u0000\u0000\u0000\u0010Y\u0001"+
		"\u0000\u0000\u0000\u0012]\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000"+
		"\u0000\u0016m\u0001\u0000\u0000\u0000\u0018u\u0001\u0000\u0000\u0000\u001a"+
		"y\u0001\u0000\u0000\u0000\u001c{\u0001\u0000\u0000\u0000\u001e!\u0003"+
		"\u0002\u0001\u0000\u001f!\u0003\u000e\u0007\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0001\u0001\u0000\u0000"+
		"\u0000$&\u0005 \u0000\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'*\u0005\u0012\u0000\u0000()\u0005\u001a"+
		"\u0000\u0000)+\u0003\u0004\u0002\u0000*(\u0001\u0000\u0000\u0000*+\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003\u0006\u0003\u0000"+
		"-.\u0005\u001b\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u0014"+
		"\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0003\b\u0004\u000023\u0005"+
		"\u0001\u0000\u000034\u0003\b\u0004\u00004\u0007\u0001\u0000\u0000\u0000"+
		"5;\u0003\n\u0005\u000067\u0003\f\u0006\u000078\u0003\n\u0005\u00008:\u0001"+
		"\u0000\u0000\u000096\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\t\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>?\u0005\u001d\u0000\u0000?@\u0003\b\u0004"+
		"\u0000@A\u0005\u001e\u0000\u0000AD\u0001\u0000\u0000\u0000BD\u0005\u0013"+
		"\u0000\u0000C>\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u000b"+
		"\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000F\r\u0001\u0000\u0000"+
		"\u0000GI\u0005 \u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0012\u0000\u0000KL\u0005\u0004"+
		"\u0000\u0000LN\u0005\u001a\u0000\u0000MO\u0003\u0004\u0002\u0000NM\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000"+
		"PR\u0003\u0010\b\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000ST\u0003\u0012\t\u0000TU\u0005\u001d\u0000\u0000"+
		"UV\u0003\u0016\u000b\u0000VW\u0005\u001e\u0000\u0000WX\u0005\u001b\u0000"+
		"\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000\u0000Z[\u0003"+
		"\u001c\u000e\u0000[\\\u0005\u001b\u0000\u0000\\\u0011\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0006\u0000\u0000^_\u0005\u0018\u0000\u0000_d\u0003\u0014"+
		"\n\u0000`a\u0005\u001c\u0000\u0000ac\u0003\u0014\n\u0000b`\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0019\u0000\u0000hi\u0005\u001b\u0000\u0000i\u0013\u0001\u0000"+
		"\u0000\u0000jk\u0003\u001a\r\u0000kl\u0005\u0012\u0000\u0000l\u0015\u0001"+
		"\u0000\u0000\u0000mr\u0003\u0018\f\u0000no\u0005\u001c\u0000\u0000oq\u0003"+
		"\u0018\f\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0017\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0013\u0000\u0000vw\u0005\u001a"+
		"\u0000\u0000wx\u0007\u0001\u0000\u0000x\u0019\u0001\u0000\u0000\u0000"+
		"yz\u0007\u0002\u0000\u0000z\u001b\u0001\u0000\u0000\u0000{|\u0007\u0003"+
		"\u0000\u0000|\u001d\u0001\u0000\u0000\u0000\u000b \"%*;CHNQdr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}