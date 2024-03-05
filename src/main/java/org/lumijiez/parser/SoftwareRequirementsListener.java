// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/SoftwareRequirements.g4 by ANTLR 4.13.1
package org.lumijiez.parser;
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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#requirementSpec}.
	 * @param ctx the parse tree
	 */
	void enterRequirementSpec(SoftwareRequirementsParser.RequirementSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#requirementSpec}.
	 * @param ctx the parse tree
	 */
	void exitRequirementSpec(SoftwareRequirementsParser.RequirementSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(SoftwareRequirementsParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(SoftwareRequirementsParser.DescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifier(SoftwareRequirementsParser.Access_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#access_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifier(SoftwareRequirementsParser.Access_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturn_types(SoftwareRequirementsParser.Return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturn_types(SoftwareRequirementsParser.Return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SoftwareRequirementsParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SoftwareRequirementsParser.ReturnContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SoftwareRequirementsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SoftwareRequirementsParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#access_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifiers(SoftwareRequirementsParser.Access_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#access_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifiers(SoftwareRequirementsParser.Access_modifiersContext ctx);
}