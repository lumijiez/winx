package org.lumijiez.models;

public class SpecificationEntry {
    private final String key;
    private final String value;

    public SpecificationEntry(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
