# Design principles 

- Why design principles are required ?

    Software development is a complex field that requires careful planning and design to ensure that applications are maintainable, scalable, and easy to understand

## SOLID Principles 

- What is SOLID principles ?

    SOLID principles are five essential guidelines that enhance software design, making code more maintainable and scalable. They include:

    1. Single Responsibility Principle 🔑
    2. Open/Closed Principle 🔓
    3. Liskov Substitution Principle 🔄
    4. Interface Segregation Principle 📏
    5. Dependency Inversion Principle 🔗 

- What is unit testing ?
    
    Unit testing is a way to test small parts of your code (called "units") to make sure they work correctly.
    


- What are the need for the SOLID principles ? [STRM]

    • Scalability: Adding new features becomes straightforward. 📈

    • Maintainability: Changes in one part of the system have minimal impact on others. 🔄

    • Testability: Decoupled designs make unit testing easier. 🧪

    • Readability: Clear separation of concerns improves code comprehension.📚

### S - Single Responsibility Principle 

    - Every class should have a single responsibility or single job or single purpose. In other words, a class should have only one job or purpose within the software system.

    - Why?
        Improves Maintainability:
            - Changes in one part of the system have minimal impact on others 🔄
        Enhances readability and reduces complexity

    Example: Consider a Baker class, the class should only perform actions related to baking such as preparing dough, operating ovens, and decorating pastries - not other tasks like inventory management or customer service.
    We can specify an separate class for those things.

    If it handles multiple unrelated responsibilities, it violates the Single Responsibility Principle. And makes the system monolithic 

    This coupling of unrelated responsibilities increases the risk of introducing bugs and makes the codebase more difficult to maintain. Reduces readability and increases the complexity.

### O - Open/Closed Principle 

    - This principle states that Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification which means you should be able to extend a class behavior, without modifying it.

    - Why it matters ?
        - Prevents breaking the existing code.Because
            - Modification may bring bugs.
            - Can break the existing features.
        - Encourages the reusable components and code.

    Example: Consider a class Shape with a printArea() method that calculates the area of various shapes. If we directly modify the Shape class's printArea() method every time we add a new shape, we violate the Open/Closed Principle by changing existing code.

    Instead, we should create an abstract class Shape with an abstract method printArea(). This way, any new shape can extend the Shape class and implement its own printArea() method without modifying the existing code. This approach follows the Open/Closed Principle by being open for extension (new shapes) but closed for modification (existing code remains unchanged).

### Liskov Substitution Principle (LSP)
    - A child class should be substitutable for its parent class without changing the correctness of the program.

    - In simple terms:
    If class B is a subclass of class A, you should be able to use B wherever A is expected, and the program should still work correctly.

    - Why it matters ?
        - Ensures reliability when using polymorphism.
        - Avoids unexpected behaviors in subclass implementations.
    
    Example: Consider a class Vehicle with a method startEngine(). Subclasses like Bike and Car can extend the Vehicle class without any changes in the parent class and can call the startEngine() method. However, if a Bicycle class extends the Vehicle class, it can't access startEngine() method since bicycles don't have engines. This would require explicitly handling that edge case by adding a different implementation or throwing an exception, which leads to undetermined behavior while using the child class implementation. Thus, the Bicycle class (child class) can't substitute the parent class (Vehicle class).

    To overcome this, we can create two abstract classes: EngineVehicle and NonEngineVehicle, such that we can properly separate these different types of vehicles and maintain the Liskov Substitution Principle.

### Interface Segregation Principle 

        - It states that clients should not be forced to depend on interfaces they don't use. In other words, keep interfaces small and specific rather than large and general.

        - Key points:
            - Break large interfaces into smaller, more focused ones
            - Classes should only implement the methods they need
            - Interfaces should be client-specific, not general-purpose
            - Avoid "fat" interfaces that force classes to implement unnecessary methods
        
        - Why it matters ?

            - Reduces unnecessary dependencies.
            - Simplifies implementation for specific use cases.
            - Make sure the class implements only what they actually needed.

        - Example: Consider a Printer interface with abstract methods like print(), scan(), fax(). Any class implementing the Printer interface must implement all these functions. But what if we need a SimplePrinter class which only needs printing functionality without scanning and faxing?

        If SimplePrinter implements the Printer interface, it would be forced to implement unnecessary scan() and fax() methods. To follow ISP, we should create separate interfaces like IPrinter, IScanner, and IFax. This way SimplePrinter can implement just IPrinter, while a SuperPrinter can implement all three interfaces.
            
