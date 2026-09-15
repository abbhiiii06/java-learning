# Multiple Inheritance in Java

## 📌 Topic

**Multiple Inheritance** is a feature where a class can inherit properties and behaviors from **more than one parent**.

### ❌ Multiple Inheritance with Classes

Java **does not support multiple inheritance using classes**.

```java
class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B {
    void showB() {
        System.out.println("Class B");
    }
}

// ❌ Not allowed in Java
class C extends A, B {
}
```

Java avoids this because it can create ambiguity when both parent classes contain methods with the same name. This is commonly known as the **Diamond Problem**.

---

## ✅ Multiple Inheritance Using Interfaces

Java supports multiple inheritance through **interfaces**.

A class can implement multiple interfaces:

```java
interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}
```

### Syntax

```java
class Child implements Interface1, Interface2 {
    // implementation
}
```

A class can also extend one class and implement multiple interfaces:

```java
class Child extends Parent implements Interface1, Interface2 {
}
```

---

# 🧠 Why Java Uses Interfaces

Multiple inheritance through interfaces allows a class to obtain different capabilities without the ambiguity associated with inheriting implementation from multiple classes.

For example:

```text
        LandVehicle
                                     AmphibiousCar
              /
             /
        WaterVehicle
```

`AmphibiousCar` can implement both `LandVehicle` and `WaterVehicle`.

---

# 💻 Practice Examples

The following examples were practiced as part of this topic.

## 1. 🚗 Amphibious Vehicle

**Files:**
- `AmpBihouscar.java`
- `LandVehicle.java`
- `WaterVehicle.java`
- `MainMethod.java`

### Concept

This example demonstrates a vehicle that can have both **land** and **water** capabilities.

```text
LandVehicle ──────┐
                  ├──> AmphibiousCar
WaterVehicle ─────┘
```

The `AmphibiousCar` can implement both interfaces and provide the required behaviors.

### Main Concept

```java
class AmphibiousCar implements LandVehicle, WaterVehicle {
    // methods from both interfaces
}
```

---

## 2. 💳 Payment System

**Files:**
- `CardPayments.java`
- `HybridPayments.java`
- `PointsPayments.java`
- `MainMethod.java`

### Concept

This example demonstrates a payment system where a hybrid payment method can combine different payment capabilities.

```text
CardPayments ──────┐
                   ├──> HybridPayments
PointsPayments ────┘
```

A class can implement multiple payment-related interfaces to support different payment methods.

### Main Concept

```java
class HybridPayments implements CardPayments, PointsPayments {
    // implementation of both payment methods
}
```

---

# 📚 Key Points

| Concept | Description |
|---|---|
| Multiple Inheritance | Inheriting from more than one parent |
| Classes | Java does not allow multiple class inheritance |
| Interfaces | Java supports multiple inheritance through interfaces |
| `implements` | Used when a class implements interfaces |
| Multiple Interfaces | A class can implement multiple interfaces |
| Diamond Problem | Ambiguity that can occur with multiple class inheritance |

---

# 🔑 Important Syntax

### One Interface

```java
class Child implements Parent {
}
```

### Multiple Interfaces

```java
class Child implements Parent1, Parent2 {
}
```

### Class + Multiple Interfaces

```java
class Child extends Parent implements Interface1, Interface2 {
}
```

---

# 🎯 What I Practiced

- Understanding multiple inheritance
- Why Java does not support multiple inheritance using classes
- Multiple inheritance using interfaces
- Implementing multiple interfaces in one class
- Real-world **Amphibious Vehicle** example
- Real-world **Payment System** example
- Using `implements` with multiple interfaces
- Understanding the Diamond Problem

---

## 📝 Summary

Java does not support:

```java
class C extends A, B
```

But Java supports:

```java
class C implements A, B
```

Therefore, **interfaces are the primary way to achieve multiple inheritance in Java** while avoiding the ambiguity associated with multiple class inheritance.
