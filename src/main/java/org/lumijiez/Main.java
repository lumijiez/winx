package org.lumijiez;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.lumijiez.parser.WinxBaseListener;
import org.lumijiez.parser.WinxLexer;
import org.lumijiez.parser.WinxParser;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String input = new String(Files.readAllBytes(Path.of(Objects.requireNonNull(Main.class.getResource("/TestProgram.txt")).toURI())));

        CharStream inputStream = CharStreams.fromString(input);
        WinxLexer lexer = new WinxLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        WinxParser parser = new WinxParser(tokenStream);

        ParseTreeWalker walker = new ParseTreeWalker();
        SoftwareReqParseTree listener = new SoftwareReqParseTree();
        walker.walk(listener, parser.winx());
    }

    static class SoftwareReqParseTree extends WinxBaseListener {
        @Override
        public void enterWinx(WinxParser.WinxContext ctx) {
            System.out.println("Parsed: " + ctx.getText());
        }
    }
}