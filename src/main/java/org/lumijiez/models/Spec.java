package org.lumijiez.models;

public class Spec {
    private String importance;
    private String name;

    public Spec(String name, String importance) {
        this.setImportance(importance);
        this.setName(name);
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
