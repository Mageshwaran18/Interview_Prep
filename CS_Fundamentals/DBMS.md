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

## SQL 

### Commit & Rollback 

    - Works after the 'START TRANSACTION' 

    - Commit -> Save all the changes made during the transactions 
    - Rollback -> Revoke all the changes made during the transactions
    
    ```sql 
    START TRANSACTION

    UPDATE Accounts SET balance = balance - 100 WHERE id = 10;

    COMMIT/ROLLBACK;
    ```

### Grant and Revoke 
    - These are data control languages 
    - GRANT -> Provide privileges to the user

    ```sql 

    CREATE USER <user_name>@<host>
    IDENTIFIED BY <pwd>

    GRANT SELECT , INSERT ON <data_base>.<table_name>
    TO <user_name>@<host>

    FLUSH privileges 

    REVOKE SELECT , INSERT ON <data_base>,<table_name>
    FROM <user_name>@<host>

    FLUSH privileges
    ```

    FLUSH privileges is used to reload the GRANT table in the MySQL

## Slowly Changing Dimensions 

    - A method used in the database to keep track of the data which changes over the time.

    EX:- A user changes from one location to the another location 

    - TYPE 1 :- Just overwrite the oldone 
        - No history is maintained / old data can't be retrieved 
    - TYPE 2 :- Add new column which keeps tracks of the versioning details 
        - History is maintained / old data can be retrieved 
    - TYPE 3 :- Add a new column which keeps track of only just previous value 
        - A partial history is maintained.

### Stored Procedure 
    - A set of SQL statements that can be saved and reused when required.
    - Provides encapsulation and optimize the query performance 

    ``` sql 
    DELIMITER $$ 

    CREATE PROCEDURE <procedure_name>
    
        BEGIN 
            <Statements>
        END $$

    DELIMITER ;

    CALL procedure_name;
    ```
    - Delimiter tells the SQL where the command actually ends

## Triggers 
    - A set of operations get executed automatically in response to a certain DML event happens such as Insertion , Deletion , Updation.

    ```sql 

    DELIMITER $$

    CREATE TRIGGER <trigger_name>

        AFTER Insert ON <table_name>
        FOR EACH ROW

            BEGIN 
                <Statements>
            END $$
    
    DELIMITER ;
    ```

## Events 

    - Events are tasks that run/executed by the user defined schedules 

    ```sql

    DELIMITER $$

    CREATE EVENT <event_name>
        ON SCHEDULE EVERY 1 MINUTE DO 
            BEGIN 
                <Statements>
            END $$

    DELIMITER ;
    ```

## Query Optimization       

- Improve performance and efficiency of the database in the context of response time, low power and memory consumptions

### Ways of Query Optimization 
- **Indexing**
    - Speed up the search and retrieval queries 
    - Index columns on the frequently used columns in the operations like WHERE, ORDER BY, JOIN, GROUP BY 
- **Avoid using Wildcards at the beginning of LIKE** 
    - It reduces the functionality of the Indexing 
- **Avoid performing functions on the indexed columns** 
    - Reduces the efficiency of the indexing 
- **Avoid SELECT *** 
    - Can slow down operations
- **Use proper joins** 
- **Use EXISTS instead of IN (while checking the presence)**
    - Because EXISTS stops when the match is found but IN will perform a full table scan 
- **Use joins instead of subqueries** 
- **Use TOP and LIMIT**
- **Monitor Query performance**
    - Using EXPLAIN and Analyze 

    #### Explain
    ```sql
    EXPLAIN 
    SELECT id FROM Employee WHERE index_id = 1;
    ```

        - Shows the query execution plan without actually executing the query .
        - Helps to understand how the database is being accessed with indexing and join.
    
    #### Explain Analyze 
    ```sql
    EXPLAIN ANALYZE 
    SELECT id FROM Employee WHERE index_id = 1;
    ```
        - Shows the query execution plan by actually running the query
        - It includes number of rows processed , time taken for each step.



## Indexing 

