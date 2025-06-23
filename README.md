### Low Level System Design ###
---

# SOLID Principles in Low-Level Design (LLD)

## What is SOLID?

**SOLID** is a set of 5 design principles used in **Object-Oriented Programming (OOP)** to write **clean**, **scalable**, and **maintainable** code.

## Where is it used?

SOLID principles are commonly applied in:

* **Low-Level Design (LLD)**
* **Object-Oriented Programming (OOP)**

## How does it help?

* Breaks code into **smaller**, **reusable**, and **testable** parts
* Makes code **easier to maintain** and **extend** without breaking existing functionality
* Applied when designing **classes**, **interfaces**, and their **relationships**

---

## The SOLID Principles Explained

### 1. Single Responsibility Principle (SRP)

> A class should have **only one reason to change** — it should do **one job only**.

✅ Improves code **maintainability** and **testability**

---

### 2. Open/Closed Principle (OCP)

> A class should be **open for extension**, but **closed for modification**.

✅ You can **add new functionality** without changing existing code — supports **safe scaling**

---

### 3. Liskov Substitution Principle (LSP)

> Subtypes must be **substitutable** for their base types **without altering** the correctness of the program.

✅ Ensures **correct inheritance** and **polymorphic behavior**

---

### 4. Interface Segregation Principle (ISP)

> Clients should not be forced to depend on interfaces they **do not use**.

✅ Design **specific**, **focused interfaces** rather than bloated ones — promotes **clean contracts**

---

### 5. Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on **abstractions**.

✅ Improves **decoupling**, **flexibility**, and **testability** by depending on **interfaces** instead of concrete implementations

---

## Summary

Following SOLID principles leads to:

* **Clean** and **modular** architecture
* **Flexible** and **scalable** systems
* **Easier testing** and **maintenance**

---
