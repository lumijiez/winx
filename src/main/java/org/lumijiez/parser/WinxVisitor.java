// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/Winx.g4 by ANTLR 4.13.1
package org.lumijiez.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WinxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WinxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WinxParser#winx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWinx(WinxParser.WinxContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(WinxParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(WinxParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(WinxParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification(WinxParser.SpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#interface_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(WinxParser.Interface_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#specification_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification_body(WinxParser.Specification_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#requirementSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementSpec(WinxParser.RequirementSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#req_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReq_specification(WinxParser.Req_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#result_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_specification(WinxParser.Result_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(WinxParser.Logical_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#functionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpec(WinxParser.FunctionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(WinxParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#input_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_types(WinxParser.Input_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#return_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_types(WinxParser.Return_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#specificationEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificationEntry(WinxParser.SpecificationEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(WinxParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#importance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportance(WinxParser.ImportanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(WinxParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#access_modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modifiers(WinxParser.Access_modifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(WinxParser.DescriptionContext ctx);
}