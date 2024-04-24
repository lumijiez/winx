package org.lumijiez.models;
import java.util.ArrayList;
import java.util.List;

public class Interface {
    private final String name;
    private final List<FunctionSpec> functions = new ArrayList<>();

    public Interface(String name) {
        this.name = name;
    }

    public void addFunction(FunctionSpec function) {
        functions.add(function);
    }

    public String getName() {
        return name;
    }

    public List<FunctionSpec> getFunctions() {
        return functions;
    }
}

