# Comparator and Comparable in Java

## Introduction

In Java, sorting objects is a common requirement. The `Comparable` and `Comparator` interfaces provide mechanisms to define custom ordering for objects.

## Why Do We Need Them?

- **Natural Ordering**: Define how objects of a class should be ordered naturally
- **Custom Sorting**: Enable different sorting criteria for the same object type
- **Collections Framework**: Allow collections of objects to be sorted using methods like `Collections.sort()` or `Arrays.sort()`

## Comparable

### Overview
- Interface: `java.lang.Comparable<T>`
- Method: `int compareTo(T obj)`
- Purpose: Provides natural ordering for a class
- Implementation: The class itself implements the interface

### Example

```java
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    // Constructor, getters, setters...

    @Override
    public int compareTo(Student other) {
        // Sort by ID (natural ordering)
        return this.id - other.id;
        
        // Alternatively for double comparison:
        // return Double.compare(this.gpa, other.gpa);
    }
}

// Usage
List<Student> students = new ArrayList<>();
// Add students...
Collections.sort(students); // Uses natural ordering
```

## Comparator

### Overview
- Interface: `java.util.Comparator<T>`
- Method: `int compare(T obj1, T obj2)`
- Purpose: Defines custom ordering strategies
- Implementation: Separate class or lambda expression

### Example

```java
// Class implementation
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// Usage
List<Student> students = new ArrayList<>();
// Add students...
Collections.sort(students, new StudentNameComparator());

// Lambda expression
Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

// Method reference (if getName returns Comparable)
Collections.sort(students, Comparator.comparing(Student::getName));
```

## Types of Comparators

### 1. Standard Comparator
```java
Comparator<Student> byGPA = new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
};
```

### 2. Lambda Expression
```java
Comparator<Student> byGPA = (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());
```

### 3. Static Factory Methods (Java 8+)
```java
// Simple comparator
Comparator<Student> byName = Comparator.comparing(Student::getName);

// Reversed order
Comparator<Student> byNameDesc = Comparator.comparing(Student::getName).reversed();

// Compound comparator (sort by name, then by GPA)
Comparator<Student> byNameThenGpa = Comparator.comparing(Student::getName)
                                             .thenComparing(Student::getGpa);

// Null-safe comparator
Comparator<Student> byNameNullSafe = Comparator.nullsFirst(
                                     Comparator.comparing(Student::getName));
```

## Comparable vs Comparator

| Feature | Comparable | Comparator |
|---------|------------|------------|
| Interface | java.lang.Comparable | java.util.Comparator |
| Method | compareTo(T obj) | compare(T obj1, T obj2) |
| Implementation | Inside the class being compared | Separate class |
| Number of ways to sort | One (natural ordering) | Multiple |
| Control over class code | Requires modification of the class | No modification needed |
| Usage scenario | When class can be modified and has a clear natural order | When class cannot be modified or multiple sort orders needed |

## Best Practices

1. Make `compareTo()`/`compare()` consistent with `equals()`
2. Implement `Comparable` for natural ordering
3. Use `Comparator` for multiple or context-specific ordering
4. Be careful with subtraction-based comparisons (integer overflow)
5. Use built-in comparison methods for primitives
6. Consider using the Comparator factory methods in Java 8+

## Java Collections Sort Methods

```java
// For Lists
Collections.sort(list); // Uses Comparable
Collections.sort(list, comparator); // Uses Comparator

// For arrays
Arrays.sort(array); // Uses Comparable
Arrays.sort(array, comparator); // Uses Comparator

// Java 8 Streams
List<Student> sortedList = studentList.stream()
                                    .sorted(Comparator.comparing(Student::getName))
                                    .collect(Collectors.toList());
```