- A data structure technique implemented to speed up the data retrieval operation on a database table by minimizing the number of disk accesses 
- Comes with the additional cost on writing and storage space for the indexing 

```sql
CREATE INDEX <index_name> ON <column_name>
```

```
Structure of Index:
Search Key : Data Reference 
```

- Search Key is the key (present in the table) we used to search in the table
- Data references are the collections of pointers that point to the disk block where the value of the key is stored

### Need for Indexing
- Faster Search operations 
- Efficient Query Processing 
- Improved sorting 

### Types of Indexing 
- **Primary Index**
    - Indexing performed on the primary key column 
    - Types of primary index:
        - **Dense Index**
            - Every primary key will have its own index for faster retrieval 
            - Additional storage space for the storage of indexing 
        - **Sparse Index**
            - Every row / primary key will not have its own separated indexing 
            - Instead couple of range is being selected for the primary key and for every range the indexing is performed 
- **Secondary Index** 
    - Indexing which are performed on the non-primary columns 
- **Multi-level Secondary Index** 
    - While using the sparse indexing the ranges are subdivided into another range to create a secondary level of indexing
    - Reducing the search space and size a little bit 
    - When using sparse indexing, we don't index every record — only certain ranges
    - To improve efficiency, these ranges are further subdivided to form a second level of indexing
    - This creates a hierarchical structure (like index on index)
- **Clustered Index** 
    - More than one columns are grouped together to get the unique values and indexing performed on that group of columns 
- **Ordered Index** 
    - Ordered Index are the index which stores the index in the sorted order making sure that retrieval and search is faster as they were sorted/ordered frequently

### Disadvantages of Indexing
- Increased storage space 
- Slower write operation
- High maintenance complexity 

## B and B+ Trees 

- In DBMS efficient data storage and retrieval are very important. B and B+ trees enable that by fastening the process of insertion, deletion, searching operations
- Both the B and B+ trees are self-balancing trees 

### B Trees    
- Self-balanced trees allow operations like searching, adding, removing and accessing data quickly 

**Properties**
- Each node can have M children and M-1 keys
- Non-root and non-leaf nodes can have at least M/2 children
- All leaves are at the same level 
- Keys within the nodes are sorted and used as a guiding search 
- Nodes are added only at the leaf nodes
- **Data can be found in both the internal and leaf nodes**
- **Requires less memory compared to the B+ Trees**

### B+ Trees 
- It's extended version of the B trees, where all the keys are stored at leaf level and internal nodes are only used to store the keys which is used for guiding purposes 

**Properties**
- Each node can have M children and M-1 keys
- Non-root and non-leaf nodes can have at least M/2 children
- All leaves are at the same level 
- **Only the leaf node contains the data**
- **Requires more memory compared to the B trees**

### Applications of B and B+ trees 
- **Databases**: Databases like MySQL and PostgreSQL use B+ Trees for fast query performance
- **Search Engines**: B+ Trees index web pages by keywords for quick retrieval
## Partitioning 

- Partitioning means splitting a large table into smaller parts (partitions) to improve performance and manageability.
- Data is divided logically, but stored separately
- Queries can skip partitions, making reads faster
- Each partition can be indexed, managed, or stored independently

```sql
CREATE TABLE Sales (
    id INT,
    sale_date DATE
)
PARTITION BY RANGE (YEAR(sale_date)) (
    PARTITION p2022 VALUES LESS THAN (2023),
    PARTITION p2023 VALUES LESS THAN (2024)
);
```

### Types of partitioning 
- **List Partitioning**
        - Partitions data based on specific values in a column.
        - You manually define which values go into which partition.
        ```sql
        PARTITION BY LIST (region) (
            PARTITION p_north VALUES IN ('North'),
            PARTITION p_south VALUES IN ('South')
        );
        ```

- **Hash Partitioning**
        - Partitions data using a hash function on a column's value.
        - Values are automatically distributed across partitions.
        - It works only on the integer based columns 
        ```sql
        PARTITION BY HASH(user_id)
        PARTITIONS 4;
        ```
