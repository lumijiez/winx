// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/SoftwareRequirements.g4 by ANTLR 4.13.1
package org.lumijiez.parser;
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
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#program_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_body(SoftwareRequirementsParser.Program_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#requirementSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementSpec(SoftwareRequirementsParser.RequirementSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#req_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReq_specification(SoftwareRequirementsParser.Req_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#result_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_specification(SoftwareRequirementsParser.Result_specificationContext ctx);
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
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(SoftwareRequirementsParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#input_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_types(SoftwareRequirementsParser.Input_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_types(SoftwareRequirementsParser.Return_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(SoftwareRequirementsParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(SoftwareRequirementsParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#importance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportance(SoftwareRequirementsParser.ImportanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SoftwareRequirementsParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#access_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifiers(SoftwareRequirementsParser.Access_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SoftwareRequirementsParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(SoftwareRequirementsParser.DescriptionContext ctx);
}