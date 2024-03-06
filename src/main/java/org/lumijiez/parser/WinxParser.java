// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/Winx.g4 by ANTLR 4.13.1
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
public class WinxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, STRING=25, 
		DESCRIPTION=26, WS=27, INT=28, FLOAT=29, LPAREN=30, RPAREN=31, COLON=32, 
		SEMICOLON=33, COMMA=34, LBRACE=35, RBRACE=36, TILDE=37, EXCLAM=38;
	public static final int
		RULE_winx = 0, RULE_body = 1, RULE_package = 2, RULE_interface = 3, RULE_specification = 4, 
		RULE_interface_body = 5, RULE_specification_body = 6, RULE_requirementSpec = 7, 
		RULE_req_specification = 8, RULE_result_specification = 9, RULE_logical_op = 10, 
		RULE_functionSpec = 11, RULE_functionBody = 12, RULE_input_types = 13, 
		RULE_return_types = 14, RULE_specificationEntry = 15, RULE_variable = 16, 
		RULE_importance = 17, RULE_type = 18, RULE_access_modifiers = 19, RULE_description = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"winx", "body", "package", "interface", "specification", "interface_body", 
			"specification_body", "requirementSpec", "req_specification", "result_specification", 
			"logical_op", "functionSpec", "functionBody", "input_types", "return_types", 
			"specificationEntry", "variable", "importance", "type", "access_modifiers", 
			"description"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'interface'", "'specification'", "'implements'", 
			"'@'", "'result'", "'AND'", "'OR'", "'return'", "'[]'", "'critical'", 
			"'optional'", "'INT'", "'FLOAT'", "'DOUBLE'", "'STRING'", "'BOOLEAN'", 
			"'CHAR'", "'VOID'", "'public'", "'protected'", "'private'", "'default'", 
			null, null, null, null, null, null, "'('", "')'", "':'", "';'", "','", 
			"'{'", "'}'", "'~'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "STRING", "DESCRIPTION", "WS", "INT", "FLOAT", "LPAREN", "RPAREN", 
			"COLON", "SEMICOLON", "COMMA", "LBRACE", "RBRACE", "TILDE", "EXCLAM"
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
	public String getGrammarFileName() { return "Winx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WinxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WinxContext extends ParserRuleContext {
		public List<PackageContext> package_() {
			return getRuleContexts(PackageContext.class);
		}
		public PackageContext package_(int i) {
			return getRuleContext(PackageContext.class,i);
		}
		public List<TerminalNode> DESCRIPTION() { return getTokens(WinxParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(WinxParser.DESCRIPTION, i);
		}
		public WinxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_winx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterWinx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitWinx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitWinx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WinxContext winx() throws RecognitionException {
		WinxContext _localctx = new WinxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_winx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(42);
					package_();
					}
					break;
				case DESCRIPTION:
					{
					setState(43);
					match(DESCRIPTION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==DESCRIPTION );
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
	public static class BodyContext extends ParserRuleContext {
		public List<InterfaceContext> interface_() {
			return getRuleContexts(InterfaceContext.class);
		}
		public InterfaceContext interface_(int i) {
			return getRuleContext(InterfaceContext.class,i);
		}
		public List<SpecificationContext> specification() {
			return getRuleContexts(SpecificationContext.class);
		}
		public SpecificationContext specification(int i) {
			return getRuleContext(SpecificationContext.class,i);
		}
		public List<TerminalNode> DESCRIPTION() { return getTokens(WinxParser.DESCRIPTION); }
		public TerminalNode DESCRIPTION(int i) {
			return getToken(WinxParser.DESCRIPTION, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(51);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__10:
				case T__11:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(48);
					interface_();
					}
					break;
				case T__2:
					{
					setState(49);
					specification();
					}
					break;
				case DESCRIPTION:
					{
					setState(50);
					match(DESCRIPTION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 82843660L) != 0) );
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
	public static class PackageContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public PackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageContext package_() throws RecognitionException {
		PackageContext _localctx = new PackageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(ID);
			setState(57);
			match(LBRACE);
			setState(58);
			body();
			setState(59);
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
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Interface_bodyContext interface_body() {
			return getRuleContext(Interface_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public Access_modifiersContext access_modifiers() {
			return getRuleContext(Access_modifiersContext.class,0);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(61);
				importance();
				}
			}

			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				setState(64);
				access_modifiers();
				}
			}

			setState(67);
			match(T__1);
			setState(68);
			match(ID);
			setState(69);
			match(LBRACE);
			setState(70);
			interface_body();
			setState(71);
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
	public static class SpecificationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(WinxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WinxParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Specification_bodyContext specification_body() {
			return getRuleContext(Specification_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
			setState(74);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(75);
				match(T__3);
				setState(76);
				match(ID);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(LBRACE);
			setState(83);
			specification_body();
			setState(84);
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
	public static class Interface_bodyContext extends ParserRuleContext {
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
		public Interface_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterInterface_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitInterface_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitInterface_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_bodyContext interface_body() throws RecognitionException {
		Interface_bodyContext _localctx = new Interface_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interface_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(86);
					requirementSpec();
					}
					break;
				case 2:
					{
					setState(87);
					functionSpec();
					}
					break;
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 99620864L) != 0) );
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
	public static class Specification_bodyContext extends ParserRuleContext {
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
		public Specification_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterSpecification_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitSpecification_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitSpecification_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specification_bodyContext specification_body() throws RecognitionException {
		Specification_bodyContext _localctx = new Specification_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_specification_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(92);
					requirementSpec();
					}
					break;
				case 2:
					{
					setState(93);
					functionSpec();
					}
					break;
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 99620864L) != 0) );
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
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterRequirementSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitRequirementSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitRequirementSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementSpecContext requirementSpec() throws RecognitionException {
		RequirementSpecContext _localctx = new RequirementSpecContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_requirementSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(98);
				description();
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(101);
				importance();
				}
			}

			setState(104);
			match(ID);
			setState(105);
			match(LBRACE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6176L) != 0)) {
				{
				{
				setState(106);
				req_specification();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(112);
				result_specification();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public List<TerminalNode> ID() { return getTokens(WinxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WinxParser.ID, i);
		}
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterReq_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitReq_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitReq_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Req_specificationContext req_specification() throws RecognitionException {
		Req_specificationContext _localctx = new Req_specificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_req_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(120);
				importance();
				}
			}

			setState(123);
			match(T__4);
			setState(124);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(125);
				logical_op();
				setState(126);
				match(ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
		}
		public Result_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterResult_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitResult_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitResult_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_specificationContext result_specification() throws RecognitionException {
		Result_specificationContext _localctx = new Result_specificationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_result_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__5);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(136);
				importance();
				}
			}

			setState(139);
			match(ID);
			setState(140);
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
	public static class Logical_opContext extends ParserRuleContext {
		public Logical_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterLogical_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitLogical_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitLogical_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_opContext logical_op() throws RecognitionException {
		Logical_opContext _localctx = new Logical_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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
		public List<TerminalNode> ID() { return getTokens(WinxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(WinxParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(WinxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WinxParser.RPAREN, 0); }
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterFunctionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitFunctionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitFunctionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecContext functionSpec() throws RecognitionException {
		FunctionSpecContext _localctx = new FunctionSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPTION) {
				{
				setState(144);
				description();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(147);
				importance();
				}
			}

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) {
				{
				setState(150);
				access_modifiers();
				}
			}

			setState(153);
			match(ID);
			setState(154);
			match(LPAREN);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040384L) != 0)) {
				{
				setState(155);
				input_types();
				}
			}

			setState(158);
			match(RPAREN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(159);
				match(T__3);
				setState(160);
				match(ID);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public List<SpecificationEntryContext> specificationEntry() {
			return getRuleContexts(SpecificationEntryContext.class);
		}
		public SpecificationEntryContext specificationEntry(int i) {
			return getRuleContext(SpecificationEntryContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LBRACE);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(169);
				specificationEntry();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			return_types();
			setState(176);
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
		public List<TerminalNode> COMMA() { return getTokens(WinxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WinxParser.COMMA, i);
		}
		public Input_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterInput_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitInput_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitInput_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_typesContext input_types() throws RecognitionException {
		Input_typesContext _localctx = new Input_typesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			variable();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				variable();
				}
				}
				setState(185);
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
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(WinxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WinxParser.COMMA, i);
		}
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterReturn_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitReturn_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitReturn_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__8);
			setState(187);
			variable();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				variable();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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
	public static class SpecificationEntryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode COLON() { return getToken(WinxParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(WinxParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
		public SpecificationEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificationEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterSpecificationEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitSpecificationEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitSpecificationEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecificationEntryContext specificationEntry() throws RecognitionException {
		SpecificationEntryContext _localctx = new SpecificationEntryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_specificationEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__4);
			setState(198);
			match(ID);
			setState(199);
			match(COLON);
			setState(200);
			match(STRING);
			setState(201);
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
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			type();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(204);
				match(T__9);
				}
			}

			setState(207);
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterImportance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitImportance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitImportance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportanceContext importance() throws RecognitionException {
		ImportanceContext _localctx = new ImportanceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040384L) != 0)) ) {
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
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterAccess_modifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitAccess_modifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitAccess_modifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_modifiersContext access_modifiers() throws RecognitionException {
		Access_modifiersContext _localctx = new Access_modifiersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_access_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
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
		public TerminalNode DESCRIPTION() { return getToken(WinxParser.DESCRIPTION, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		"\u0004\u0001&\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0004"+
		"\u0005Y\b\u0005\u000b\u0005\f\u0005Z\u0001\u0006\u0001\u0006\u0004\u0006"+
		"_\b\u0006\u000b\u0006\f\u0006`\u0001\u0007\u0003\u0007d\b\u0007\u0001"+
		"\u0007\u0003\u0007g\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007l\b\u0007\n\u0007\f\u0007o\t\u0007\u0001\u0007\u0005\u0007r\b\u0007"+
		"\n\u0007\f\u0007u\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0003\bz\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0081\b\b\n\b\f\b\u0084"+
		"\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u008a\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0095\b\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009d\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00a2\b\u000b\n\u000b\f\u000b\u00a5\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f\u00ab\b\f\n\f\f\f\u00ae"+
		"\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b6\b\r"+
		"\n\r\f\r\u00b9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00bf\b\u000e\n\u000e\f\u000e\u00c2\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00ce\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(\u0000\u0004\u0001\u0000\u0007\b\u0001\u0000\u000b\f\u0001\u0000\r"+
		"\u0013\u0001\u0000\u0014\u0017\u00e0\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000"+
		"\f^\u0001\u0000\u0000\u0000\u000ec\u0001\u0000\u0000\u0000\u0010y\u0001"+
		"\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u008e\u0001"+
		"\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u00a8\u0001"+
		"\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00ba\u0001"+
		"\u0000\u0000\u0000\u001e\u00c5\u0001\u0000\u0000\u0000 \u00cb\u0001\u0000"+
		"\u0000\u0000\"\u00d1\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000\u0000"+
		"\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00d7\u0001\u0000\u0000\u0000*"+
		"-\u0003\u0004\u0002\u0000+-\u0005\u001a\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/\u0001\u0001\u0000\u0000\u0000"+
		"04\u0003\u0006\u0003\u000014\u0003\b\u0004\u000024\u0005\u001a\u0000\u0000"+
		"30\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0003\u0001\u0000\u0000\u000078\u0005\u0001\u0000\u0000"+
		"89\u0005\u0018\u0000\u00009:\u0005#\u0000\u0000:;\u0003\u0002\u0001\u0000"+
		";<\u0005$\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=?\u0003\"\u0011\u0000"+
		">=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"+
		"\u0000@B\u0003&\u0013\u0000A@\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0002\u0000\u0000DE\u0005\u0018"+
		"\u0000\u0000EF\u0005#\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005$\u0000"+
		"\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0003\u0000\u0000JO\u0005"+
		"\u0018\u0000\u0000KL\u0005\u0004\u0000\u0000LN\u0005\u0018\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RS\u0005#\u0000\u0000ST\u0003\f\u0006\u0000TU\u0005$\u0000"+
		"\u0000U\t\u0001\u0000\u0000\u0000VY\u0003\u000e\u0007\u0000WY\u0003\u0016"+
		"\u000b\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\u000b\u0001\u0000\u0000\u0000\\_\u0003\u000e\u0007\u0000]_\u0003\u0016"+
		"\u000b\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a\r\u0001\u0000\u0000\u0000bd\u0003(\u0014\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000eg\u0003\"\u0011\u0000"+
		"fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hi\u0005\u0018\u0000\u0000im\u0005#\u0000\u0000jl\u0003\u0010\b"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000ns\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pr\u0003\u0012\t\u0000qp\u0001\u0000\u0000\u0000ru\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005$\u0000\u0000"+
		"w\u000f\u0001\u0000\u0000\u0000xz\u0003\"\u0011\u0000yx\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0005"+
		"\u0000\u0000|\u0082\u0005\u0018\u0000\u0000}~\u0003\u0014\n\u0000~\u007f"+
		"\u0005\u0018\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080}\u0001"+
		"\u0000\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"!\u0000\u0000\u0086\u0011\u0001\u0000\u0000\u0000\u0087\u0089\u0005\u0006"+
		"\u0000\u0000\u0088\u008a\u0003\"\u0011\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005\u0018\u0000\u0000\u008c\u008d\u0005!\u0000\u0000"+
		"\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0007\u0000\u0000\u0000"+
		"\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0092\u0003(\u0014\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0001\u0000\u0000\u0000\u0093\u0095\u0003\"\u0011\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0001\u0000\u0000\u0000\u0096\u0098\u0003&\u0013\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0005\u0018\u0000\u0000\u009a\u009c\u0005"+
		"\u001e\u0000\u0000\u009b\u009d\u0003\u001a\r\u0000\u009c\u009b\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a3\u0005\u001f\u0000\u0000\u009f\u00a0\u0005\u0004"+
		"\u0000\u0000\u00a0\u00a2\u0005\u0018\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u0018"+
		"\f\u0000\u00a7\u0017\u0001\u0000\u0000\u0000\u00a8\u00ac\u0005#\u0000"+
		"\u0000\u00a9\u00ab\u0003\u001e\u000f\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u001c\u000e"+
		"\u0000\u00b0\u00b1\u0005$\u0000\u0000\u00b1\u0019\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b7\u0003 \u0010\u0000\u00b3\u00b4\u0005\"\u0000\u0000\u00b4"+
		"\u00b6\u0003 \u0010\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\t\u0000\u0000\u00bb\u00c0\u0003"+
		" \u0010\u0000\u00bc\u00bd\u0005\"\u0000\u0000\u00bd\u00bf\u0003 \u0010"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005!\u0000\u0000\u00c4\u001d\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00c7\u0005\u0018\u0000\u0000"+
		"\u00c7\u00c8\u0005 \u0000\u0000\u00c8\u00c9\u0005\u0019\u0000\u0000\u00c9"+
		"\u00ca\u0005!\u0000\u0000\u00ca\u001f\u0001\u0000\u0000\u0000\u00cb\u00cd"+
		"\u0003$\u0012\u0000\u00cc\u00ce\u0005\n\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\u0018\u0000\u0000\u00d0!\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0007\u0001\u0000\u0000\u00d2#\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0007\u0002\u0000\u0000\u00d4%\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0007\u0003\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005\u001a\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000\u001b,."+
		"35>AOXZ^`cfmsy\u0082\u0089\u0091\u0094\u0097\u009c\u00a3\u00ac\u00b7\u00c0"+
		"\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}