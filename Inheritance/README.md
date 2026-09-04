# Java Inheritance

Inheritance is an **Object-Oriented Programming (OOP)** concept in Java that allows one class to acquire the properties and behaviors of another class.

It promotes **code reusability**, **method overriding**, and represents an **IS-A relationship** between classes.

---

## Definition

**Inheritance** is the mechanism by which a child class acquires fields and methods from a parent class using the `extends` keyword.

### Key Terms

- **Parent / Superclass** → The class whose properties are inherited.
- **Child / Subclass** → The class that inherits from the parent.
- **`extends`** → Keyword used to create inheritance between classes.

---

## Syntax

```java
class Parent {
    // fields and methods
}

class Child extends Parent {
    // additional fields and methods
}
```

---

## Simple Example

```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();   // inherited method
        dog.bark();  // child method
    }
}
```

### Output

```text
Animal is eating
Dog is barking
```

Here, `Dog` inherits the `eat()` method from `Animal`.

---

# Practice Problems

## 1. Smart Home Devices

### Concept

A common parent class contains properties and behavior shared by different smart-home devices.

```text
              SmartDevice
              /         \
        SmartLight    SmartFan
```

### Example Structure

```java
class SmartDevice {

    String deviceName;

    void turnOn() {
        System.out.println(deviceName + " is ON");
    }

    void turnOff() {
        System.out.println(deviceName + " is OFF");
    }
}

class SmartLight extends SmartDevice {

    void changeBrightness() {
        System.out.println("Brightness changed");
    }
}

class SmartFan extends SmartDevice {

    void changeSpeed() {
        System.out.println("Fan speed changed");
    }
}
```

### Usage

```java
SmartLight light = new SmartLight();

light.deviceName = "Living Room Light";
light.turnOn();
light.changeBrightness();
```

**Inheritance:** `SmartLight` and `SmartFan` inherit common functionality from `SmartDevice`.

---

## 2. User and Premium User

### Concept

A `PremiumUser` is a specialized type of `User`, so it can inherit common user functionality and add premium-specific features.

```text
              User
               |
          PremiumUser
```

### Example Structure

```java
class User {

    String username;

    void login() {
        System.out.println(username + " logged in");
    }

    void logout() {
        System.out.println(username + " logged out");
    }
}

class PremiumUser extends User {

    void accessPremiumContent() {
        System.out.println("Accessing premium content");
    }
}
```

### Usage

```java
PremiumUser user = new PremiumUser();

user.username = "John";

user.login();
user.accessPremiumContent();
user.logout();
```

**Inheritance:** `PremiumUser` inherits the common behavior of `User` and provides additional premium functionality.

---

## Key Points

- Java uses the **`extends`** keyword for class inheritance.
- A child class can access inherited **non-private** members of the parent class.
- Inheritance represents an **IS-A relationship**.
- It improves **code reusability**.
- A child class can add its own fields and methods.
- A child class can **override** inherited methods.
- Java supports **single, multilevel, and hierarchical inheritance** through classes.
- Java does **not** support multiple inheritance through classes.

---

## What I Practiced

### Problem 1
**Smart Home Devices**

Applied inheritance to model different smart devices sharing common functionality.

### Problem 2
**User → Premium User**

Applied inheritance to model a specialized user with additional premium features.

---

## Concept Summary

```text
Inheritance
    │
    ├── Parent Class
    │
    ├── Child Class
    │
    ├── extends
    │
    ├── Code Reusability
    │
    └── IS-A Relationship
```

> **Inheritance allows a child class to reuse and extend the functionality of a parent class.**