## Prerequisites

- What are Low-Level Languages and High-Level Languages?
    - Low-level languages are close to hardware, harder to understand [Machine Language (Binary), Assembly Language]
    - High-level languages are closer to human language; easier to write and read [Java, C++, Python]

- What are the types of programming languages based on programming paradigm?

    1. Procedural Languages

        - Focus on functions and procedure calls
        - Code is executed line by line
        - Examples: C, Pascal

    2. Object-Oriented Languages (OOP)

        - Based on objects and classes
        - Examples: Java, C++, Python

    3. Functional Languages

        - Treat computation as evaluation of functions
        - Avoid changing state and mutable data
        - Examples: Haskell, Lisp, Scala

    4. Scripting Languages

        - Used for automating tasks; often interpreted
        - Examples: Python, JavaScript, Bash

    5. Logic-Based Languages

        - Based on formal logic
        - Example: Prolog

## What is OOP ?

- OOP (Object-Oriented Programming) is a programming paradigm that organizes software design around objects rather than functions and logic.

#### 4 Pillars of OOP :-

1. Encapsulation - Hides internal data and exposes only what’s necessary.

2. Abstraction - Hides complex implementation and shows only important details.

3. Inheritance - Same method behaves differently based on the object.

4. Polymorphism - Same method behaves differently based on the object.


#### Q/A :-

- What is Class ?

    - A blueprint for creating objects. It defines properties (attributes) and behaviors (methods).

- What is Object class?

    - In Java, Object class is the root/parent class of all classes

    - Every class automatically inherits from Object class if no explicit parent is specified

    - Object class provides common methods like toString(), equals(), hashCode() that all objects can use

- What is toString() method ?

    - It's a method from the Object class which returns a string representation of the object. By default it returns a unique value (ex:- A@12345 -> classname@hashcode) if not overridden.

    - It's a non-static method, hence we need an object to access it.

- What is Object ?

    - An instance of a class.

- What is the use of ```new``` keyword ?
    
    - Dynamically allocates memory and returns a reference to it.

- In the ``` classA a = new classA() ;``` which is excuted at which time ?

    - ``` classA a ``` is executed  during the compile time.

    - ``` new classA() ``` is executed during the run time.

- What is constructor ?
    
    - Constructor is a special method that is automatically called when an object of a class is created.
    
    - Constructor has no return type and must have the same name as the class.

- Can we add a explicit return type to the constructor ?
    
    - No. It makes that a method and not a constructor.

- What is stack memory and heap memory ?
    
    - Stack memory -> Stores method-specific values, local variables, method calls, and primitive data types. It follows Last-In-First-Out (LIFO).

    - Heap memory -> Stores objects and class instances, dynamically allocated memory. Garbage collection happens here.

- What is primitive and non primitive data type ?

    - Primitive -> Basic data types, stores values directly, stored in stack memory [byte, short, int, long, float, double, char, boolean].Primitive data types are not implemented as objects in java.
    
    - Non primitive -> Reference data types that store addresses of objects, stored in heap memory [String, Arrays, Classes, Interfaces, etc.]

- What is stored in the non primitive data types ?

    - They don't store the actual values directly , Instead they store a reference ( memory address ) that points to the actual values in a heap memory.

- Among primitive and non primitive data type , which is passed by values ?

    - Primitive data types are passed by value and non primitive data types are passed by reference. Java supports only call be value and not call by reference 

- Does Java support destructors?
    No, Java does not support destructors because:
    - Java uses Garbage Collection (GC) to manage memory automatically
    - You don't need to manually delete objects like in C++

- What is the use of finalize()?
    - In Java, while you can't control when an object is deleted, you can specify what happens during deletion using finalize()
    - The finalize() method is called by the garbage collector before reclaiming the object's memory

```java
protected void finalize() throws Throwable {
    System.out.println("The object is being deleted");
}
```
    - The above code executes before the object is deleted by the garbage collector

Note: The finalize() method has been deprecated since Java 9. It is recommended to use try-with-resources or explicit cleanup methods instead.

## Package 

- What is package ?
    
    - A package in Java is a way to group related classes, interfaces, and sub-packages together.

    - Think of it like a folder on your computer that organizes files.

    - You can't creat two classes with the same name in a single package.

