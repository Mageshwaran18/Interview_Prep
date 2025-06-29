### 1. What are Generics in Java?

Generics allow you to write classes, interfaces, and methods with a placeholder type, enabling **type-safe** code that works with any data type. They improve code reusability and eliminate the need for explicit type casting.

### 2. Why Do We Need Generics?

Generics provide:

- **Type Safety**: Catch type errors at compile time.
- **Code Reusability**: Write flexible, reusable code.
- **Eliminate Casting**: No need for explicit type casting when retrieving elements.

**Example Scenario**:
Without generics, using a raw `ArrayList` to store integers requires casting and risks type errors:
```java
ArrayList list = new ArrayList();
list.add(10);
Integer num = (Integer) list.get(0); // Requires casting, prone to errors
```
With generics, you ensure type safety:
```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
Integer num = list.get(0); // No casting needed, type-safe
```

### 3. Example of a Generic Class
```java
public class Box<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

Box<Integer> intBox = new Box<>();
intBox.setItem(10);
System.out.println(intBox.getItem()); // Output: 10
```

### 4. Example of a Generic Method
A generic method that returns a generic type:
```java
public class Utility {
    public static <T> T getFirstElement(List<T> list) {
        return list.isEmpty() ? null : list.get(0);
    }
}

List<String> strings = Arrays.asList("Hello", "World");
String first = Utility.getFirstElement(strings); // Returns "Hello"
```

### 5. Generic Class with Type Restriction (Using Class and Interface)

- You can restrict generics using `extends` for a class or interface.
- You can extend only one class and many interfaces.
- Even for the interface use extends and not implements

```java
public class RestrictedBox<T extends Number & Comparable<T>> {
    private T item;
    
    public RestrictedBox(T item) {
        this.item = item;
    }
    
    public T getItem() {
        return item;
    }
}

RestrictedBox<Integer> intBox = new RestrictedBox<>(10); // Works (Integer extends Number and implements Comparable)
RestrictedBox<String> strBox = new RestrictedBox<>("Test"); // Compile-time error (String is not a Number)
```

### 6. What is a Wildcard in Java?

Wildcards (`?`) in generics allow flexibility when the exact type is unknown or you want to work with a range of types. There are three types:
- **Unbounded Wildcard**: `?` (e.g., `List<?>`)
- **Upper-Bounded Wildcard**: `? extends Type` (e.g., `List<? extends Number>`) [ Allow all it's child class ex:- Integer, Double , Float ]
- **Lower-Bounded Wildcard**: `? super Type` (e.g., `List<? super Integer>`) [ Allow all it's parent class ex:- Object , Number and not Double , Float]

**Why `List<Object> != List<Integer>`?**
Even though `Integer` inherits from `Object`, generics are **invariant**. A `List<Integer>` is not a subtype of `List<Object>`, as this could lead to type safety issues. For example:
```java
List<Integer> intList = new ArrayList<>();
List<Object> objList = intList; // Not allowed, but assume it was
objList.add("Hello"); // Adding a String to a List<Integer> breaks type safety
```

**Wildcard Example**:
To allow flexibility, use wildcards:
```java
public void printList(List<?> list) { // Unbounded wildcard
    for (Object item : list) {
        System.out.println(item);
    }
}

public void printNumbers(List<? extends Number> list) { // Upper-bounded wildcard
    for (Number num : list) {
        System.out.println(num);
    }
}

List<Integer> intList = Arrays.asList(1, 2, 3);
List<Double> doubleList = Arrays.asList(1.1, 2.2);
printList(intList); // Works
printNumbers(intList); // Works
printNumbers(doubleList); // Works
```

This ensures type safety while allowing flexibility with collections of different types.