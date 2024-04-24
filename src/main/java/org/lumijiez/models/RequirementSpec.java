package org.lumijiez.models;

import java.util.ArrayList;
import java.util.List;

public class RequirementSpec {
    private final String name;
    private final List<Spec> specs = new ArrayList<>();

    public RequirementSpec(String name) {
        this.name = name;
    }

    public void addAnnotation(Spec spec) {
        specs.add(spec);
    }

    public String getName() {
        return name;
    }

    public List<Spec> getAnnotations() {
        return specs;
    }
}