## Keywords 

### this 

  - What are the uses of 'this' keyword?

      - Access instance variables when local variables have the same name (this.rollno)

      - Call another constructor in the same class (constructor chaining)

      - Pass the current object as a parameter to another method/constructor

      - Return the current object from a method

### final 

- Did variables ( primitive data types ) declared as final allow modifications ?
    
    - No , it don't allow modifications. 
    
    - So , it's compulsory to intialize the final variables during the declaration or using the static blocks.

- Did variables ( non primitive data types ) declared as final allow modifications ?

    - Yes , modifications are allowed but re assigning is not allowed.
    
```java
class A{
    String name = "ABD";

    public static void main(String args[])
    {
        final A obj1 = new A();
        
        obj1.name = "Virat"; // modifications are allowed

        obj1 = new A() ; // re assigning is not allowed

    }
}
```

- What happens when a class is declared as final ?

    - It prevents that particular class to be inherited. 

    - Declares all of it's method as final too. 

    - Final methods can't be over ridden . 

```java
class Parent {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // ❌ This will cause a compile-time error
    // public void show() {
    //     System.out.println("Trying to override.");
    // }
}
```

### static 

- Memory for the static variables are created at only once ?
    
    - Yes, memory for static variables is created only once per class, when the class is loaded into memory, not at compile time, but at runtime.

- Can static variables are methods can be accessed before the object creation ?

    - Yes , they don't depend on object , hence the can be accessed before the object creation using the class name.

- Can the static variables are accessed using the objects of the class ?

    - Yes , it possible because during the compile time the object is treated as it's class name.
    
    - The static variables are common to all the objects of a class.

- Can you call a non-static method inside a static method ?

    - No , because the non static method depends on the object whereas the static methods doesn't depends on the object.

    - If you want to do so create an object then access it.

- Can you call a static method inside a non - static method ?

    - Yes , it's possible.

- Can we use ``` this ``` inside a static method ?

    - No , this belongs to an object whereas the static methods are not dependent on the object. Hence it's not possible.

- Can we use ``` super ``` inside a static method ?

    - No , static methods belongs to the class only and they don't have access to parent class

- What is static blocks ?

    - Static blocks are inside a class that runs once , when the class is loaded into the memory.
    
    - It's used to intialize static variables / run setup codes.

    - These are class levels , hence they're resolved during the compile time itself.

- Can a main function of class can be called from another class ?

    - Yes it's possible. Because they're public ( accessable from anywhere ) , static ( object independent ).

- What happens in a nested class ,when the inner class is declared as static ?

    - The inner class become independent of outer class. No need to create object for the outer class to access the inner class.
- What is Singleton class ?

    - Singleton class allows you to create only one object for the same class.

    - No two objects of the same class are allowed

## Inheritance 

- It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class. In Java, Inheritance means creating new classes based on existing ones.

#### Q/A :- 

- What are the things to be considered while inheriting ?

    - While using the child class the parent class variable are need to be initialized 

    - Even though it's a child class the it can't inherit the private variables and methods

- A child class reference variable can't point to the parent class object ?

    - No , ```subclass obj = new parentclass()``` is not possible.Because the obj may not have all the properties of the child class.

- The variables / methods which can be accessed is determined by the reference variable and not by the object it referring to ?

    - Yes, the variable / method that can be accessed is determined by the reference variable 

### super 

- What are the use cases of super ?

    - Used to access the constructor of the parent class from the child class

    - Used to access the variables of the parent class from the child class

- What are the considerations during the inheritance ?

    - When the parent class have the parameterized constructors , then the repective arguments should be passed to the parent class constructor from the child class constructor during the object creation.

    - If no parameterized constructor , then we don't want to anything because the child class calls the default constructor of the the parent class.

- What is upcasting ?

    - The process of converting the child class object to the parent class object is known as upcasting and it's possible in java.

    - But downcast is not possible in java.

- What are the types of inheritance available in java ?

    - Single inheritance , Multilevel inheritance , Herarical inheritance , Hybrid inheritance ( Single + multiple ), Multiple inheritance 

    - Multiple inheritance is not possible in java. But can be implemented using interface 

