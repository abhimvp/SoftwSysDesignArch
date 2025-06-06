# Core Principles of Oops

- Encapsulation
- Access Modifiers
- Inheritance
- Polymorphism

## Encapsulation

Encapsulation is a fundamental concept in object-oriented programming (OOP) where the internal details (data and logic) of an object are hidden from the outside world. It is the process of bundling the object's data (attributes) and methods (functions) together into a single unit or class. The primary goal is to protect the internal state of an object from unintended modifications and provide controlled access to it.

- Encapsulation enforces data hiding and ensures that attributes (variables) within a class are not directly accessible to other classes or external code. Instead, it provides getter and setter methods to access and modify these private attributes. By making attributes private, encapsulation maintains control over how the data is accessed and modified, preventing unwanted changes or access.

Flexibility and Maintenance: If the internal implementation needs to change, encapsulation allows you to modify the code without affecting external code. You can alter the internal representation of the data or how it's accessed, as long as the public interface (methods) remains the same.

- Key Takeaways:
  Private Data: In the example above, the accountHolderName and balance attributes are private. This restricts direct access to the attributes from outside the class.
  Getter and Setter Methods: The getBalance() and deposit() methods are public and act as controlled interfaces to interact with the private data.
  Controlled Access: The deposit() method includes a check to ensure that only positive amounts are added to the balance, maintaining data integrity.
  --
  By encapsulating the BankAccount class, we make sure that the balance cannot be arbitrarily altered from outside the class, which protects it from unintended modifications and ensures proper validation is performed.

## Access Modifiers/Specifiers

Access modifiers in object-oriented programming are keywords that define the visibility and accessibility of classes, methods, variables, and other members of a program. They determine which parts of the program can interact with a particular component, ensuring that code adheres to encapsulation — a key principle of object-oriented programming.
Access modifiers provide a controlled interaction between objects and help enforce good design practices, making programs more reliable, scalable, and easy to debug.

Types of Access Modifiers
Most of the Object Oriented Programming languages provide the following four access levels:

Public: Accessible everywhere (within the same class, same package, and outside the package).
Private: Accessible only within the class where it is declared.
Protected: Accessible within the same package and by subclasses in other packages.
Default: (No Modifier) Accessible within the same package (package-private).

## Inheritance

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (subclass) to inherit the attributes (fields) and behaviors (methods) of another class (superclass). It is the mechanism that promotes code reuse and establishes a hierarchical relationship between classes.
In Java, this concept allows a subclass to inherit or extend the functionality of a superclass, enabling the subclass to reuse code and, in many cases, modify or add new behavior.

Parent Class
The parent class (also known as the superclass) is the class that provides common properties (attributes) and behaviors (methods) that are shared by one or more subclasses. It serves as a template or blueprint from which other classes (subclasses) can inherit. For example, School class.
Subclass (Child Class)
A subclass (also known as a child class) is a class that inherits from a parent class. The subclass can reuse, extend, or override the attributes and methods of the parent class to specialize or modify the inherited functionality. For example, Student class.

Advantages of Using Inheritance
Inheritance is a cornerstone of object-oriented programming, offering significant benefits such as:

Reusability: It allows you to reuse the code of an existing class in a new class. Instead of rewriting code, the subclass (child class) can inherit the methods and attributes of the parent class. This reduces redundancy and promotes efficient coding.
Modularity: It promotes a modular structure by separating concerns into different classes. Each class focuses on a specific part of the program, improving clarity and manageability.
Extensibility: It enables adding new features or extending existing functionality without modifying the base class. This makes it easy to adapt to changing requirements.
Maintainability: Inheritance makes code easier to maintain by centralizing common features in a parent class. Changes to shared functionality only need to be made in one place, reducing the risk of errors.

Note
Note that Java does not allow multiple inheritance using classes to avoid the diamond problem, it allows multiple inheritance through interfaces, as interfaces only declare method signatures (no method bodies initially), thus preventing conflicts.

## Polymorphism

Polymorphism is one of the key concepts in object-oriented programming (OOP) and refers to the ability of a single entity (like a method, operator, or object) to behave differently in different contexts. The term “polymorphism” is derived from Greek, meaning “many forms.” In programming, it allows the same method or object to perform different tasks depending on the context.

Compile-Time Polymorphism (Static Polymorphism)
In compile-time polymorphism, the method to be called is resolved at compile time. When we say the method is "resolved" at compile-time, it means that the compiler determines the correct method to invoke based on the method's signature (such as method name, parameters, etc.). It is achieved through method overloading or operator overloading (not supported in Java).

Run-Time Polymorphism (Dynamic Polymorphism)
In run-time polymorphism, the method is resolved during the runtime. It is achieved through method overriding. When we say the method is "resolved" at run-time, it refers to the decision about which method (in the case of method overriding) to call being made at the time the program is actually running. This occurs due to the dynamic method dispatch mechanism, where the JVM decides which method of a subclass to call based on the actual object type (not the reference type) at runtime.
