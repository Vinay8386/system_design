## Software Design Principles (SDP)

Software Design Principles are high-level guidelines used to create clean, maintainable, scalable, and testable software systems.

### SOLID Principles (Object-Oriented Design)
SOLID is a set of five object-oriented design principles that fall under Software Design Principles.

- Single Responsibility Principle (SRP)
- Open/Closed Principle (OCP)
- Liskov Substitution Principle (LSP)
- Interface Segregation Principle (ISP)
- Dependency Inversion Principle (DIP)

### Other Important Software Design Principles

- DRY (Don’t Repeat Yourself)
- KISS (Keep It Simple)
- YAGNI (You Aren’t Gonna Need It)



## Design Patterns (GOF – Must Know)

This section covers all **Gang of Four (GOF) design patterns** that are essential for writing clean, maintainable, and scalable object-oriented systems. Each pattern is explained with real-world use cases, design intent, class diagrams, and Java-based examples.

---

### Behavioral Design Patterns
Behavioral patterns focus on **communication between objects** and **responsibility delegation**.

- **Strategy** – Define a family of algorithms and make them interchangeable
- **Observer** – One-to-many dependency between objects
- **Command** – Encapsulate a request as an object
- **State** – Change object behavior based on internal state
- **Chain of Responsibility** – Pass requests along a chain of handlers
- **Template Method** – Define the skeleton of an algorithm
- **Iterator** – Traverse a collection without exposing its internal structure
- **Mediator** – Centralize communication between objects
- **Memento** – Capture and restore an object’s internal state
- **Visitor** – Separate algorithms from object structure
- **Interpreter** – Define grammar and interpret expressions

---

### Creational Design Patterns
Creational patterns deal with **object creation mechanisms**, improving flexibility and reuse.

- **Factory Design Pattern**
- **Abstract Factory Pattern**
- **Singleton Pattern**
- **Builder Pattern**
- **Prototype Pattern**

---

### Structural Design Patterns
Structural patterns focus on **how classes and objects are composed** to form larger structures.

- **Decorator Design Pattern**
- **Facade Design Pattern**
- **Adapter Design Pattern**
- **Proxy Design Pattern**
- **Composite Design Pattern**
- **Bridge Design Pattern**
- **Flyweight Design Pattern**

## HLD Basic Terminology

Before diving into system design and architecture, it is important to understand some core High-Level Design (HLD) concepts. This section explains the foundational building blocks used while designing scalable, reliable, and distributed systems.

- **Scaling** – How systems grow to handle more users and traffic
- **Stateful vs Stateless Applications** – How application data/state is managed
- **Load Balancer** – Managing and distributing incoming requests efficiently
- **TCP & UDP** – Communication protocols and their use cases
- **DNS (Domain Name System)** – Mapping domain names to server IP addresses
- **CDN (Content Delivery Network)** – Serving content faster using geographically distributed servers
- **Single Point of Failure (SPOF)** – Components that can cause total system failure
- **Database Replication** – Copying data across multiple databases for availability
- **Database Scaling** – Techniques to handle large volumes of data and traffic
