package org.lumijiez.models;

public class ResultSpecification {
    private final String name;
    private final String importance;

    public ResultSpecification(String name) {
        this.name = name;
        this.importance = "none";
    }

    public ResultSpecification(String name, String importance) {
        this.name = name;
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public String getImportance() {
        return importance;
    }
}
