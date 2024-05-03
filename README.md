# Winx Language Documentation

## Overview

Winx is a domain-specific language designed to explicitly define interfaces and specifications for systems across various domains. It enables system architects and developers to declare critical and optional operations, specify constraints, and establish clear contracts within the system components. Winx supports the development of reliable systems by enforcing strict adherence to defined behaviors and performance metrics.
![photo_2024-05-01_22-48-04](https://github.com/lumijiez/dsl-winx/assets/59575049/c9bff223-5337-4c4d-a6d8-8ac4dc532e2d)

## Features of Winx

- **Type Safety:** Winx is built with strong typing to reduce errors at design time.
- **Modularity:** Encourages modular design by separating interface definitions from implementations.
- **Extensible Annotations:** Users can define custom annotations to enforce additional constraints or document behavior.
- **Clear Concurrency Specifications:** Offers annotations to manage concurrency control and transaction behavior.

## Language Constructs

### Keywords and Modifiers

- `package`: Defines a collection of related interfaces and specifications.
- `interface`: Declares a group of related methods that form a contract.
- `specification`: Provides concrete implementations of one or more interfaces.
- `critical`, `optional`: Modifiers that dictate the necessity of methods within interfaces and specifications.
- `implements`: Shows that a specification adheres to the contract of an interface.

### Basic Syntax Overview

Here is an outline of the basic syntax used in Winx:

```plaintext
package PackageName {
    [critical|optional] interface InterfaceName {
        [critical|optional] ReturnType MethodName(ParamType paramName) {
            @AnnotationName : "Value";
            return ReturnType;
        }
    }

    specification SpecificationName implements InterfaceName {
        [critical|optional] ReturnType MethodName(ParamType paramName) {
            // Method implementation
            return ReturnType;
        }
    }
}
```

### Defining Interfaces and Specifications

Interfaces in Winx define the blueprint of operations that any implementing specification must fulfill, whereas specifications provide the actual implementation logic for these interfaces.

### Annotations

Annotations in Winx provide essential metadata and constraints for methods within interfaces and specifications. Here are a few examples:

- `@ExecTime : "3s"`: Specifies that the execution time should not exceed 3 seconds.
- `@DataIntegrity : "High"`: Ensures high levels of data integrity during operations.
