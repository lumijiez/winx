package org.lumijiez.models;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private final String name;
    private final List<Interface> interfaces = new ArrayList<>();
    private final List<Specification> specifications = new ArrayList<>();

    public Package(String name) {
        this.name = name;
    }

    public void addInterface(Interface iface) {
        interfaces.add(iface);
    }

    public void addSpecification(Specification spec) {
        specifications.add(spec);
    }

    public String getName() {
        return name;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }
}
