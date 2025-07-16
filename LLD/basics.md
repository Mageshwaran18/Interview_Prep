# Basics of LLD 

- # What is UML ?

    - UML (Unified Modeling Language) is a standardized way to visualize the design of a system. It helps you communicate your design clearly with others 

    - UML has many diagram types, but for LLD, the Class Diagram is the most important.

-  # What is class diagram ?

    - It shows the structure of the system. It focuses on 
        - Classes (blueprints of objects)

        - Attributes (data members)

        - Methods (functions/behaviors)

        - Relationships between classes
- # What does a class diagram look like?

      - A box divided into three parts:
          - Top part contains the class name
          - Middle part contains attributes with their access modifiers (+, -, #) and data types
              - (+) indicates public
              - (-) indicates private
              - (#) indicates protected
          - Bottom part contains methods with their access modifiers, return types and parameters
      - Static attributes and methods are underlined
      - Abstract classes and methods are shown in italics
      - If it's a interface it's declared as <<Interface_Name>>

- # What is the difference between LLD and HLD?

    - HLD 
        - Focuses more on how the entire system is working and its components
        - Includes Frontend, Backend, API calls between them, Load Balancing 
    
    - LLD 
        - Focuses more on the implementation of each component 
        - Includes the relationships between classes, objects, attributes etc.


- # Explain Association 

    - It's the simplest relationship exists between two classes. Which says that whether Class A can access Class B OR Class A have the reference to the Class B .

    - It focus on relationships like "can call" , "uses" , "any role" (drives) between two classes

    It’s the most **generic relationship**, often read as:

    > "**Class A uses or is connected to Class B**"

    It can be:

    * **Unidirectional** (A → B): A knows B, but B doesn't know A.
    * **Bidirectional** (A ↔ B): Both know each other.

    ---

    ### 🔁 Example: Association (Unidirectional)

    ```
    +----------+        uses        +-----------+
    |  Person  | -----------------> |  Vehicle  |
    +----------+                   +-----------+
    ```

    **Meaning**: A `Person` *uses* a `Vehicle`. The `Person` class may have a reference to `Vehicle`, but `Vehicle` doesn’t know about `Person`.

    In code:

    ```java
    class Person {
        private Vehicle vehicle;
    }
    ```

    ---

    ### 🔁 Example: Association (Bidirectional)

    ```
    +----------+      drives        +-----------+
    |  Person  | <----------------> |  Vehicle  |
    +----------+                   +-----------+
    ```

    **Meaning**: `Person` drives a `Vehicle`, and `Vehicle` knows who the `Person` is.

    In code:

    ```java
    class Person {
        private Vehicle vehicle;
    }

    class Vehicle {
        private Person owner;
    }
    ```

    ---

    ## ✅ 2. Role Names (like “driver”, “owner”)

    UML lets you name **roles** in the association — what role each class plays in the relationship.

    ```
    +----------+           +-----------+
    |  Person  |  driver   |  Vehicle  |
    |          | --------> |           |
    +----------+           +-----------+
    ```

    Here, the `Person` plays the role of **driver** in relation to the `Vehicle`.

    ---

    ## ✅ 3. "Can Call" / "Uses" Meaning

    These are ways to **interpret associations**:

    * "A uses B" → A has a reference to B (e.g., in a method)
    * "A can call B’s methods" → A has access to B’s public members

    ---

    ## ✅ 4. Multiplicity (Very Important)

    * Number of instances allowed on each end 

    ### 🎯 Syntax:

    ```
    ClassA 1 -------- 0..* ClassB
    ```

    ### 🎯 Meanings:

    | Notation      | Meaning                 |
    | ------------- | ----------------------- |
    | `1`           | exactly one             |
    | `0..1`        | zero or one             |
    | `*` or `0..*` | zero or many            |
    | `1..*`        | one or many             |
    | `m..n`        | from m to n (inclusive) |

    ---

    ### 🧠 Example 1: One Person — Many Vehicles

    ```
    +---------+ 1        owns        0..* +----------+
    | Person  | ------------------------> | Vehicle  |
    +---------+                           +----------+
    ```

    **Meaning**: A person can own multiple vehicles.

    ```java
    class Person {
        private List<Vehicle> vehicles;
    }
    ```

    ---

    ### 🧠 Example 2: 2 to 3 Persons Share One Room

    ```
    +---------+ 2..3     share      1 +--------+
    | Person  | --------------------> | Room   |
    +---------+                       +--------+
    ```

    **Meaning**: A room must have **2 to 3** persons. Strict constraint.

    ---

    ### 🧠 Example 3: A Department has zero or more Employees

    ```
    +--------------+ 1     employs     0..* +------------+
    | Department   | ----------------------> | Employee  |
    +--------------+                        +------------+
    ```

    ```java
    class Department {
        private List<Employee> employees;
    }
    ```

    ---

    ## ✅ 5. Summary Table

    | Concept          | Meaning                                                 |
    | ---------------- | ------------------------------------------------------- |
    | Association      | General connection between classes                      |
    | Unidirectional   | One class knows the other                               |
    | Bidirectional    | Both classes know each other                            |
    | Role Name        | Describes the function of the class in the relationship |
    | Multiplicity     | Number of instances allowed on each end                 |
   

# Explain Aggregation and Composition 
    **Aggregation** and **Composition**, both of which are special types of **Association**, commonly referred to as **“Has-A”** relationships.

    ---

    ## ✅ 1. What is “Has-A” Relationship?

    **“Has-A”** means one class **contains or is made up of another class**.

    * `Car has a Engine`
    * `Library has Books`
    * `Team has Players`

    Depending on the **lifetime** of the contained objects, it can be:

    * **Aggregation** (loose containment — *can exist without*)
    * **Composition** (strong containment — *cannot exist without*)

    ---

    ## ✅ 2. Aggregation (◇ Symbol)

    ### 📌 Definition:

    Aggregation is a **"Has-A"** relationship where:

    * The **contained object can exist independently** of the container.
    * It’s a **weak ownership**.

    ### 🔹 UML Symbol: **Open Diamond (◇)**

    ```
    ClassA ◇----------------> ClassB
    ```

    ---

    ### 🔁 Example: Department and Employees

    ```
    +-------------+ ◇------------> +------------+
    | Department  |     has       |  Employee  |
    +-------------+               +------------+
    ```

    **Meaning**:

    * A `Department` has Employees.
    * But `Employee` can exist even if the `Department` is deleted.

    ### 🧠 Code:

    ```java
    class Department {
        private List<Employee> employees;
    }

    class Employee {
        private String name;
    }
    ```

    ---

    ## ✅ 3. Composition (◆ Symbol)

    ### 📌 Definition:

    Composition is a **"Has-A"** relationship with **strong ownership**:

    * The contained object **cannot exist without** the container.
    * If the container is destroyed, so is the part.

    ### 🔹 UML Symbol: **Filled Diamond (◆)**

    ```
    ClassA ◆----------------> ClassB
    ```

    ---

    ### 🔁 Example: House and Room

    ```
    +--------+ ◆-------------> +-------+
    | House  |     has        | Room  |
    +--------+                +-------+
    ```

    **Meaning**:

    * A `House` is composed of `Rooms`.
    * If the `House` is destroyed, the `Rooms` have no purpose (can't exist independently).

    ### 🧠 Code:

    ```java
    class House {
        private List<Room> rooms = new ArrayList<>();
    }

    class Room {
        private String type;
    }
    ```

    Rooms are part of a specific house and don’t exist meaningfully on their own.

    ---

    ## ✅ 4. Summary Table

    | Concept     | Symbol | Can Exist Without? | Lifetime Bound | Relationship Type |
    | ----------- | ------ | ------------------ | -------------- | ----------------- |
    | Association | →      | ✅ Yes              | Independent    | Generic           |
    | Aggregation | ◇→     | ✅ Yes              | Shared         | Weak Has-A        |
    | Composition | ◆→     | ❌ No               | Tied           | Strong Has-A      |

    ---

    ## ✅ 5. Real-Life Analogy

    | Relationship | Example             | Can Exist Without?                  |
    | ------------ | ------------------- | ----------------------------------- |
    | Aggregation  | School and Students | ✅ Students can exist without school |
    | Composition  | Human and Heart     | ❌ Heart dies with human             |

    ---

    ## ✅ Final Visualization

    ```
    Library ◇----- Book        ← Aggregation (can exist independently)
    House ◆------ Room        ← Composition (can't exist without)
    ```

- # Explain Inheritance and Interface 

    These are fundamental in object-oriented design and often come up in system design and interviews.

    ---

    # ✅ 1. Inheritance (Generalization)

    ---

    ## 🔹 What is Inheritance?

    Inheritance represents a **"generalization-specialization"** relationship between classes — where one class (child) **inherits** the attributes and methods of another (parent).

    > It's often described as an **"is-a"** relationship.

    ### 📘 Example:

    * A `Dog` is a `Animal`
    * A `Car` is a `Vehicle`
    * A `Manager` is an `Employee`

    So, a child class *is a* more specific version of the parent.

    ---

    ## 🔹 UML Notation for Inheritance

    Use a **hollow triangle arrow** pointing to the parent class:

    ```
    +-----------+              +------------+
    |   Dog     |  --------▷   |  Animal    |
    +-----------+   is-a       +------------+
    ```

    In UML:

    * The arrow goes **from subclass to superclass**.
    * The triangle represents **"generalization"** (the child generalizes the parent).

    ---

    ## 🧠 In Code (Java-like):

    ```java
    class Animal {
        void makeSound() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("Bark!");
        }
    }
    ```

    * `Dog` **inherits** `makeSound()` from `Animal`.
    * It can add its own behavior (`bark()`), override existing ones, etc.

    ---

    ## 🔍 Real-world Analogy:

    | Superclass | Subclass  |
    | ---------- | --------- |
    | Vehicle    | Car, Bike |
    | Employee   | Manager   |
    | Shape      | Circle    |

    ---

    ## 📌 Key Points:

    * Promotes **code reuse** and **polymorphism**
    * Enables **Liskov Substitution Principle** (important in SOLID)
    * Subclass can override methods from superclass
    * UML triangle points **towards the more general class**

    ---

    # ✅ 2. Interface and Implementation

    ---

    ## 🔹 What is an Interface?

    An **interface** defines a **contract** — a set of method signatures that a class must implement.

    * It contains **no implementation**, only method declarations.
    * Classes can **implement** one or more interfaces.
    * Promotes **abstraction and flexibility**.

    ### 🧠 Think of it like:

    > "If a class claims to implement an interface, it *promises* to provide behavior for all its declared methods."

    ---

    ## 🔹 UML Notation for Interface

    ### Interface:

    Use the `<<interface>>` stereotype above the class name:

    ```
    <<interface>>
    +------------+
    |  Flyable   |
    +------------+
    ```

    ### Implementation:

    A **dashed arrow with a hollow triangle** pointing to the interface.

    ```
    +------------+      implements     +--------------+
    |   Bird     | ----------------▷  | <<interface>> |
    +------------+                    |   Flyable     |
                                    +--------------+
    ```

    In UML:

    * **Dashed arrow** = implementation
    * **Triangle** = pointing to interface

    ---

    ## 🧠 In Code (Java-like):

    ```java
    interface Flyable {
        void fly();
    }

    class Bird implements Flyable {
        public void fly() {
            System.out.println("Bird is flying");
        }
    }
    ```

    * `Flyable` is the **interface**
    * `Bird` **implements** it by providing a concrete `fly()` method
    ---

    ## ✅ Summary Table

    | Concept         | UML Symbol                        | Example                     | Relationship          |
    | --------------- | --------------------------------- | --------------------------- | --------------------- |
    | Inheritance     | Solid arrow with hollow triangle  | `Dog` is-a `Animal`         | is-a                  |
    | Interface Impl. | Dashed arrow with hollow triangle | `Bird` implements `Flyable` | behaves-like / can-do |

- UML Class Relationship Summary Table 
    UML Class Relationship Summary Table

    | **Relationship Name** | **UML Visual**                              | **Relationship Type**               | **Semantic Meaning**                  | **Example**                                        |
    | --------------------- | ------------------------------------------- | ----------------------------------- | ------------------------------------- | -------------------------------------------------- |
    | **Association**       | `A ───────> B` (solid line)                 | General connection                  | "can call", "uses", "knows"           | `Person ───> Vehicle` (uses a vehicle)             |
    | **Aggregation**       | `A ◇──────> B` (open diamond)               | Weak **has-a**                      | "has-a", but **can exist without**    | `Library ◇──> Book` (book can exist independently) |
    | **Composition**       | `A ◆──────> B` (filled diamond)             | Strong **has-a**                    | "has-a", but **cannot exist without** | `House ◆──> Room` (room dies with house)           |
    | **Inheritance**       | `A ─────▷ B` (solid line, hollow triangle)  | "is-a" (generalization)             | inherits behavior and state           | `Dog ▷── Animal` (Dog is-an Animal)                |
    | **Interface Impl.**   | `A - - -▷ B` (dashed line, hollow triangle) | "can-do", "behaves-like" (contract) | implements method declarations        | `Bird - -▷ Flyable` (Bird implements Flyable)      |
    | **Dependency**        | `A - - - > B` (dashed line, no triangle)    | Temporary usage                     | "depends on", "calls briefly"         | `Order - --> PaymentService` (uses in a method)    |

    ---

    ### 🧠 Notes:

    * **Association** is the broadest term. It includes aggregation and composition.
    * **Dependency** is weaker than association — no attribute reference, only short-term use.
    * **Aggregation vs Composition** is mainly about **lifetime coupling**.
    * **Inheritance** and **Interface implementation** form the **"is-a"** and **"can-do"** relationships, respectively.

- Why composition is preferred over the inheritance ?
    
    - Composition allows us to change the behavior of an object dynamically by replacing components at runtime.
    - Inheritance makes it difficult to modify an existing class hierarchy without breaking existing code
    - Inheritance can lead to deep class hierarchies, making maintenance difficult.
    - It enforces strict parent-child relationships, which can be too rigid for some designs.
