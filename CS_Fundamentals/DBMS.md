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

#### 1NF 
    - The row order shouldn't tell any informations 
    - The table should have the primary key 
    - The columns need to be atomic not multivalued 
#### 2NF 
    - Follow 1NF
    - No partial Dependencies 
    - All non-key attributes should depend on the entire primary key 
#### 3NF 
    - Follow 2NF
    - No transitive dependency 
    - All non-key attributes should depend only on the primary key not on any other non-key attributes
#### 4NF 
    - Follow 3NF
    - All the multivalued attributes should depend on the entire primary key regardless of other attributes
#### 5NF 
    - No joint dependency.
    - A table can't be described as a join result of some other tables together.
    - A table can't be splitted into smaller tables.

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

Structured Query Language used to retrieve data from the Relational database, whereas MySQL is a database which uses SQL as its querying language.

## Transactions

A sequence of SQL operations that are executed as a single unit to ensure ACID properties:
- **A - Atomic**: All or nothing
- **C - Consistency**: One state to another state
- **I - Isolation**: Transactions don't interfere with each other
- **D - Durability**: Once committed everything is permanent

### SQL Language Categories
- **TCL** - Transaction Control Language: Commit, Rollback, Savepoint
- **DDL** - Data Definition Language: Create, Alter, Drop, Truncate, Rename
- **DML** - Data Manipulation Language: Select, Insert, Update, Delete
- **DCL** - Data Control Language: Grant, Revoke

## Basic SQL Commands

```sql
SHOW DATABASE;

CREATE DATABASE <database_name>;

CREATE TABLE <table_name>
(
    column_name1 <data_type>,
    column_name2 <data_type>
);

-- Value must match the data type of the column
INSERT INTO <table_name> (column1, column2) VALUES (value1, value2); 

UPDATE <table_name> SET column1 = value1 WHERE <condition>;

-- Without WHERE condition all rows will be deleted
DELETE FROM <table_name> WHERE <condition>;
```

## Table Operations

### TRUNCATE
- Deletes all rows from the table but maintains the schema
- Faster than DELETE
- Resets the AUTO INCREMENT

### DROP
- Drops the entire table and the rows present in it including its schema
- Cannot be undone

## Different Ways to Create Tables

### CTAS - Create Table as Select
A table is created from the result of a SELECT query, but doesn't contain the PK and FK

```sql
-- Create new table
CREATE TABLE <table_name> AS SELECT COL1, COL2 FROM <existing_table> WHERE <condition>;

-- Insert into table 
INSERT INTO <table_name> SELECT COL1, COL2 FROM <existing_table> WHERE <condition>;
```

### Temporary Table
A table that exists only during the session, best suitable for intermediate calculations

```sql
CREATE TEMPORARY TABLE <table_name>
(
    col1 <data_type>,
    col2 <data_type>
);
```

### CTE - Common Table Expression
Temporary table that is available just for the next query.

```sql
WITH CTE1 AS (
    SELECT C1, C2 FROM Table WHERE <condition>
)

SELECT * FROM CTE1; -- CTE1 is available 
SELECT * FROM CTE1; -- Error: CTE1 doesn't exist
```

## Window Functions

Window functions in SQL perform calculations on a set of rows that are related to the current row without changing the number of rows in the result set.

### Advantages
- No extra joins/subquery required
- Faster on larger tables
- Cleaner syntax for analytical purposes

### Types of Window Functions

#### Aggregation Functions
- AVG(), SUM(), MIN(), MAX(), COUNT()

#### Ranking Functions
Ranking provides a rank/position to each row within a partition based on ordering

- **ROW_NUMBER()**: Doesn't care about ties, assigns unique rank for each row in the partition
- **RANK()**: Assigns unique rank, tie rows get the same rank but skips the next rank
- **DENSE_RANK()**: Assigns unique rank, tie rows get the same rank but doesn't skip the next rank
- **PERCENT_RANK()**: Calculates the relative rank of a row in a partition expressed as decimal between 0 to 1
  - Percent rank of row = (rank-1) / (total rows in partition-1)
- **NTILE(n)**: Divides the result into approximately equal parts and assigns tile number to each row

#### Value Functions
Used to retrieve values from:
- **LAG()**: Previous rows
- **LEAD()**: Next rows
- **FIRST_VALUE()**: First value in the partition
- **LAST_VALUE()**: Last value in the partition
- **NTH_VALUE(n)**: Gets the nth value from the partition

## Set Operations

### UNION
- Combines one or more SELECT statements
- Removes duplicates from the result
- Each select statement should have equal number of columns with compatible datatypes
- Columns must be in the same order
- Final result takes column names from the first select statement

### UNION ALL
- Works same as UNION but allows duplications
- Faster than UNION as it doesn't remove duplicates
- Final result takes column names from the first select statement

### JOINS
Joins establish relationships between two tables. Any column that can represent a relationship between tables can be used as the join condition, not just primary or foreign keys.

