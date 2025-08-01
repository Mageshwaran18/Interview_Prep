# Data Base Management System

## Data Model 
* Schema diff Data Model 
    * Schema - Actual implementation of Data Model 
    * Data Model - An abstract representation of how the data has been stored and structured
* Types of data Model
    - Hierarchical Data Model - Single parent to a child, Tree
    - Network Data Model - Multiple parent to a child, graphs
    - Relational Data Model - Table and columns, Relationship between one to another, SQL 
    - No SQL Data Model - Document oriented, unstructured data
    - Entity Relationship model - Data through entities (objects) and its attribute (characteristics)

## ER model 
* Representing entities, relationships, attributes of them
* Entity 
    - The table 
    * Types of entities 
        - Strong entity - Contains PK, does not depend on any other entity
        - Weak entity - Doesn't contain PK, depends on another entity
* Attributes 
    - The columns 	
    * Types of Attributes 	
        - Simple - Atomic, cannot be divided further 
        - Composite - Made up of several parts 
        - Single valued - single value 
        - Multi valued - Multiple values 
        - Stored attribute - As a part of data base record already (ex: DOB)
        - Derived attribute - Being derived within the database (ex: age is derived using DOB) 
        - Complex attribute - A group of smaller attributes (ex: name -> (first name, middle name, last name))
        - Key Attribute - Used to uniquely identify the rows
* Relationship 
    - Association between two entities 
    * Types of relationship
        - Strong relationship - One can't exist without another 
        - Weak relationship - One can exist without another 
* Degree 
    - Defines the number of columns that a table contains
    * Types of Degree
        - Unary 
        - Binary 
        - Ternary 
        - N-ary

* Null value occurring reason 
    - Don't know what to fill 
    - Unwanted info
    - Forget to fill
    
* Based on degree / cardinality relationships 
    - One to One [Person - Passport] - any one can be PK 
    - One to Many [Author - Book] - PK should lie on Many side
    - Many to One [Employees - Department] - PK should be on the many side 
    - Many to Many [Student - Course] - A junction table is needed which is also know as Association / Linking table between two entities

## Participation constraint
- It defines the association between the entity in the participation set and the related is mandatory or not

### Types of participation constraint

- Total (Mandatory) – Every entity must participate.
    - Ex: Every employee must belong to a department.
- Partial (Optional) – Entity may or may not participate.
    - Ex: Some students may register for clubs, some may not.
        
## Extended ER feature

- ER models defines the relationships between the entities but in real world data may exhibit some hierarchical relationships and extended ER models provides these functionalities by providing code reusability and data integrity.

### Features provided in the EER (extended ER model)

- Specialization 
    - Top down approach 
    - 'is a' relationship between the parent and the child class
    - Split an entity into subclasses
    - Implements attribute inheritance
    - Example: Employee → Manager, Engineer

- Generalization 
    - Bottom up approach 
    - 'is a' relationship between the parent and the child class
    - Generalization – Combine similar entities into a superclass
    - Implements attribute inheritance
    - Example: Car and Truck → Vehicle
        
- Aggregation  
    - A way to treat the relationship as an entity
    - Used when a relationship itself has an attribute or participates in another relationship
    - "Employee works on Project" → This whole thing can link to Client
    - So, Client hires this (Employee–Project) team
    - So, we use Aggregation:
    - Create aggregation:
        - (Employee — Works_On — Project) → treat this as a single unit
        - Now link:
            - Manager — Supervises — Aggregated(Works_On)

### Steps to draw an ER model

1. Identify the entities 
2. Understand its characteristics / attributes 
3. Understand its constraints, participants 
4. Understand its cardinality with other entities 
5. Construct an ERD (entity relation diagram)
6. Annotate the relationship and diagram 
7. Review and refine the model (Extended ER model)

## Relational model 

- In relational model:
    - The data is organized into tables
    - There exists a relation between one table to another table using the foreign key 
    - Maintain data integrity and **referential integrity**
    - A flexible and efficient way to store and retrieve the data
    - The values in the relationship model are atomic
    - Contains **Primary key**, **candidate key** and **composite key** to uniquely identify the row or a record

### Terms in the Relational model 

- Tables - Relations
- Row - Tuples / record
- Column - Attribute
- Domain - Types of data that column can hold
- Degree - Number of columns in the table
- Cardinality - Number of tuples in the table

### Steps in converting the ER model to the Relational model

1. Identify the entities 
     - Strong entity and Weak entity

2. Identify the attribute 
     - Composite attribute - can be divided into smaller parts 
     - Multivalued attribute - can contain multiple values

3. Identify the keys
     - Primary key, foreign key, composite key etc.

4. Identify the relationships 
     - One to One -> 2 tables, P.K can lie on any side
     - One to Many -> 2 tables, P.K can lie on Many side
     - Many to One -> 2 tables, P.K can lie on Many side
     - Many to Many -> 3 tables, P.K can lie on the third table (junction table) which holds the primary keys of both original tables as foreign keys, and together they act as a composite primary key

### Intension and Extension in DBMS

- Intension refers to schema of the table (table name, constraints, data types etc.), it doesn't change frequently.
- Extension refers to the actual data in the database at specific instance in time, it keeps changing.

### RDBMS

- These databases structure the data into organized tables that use Structured Query Language to insert and update data between the tables.

## Normalization 

- It's a process in which we organize the data in such a way to reduce data redundancy (duplications) and improve data consistency.
- It involves dividing a database into two or more tables.

### Effects of data redundancy

- When we have same set of data for the same set of columns, it leads to anomalies (data inconsistency)

- Insertion anomaly
    - Difficult to insert data into the table due to absence of other required data
- Updation anomaly 
    - Occurs when changes to data require multiple updates
- Deletion anomaly 
    - Occurs when deleting some data removes valuable data completely

### Denormalization

- This is the opposite of normalization, it involves intentionally introducing some redundancy to improve query performance.
- Provides faster and simpler queries while introducing data redundancy and inconsistency, making the database less flexible for future developments.

## Functional dependency

- Functional dependency defines the relationship between the attributes in a relation.
- x(deterministic) -> y(dependent)
    - Attribute Y is functionally dependent on attribute X
        
### Properties of functional dependency

- Reflexivity -> If Y is a subset of X, then X (deterministic) -> Y(dependent)
- Augmentation -> If X->Y, then XZ -> YZ for any Z 
- Transitivity -> If X->Y and Y->Z, then X->Z
- Union -> If X->Y and X->Z, then X->YZ
- Decomposition -> If X->YZ, then X->Y and X->Z

### Types of functional dependency

- Trivial dependency 
    - X->Y is trivial where Y is the subset of X
        
- Non-Trivial dependency 
    - X->Y is not trivial where Y is not the subset of X
