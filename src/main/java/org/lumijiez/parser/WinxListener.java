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
	 * Enter a parse tree produced by {@link WinxParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(WinxParser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(WinxParser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#specification_body}.
	 * @param ctx the parse tree
	 */
	void enterSpecification_body(WinxParser.Specification_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#specification_body}.
	 * @param ctx the parse tree
	 */
	void exitSpecification_body(WinxParser.Specification_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#requirementSpec}.
	 * @param ctx the parse tree
	 */
	void enterRequirementSpec(WinxParser.RequirementSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#requirementSpec}.
	 * @param ctx the parse tree
	 */
	void exitRequirementSpec(WinxParser.RequirementSpecContext ctx);
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
	 * Enter a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void enterLogical_op(WinxParser.Logical_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#logical_op}.
	 * @param ctx the parse tree
	 */
	void exitLogical_op(WinxParser.Logical_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#functionSpec}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpec(WinxParser.FunctionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#functionSpec}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpec(WinxParser.FunctionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(WinxParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(WinxParser.FunctionBodyContext ctx);
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
	 * Enter a parse tree produced by {@link WinxParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturn_types(WinxParser.Return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturn_types(WinxParser.Return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WinxParser#specificationEntry}.
	 * @param ctx the parse tree
	 */
	void enterSpecificationEntry(WinxParser.SpecificationEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#specificationEntry}.
	 * @param ctx the parse tree
	 */
	void exitSpecificationEntry(WinxParser.SpecificationEntryContext ctx);
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
	 * Enter a parse tree produced by {@link WinxParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(WinxParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WinxParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(WinxParser.DescriptionContext ctx);
}