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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, ID=24, INT=25, 
		FLOAT=26, STRING=27, WS=28, COMMENT=29, LINE_COMMENT=30, LPAREN=31, RPAREN=32, 
		COLON=33, SEMICOLON=34, COMMA=35, LBRACE=36, RBRACE=37, TILDE=38, EXCLAM=39;
	public static final int
		RULE_winx = 0, RULE_package = 1, RULE_body = 2, RULE_interface = 3, RULE_specification = 4, 
		RULE_impls = 5, RULE_spec_body = 6, RULE_requirement_spec = 7, RULE_req_specification = 8, 
		RULE_result_specification = 9, RULE_function_spec = 10, RULE_function_body = 11, 
		RULE_input_types = 12, RULE_return_type = 13, RULE_specification_entry = 14, 
		RULE_variable = 15, RULE_importance = 16, RULE_type = 17, RULE_access_modifiers = 18, 
		RULE_logical_op = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"winx", "package", "body", "interface", "specification", "impls", "spec_body", 
			"requirement_spec", "req_specification", "result_specification", "function_spec", 
			"function_body", "input_types", "return_type", "specification_entry", 
			"variable", "importance", "type", "access_modifiers", "logical_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'interface'", "'specification'", "'implements'", 
			"'@'", "'result'", "'return'", "'[]'", "'critical'", "'optional'", "'INT'", 
			"'FLOAT'", "'DOUBLE'", "'STRING'", "'BOOLEAN'", "'CHAR'", "'VOID'", "'public'", 
			"'protected'", "'private'", "'default'", "'AND'", "'OR'", null, null, 
			null, null, null, null, null, "'('", "')'", "':'", "';'", "','", "'{'", 
			"'}'", "'~'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ID", "INT", "FLOAT", "STRING", "WS", "COMMENT", "LINE_COMMENT", "LPAREN", 
			"RPAREN", "COLON", "SEMICOLON", "COMMA", "LBRACE", "RBRACE", "TILDE", 
			"EXCLAM"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				package_();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
		enterRule(_localctx, 2, RULE_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			match(ID);
			setState(47);
			match(LBRACE);
			setState(48);
			body();
			setState(49);
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
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1548L) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__8:
				case T__9:
					{
					setState(51);
					interface_();
					}
					break;
				case T__2:
					{
					setState(52);
					specification();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
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
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public ImportanceContext importance() {
			return getRuleContext(ImportanceContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(58);
				importance();
				}
			}

			setState(61);
			match(T__1);
			setState(62);
			match(ID);
			setState(63);
			match(LBRACE);
			setState(64);
			spec_body();
			setState(65);
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
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Spec_bodyContext spec_body() {
			return getRuleContext(Spec_bodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public ImplsContext impls() {
			return getRuleContext(ImplsContext.class,0);
		}
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
			setState(67);
			match(T__2);
			setState(68);
			match(ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(69);
				impls();
				}
			}

			setState(72);
			match(LBRACE);
			setState(73);
			spec_body();
			setState(74);
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
	public static class ImplsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public ImplsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterImpls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitImpls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitImpls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplsContext impls() throws RecognitionException {
		ImplsContext _localctx = new ImplsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_impls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(76);
			match(T__3);
			setState(77);
			match(ID);
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
	public static class Spec_bodyContext extends ParserRuleContext {
		public List<Requirement_specContext> requirement_spec() {
			return getRuleContexts(Requirement_specContext.class);
		}
		public Requirement_specContext requirement_spec(int i) {
			return getRuleContext(Requirement_specContext.class,i);
		}
		public List<Function_specContext> function_spec() {
			return getRuleContexts(Function_specContext.class);
		}
		public Function_specContext function_spec(int i) {
			return getRuleContext(Function_specContext.class,i);
		}
		public Spec_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterSpec_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitSpec_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitSpec_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_bodyContext spec_body() throws RecognitionException {
		Spec_bodyContext _localctx = new Spec_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_spec_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 20710912L) != 0)) {
				{
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(79);
					requirement_spec();
					}
					break;
				case 2:
					{
					setState(80);
					function_spec();
					}
					break;
				}
				}
				setState(85);
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
	public static class Requirement_specContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
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
		public Requirement_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterRequirement_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitRequirement_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitRequirement_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_specContext requirement_spec() throws RecognitionException {
		Requirement_specContext _localctx = new Requirement_specContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_requirement_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(86);
				importance();
				}
			}

			setState(89);
			match(ID);
			setState(90);
			match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1568L) != 0)) {
				{
				{
				setState(91);
				req_specification();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(97);
				result_specification();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(105);
				importance();
				}
			}

			setState(108);
			match(T__4);
			setState(109);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__22) {
				{
				{
				setState(110);
				logical_op();
				setState(111);
				match(ID);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
			setState(120);
			match(T__5);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(121);
				importance();
				}
			}

			setState(124);
			match(ID);
			setState(125);
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
	public static class Function_specContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(WinxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(WinxParser.RPAREN, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
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
		public ImplsContext impls() {
			return getRuleContext(ImplsContext.class,0);
		}
		public Function_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterFunction_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitFunction_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitFunction_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_specContext function_spec() throws RecognitionException {
		Function_specContext _localctx = new Function_specContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__9) {
				{
				setState(127);
				importance();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) {
				{
				setState(130);
				access_modifiers();
				}
			}

			setState(133);
			match(ID);
			setState(134);
			match(LPAREN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134477824L) != 0)) {
				{
				setState(135);
				input_types();
				}
			}

			setState(138);
			match(RPAREN);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(139);
				impls();
				}
			}

			setState(142);
			function_body();
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
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(WinxParser.LBRACE, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(WinxParser.RBRACE, 0); }
		public List<Specification_entryContext> specification_entry() {
			return getRuleContexts(Specification_entryContext.class);
		}
		public Specification_entryContext specification_entry(int i) {
			return getRuleContext(Specification_entryContext.class,i);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(145);
				specification_entry();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			return_type();
			setState(152);
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
		enterRule(_localctx, 24, RULE_input_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			variable();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				variable();
				}
				}
				setState(161);
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
	public static class Return_typeContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__6);
			setState(163);
			variable();
			setState(164);
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
	public static class Specification_entryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WinxParser.ID, 0); }
		public TerminalNode COLON() { return getToken(WinxParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(WinxParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(WinxParser.SEMICOLON, 0); }
		public Specification_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification_entry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).enterSpecification_entry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WinxListener ) ((WinxListener)listener).exitSpecification_entry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WinxVisitor ) return ((WinxVisitor<? extends T>)visitor).visitSpecification_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specification_entryContext specification_entry() throws RecognitionException {
		Specification_entryContext _localctx = new Specification_entryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_specification_entry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__4);
			setState(167);
			match(ID);
			setState(168);
			match(COLON);
			setState(169);
			match(STRING);
			setState(170);
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
		enterRule(_localctx, 30, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			type();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(173);
				match(T__7);
				}
			}

			setState(176);
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
		enterRule(_localctx, 32, RULE_importance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		public TerminalNode STRING() { return getToken(WinxParser.STRING, 0); }
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134477824L) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_access_modifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
		enterRule(_localctx, 38, RULE_logical_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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
		"\u0004\u0001\'\u00bb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u0002"+
		"9\t\u0002\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005"+
		"\u0006R\b\u0006\n\u0006\f\u0006U\t\u0006\u0001\u0007\u0003\u0007X\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007]\b\u0007\n\u0007\f\u0007"+
		"`\t\u0007\u0001\u0007\u0005\u0007c\b\u0007\n\u0007\f\u0007f\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\bk\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\br\b\b\n\b\f\bu\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003"+
		"\t{\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0003\n\u0081\b\n\u0001\n\u0003"+
		"\n\u0084\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0089\b\n\u0001\n\u0001\n"+
		"\u0003\n\u008d\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0093\b\u000b\n\u000b\f\u000b\u0096\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u009e\b\f\n\f\f\f\u00a1\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00af\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\t\n\u0002\u0000\u000b"+
		"\u0011\u001b\u001b\u0001\u0000\u0012\u0015\u0001\u0000\u0016\u0017\u00ba"+
		"\u0000)\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00047"+
		"\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\bC\u0001\u0000"+
		"\u0000\u0000\nL\u0001\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000e"+
		"W\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000\u0012x\u0001"+
		"\u0000\u0000\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0090\u0001"+
		"\u0000\u0000\u0000\u0018\u009a\u0001\u0000\u0000\u0000\u001a\u00a2\u0001"+
		"\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00ac\u0001"+
		"\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b4\u0001\u0000"+
		"\u0000\u0000$\u00b6\u0001\u0000\u0000\u0000&\u00b8\u0001\u0000\u0000\u0000"+
		"(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0001\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005\u0018\u0000\u0000"+
		"/0\u0005$\u0000\u000001\u0003\u0004\u0002\u000012\u0005%\u0000\u00002"+
		"\u0003\u0001\u0000\u0000\u000036\u0003\u0006\u0003\u000046\u0003\b\u0004"+
		"\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\u0005"+
		"\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:<\u0003 \u0010\u0000"+
		";:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0002\u0000\u0000>?\u0005\u0018\u0000\u0000?@\u0005$\u0000"+
		"\u0000@A\u0003\f\u0006\u0000AB\u0005%\u0000\u0000B\u0007\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0003\u0000\u0000DF\u0005\u0018\u0000\u0000EG\u0003\n\u0005"+
		"\u0000FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0005$\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0005%\u0000"+
		"\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0004\u0000\u0000MN\u0005\u0018"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OR\u0003\u000e\u0007\u0000"+
		"PR\u0003\u0014\n\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\r\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VX\u0003 \u0010"+
		"\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0005\u0018\u0000\u0000Z^\u0005$\u0000\u0000[]\u0003\u0010"+
		"\b\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_d\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000ba\u0001\u0000\u0000\u0000"+
		"cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005%\u0000"+
		"\u0000h\u000f\u0001\u0000\u0000\u0000ik\u0003 \u0010\u0000ji\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005"+
		"\u0005\u0000\u0000ms\u0005\u0018\u0000\u0000no\u0003&\u0013\u0000op\u0005"+
		"\u0018\u0000\u0000pr\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005\"\u0000"+
		"\u0000w\u0011\u0001\u0000\u0000\u0000xz\u0005\u0006\u0000\u0000y{\u0003"+
		" \u0010\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0018\u0000\u0000}~\u0005\"\u0000\u0000~\u0013"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0003 \u0010\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0003$\u0012\u0000\u0083\u0082\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0018\u0000\u0000\u0086\u0088\u0005\u001f"+
		"\u0000\u0000\u0087\u0089\u0003\u0018\f\u0000\u0088\u0087\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008c\u0005 \u0000\u0000\u008b\u008d\u0003\n\u0005\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0003\u0016\u000b\u0000"+
		"\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0094\u0005$\u0000\u0000\u0091"+
		"\u0093\u0003\u001c\u000e\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u0099"+
		"\u0005%\u0000\u0000\u0099\u0017\u0001\u0000\u0000\u0000\u009a\u009f\u0003"+
		"\u001e\u000f\u0000\u009b\u009c\u0005#\u0000\u0000\u009c\u009e\u0003\u001e"+
		"\u000f\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u00a4\u0003\u001e"+
		"\u000f\u0000\u00a4\u00a5\u0005\"\u0000\u0000\u00a5\u001b\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0005\u0000\u0000\u00a7\u00a8\u0005\u0018\u0000"+
		"\u0000\u00a8\u00a9\u0005!\u0000\u0000\u00a9\u00aa\u0005\u001b\u0000\u0000"+
		"\u00aa\u00ab\u0005\"\u0000\u0000\u00ab\u001d\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0003\"\u0011\u0000\u00ad\u00af\u0005\b\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0018\u0000\u0000\u00b1\u001f"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0007\u0000\u0000\u0000\u00b3!\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0007\u0001\u0000\u0000\u00b5#\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0007\u0002\u0000\u0000\u00b7%\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0007\u0003\u0000\u0000\u00b9\'\u0001\u0000\u0000\u0000"+
		"\u0014+57;FQSW^djsz\u0080\u0083\u0088\u008c\u0094\u009f\u00ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}