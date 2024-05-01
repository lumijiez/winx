package org.lumijiez;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lumijiez.models.Package;
import org.lumijiez.parser.WinxLexer;
import org.lumijiez.parser.WinxParser;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
            String json = saveAsJson(packages);

            System.out.println("Data successfully saved to 'output.json'.");

            Path templatePath = Path.of(Objects.requireNonNull(Main.class.getResource("/graph.html")).toURI());
            String htmlTemplate = Files.readString(templatePath);

            // Replace placeholder with JSON
            String finalHtmlContent = htmlTemplate.replace("const jsonData = null;", "const jsonData = " + json + ";");

            // Save the modified HTML to a temporary file and open in a browser
            Path tempFile = Files.createTempFile("output", ".html");
            Files.writeString(tempFile, finalHtmlContent);
            Desktop.getDesktop().browse(tempFile.toUri());

            System.out.println("HTML with JSON data successfully opened in a browser.");

        } catch (IOException | URISyntaxException e) {
            System.err.println("Error processing the input file: " + e.getMessage());
        }
    }

    private static String saveAsJson(List<Package> packages) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(packages);
            Files.writeString(Paths.get("output.json"), jsonString);
            return jsonString;
        } catch (JsonProcessingException e) {
            throw new IOException("Failed to serialize data to JSON", e);
        }
    }
}