- Can a class can be it's own super class ?

    - No , it's not possible.

## Polymorphism 

- Polymorphism allows the same method or object to behave differently based on the context, specifically on the project's actual runtime class. 

- This is can be acheived using the method overloading / method over ridding .

#### Q/A :- 

- Differentiate b/w the compile time and runtime !

| Work | Compile Time | Run Time |
|------|--------------|-----------|
| Errors | Syntax and type errors | Exception, null pointer |
| Handled by | Compiler (javac) | JVM (Java Virtual Machine) |
| Resolution | Method overloading | Method overriding |

- What is widening?
    
    - When a method accepts only float but the user passes an int to the function, then the int is upcasted into float which is known as widening 

- What if widening is not possible?
    
    - Then Java will try to do unboxing (int to Integer)

- What is the other names of method overloading and method overriding?

    - Method overloading -> compile time polymorphism / static polymorphism 

    - Method overriding -> run time polymorphism / dynamic polymorphism 

- Can method overloading be done using normal methods?

    - Yes, method overloading can also be done using both normal methods and constructors. Either the type of parameter or the order of the parameters should be changed.

- Does Java support operator overloading?

    - No, it doesn't support user specific operator overloading. But it allows '+' to perform operator overloading.

    - For int it performs arithmetic operation and for string it performs concatenation.    
- In which polymorphism the method need to be executed is determined during the compile time ?

    - Compile time polymorphism ( Method overloading )

- In which polymorphism the method need to be executed is determined during the run time ?

    - Run time polymorphism ( Method overriding )

- What is method overloading and method overriding ?

    - Method overloading -> When two functions have the same name but differentiated by the type of parameter and the arrangement of parameters

    - Method overriding -> When the superclass method is overridden by the subclass method with same name but different method definition.

- What is method dispatch / dynamic dispatch ?

    - During the method overriding, the method which is need to be executed is determined during the run time and it's also determined by the actual object which is created and not by the reference variable.

    - Only the overriding methods are determined in this way and the variables still accessed based on the reference variable.

    - In short, Object type determines the version of the method that can be executed.

- Can static methods be overridden ?

    - Overriding depends on the object and the static methods are associated with the class only.

    - Hence static methods can't be overridden. But you can inherit static methods from parent class to the child class.

- What is early binding ?

    - Method calls are resolved during the compile time.
    
    - Faster because the method which is need to be executed is determined before the execution itself 

    - Early binding are done in 

        - Method overloading --> Determined during the compile time 

        - Static methods --> Static methods can't be over ridden 

        - Final methods --> Prevents the method from being overridden 
    
- What is late binding ?

    - Method calls are determined during the run time using dynamic dispatch.

    - Slower when compared to the early binding because the JVM determines the method need to be executed during the run time.

    - Supported by the method overridding 
## Encapsulation 

#### Q/A :- 

- Can a class be protected ?
    
    - Only the inner class can be protected. Outermost class should always be public or default 

    - Outer class can't be private and protected.

## Abstraction

Abstraction in Java is the process of hiding the implementation details and only showing the essential details or features to the user. It allows focusing on what an object does rather than how it does it. The unnecessary details are not displayed to the user.

- Java provides two ways to implement abstraction, which are listed below:

        - Abstract Classes (Partial Abstraction)

            - Abstract classes can have both:

                Abstract methods (no body — must be overridden)

                Concrete methods (with body — can be inherited as-is or overridden)

                Hence, they do not enforce 100% abstraction — some implementation can already exist.

        - Interface (100% Abstraction)

            - Why is it considered 100% Abstraction?

                Traditionally (before Java 8), interfaces could only have abstract methods (implicitly public abstract) — no 
                method bodies allowed.

                No implementation, only method declarations — subclasses must implement all methods.

![Abstraction Example](D:/Magesh/LLD/images/abstraction.png)

### Abstract Classes 

- Abstract class is declared with the abstract keyword.

- It may have both abstract and non-abstract methods (methods with bodies).

- If a class has at least one abstract method then it's said to be an abstract class by default.

