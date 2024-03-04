package org.lumijiez.parser;// Generated from D:/Source/JavaProjects/dsl-formal-requirements/src/grammars/HelloWorld.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloWorldParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloWorldVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloWorldParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HelloWorldParser.StartContext ctx);
}