# Data Base Management System.

- What is participation constraint ?
    - It defines the association between the entity in the participation set and the related is mandatory or not.

- Types of participation constraint ?

    - Total (Mandatory) – Every entity must participate.
        Ex:- Every employee must belong to a department.
    - Partial (Optional) – Entity may or may not participate.
        Ex:- Some students may register for clubs, some may not.
    
- What is extended ER feature ?

    - ER models defines the relationships between the entities but in real world data may exhibit some hierarchical relationships and extended ER models provides these functionalities by providing code reusability and data integrity.

- What are the features provided in the EER (extended er model) ?

    - Specialization 
        - Top down approach 
        - ' is a ' relationship between the parent and the child class
        - Split an entity into subclasses.
        - Implements attribute inheritance.
        - Example: Employee → Manager, Engineer.

    - Generalization 
        - Bottom up approach 
        - ' is a ' relationship between the parent and the child class
        - Generalization – Combine similar entities into a superclass.
        - Implements attribute inheritance
        - Example: Car and Truck → Vehicle.
    
    - Aggregation  
        - A way to treat the relationship as an entity.
        - Used when a relationship itself has an attribute or participates in another relationship.
        - "Employee works on Project" → This whole thing can link to Client.
        - So, Client hires this (Employee–Project) team.

- What are the steps to draw an ER model ?

    - Identify the entities 
    - Understand it's characteristics / attributes 
    - Understand it's constraints , participants 
    - Understand it's cardinality with other entities 
    - Construct an ERD (entity relation diagram)
    - Annotate the relationship and diagram 
    - Review and refine the model ( Extended ER model)

- What is relational model ?

    - In relational model , 
        - The data's are being organized into tables
        - There exists a relation between one table to the another table using the foreign key 
        - Maintain data integrity and referential integrity
        - A flexible and effecient way to store and retrieve the data.
        - The values in the relationship model is atomic
        - Contains Primary key , candidate key and composite key to uniquely indentify the row or a record.

- Define the terms in the Relational model 

    - Tables - Relations.
    - Row - Tubles / record.
    - Column - Attribute.
    - Domain - What are the types of data that column can hold.
    - Degree - No of columns in the table.
    - Cardinality - No of tuples in the table.

- Steps in converting the ER model to the Relational model

    - Identify the entities 
        - Strong entity and Weak entity

    - Identify the attribute 
        - Composite attribute - can be divided into smaller parts 
        - Multivalued attribute - can contains multiple values in it.

    - Indentify the keys
        - Primary key , foriegn key , composite key etc..

    - Identify the relationships 
        - One to One -> 2 tables ,P.K can lie on any side
        - One to Many -> 2 tables , P.K can lie on Many side
        - Many to One -> 2 tables , P.K can lie on Many side
        - Many to Many -> 3 tables, P.K can lie on the third table (junction table) holds the primary keys of both original tables as foreign keys, and together they act as a composite primary key. 

- What is Intension and Extension in DBMS ?

    - Intension refers to schema of the table (table name , constraints,data types etc..) , it doesn't change frequently.

    - Extension refer to the actual data in the database at specific instance in a time , it keeps changing.

- What is RDBMS ?
    
    - These databases structures the data into organized tables that uses any Structured query language to insert and update data between the tables.

- What is normalization ?

    - It's a process in which we organize the data in such a way so that it reduces the data redudancy(duplications) and improves the data consistency.

    - It involves dividing a database into two or more tables.

- What happens when we have data redudancy ?

    - When we have same set of data for the same set of columns , it leads to anomalies (data inconsistency)

    - Insertion anomaly
        - Difficult to insert data into the table due to absence of other required datas
    - Updation anomaly 
        - It occurs when changes to data require multiple updates
    - Deletion anomaly 
        - It occurs when deleting the some of the data removes the valuable data completely.

- What is denormalization ?
    
    - This is the opposite of normalization , It involves intentionally introducing some redudancy to improve the query performance.

    - Provides faster and simpler queries at the same time provides data redudancy and inconsistency and make the database less flexible for the future developments.

- What is functional dependency ?

    - Functional dependency defines the relationship between the attributes in a relation.

    - x(deterministic) -> y(dependent)
        - Attribute Y is functionally dependent on attribute X
    
- What are the properties of functional dependency ?

    - Reflexivity -> If Y is a subset of X , then X (deterministic) -> Y(dependent)
    - Augmentation -> If X->Y , then XZ -> YZ for any Z 
    - Transitivity -> If X->Y and Y->Z , then X->Z
    - Union -> If X->Y and X->Z , then X->YZ
    - Decomposition -> If X ->YZ , then X->Y and X->Z

- What are the types of functional dependency ?

    - Trivial dependency 
        - X->Y is trivial where Y is the subset of X
    
    - Non Trivial dependency 
        - X->Y is not trivial where Y is not the subset of X