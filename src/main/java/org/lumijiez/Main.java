package org.lumijiez;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.lumijiez.parser.HelloWorldBaseListener;
import org.lumijiez.parser.HelloWorldLexer;
import org.lumijiez.parser.HelloWorldParser;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World!";
        CharStream inputStream = CharStreams.fromString(input);
        HelloWorldLexer lexer = new HelloWorldLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        HelloWorldParser parser = new HelloWorldParser(tokenStream);

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener, parser.start());
    }

    static class MyListener extends HelloWorldBaseListener {
        @Override
        public void enterStart(HelloWorldParser.StartContext ctx) {
            System.out.println("Parsed: " + ctx.getText());
        }
    }
}