# Design Patterns

Design patterns are typical solutions to common problems in software design. Each pattern is like a blueprint that you can customize to solve a particular design problem in your code.

---

## 📚 Types of Design Patterns

- **Creational**
- **Structural**
- **Behavioral**

---

## 🔧 Creational Patterns

### 1. Singleton
- Restricts the instantiation of a class to one object.
- Uses synchronized methods to ensure thread safety.

### 2. Prototype
- Used to create a clone of the object in a structured manner.

### 3. Builder
- Used to create a complex object step by step.
- Helps decide whether a property should be added to the instance or not.

### 4. Factory
- Provides an interface for creating objects in a superclass but allows subclasses to alter the type of object created.

### 5. Abstract Factory
- An extended version where entire families of related products with consistent interfaces are created.

---

## 🏗️ Structural Patterns

### 1. Adapter
- Connects incompatible interfaces.
- Converts one form to another (e.g., JSON to XML).

### 2. Bridge
- Connects two similar objects using composition.

### 3. Composite
- Uses composition at multiple levels to form a tree-like structure.

### 4. Facade
- Combines multiple classes into a single interface to simplify usage.

### 5. Flyweight
- Reduces memory usage by sharing objects that have intrinsic and extrinsic states.

### 6. Proxy
- Acts as a cache for objects to improve access time.

### 7. Decorator
- Adds additional features to objects dynamically while adhering to the open/closed principle.

---

## 🔁 Behavioral Patterns

### 1. Command
- Encapsulates a request as an object, thereby letting users parameterize clients with queues, requests, and operations.

### 2. Iterator
- Provides a way to access elements of a collection sequentially without exposing its internal representation.

### 3. Mediator
- Defines an object that controls how a set of objects interact.

### 4. Observer
- Implements a one-to-many dependency. When one object changes state, its dependents are notified.

### 5. Memento
- Saves the state of an object so it can be restored to that state later.

### 6. State
- Allows an object to alter its behavior when its internal state changes.

### 7. Visitor
- Separates algorithms from the objects on which they operate.

### 8. Template
- Defines the skeleton of an algorithm and allows subclasses to override certain steps.

### 9. Strategy
- Allows changing the behavior of an object dynamically by switching algorithms.

### 10. Chain of Responsibility
- Passes a request along a chain of handlers where each handler decides either to process the request or pass it on.

---

## 📌 Note

This repository documents key design patterns along with simple definitions. Ideal for interviews, revisions, or when building scalable architectures.
