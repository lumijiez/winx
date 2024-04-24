package org.lumijiez.models;
import java.util.ArrayList;
import java.util.List;

public class Specification {
    private final String name;
    public String implemented_interface = "none";
    private final List<RequirementSpec> requirements = new ArrayList<>();
    private final List<ResultSpecification> results = new ArrayList<>();
    private final List<FunctionSpec> functions = new ArrayList<>();

    public Specification(String name) {
        this.name = name;
    }

    public void addRequirement(RequirementSpec requirement) {
        requirements.add(requirement);
    }

    public void addResult(ResultSpecification result) {
        results.add(result);
    }

    public void addFunction(FunctionSpec function) {
        functions.add(function);
    }

    public String getName() {
        return name;
    }

    public List<RequirementSpec> getRequirements() {
        return requirements;
    }

    public List<ResultSpecification> getResults() {
        return results;
    }

    public List<FunctionSpec> getFunctions() {
        return functions;
    }

    public String getImplementedInterface() {
        return implemented_interface;
    }

    public void setImplementedInterface(String implemented_interface) {
        this.implemented_interface = implemented_interface;
    }
}
