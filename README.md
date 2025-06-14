# 🧠 Design Patterns in Software Engineering

Design patterns are typical solutions to common problems in software design. They are proven, reusable templates that make software architecture more flexible, scalable, and maintainable.

---

## 📚 Categories of Design Patterns

- **Creational Patterns** – Object creation mechanisms.
- **Structural Patterns** – How classes and objects are composed.
- **Behavioral Patterns** – Communication between objects.

---

## 🔧 Creational Patterns

### 1. Singleton
- Ensures only one instance of a class exists.
- Useful for shared resources like configuration, logging, or thread pools.

### 2. Prototype
- Creates new objects by copying an existing object (clone).
- Avoids the overhead of new object creation.

### 3. Builder
- Separates object construction from its representation.
- Ideal for creating complex objects step by step.

### 4. Factory Method
- Defines an interface for creating an object but lets subclasses alter the type that will be created.

### 5. Abstract Factory
- Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

---

## 🏗️ Structural Patterns

### 1. Adapter
- Converts one interface to another the client expects.
- Example: Convert XML data to JSON.

### 2. Bridge
- Separates abstraction from implementation so both can vary independently.
- Promotes flexibility through composition over inheritance.

### 3. Composite
- Composes objects into tree structures to represent part-whole hierarchies.
- Treat individual objects and compositions uniformly.

### 4. Facade
- Provides a simplified interface to a complex subsystem.
- Hides internal complexity from the client.

### 5. Flyweight
- Reduces memory usage by sharing common parts of object state (intrinsic).
- Ideal for large numbers of similar objects.

### 6. Proxy
- Controls access to another object.
- Can be used for lazy loading, access control, logging, or caching.

### 7. Decorator
- Dynamically adds behavior or responsibilities to objects.
- Follows the Open/Closed Principle (open for extension, closed for modification).

---

## 🔁 Behavioral Patterns

### 1. Command
- Encapsulates a request as an object.
- Useful for undo/redo, transaction logs, and action queues.

### 2. Iterator
- Provides a way to access elements of a collection without exposing the underlying structure.

### 3. Mediator
- Defines an object that coordinates interaction between a group of objects.
- Promotes loose coupling.

### 4. Observer
- One-to-many dependency: When one object changes state, all dependents are notified.
- Used in event handling systems.

### 5. Memento
- Captures and restores an object’s internal state without violating encapsulation.
- Useful for implementing undo functionality.

### 6. State
- Allows an object to change its behavior when its internal state changes.

### 7. Visitor
- Adds new operations to existing object structures without modifying them.

### 8. Template Method
- Defines the program skeleton in a base class and lets subclasses override specific steps.

### 9. Strategy
- Enables selecting an algorithm’s behavior at runtime.
- Promotes flexibility in choosing operations.

### 10. Chain of Responsibility
- Passes a request along a chain of handlers until one handles it.
- Decouples sender and receiver.

---