- **Inner Join**: Include only common rows 
- **Left Join**: Include everything from left and common from right
- **Right Join**: Include everything from right and common from left
- **Full Outer Join**: Includes everything from the two tables
    - SQL doesn't directly support full join, use UNION instead
- **Left Exclusive Join**: Include everything from left table but exclude rows common to both tables 
- **Right Exclusive Join**: Include everything from right table but exclude rows common to both tables
- **Full Exclusive Join**: Include everything but exclude rows common to both tables 
- **Cross Join**: Cartesian product of two tables, resulting in n*n rows, Cross join can work with and without **ON Condition**
- **Self Join**: A table joining with itself using a join condition
    - There is no specific keyword as SELF JOIN
    - Example:
        ```sql
        SELECT A.name AS Employee, B.name AS Manager
        FROM Employees A
        JOIN Employees B
        ON A.manager_id = B.id;
        ```
    - Self join without a join condition will result in a cartesian product

### Commit & Rollback
Works after the 'START TRANSACTION' statement:

- **Commit**: Save all the changes made during the transaction 
- **Rollback**: Revoke all the changes made during the transaction
        
```sql 
START TRANSACTION;

UPDATE Accounts SET balance = balance - 100 WHERE id = 10;

COMMIT; -- or ROLLBACK;
```

### Grant and Revoke
These are data control language (DCL) commands:

- **GRANT**: Provide privileges to users

```sql
CREATE USER <user_name>@<host>
IDENTIFIED BY <pwd>;

GRANT SELECT, INSERT ON <database>.<table_name>
TO <user_name>@<host>;

FLUSH PRIVILEGES;

REVOKE SELECT, INSERT ON <database>.<table_name>
FROM <user_name>@<host>;

FLUSH PRIVILEGES;
```

FLUSH PRIVILEGES is used to reload the GRANT tables in MySQL.

### Slowly Changing Dimensions
A method used in databases to track data that changes over time.

Example: A user changes from one location to another location 

- **TYPE 1**: Overwrite the old data
    - No history is maintained / old data can't be retrieved 
- **TYPE 2**: Add new columns to track versioning details 
    - History is maintained / old data can be retrieved 
- **TYPE 3**: Add a new column to track only the previous value 
    - Partial history is maintained

### Stored Procedures
A set of SQL statements that can be saved and reused when required.
Provides encapsulation and optimized query performance.

```sql 
DELIMITER $$

CREATE PROCEDURE <procedure_name>
BEGIN 
        <Statements>
END $$

DELIMITER ;

CALL procedure_name;
```

The delimiter tells SQL where the command actually ends.

### Triggers
A set of operations executed automatically in response to certain DML events such as insertion, deletion, or updates.

```sql
DELIMITER $$

CREATE TRIGGER <trigger_name>
AFTER INSERT ON <table_name>
FOR EACH ROW
BEGIN 
        <Statements>
END $$
        
DELIMITER ;
```

### Events
Events are tasks that run according to user-defined schedules.

```sql
DELIMITER $$

CREATE EVENT <event_name>
ON SCHEDULE EVERY 1 MINUTE DO 
BEGIN 
        <Statements>
END $$

DELIMITER ;
```

### Query Optimization
Improves database performance and efficiency in terms of response time, power usage, and memory consumption.

#### Ways to Optimize Queries
- **Indexing**
    - Speed up search and retrieval queries 
    - Index columns frequently used in WHERE, ORDER BY, JOIN, GROUP BY operations
- **Avoid wildcards at the beginning of LIKE**
    - It reduces the functionality of indexing 
- **Avoid functions on indexed columns**
    - Reduces the efficiency of indexing 
- **Avoid SELECT ***
    - Can slow down operations
- **Use proper joins**
- **Use EXISTS instead of IN** (when checking for presence)
    - EXISTS stops when a match is found, but IN performs a full table scan 
- **Use joins instead of subqueries**
- **Use TOP and LIMIT clauses**
- **Monitor query performance**
    - Using EXPLAIN and ANALYZE

#### EXPLAIN
```sql
EXPLAIN 
SELECT id FROM Employee WHERE index_id = 1;
```
- Shows the query execution plan without executing the query
- Helps understand how the database accesses data, including indexing and joins

#### EXPLAIN ANALYZE
```sql
EXPLAIN ANALYZE 
SELECT id FROM Employee WHERE index_id = 1;
```
- Shows the query execution plan by actually running the query
- Includes number of rows processed and time taken for each step

### Indexing
A data structure technique to speed up data retrieval operations by minimizing disk accesses.
Includes additional costs for writing and storage space.

```sql
CREATE INDEX <index_name> ON <table_name>(<column_name>);
```

**Structure of Index:**
```
Search Key : Data Reference 
```

- **Search Key**: The key (present in the table) used to search in the table
- **Data References**: Collection of pointers that point to disk blocks where key values are stored

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
