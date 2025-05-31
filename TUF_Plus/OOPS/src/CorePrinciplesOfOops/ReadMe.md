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