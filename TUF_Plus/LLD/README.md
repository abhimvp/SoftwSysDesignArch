# Low Level Design

- Introduction: LLD is all about the small, detailed planning you do before actually building the house (or writing code).LLD is where your code starts to take shape. It's a crucial phase in the software development lifecycle that focuses on the detailed design of individual components or modules of a system.
- A simple example of LLD would be a basic Login System for a website, where LLD would involve forming different details components like: login(), signUp(), forgotPassword() along with their functionality.
- Key Characteristics of LLD:
  - Granular and Code-Level: LLD dives deep into the fine details of how each component will function.It defines classes, functions, variables, and data structures.
  - Implementation-Focused: LLD is directly linked to how the actual code will be written.It often includes pseudocode, flow diagrams, and sequence diagrams that show real-time data flow between functions.
  - Applies OOP Principles: LLD makes heavy use of Object-Oriented Programming (OOP) concepts like classes, inheritance, abstraction, encapsulation, and polymorphism.This helps build modular, reusable, and maintainable systems.For example, a base Notification class might have subclasses like EmailNotification and SMSNotification using inheritance and polymorphism.
  - `Note` that, in Low-Level Design (LLD), the stakeholders are primarily the people directly involved in the actual implementation of the system — Senior Software Developers, Technical Leads, Managers, etc.
- Software Design Principles:
  - `DRY` — Don't Repeat Yourself : This principle states that every piece of knowledge must have a single, unambiguous, authoritative representation within a system. In simple terms, avoid duplication of logic or code. Repeating code makes the system hard to maintain and error-prone. If a change is required, you might forget to update all occurrences.
  - `KISS` — Keep It Simple, Stupid : This principle states that simplicity should be a key goal in design and unnecessary complexity should be avoided. In simple terms, use the simplest possible solution that works. Avoid clever, convoluted code.
  - `YAGNI` — You Aren't Gonna Need It : This principle states that "Always implement things when you actually need them, never when you just foresee that you need them.". In simple terms, don't add functionality until it's necessary. Avoid building features that you think you might need in the future. This principle helps to keep the codebase clean and reduces unnecessary complexity.

## Solid Principles

There is a set of five principles for writing clean, scalable, maintainable object-oriented code. These principles are known as SOLID principles.`CHeck code examples in TUF+ Platform`

- The S in SOLID stands for Single Responsibility Principle.
- The O in SOLID stands for Open Closed Principle.
- The L in SOLID stands for Liskov Substitution Principle.
- The I in SOLID stands for Interface Segregation Principle.
- The D in SOLID stands for Dependency Inversion Principle.

- Single Responsibility Principle (SRP): A class should have only one reason to change. In other words, a class should only have one job, one responsibility, and one purpose.If a class takes more than one responsibility, it becomes coupled. This means that if one responsibility changes, the other responsibilities may also be affected, leading to a ripple effect of changes throughout the codebase.
- Open Closed Principle (OCP): As per OCP, Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.This means that the behavior of a module can be extended without modifying its source code. The goal is to reduce the risk of breaking existing functionality when requirements change.
- Liskov Substitution Principle (LSP): If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering the correctness of the program.This means that any subclass should be substitutable for its parent class without breaking the functionality.
  - There are some key principles to follow to avoid LSP violations. These are:
    - Subclasses should honor the contract (expectations) of the parent class.
    - Avoid overriding methods in a way that changes behavior drastically.
    - `Prefer` composition over inheritance when possible.
    - Think in terms of interfaces and behavioral compatibility.
    - Subclass should only extend, not restrict behavior.
- Interface Segregation Principle (ISP): "Don't force a class to depend on methods it does not use.".The Interface Segregation Principle is all about designing interfaces that are tailored to the needs of each client — just like Uber doesn't show driver options to passengers. This leads to modular, understandable, and future-proof code.
- Dependency Inversion Principle (DIP): High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.
  - High-Level Modules: The parts of your code that contain the core logic — the brains of your application. They make big decisions and coordinate how different features work together.Example: CEO (makes decisions, plans strategies).
  - Low-Level Modules: The ones that handle the details — like talking to a database, making API calls, reading files, or providing data. They support the high-level logic by doing the grunt work.Example: Employees (do the actual implementation, logistics, and execution).