### Dependency Inversion Principle 
    
    - The Dependency Inversion Principle (DIP) is a principle in object-oriented design that states that High-level modules should not depend on low-level modules. Both should depend on abstractions

    - In simpler terms, the DIP suggests that classes should rely on abstractions (e.g., interfaces or abstract classes) rather than concrete implementations.

    - Why it matters ?

        - Promotes decoupled architecture.
        - Supports testing and maintainability 
    
    - Example :- 
        Imagine you have a Switch that turns on a LightBulb.

        If the Switch is directly connected to the LightBulb class, it only works with LightBulb. If later you want the same switch to control a Fan, you have to change the Switch code. That’s bad.

        To fix this and follow DIP:
        Create an interface called Switchable with methods like turnOn() and turnOff().Both LightBulb and Fan will implement this interface.
        Now the Switch depends on the interface, not the actual device.So, you can pass any device (LightBulb, Fan, etc.) to the Switch without changing its code.


## DRY Principle 

    - Don't repeat yourself 
        - Ensuring that a particular piece of knowledge or logic exists in only one place within a codebase.
    
    - They aim to create reusable components, functions, or modules that can be utilized in various parts of the codebase. This not only makes the code more maintainable but also minimizes the chances of errors since changes or updates only need to be made in one location.

    - Key Features :- 
        - Code resuability 
        - Maintainability and Updation
        - Testability 
        - Consistency 
        - Reduced time in development.

    - DRY is implicitly supported by inheritance , polymorphism , abstraction and interfaces.

    - It can also be implemented by 
        - Creating resuable components (class,methods etc..)
        - Use constant and configuration files

      - Example: Consider a scenario with submit and cancel buttons in a UI. Instead of creating separate classes with duplicate rendering logic:

      ```java
      // Bad approach
      class SubmitButton {
          void render() {
              // Common rendering code
          }
      }
    
      class CancelButton {
          void render() {
              // Same rendering code duplicated
          }
      }

      // Better approach using abstraction
      abstract class Button {
          void render() {
              // Common rendering code shared by all buttons
          }
      }

      class SubmitButton extends Button {
          // Inherits render() from Button
      }

      class CancelButton extends Button {
          // Inherits render() from Button
      }
      ```

      This way, the rendering logic is defined once in the abstract Button class and reused by all button types.

## KISS Principle 

    - Keep it simple and stupid 
        - Ensures the clarity and efficiency not only for you for other/colleagues.
    
    - The idea is straightforward: overcomplicated code is harder to understand, debug, and maintain. By keeping solutions simple, developers can improve their own productivity while ensuring that their code remains accessible to others.

    - Avoid unnecessary complexity to create solutions that are both efficient and maintainable.

    - It always lies inbetween the scalable , maintainable code  to the over complicated code.

    ‍- Key matters :- 
        - Ensures the code is reusable
        - Readability 
        - Maintainability 
        - Easier collaboration 
        - Faster development

    - How to implement ? 
        - Break down problems into the smaller ones
        - Avoid over engineering simple things 
        - Use clear naming conventions 
        - Leverage design patterns

    - Disadvantages :- 
        - Limit the flexibility and innovation
        - Misinterpretation of simplicity ( considering less code lines are better codes ).

## YAGNI

    - You aren't gonna need it. 
        -  This principle is a cornerstone of agile methodologies and plays a critical role in ensuring that software projects stay on track without unnecessary complexity. Relies more closer to the KISS principle.
    
    - YAGNI is a principle in software development that suggests developers should only implement features that are necessary for the current requirements and not add any additional functionality that might be needed in the future. This principle is based on the idea that adding unnecessary features can lead to increased complexity, longer development times, and potentially more bugs.

    - As same as the kiss it lies inbetween the think about the future and don't over complicate it 

    - Example :- 
        
        Suppose you're in an interview, and the interviewer asks you to design a PaymentProcessor class. The requirements are simple:

        • The system should only support debit and credit card payments.
        • The interviewer stresses that the focus is on meeting current requirements without unnecessary complexity.

        However, instead of sticking to the given requirements, you decide to implement support for PayPal and cryptocurrency payments, assuming they might be needed in the future.

    - Why it matters ?

        - Follow only the requirements 
        - Prevents over engineering 
        - Saves time and resources 
        - Alligns best for the agile technologies.
    
    - How to implement ?

        - Have a clear set of goals and requirements 
        - Always track your progress 
        - Refuse if it doesn't fit for the solution

    - Disadvantages :- 

        - Difficulty in estimation 
        - Incomplete or ineffecient solutions
        - Team co-ordination issues