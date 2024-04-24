package org.lumijiez;

import org.lumijiez.models.*;
import org.lumijiez.models.Package;
import org.lumijiez.parser.WinxBaseVisitor;
import org.lumijiez.parser.WinxParser;

import java.util.ArrayList;
import java.util.List;

public class WinxCollector extends WinxBaseVisitor<Void> {
    private final List<Package> packages = new ArrayList<>();
    private Package currentPackage;
    private Specification currentSpecification;
    private Interface currentInterface;

    @Override
    public Void visitPackage(WinxParser.PackageContext ctx) {
        String packageName = ctx.ID().getText();
        currentPackage = new Package(packageName);
        visitChildren(ctx);  // Recursively visit children to fill the package
        packages.add(currentPackage);
        currentPackage = null;  // Reset after finishing this package
        return null;
    }

    @Override
    public Void visitInterface(WinxParser.InterfaceContext ctx) {
        String interfaceName = ctx.ID().getText();
        currentInterface = new Interface(interfaceName);
        visitChildren(ctx);  // Recursively visit children to fill the interface
        currentPackage.addInterface(currentInterface);
        currentInterface = null;  // Reset after finishing this interface
        return null;
    }

    @Override
    public Void visitSpecification(WinxParser.SpecificationContext ctx) {
        String specificationName = ctx.ID().getText();
        currentSpecification = new Specification(specificationName);
        if (ctx.impls() != null) {
            currentSpecification.setImplementedInterface(ctx.impls().ID().getText());
        }
        visitChildren(ctx);
        currentPackage.addSpecification(currentSpecification);
        currentSpecification = null;
        return null;
    }

    @Override
    public Void visitFunction_spec(WinxParser.Function_specContext ctx) {
        String functionName = ctx.ID().getText();
        FunctionSpec function = new FunctionSpec(functionName);
        if (ctx.input_types() != null) {
            ctx.input_types().variable().forEach(v -> function.addInputType(new Variable(v.type().getText(), v.ID().getText())));
        }

        function.addReturnType(new Variable(ctx.function_body().return_type().variable().type().getText(), ctx.function_body().return_type().variable().ID().getText()));

        if (ctx.impls() != null) function.setImplemented_interface(ctx.impls().ID().getText());

        if (ctx.function_body().specification_entry() != null)
            ctx.function_body().specification_entry().forEach(
                    se -> function.addSpecificationEntry(new SpecificationEntry(se.ID().getText(), se.STRING().getText())));

        function.setAccess_modifier(ctx.access_modifiers().getText());
        if (currentInterface != null) {
            currentInterface.addFunction(function);
        } else if (currentSpecification != null) {
            currentSpecification.addFunction(function);
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitRequirement_spec(WinxParser.Requirement_specContext ctx) {
        RequirementSpec requirement = new RequirementSpec(ctx.ID().getText());
        ctx.req_specification().forEach(rs -> requirement.addAnnotation(
                new Spec(rs.ID(0).getText(), rs.importance().getText())
        ));
        if (currentSpecification != null) {
            currentSpecification.addRequirement(requirement);
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitResult_specification(WinxParser.Result_specificationContext ctx) {
        ResultSpecification result;

        if (ctx.importance() != null) {
            result = new ResultSpecification(ctx.ID().getText(), ctx.importance().getText());
        } else {
            result = new ResultSpecification(ctx.ID().getText());
        }

        if (currentSpecification != null) {
            currentSpecification.addResult(result);
        }
        return visitChildren(ctx);
    }

    public List<Package> getPackages() {
        return packages;
    }
}
