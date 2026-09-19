# Java Abstraction

## 📌 Definition

**Abstraction** in Java is the process of hiding implementation details and showing only the essential functionality to the user.

Abstraction can be achieved using:

- **Abstract Classes**
- **Interfaces**

---

## 🔹 Syntax

```java
abstract class ClassName {

    // Concrete method
    public void methodName() {
        // implementation
    }

    // Abstract method
    public abstract void abstractMethod();
}
```

A subclass extends the abstract class and provides the implementation of the abstract method.

```java
class ChildClass extends ClassName {

    @Override
    public void abstractMethod() {
        // implementation
    }
}
```

---

## 🔹 Key Points

- An abstract class is declared using the `abstract` keyword.
- An abstract class cannot be instantiated directly.
- An abstract class can contain both **abstract and concrete methods**.
- An abstract method does not have a method body.
- A subclass uses the `extends` keyword to inherit an abstract class.
- The subclass must implement the abstract methods of the parent class.
- Abstract classes can contain variables and constructors.
- Abstraction focuses on **what an object does** rather than **how it does it**.

---

## 🔹 Abstract Method

An abstract method is declared without a method body.

```java
public abstract void operate();
```

The implementation is provided by the child class.

---

## 🔹 Concrete Method

A concrete method contains its implementation.

```java
public void turnOn() {
    System.out.println("Device turned on");
}
```

Concrete methods can be directly inherited by subclasses.

---

## 🔄 How Abstraction Works

```text
             Abstract Class
                   │
          ┌────────┴────────┐
          │                 │
     Common Methods    Abstract Methods
          │                 │
          │                 ↓
          │          Child Class
          │                 │
          └─────────────────┘
                    │
                    ↓
             Actual Implementation
```

The abstract class defines the common structure, while child classes provide the specific implementation.

---

## 🎯 Concepts Practiced

- Abstraction
- Abstract class
- Abstract method
- Concrete method
- `abstract` keyword
- `extends` keyword
- Method overriding
- Inheritance
- Runtime polymorphism
- Code reusability

---

## 🆚 Abstract Class vs Interface

| Feature | Abstract Class | Interface |
|---|---|---|
| Keyword | `abstract class` | `interface` |
| Inheritance | `extends` | `implements` |
| Abstract methods | ✅ Yes | ✅ Yes |
| Concrete methods | ✅ Yes | ✅ Yes |
| Variables | ✅ Yes | Constants by default |
| Multiple inheritance | ❌ Not with classes | ✅ Supported |
| Object creation | ❌ Not directly | ❌ Not directly |

---

## 📝 Summary

> **Abstraction = Hiding implementation details and exposing essential functionality.**

An abstract class provides a common structure and allows subclasses to define their own specific behavior.
