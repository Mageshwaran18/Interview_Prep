# Java Fundamentals - Interview Preparation Guide

## Table of Contents
- [Java Architecture](#java-architecture)
    - [JDK (Java Development Kit)](#jdk-java-development-kit)
    - [JRE (Java Runtime Environment)](#jre-java-runtime-environment)
    - [JVM (Java Virtual Machine)](#jvm-java-virtual-machine)
- [Java Compilation Process](#java-compilation-process)
- [Memory Management in Java](#memory-management-in-java)
- [Java Features](#java-features)
- [OOP Concepts in Java](#oop-concepts-in-java)
- [Frequently Asked Java Interview Questions](#frequently-asked-java-interview-questions)

## Java Architecture

### JDK (Java Development Kit)
JDK is a software development environment used for developing Java applications. It includes:

- **JRE (Java Runtime Environment)**: To run Java applications
- **Development Tools**: 
    - `javac` - Java compiler
    - `java` - Java interpreter
    - `javadoc` - Documentation generator
    - `jar` - Archiver
    - `debugger` - For debugging Java applications
- **Java API Libraries**: Pre-written classes and packages

### JRE (Java Runtime Environment)
JRE is the runtime environment required to execute Java programs. It includes:

- **JVM (Java Virtual Machine)**: The runtime engine
- **Java Class Libraries**: Core classes and supporting files
- **Runtime System Components**: For memory management, etc.

### JVM (Java Virtual Machine)
JVM is an abstract computing machine that enables a computer to run Java programs. Key components include:

- **Class Loader**: Loads class files
- **Execution Engine**: Executes the bytecode
- **Just-In-Time (JIT) Compiler**: Improves performance by compiling bytecode to native code
- **Garbage Collector**: Manages memory automatically
- **Memory Areas**:
    - Method Area (stores class structures)
    - Heap (objects storage)
    - Stack (method frames)
    - PC Registers (stores addresses of JVM instructions)
    - Native Method Stack (for native methods)

## Java Compilation Process
1. **Write Java Code**: Create `.java` source files
2. **Compilation**: `javac` compiler converts source code to bytecode (`.class` files)
3. **Class Loading**: JVM loads the class file
4. **Bytecode Verification**: Ensures code adheres to Java security rules
5. **Execution**: JVM interprets or JIT-compiles bytecode into machine code

## Memory Management in Java
- **Automatic Memory Management**: Through Garbage Collection
- **Memory Areas**:
    - **Heap**: For object storage, managed by GC
    - **Stack**: For local variables and method calls
    - **Metaspace** (formerly PermGen): For class metadata
- **Garbage Collection Process**:
    - Marking: Identifies unused objects
    - Sweeping: Removes unused objects
    - Compacting: Reorganizes memory

## Java Features
- **Platform Independence**: "Write Once, Run Anywhere"
- **Object-Oriented**: Based on objects and classes
- **Robust**: Strong memory management, exception handling
- **Secure**: No pointer arithmetic, bytecode verification
- **Multithreaded**: Built-in support for concurrent programming
- **Architecture-Neutral**: Independent of hardware architecture
- **Interpreted & High Performance**: JIT compilation
- **Distributed**: Extensive networking libraries

## OOP Concepts in Java
- **Encapsulation**: Data hiding and bundling
- **Inheritance**: Class hierarchy and code reuse
- **Polymorphism**: Method overloading and overriding
- **Abstraction**: Interface and abstract classes

## Frequently Asked Java Interview Questions
1. **What is the difference between JDK, JRE, and JVM?**
   - JDK: Development kit that includes JRE plus development tools
   - JRE: Runtime environment that includes JVM plus libraries
   - JVM: Virtual machine that executes bytecode

2. **Explain the Java execution process from source code to execution.**
   - Source code (.java) → Compiler → Bytecode (.class) → ClassLoader → Bytecode Verification → Execution by JVM

3. **What are the different memory areas in JVM?**
   - Method Area, Heap, Stack, PC Registers, and Native Method Stack

4. **How does garbage collection work in Java?**
   - Automatically reclaims memory by identifying and removing objects with no references through mark-sweep-compact processes

5. **What is the difference between stack and heap memory?**
   - Stack: Stores method frames and local variables; memory managed in LIFO order
   - Heap: Stores objects; memory managed by garbage collector

6. **Explain the main features of Java.**
   - Platform independence, object-oriented, robust, secure, multithreaded, architecture-neutral

7. **What is method overloading and method overriding?**
   - Overloading: Multiple methods with same name but different parameters in same class
   - Overriding: Subclass provides specific implementation for method defined in parent class

8. **Difference between an interface and an abstract class?**
   - Abstract class: Can have constructors, instance variables, and some implemented methods
   - Interface: Can only have constants, method signatures, default methods, static methods

9. **What are access modifiers in Java?**
   - public: Accessible everywhere
   - protected: Within package and subclasses
   - default (no modifier): Within package only
   - private: Within class only

10. **Explain the concept of exception handling in Java.**
    - Mechanism to handle runtime errors using try, catch, finally, throw, and throws keywords

11. **What are the differences between checked and unchecked exceptions?**
    - Checked: Compile-time exceptions that must be handled explicitly
    - Unchecked: Runtime exceptions that don't require explicit handling

12. **How is multithreading implemented in Java?**
    - By extending Thread class, implementing Runnable interface, or using Executor framework

13. **What are Java collections and the collection framework?**
    - Framework providing interfaces and classes for storing, processing, and manipulating groups of data

14. **What is the difference between ArrayList and LinkedList?**
    - ArrayList: Uses dynamic array, faster for random access, slower for insertions/deletions
    - LinkedList: Uses doubly linked list, faster for insertions/deletions, slower for random access

15. **Explain Java 8 features like lambda expressions and streams.**
    - Lambda expressions: Enable functional programming with concise syntax for anonymous functions
    - Streams: Support functional-style operations on collections with pipeline processing