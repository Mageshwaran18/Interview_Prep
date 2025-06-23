## Polymorphism 

- Polymorphism allows the same method or object to behave differently based on the context, specifically on the project's actual runtime class.

#### Q/A :- 

- What is widening?
    - When a method accepts only float but the user passes an int to the function, then the int is upcasted into float which is known as widening 
- What if widening is not possible?
    - Then Java will try to do unboxing (int to Integer)


#### Q/A :- 

- Can method overloading be done using normal methods?
    - Yes, method overloading can also be done using both normal methods and constructors. Either the type of parameter or the order of the parameters should be changed.
- 

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
                Traditionally (before Java 8), interfaces could only have abstract methods (implicitly public abstract) — no method bodies allowed.
                No implementation, only method declarations — subclasses must implement all methods.

![Abstraction Example](D:\Magesh\LLD\images\abstraction.png)

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
    - Interface doesn't care about the parent class or anything else. It sees if you are implementing that interface, if yes then you can use all the methods of that interface. It doesn't care about which child class you are, which package you belong to etc.
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