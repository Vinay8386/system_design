# System Design & Design Patterns Repository

A comprehensive resource for learning and mastering **system design concepts**, **software design principles**, and **Gang of Four (GoF) design patterns** with real-world Java implementations and interview preparation materials.

---

## 📑 Table of Contents

1. [Software Design Principles](#software-design-principles-sdp)
2. [Design Patterns (GOF)](#design-patterns-gof--must-know)
3. [High-Level Design (HLD)](#high-level-design-hld)
4. [Low-Level Design (LLD)](#low-level-design-lld)
5. [How to Use This Repository](#how-to-use-this-repository)
6. [Repository Structure](#repository-structure)

---

## Software Design Principles (SDP)

Software Design Principles are high-level guidelines used to create clean, maintainable, scalable, and testable software systems.

### SOLID Principles (Object-Oriented Design)

SOLID is a set of five foundational object-oriented design principles:

| Principle | Meaning | Purpose |
|-----------|---------|---------|
| **S** | Single Responsibility Principle (SRP) | Each class should have only one reason to change |
| **O** | Open/Closed Principle (OCP) | Open for extension, closed for modification |
| **L** | Liskov Substitution Principle (LSP) | Subtypes must be substitutable for their base types |
| **I** | Interface Segregation Principle (ISP) | Many specific interfaces better than one general interface |
| **D** | Dependency Inversion Principle (DIP) | Depend on abstractions, not concrete implementations |

📚 Learn more in: [SOLID Principles Interview Questions](./SOLID_Principal_Interview_Question) | [SOLID with Notification System](./SOLID_Principal_using_Notification_System/)

### Other Important Software Design Principles

- **DRY** (Don't Repeat Yourself) – Avoid code duplication
- **KISS** (Keep It Simple, Stupid) – Prefer simplicity over complexity
- **YAGNI** (You Aren't Gonna Need It) – Don't build features you don't need

📚 Learn more in: [Design Principles Deep Dive](./KISS_DRY_SOLID_YAGNI)

---

## Design Patterns (GOF – Must Know)

This section covers all **Gang of Four (GOF) design patterns** that are essential for writing clean, maintainable, and scalable object-oriented systems. Each pattern is explained with real-world use cases, design intent, class diagrams, and Java-based implementations.

📚 Interview Questions: [Design Pattern Interview Questions](./LLD_DesignPattern/Design_Pattern_Interview_Question)

### Behavioral Design Patterns

Behavioral patterns focus on **communication between objects** and **responsibility delegation**. They define how objects interact and distribute responsibilities.

- **Chain of Responsibility** – Pass requests along a chain of handlers until one handles it
- **Command** – Encapsulate a request as an object, allowing queuing and logging
- **Iterator** – Traverse a collection without exposing its internal structure
- **Mediator** – Centralize complex communication and control logic between related objects
- **Memento** – Capture and restore an object's internal state without violating encapsulation
- **Observer** – One-to-many dependency where objects are notified of state changes
- **State** – Change object behavior based on its internal state
- **Strategy** – Define a family of algorithms and make them interchangeable
- **Template Method** – Define the skeleton of an algorithm in a base class
- **Visitor** – Separate algorithms from the object structure they operate on
- **Interpreter** – Define grammar and interpret expressions in a language

📚 Explore: [Behavioral Design Patterns](./LLD_DesignPattern/Behavioral_Design_Pattern/Theory_BDP)

### Creational Design Patterns

Creational patterns deal with **object creation mechanisms**, improving flexibility and code reuse while hiding creation logic.

- **Abstract Factory** – Create families of related objects without specifying concrete classes
- **Builder** – Construct complex objects step by step with a fluent interface
- **Factory** – Create objects without specifying exact classes
- **Prototype** – Clone objects instead of creating new instances
- **Singleton** – Ensure a class has only one instance with global access

📚 Explore: [Creational Design Patterns](./LLD_DesignPattern/Creational_Design_Pattern/Theory_CDP)

### Structural Design Patterns

Structural patterns focus on **how classes and objects are composed** to form larger structures while keeping these structures flexible and efficient.

- **Adapter** – Make incompatible interfaces work together
- **Bridge** – Decouple abstraction from implementation
- **Composite** – Compose objects into tree structures to represent part-whole hierarchies
- **Decorator** – Attach additional responsibilities to objects dynamically
- **Facade** – Provide a unified interface to a complex subsystem
- **Flyweight** – Share objects efficiently to reduce memory usage
- **Proxy** – Provide a surrogate or placeholder for another object

📚 Explore: [Structural Design Patterns](./LLD_DesignPattern/Structural_Design_Pattern/Theory_SDP)

---

## High-Level Design (HLD)

High-Level Design concepts form the foundation for building scalable, reliable, and distributed systems.

### Core HLD Concepts

Before diving into system design and architecture, understand these foundational building blocks:

- **Scaling** – Vertical and horizontal scaling to handle growth
- **Stateful vs Stateless Applications** – How to manage application state
- **Load Balancer** – Distribute traffic across multiple servers
- **TCP & UDP** – Transport layer protocols and trade-offs
- **DNS (Domain Name System)** – Domain resolution and routing
- **CDN (Content Delivery Network)** – Serve content from edge locations
- **Single Point of Failure (SPOF)** – Identify and eliminate critical bottlenecks
- **Database Replication** – Copy data for availability and resilience
- **Database Scaling** – Handle large data volumes and traffic

📚 Learn more: [HLD Basic Terminology](./HLD_Basic_terminology)

### Advanced HLD Topics

| Topic | Description | Resource |
|-------|-------------|----------|
| **Network Protocols** | TCP, UDP, HTTP, HTTPS, gRPC | [Learn](./HLD_Network_Protocol) |
| **HTTP Concepts** | Status codes, methods, headers, caching | [Learn](./HTTP_Basic_Documents) |
| **CAP Theorem** | Consistency, Availability, Partition tolerance tradeoffs | [Learn](./HLD_CAP_Theoram) |
| **Microservices** | Architecture patterns and design principles | [Learn](./HLD_Microservices_Design_Pattern) |
| **Rate Limiting** | Algorithms and implementation strategies | [Learn](./HLD_Rate_limiting/) |
| **Scaling to Millions** | Techniques to scale from zero to millions of users | [Learn](./HLD_Scaling_Zero_To_Millions_User.excalidraw) |

---

## Low-Level Design (LLD)

Low-Level Design focuses on detailed class-level design, algorithms, and data structures.

### Prerequisites & Walkthrough

Before diving into LLD, build your foundation:

📚 [LLD Prerequisites & Walkthrough](./LLD_Prerequicites_&_Walkthrough)  
📚 [LLD Basic Terminology](./LLD_Basic_terminology)

### Design Patterns for LLD

Apply Gang of Four design patterns to solve common design problems:

📚 [Complete Design Patterns Guide](./LLD_DesignPattern/)

---

## How to Use This Repository

### 📖 For Learning
1. Start with [Software Design Principles](#software-design-principles-sdp) to understand SOLID and other principles
2. Move to [Design Patterns](#design-patterns-gof--must-know) and learn each pattern category
3. Explore [HLD](#high-level-design-hld) concepts for system architecture
4. Apply [LLD](#low-level-design-lld) patterns to detailed design problems

### 🎯 For Interview Preparation
- Review [SOLID Principles Interview Questions](./SOLID_Principal_Interview_Question)
- Practice [Design Pattern Interview Questions](./LLD_DesignPattern/Design_Pattern_Interview_Question)
- Study real-world scenarios with [Notification System Implementation](./SOLID_Principal_using_Notification_System/)
- Master [Rate Limiting Interview Questions](./HLD_Rate_limiting/Rate_Limiting_Interview_Question)

### 💻 For Implementation
- Each design pattern includes **Java implementations** with real-world examples
- Study the code in respective folders and understand design decisions
- Try implementing patterns in your own projects

---

## Repository Structure

```
system_design/
├── SOLID_Principal_Interview_Question/          # SOLID principles Q&A
├── SOLID_Principal_using_Notification_System/   # Real-world SOLID implementation
├── KISS_DRY_SOLID_YAGNI/                       # Design principles deep dive
├── LLD_Basic_terminology/                       # LLD foundational concepts
├── LLD_Prerequicites_&_Walkthrough/            # Prerequisites guide
├── LLD_DesignPattern/                          # Complete design patterns
│   ├── Behavioral_Design_Pattern/
│   │   ├── ChainOfResponsibility_Design_Pattern/
│   │   ├── Command_Design_Pattern/
│   │   ├── Iterator_design_Pattern/
│   │   ├── Observer_Design_Pattern/
│   │   ├── State_Design_Pattern/
│   │   ├── Strategy_Design_Pattern/
│   │   └── ... (more behavioral patterns)
│   ├── Creational_Design_Pattern/
│   │   ├── AbstractFactory_Design_Pattern/
│   │   ├── Builder_Design_Pattern/
│   │   ├── Factory_Design_Pattern/
│   │   ├── Proxy_Design_Pattern/
│   │   └── Singleton_Design_Pattern/
│   └── Structural_Design_Pattern/
│       ├── Adapter/
│       ├── Bridge_Design_Pattern/
│       ├── Composite_Design_Pattern/
│       ├── Decorator_Design_Pattern/
│       ├── Facade_Design_Pattern/
│       ├── Flyweight_Design_Pattern/
│       └── Proxy_Design_Pattern/
├── HLD_Basic_terminology/                       # HLD foundational concepts
├── HLD_Network_Protocol/                        # Network protocols guide
├── HTTP_Basic_Documents/                        # HTTP protocol reference
├── HLD_CAP_Theoram/                            # CAP theorem explanation
├── HLD_Microservices_Design_Pattern/           # Microservices architecture
├── HLD_Rate_limiting/                          # Rate limiting algorithms
│   ├── FixedWindowRateLimiter.java
│   ├── LeakyBucketRateLimiter.java
│   ├── SlidingWindowCounterRateLimiter.java
│   ├── SlidingWindowLogRateLimiter.java
│   ├── TokenBucketRateLimiter.java
│   ├── Rate_Limiting_Interview_Question
│   └── Rate_Limiting_Theory
├── HLD_Scaling_Zero_To_Millions_User.excalidraw # Scaling strategies diagram
└── README.md                                    # This file
```

---

## Key Concepts at a Glance

### When to Use Each Pattern

| Problem | Pattern | Example |
|---------|---------|---------|
| Multiple implementations of algorithm | Strategy | Payment methods (credit card, PayPal, etc.) |
| Object creation is complex | Builder | Building a complex object with many options |
| Single instance needed across app | Singleton | Database connection, Logger |
| Add behavior to objects dynamically | Decorator | Adding features to a pizza (cheese, pepperoni) |
| Simplify complex subsystem | Facade | Unified interface to complex booking system |
| Undo/Redo functionality | Memento | Save and restore state |
| Notify multiple objects of state change | Observer | Event notification system |
| Tree structures (part-whole hierarchy) | Composite | File system (files and folders) |
| Handle requests in a chain | Chain of Responsibility | Logging level filters, approval workflows |

---

## Learning Recommendations

### Beginner Level
1. Understand [Software Design Principles](#software-design-principles-sdp)
2. Learn [Creational Design Patterns](#creational-design-patterns) (focus on Singleton, Factory, Builder)
3. Study [HLD Basic Concepts](#core-hld-concepts)

### Intermediate Level
4. Master [Behavioral Design Patterns](#behavioral-design-patterns) (focus on Observer, Strategy, State)
5. Explore [Structural Design Patterns](#structural-design-patterns) (focus on Decorator, Adapter, Facade)
6. Deep dive into [Advanced HLD Topics](#advanced-hld-topics)

### Advanced Level
7. Design complete systems using multiple patterns
8. Practice interview questions from each section
9. Build real-world projects combining HLD and LLD concepts

---

## Interview Preparation Guide

### Essential Topics to Master
✅ SOLID Principles  
✅ All 23 Gang of Four Design Patterns  
✅ System Design Fundamentals (HLD)  
✅ Scalability Concepts  
✅ Database Design  
✅ Cache Design  
✅ Message Queues  
✅ Rate Limiting Algorithms  

### Interview Resources
- **Pattern Questions**: [Design Pattern Q&A](./LLD_DesignPattern/Design_Pattern_Interview_Question)
- **SOLID Questions**: [SOLID Principles Q&A](./SOLID_Principal_Interview_Question)
- **Rate Limiting**: [Rate Limiting Q&A](./HLD_Rate_limiting/Rate_Limiting_Interview_Question)
- **Real-World Implementation**: [Notification System](./SOLID_Principal_using_Notification_System/)

---

## Quick Reference

### Rate Limiting Algorithms

| Algorithm | Use Case | Pros | Cons |
|-----------|----------|------|------|
| **Fixed Window** | Simple rate limiting | Easy to implement | Edge case issues |
| **Sliding Window Log** | Precise rate limiting | Very accurate | High memory usage |
| **Sliding Window Counter** | Balanced approach | Good accuracy, reasonable memory | Slightly inaccurate |
| **Leaky Bucket** | Smooth traffic | Smooths traffic spikes | Complex implementation |
| **Token Bucket** | Burst handling | Handles bursts, flexible | Requires tuning |

---

## Contributing

Feel free to add more patterns, examples, or interview questions. Keep the repository well-organized and documented.

---

## License

This repository is for educational purposes. Feel free to use and modify for your learning.

---

## Last Updated
April 2026

For questions or feedback, feel free to open an issue or contribute improvements!