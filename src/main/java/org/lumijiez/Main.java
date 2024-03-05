package org.lumijiez;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.lumijiez.parser.SoftwareRequirementsBaseListener;
import org.lumijiez.parser.SoftwareRequirementsLexer;
import org.lumijiez.parser.SoftwareRequirementsParser;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        String input = new String(Files.readAllBytes(Path.of(Objects.requireNonNull(Main.class.getResource("/TestProgram.txt")).toURI())));

        CharStream inputStream = CharStreams.fromString(input);
        SoftwareRequirementsLexer lexer = new SoftwareRequirementsLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SoftwareRequirementsParser parser = new SoftwareRequirementsParser(tokenStream);

        ParseTreeWalker walker = new ParseTreeWalker();
        SoftwareReqParseTree listener = new SoftwareReqParseTree();
        walker.walk(listener, parser.program());
    }

    static class SoftwareReqParseTree extends SoftwareRequirementsBaseListener {
        @Override
        public void enterProgram(SoftwareRequirementsParser.ProgramContext ctx) {
            System.out.println("Parsed: " + ctx.getText());
        }
    }
}