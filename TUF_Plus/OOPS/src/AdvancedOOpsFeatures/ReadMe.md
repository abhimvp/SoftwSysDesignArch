# Advanced OOPS Features

- Abstraction
- Interfaces
- Static Keyword
- Inner classes

## Abstraction - 28 min

(refer offline notes as well)

- Abstraction is one of the fundamental concepts of Object-Oriented Programming (OOP). It is the process of hiding the implementation details and showing only the necessary features or interface to the user. In simpler terms, abstraction allows us to focus on what an object does, rather than how it does it.
- Abstraction is achieved through abstract classes and interfaces in languages like Java. It allows programmers to create a blueprint or template for objects without having to worry about their specific implementation details, making the system easier to use and manage.

Hiding Implementation Details: The goal of abstraction is to hide the complex implementation details of a system and provide a simpler interface for interaction. For example, when you drive a car, you don't need to know how the engine works internally; you just need to know how to start the car, steer, and stop.
Abstract Methods: These are methods declared in abstract classes or interfaces but have no body (i.e., they have no implementation). The implementation must be provided by the subclass or the class that implements the interface.
Concrete Methods: These are methods with complete implementation in an abstract class. Subclasses inherit these methods, but they are also allowed to override them if necessary.

Benefits of Abstraction in Programming
Abstraction allows the programmers to:

Simplify the system: By hiding unnecessary details, it reduces complexity.
Improve maintainability: It makes the code more manageable, as changes to implementation details don't affect the rest of the system.
Increase reusability: It allows code to be reused across different parts of the system with different implementations.
Provide security: It ensures that the user interacts with the system at a higher level, without the risk of them modifying or interacting with internal mechanisms directly.

`Static` methods belong to the class rather than any instance of the class. This means that they can be called without creating an object of the class. Static methods can only directly access static members of the class, not instance variables or instance methods. They are defined using the static keyword.

```py
from typing import List
class Example:
    @staticmethod
    def staticMethod():
        print("This is a static method.")

if __name__ == "__main__":
    Example.staticMethod()  # Accessing static method directly using the class name

```

They are called on the class itself, not on an instance of the class.
They can be used to perform operations that are common to all instances of a class.
They can access only other static members (variables, methods) of the class.
They cannot access instance variables or methods.

`Default` methods were introduced in Java 8 to allow adding new functionality to interfaces without breaking existing implementations. Prior to Java 8, interfaces could only declare method signatures, leaving the implementation to the classes that implemented the interface. With the introduction of default methods, interfaces can now provide default implementations for methods.

```java
import java.util.*;
interface Example {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

class Demo implements Example {
    public static void main(String[] args) {
        Example obj = new Demo();
        obj.defaultMethod();  // Accessing default method
    }
}
```

## interface

An interface in Java is a blueprint of a class that defines a contract for behavior but does not provide an implementation. It contains a set of abstract methods (methods without a body) that a class must implement if it chooses to "sign the contract" by implementing the interface. Think of it as a way to specify what a class should do without dictating how it should do it.

Can interface have instance variables?
No, an interface cannot have instance variables. All fields in an interface are implicitly public, static, and final. This means they act as constants and cannot be changed. Attempting to declare a non-static or non-final field will result in a compilation error.

Can Interfaces Have Constructors?
No, interfaces cannot have constructors. This is because constructors are used to initialize the state of an object, and interfaces cannot have state (no instance variables). Since interfaces are not classes and cannot be instantiated directly, they do not need constructors.
