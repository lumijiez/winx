package org.lumijiez.models;
import java.util.ArrayList;
import java.util.List;

public class FunctionSpec {
    private final String name;
    private String access_modifier;
    private String implemented_interface = "none";
    private String importance = "none";
    private final List<Variable> inputTypes = new ArrayList<>();
    private final List<Variable> returnTypes = new ArrayList<>();
    private final List<SpecificationEntry> specificationEntries = new ArrayList<>();

    public FunctionSpec(String name) {
        this.name = name;
    }

    public void addInputType(Variable inputType) {
        inputTypes.add(inputType);
    }

    public void addReturnType(Variable returnType) {
        returnTypes.add(returnType);
    }

    public void addSpecificationEntry(SpecificationEntry entry) {
        specificationEntries.add(entry);
    }

    public String getName() {
        return name;
    }

    public List<Variable> getInputTypes() {
        return inputTypes;
    }

    public List<Variable> getReturnTypes() {
        return returnTypes;
    }

    public List<SpecificationEntry> getSpecificationEntries() {
        return specificationEntries;
    }

    public String getAccess_modifier() {
        return access_modifier;
    }

    public void setAccess_modifier(String access_modifier) {
        this.access_modifier = access_modifier;
    }

    public String getImplemented_interface() {
        return implemented_interface;
    }

    public void setImplemented_interface(String implemented_interface) {
        this.implemented_interface = implemented_interface;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}

