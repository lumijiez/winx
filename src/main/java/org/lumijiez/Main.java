package org.lumijiez;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lumijiez.models.Package;
import org.lumijiez.parser.WinxLexer;
import org.lumijiez.parser.WinxParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        try {
            // Load the input from a resource file
            Path inputPath = Path.of(Objects.requireNonNull(Main.class.getResource("/TestProgram.txt")).toURI());
            String input = Files.readString(inputPath);

            // Initialize ANTLR components
            CharStream inputStream = CharStreams.fromString(input);
            WinxLexer lexer = new WinxLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            WinxParser parser = new WinxParser(tokenStream);

            // Parsing the input
            ParseTree tree = parser.winx();

            // Creating and using the collector to process the parse tree
            WinxCollector collector = new WinxCollector();
            collector.visit(tree);

            // Retrieve the collected data and save it to JSON
            List<Package> packages = collector.getPackages();
            saveAsJson(packages, "output.json");

            System.out.println("Data successfully saved to 'output.json'.");
        } catch (IOException | URISyntaxException e) {
            System.err.println("Error processing the input file: " + e.getMessage());
        }
    }

    private static void saveAsJson(List<Package> packages, String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        // Write JSON output to a file with pretty printing
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), packages);
    }
}
