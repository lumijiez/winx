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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#program_body}.
	 * @param ctx the parse tree
	 */
	void enterProgram_body(SoftwareRequirementsParser.Program_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#program_body}.
	 * @param ctx the parse tree
	 */
	void exitProgram_body(SoftwareRequirementsParser.Program_bodyContext ctx);
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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#req_specification}.
	 * @param ctx the parse tree
	 */
	void enterReq_specification(SoftwareRequirementsParser.Req_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#req_specification}.
	 * @param ctx the parse tree
	 */
	void exitReq_specification(SoftwareRequirementsParser.Req_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#result_specification}.
	 * @param ctx the parse tree
	 */
	void enterResult_specification(SoftwareRequirementsParser.Result_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#result_specification}.
	 * @param ctx the parse tree
	 */
	void exitResult_specification(SoftwareRequirementsParser.Result_specificationContext ctx);
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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(SoftwareRequirementsParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(SoftwareRequirementsParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#input_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_types(SoftwareRequirementsParser.Input_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#input_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_types(SoftwareRequirementsParser.Input_typesContext ctx);
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
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(SoftwareRequirementsParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(SoftwareRequirementsParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(SoftwareRequirementsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(SoftwareRequirementsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SoftwareRequirementsParser#importance}.
	 * @param ctx the parse tree
	 */
	void enterImportance(SoftwareRequirementsParser.ImportanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SoftwareRequirementsParser#importance}.
	 * @param ctx the parse tree
	 */
	void exitImportance(SoftwareRequirementsParser.ImportanceContext ctx);
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
}