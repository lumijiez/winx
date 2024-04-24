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
	 * Visit a parse tree produced by {@link WinxParser#package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage(WinxParser.PackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(WinxParser.BodyContext ctx);
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
	 * Visit a parse tree produced by {@link WinxParser#impls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpls(WinxParser.ImplsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#spec_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec_body(WinxParser.Spec_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#requirement_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_spec(WinxParser.Requirement_specContext ctx);
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
	 * Visit a parse tree produced by {@link WinxParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(WinxParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(WinxParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#input_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_types(WinxParser.Input_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(WinxParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WinxParser#specification_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecification_entry(WinxParser.Specification_entryContext ctx);
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
	 * Visit a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_op(WinxParser.Logical_opContext ctx);
}