- An abstract is a Java modifier applicable for classes and methods in Java but not for Variables.

#### Q/A :-

- Can an abstract class be without abstract methods?

    - Yes, we can have an abstract class without any abstract method.

- Is it compulsory to override all the abstract methods of parent class (abstract class) by the child class?

    - Yes

- Can variables be abstract?

    - No 

- Can objects for the abstract class be created?

    - No

- Can you create constructor for the abstract class?

    - Yes, it can't be used for object creation but it can be used for declaring and initializing variables.

- Can abstract method be static?   

    - No, abstract methods can't be static, because abstract methods need to be overridden, whereas static prevents overriding 

- Can static method be implemented inside the abstract class?

    - Yes we can implement but all the static methods inside the abstract class should have the method definition

- Is it compulsory to override normal methods in abstract class?

    - No, it's optional.

- Can abstract class be used as a reference variable?

    - Yes, because we know that a child class which is extending the abstract class is going to be the reference variable. And also according to the abstract class rules the implementing child class should override the abstract class. Hence 100% sure that the methods will be overridden and during the overridden methods the method which needs to be executed is determined by the object which is created. So it's possible.

- Can the abstract class be final?

    - No, final prevents the class from being inherited, whereas abstract classes need to be inherited. Hence this combination is not possible.

- Can abstract class have static and final variables?

    - Yes, they can have.

- Are the normal methods and their variables in an abstract class inherited?

    - Yes, normal methods and their variables in the abstract class are inherited by the child class.

## Interface 

- An Interface in Java programming language is defined as an abstract type used to specify the behavior of a class. 

- An interface in Java is a blueprint of a behavior. A Java interface contains static constants and abstract methods.

- Mostly used for the implementation of multiple inheritance in Java.


| Feature | Abstract | Interface |
|---------|-----------|-----------|
| Inheritance Support | Doesn't support multiple inheritance | Can support multiple inheritance |
| Abstraction Level | Implements partial abstraction | Implements 100% abstraction |
| Method Types | Can have both abstract and concrete methods | From Java 8, default and static methods can have function definitions |
| Variables | All the variables can be static and final | All the variables are static and final by default |
| Method Access | The methods can be public, default | The methods are public and abstract by default |

- Can objects be created using the interface?

    - No, they don't have implementation. Only the method signatures are available 

- Can interface implement another interface?

    - No, an interface can only extend another interface. A class can only implement the interface.

- Advantage of interface?

    - Interface allows unrelated classes to share a common behavior   

    - Interface doesn't care about the parent class or anything else. It sees if you are implementing that interface, if yes then 
    you can use all the methods of that interface. It doesn't care about which child class you are, which package you belong to etc.

- Why can't the methods in the interface be private?

    - It reduces the visibility of the interface, affecting the core feature of the interface 

- Can an interface have a private method with definition?

    - Yes, private methods in interface are possible only if the method has the function definition.

- Are all the methods in interface public by default?

    - Yes, even for the default methods you have to specify that ```default void fun() { // method definition }```

- Can the static methods in the interface be inherited by the child interface?
    
    - No, the static methods in the interface are not inherited by its child interface. Hence it can't be overridden also. So static methods are directly accessed by the interface name itself.

- Can the default methods in the interface be inherited by the child interface?

    - Yes, it can be inherited. So it can also be overridden.

- ```default static void fun``` is this possible?

    - No, static prevents overriding and default supports overriding then a function can't be both static and default in an interface.

- Can the variables of interface be allowed for modification?

    - No, the variables are static (not specific to any object) and final (constant). Hence no modification is allowed.

- Can a static method in a parent class be redeclared in its child class?

    - Yes, static methods in interface are not inherited but we can redeclare in the child class.

- Can a static final method in a parent class be redeclared in its child class?

    - No, static final methods in interface are not inherited and also final prevents that from being redeclared in the child class.

- Does interface have states?

    - No, interface doesn't have states because they don't support instance level variables. All the variables are constants [final and static]

- What to do when two interfaces have same default methods and these two interfaces are implemented in a single class?

    - The implementing class should override the default method.

- What is the order of extend and implement in a class?

    - Class A extends B implements C. Extends comes before implements.