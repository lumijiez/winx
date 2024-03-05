package org.lumijiez.parser;// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/SoftwareRequirements.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SoftwareRequirementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SoftwareRequirementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SoftwareRequirementsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(SoftwareRequirementsParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SoftwareRequirementsParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SoftwareRequirementsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(SoftwareRequirementsParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(SoftwareRequirementsParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#functionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpec(SoftwareRequirementsParser.FunctionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(SoftwareRequirementsParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SoftwareRequirementsParser.ParameterContext ctx);
}