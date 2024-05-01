package org.lumijiez;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.lumijiez.models.Package;
import org.lumijiez.parser.WinxLexer;
import org.lumijiez.parser.WinxParser;

import com.fasterxml.jackson.databind.ObjectMapper;

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
            Path inputPath = Path.of(Objects.requireNonNull(Main.class.getResource("/TestProgram.txt")).toURI());
            String input = Files.readString(inputPath);

            CharStream inputStream = CharStreams.fromString(input);
            WinxLexer lexer = new WinxLexer(inputStream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            WinxParser parser = new WinxParser(tokenStream);

            ParseTree tree = parser.winx();

            WinxCollector collector = new WinxCollector();
            collector.visit(tree);

            List<Package> packages = collector.getPackages();
            saveAsJson(packages);

            System.out.println("Data successfully saved to 'output.json'.");
            System.out.println("Spinning up React environment...");

            startReactServer();

        } catch (IOException | URISyntaxException e) {
            System.err.println("Error processing the input file: " + e.getMessage());
        }
    }

    private static void saveAsJson(List<Package> packages) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(packages);
            String jsContent = "export const jsonData = " + jsonString + ";";
            Files.writeString(Paths.get("winx-serve/src/Data.js"), jsContent);
            System.out.println("Data successfully saved to '" + "frontend/src/data.js" + "'.");
        } catch (JsonProcessingException e) {
            throw new IOException("Failed to serialize data to JSON", e);
        }
    }

    private static void startReactServer() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            processBuilder.command("cmd.exe", "/c", "cd winx-serve && npm start");
        } else {
            processBuilder.command("bash", "-c", "cd winx-serve && npm start");
        }
        processBuilder.inheritIO();
//        Process process =
        processBuilder.start();

        // int exitCode = process.waitFor();
        // System.out.println("React server started with exit code " + exitCode);
    }
}
