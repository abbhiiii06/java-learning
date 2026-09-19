# Java Interface

## 📌 Definition

An **interface** in Java is a blueprint that defines a set of methods that implementing classes must provide.

Interfaces are mainly used to achieve **abstraction** and support **multiple inheritance** in Java.

---

## 🔹 Syntax

```java
interface InterfaceName {

    returnType methodName();

}
```

A class implements an interface using the `implements` keyword:

```java
class ClassName implements InterfaceName {

    @Override
    public returnType methodName() {
        // implementation
    }

}
```

---

## 🔹 Key Points

- An interface is declared using the `interface` keyword.
- A class implements an interface using `implements`.
- Interface methods are `public` and `abstract` by default (unless they are `default`, `static`, or `private` methods).
- Interface variables are `public`, `static`, and `final` by default.
- A class can implement **multiple interfaces**.
- Interfaces help achieve **abstraction** and **loose coupling**.

---

## 💳 Practice Example — Payment Method

### Interface

```java
public interface Paymentmethod {

    public void pay(double amount);

    public void getrecept();

}
```

### Explanation

The `Paymentmethod` interface defines two methods:

- `pay(double amount)` → Used to process a payment.
- `getrecept()` → Used to generate or retrieve the payment receipt.

The interface only defines **what** operations a payment method should provide. The implementing class decides **how** those operations are performed.

---

## 🔹 Example Implementation

```java
class UPI implements Paymentmethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

    @Override
    public void getrecept() {
        System.out.println("UPI payment receipt generated");
    }
}
```

---

## 🔄 How It Works

```text
Paymentmethod
      │
      ├── pay()
      │
      └── getrecept()
           │
           ▼
         UPI
           │
           ├── pay()
           └── getrecept()
```

The `Paymentmethod` interface provides the **contract**, while `UPI` provides the actual **implementation**.

---

## 🎯 Concepts Practiced

- Interface
- Abstraction
- `implements` keyword
- Method overriding
- Multiple inheritance through interfaces
- Loose coupling
- Polymorphism

---

## 📝 Summary

> **Interface = Contract**

An interface specifies **what a class must do**, while the implementing class specifies **how it does it**.
