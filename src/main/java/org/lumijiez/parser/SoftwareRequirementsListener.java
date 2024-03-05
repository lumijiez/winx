package org.lumijiez.parser;// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/SoftwareRequirements.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SoftwareRequirementsParser}.
 */
public interface SoftwareRequirementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SoftwareRequirementsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SoftwareRequirementsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(SoftwareRequirementsParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(SoftwareRequirementsParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SoftwareRequirementsParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SoftwareRequirementsParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SoftwareRequirementsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SoftwareRequirementsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SoftwareRequirementsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SoftwareRequirementsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(SoftwareRequirementsParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(SoftwareRequirementsParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#functionSpec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpec(SoftwareRequirementsParser.FunctionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#functionSpec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpec(SoftwareRequirementsParser.FunctionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(SoftwareRequirementsParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(SoftwareRequirementsParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SoftwareRequirementsParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SoftwareRequirementsParser.ParameterContext ctx);
}