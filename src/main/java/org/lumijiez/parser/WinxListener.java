// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/Winx.g4 by ANTLR 4.13.1
package org.lumijiez.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WinxParser}.
 */
public interface WinxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WinxParser#winx}.
	 * @param ctx the parse tree
	 */
	void enterWinx(WinxParser.WinxContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#winx}.
	 * @param ctx the parse tree
	 */
	void exitWinx(WinxParser.WinxContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#package}.
	 * @param ctx the parse tree
	 */
	void enterPackage(WinxParser.PackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#package}.
	 * @param ctx the parse tree
	 */
	void exitPackage(WinxParser.PackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(WinxParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(WinxParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(WinxParser.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(WinxParser.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(WinxParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(WinxParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#impls}.
	 * @param ctx the parse tree
	 */
	void enterImpls(WinxParser.ImplsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#impls}.
	 * @param ctx the parse tree
	 */
	void exitImpls(WinxParser.ImplsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void enterSpec_body(WinxParser.Spec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#spec_body}.
	 * @param ctx the parse tree
	 */
	void exitSpec_body(WinxParser.Spec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#requirement_spec}.
	 * @param ctx the parse tree
	 */
	void enterRequirement_spec(WinxParser.Requirement_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#requirement_spec}.
	 * @param ctx the parse tree
	 */
	void exitRequirement_spec(WinxParser.Requirement_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#req_specification}.
	 * @param ctx the parse tree
	 */
	void enterReq_specification(WinxParser.Req_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#req_specification}.
	 * @param ctx the parse tree
	 */
	void exitReq_specification(WinxParser.Req_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#result_specification}.
	 * @param ctx the parse tree
	 */
	void enterResult_specification(WinxParser.Result_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#result_specification}.
	 * @param ctx the parse tree
	 */
	void exitResult_specification(WinxParser.Result_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(WinxParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(WinxParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(WinxParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(WinxParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#input_types}.
	 * @param ctx the parse tree
	 */
	void enterInput_types(WinxParser.Input_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#input_types}.
	 * @param ctx the parse tree
	 */
	void exitInput_types(WinxParser.Input_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(WinxParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(WinxParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#specification_entry}.
	 * @param ctx the parse tree
	 */
	void enterSpecification_entry(WinxParser.Specification_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#specification_entry}.
	 * @param ctx the parse tree
	 */
	void exitSpecification_entry(WinxParser.Specification_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(WinxParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(WinxParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#importance}.
	 * @param ctx the parse tree
	 */
	void enterImportance(WinxParser.ImportanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#importance}.
	 * @param ctx the parse tree
	 */
	void exitImportance(WinxParser.ImportanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(WinxParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(WinxParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#access_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccess_modifiers(WinxParser.Access_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#access_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccess_modifiers(WinxParser.Access_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(WinxParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(WinxParser.Logical_opContext ctx);
}