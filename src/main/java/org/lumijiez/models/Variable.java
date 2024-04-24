package org.lumijiez.models;

public class Variable {
    private final String type;
    private final String identifier;

    public Variable(String type, String identifier) {
        this.type = type;
        this.identifier = identifier;
    }

    public String getType() {
        return type;
    }

    public String getIdentifier() {
        return identifier;
    }
}
