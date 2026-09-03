# Java Constructors

## 📌 Overview

A **constructor** in Java is a special member of a class that is used to **initialize objects** when they are created.

A constructor:

- Has the **same name as the class**.
- Does **not have a return type**, not even `void`.
- Is automatically called when an object is created using `new`.
- Is mainly used to initialize instance variables.
- Can be **overloaded** by defining multiple constructors with different parameter lists.

---

# 1. What is a Constructor?

A constructor is a special method-like block that runs automatically when an object is created.

### Basic Syntax

```java
class ClassName {

    ClassName() {
        // initialization
    }
}
```

### Object Creation

```java
ClassName object = new ClassName();
```

When the object is created, the constructor is automatically executed.

---

# 2. Default Constructor

A **default constructor** is a constructor with no parameters.

### Syntax

```java
class ClassName {

    ClassName() {
        // initialization
    }
}
```

### Example Concept

A constructor without parameters can provide default values to an object.

For example, in the **ThermoStat** practice problem, the no-argument constructor initializes the thermostat with default settings such as:

- Target temperature → `72`
- Mode → `"Eco"`

This allows an object to be created without providing configuration values.

---

# 3. Parameterized Constructor

A **parameterized constructor** accepts values when an object is created.

### Syntax

```java
class ClassName {

    ClassName(dataType value1, dataType value2) {
        // initialize instance variables
    }
}
```

### Object Creation

```java
ClassName object = new ClassName(value1, value2);
```

The values supplied during object creation are passed to the constructor.

### ThermoStat Example

The `ThermoStat` practice problem uses a parameterized constructor to allow the user to specify:

- Target temperature
- Thermostat mode

This makes it possible to create objects with different configurations.

---

# 4. Constructor Overloading

**Constructor overloading** means having multiple constructors in the same class with different parameter lists.

The constructors must differ in their:

- Number of parameters
- Type of parameters
- Order of parameters

### Syntax

```java
class ClassName {

    ClassName() {
        // default initialization
    }

    ClassName(int value) {
        // initialization
    }

    ClassName(int value, String name) {
        // initialization
    }
}
```

This allows objects to be created in different ways.

### Example Structure

```text
Class
 │
 ├── Constructor()
 │      └── Default values
 │
 └── Constructor(value1, value2)
        └── User-provided values
```

Your **ThermoStat** problem demonstrates this concept by providing:

1. A no-argument constructor for default thermostat settings.
2. A parameterized constructor for custom temperature and mode.

---

# 5. Constructor vs Method

| Constructor | Method |
|---|---|
| Same name as class | Can have any valid name |
| No return type | Can have a return type |
| Called automatically during object creation | Usually called explicitly |
| Used mainly for initialization | Used to perform operations |
| Can be overloaded | Can also be overloaded |

---

# 6. `this` Keyword in Constructors

The `this` keyword refers to the **current object**.

It is commonly used when constructor parameters have the same names as instance variables.

### Syntax

```java
this.variable = parameter;
```

### Example Concept

```text
Constructor parameter
        ↓
     this.value
        ↓
Instance variable
```

This makes it clear that the value is being assigned to the current object's instance variable.

---

# 7. Constructor Overriding ❌

A constructor **cannot be overridden** in Java.

This is an important distinction.

### Why?

Constructor overriding is not possible because constructors are **not inherited** by subclasses.

Therefore:

```text
Constructor → Cannot be overridden
Method      → Can be overridden
```

When working with inheritance, a subclass can have its **own constructor**, but this is not constructor overriding.

---

# 8. Constructor Overloading vs Method Overriding

These concepts are different.

| Constructor Overloading | Method Overriding |
|---|---|
| Same class | Parent and child classes |
| Multiple constructors | Same method in parent and child |
| Different parameter lists | Same method signature |
| Compile-time concept | Runtime polymorphism |
| Constructors cannot be overridden | Methods can be overridden |

### Remember

> **Constructors can be overloaded, but constructors cannot be overridden.**

---

# 9. `this()` Constructor Chaining

A constructor can call another constructor in the same class using `this()`.

### Syntax

```java
ClassName() {
    this(value);
}
```

The `this()` call must be the **first statement** inside the constructor.

### Concept

```text
Constructor 1
     ↓
   this()
     ↓
Constructor 2
```

This can help avoid repeating initialization logic.

---

# 10. Practice Problem 1 — CartItem 🛒

### Objective

Create a `CartItem` class that represents an item in a shopping cart.

### Attributes

The class contains information such as:

- Product name
- Quantity
- Price per unit

### Constructor

A parameterized constructor is used to initialize all three properties when a `CartItem` object is created.

### Functionality Practiced

The problem demonstrates:

- Parameterized constructors
- Object initialization
- Instance variables
- `this` keyword
- Object methods
- Calculating total price

### Calculation

```text
Total Price = Quantity × Price Per Unit
```

### Concept Learned

The constructor ensures that each `CartItem` object is created with its required product information.

---

# 11. Practice Problem 2 — ThermoStat 🌡️

### Objective

Create a `ThermoStat` class that represents a thermostat configuration.

### Attributes

The class contains:

- Current temperature
- Target temperature
- Mode

### Constructors Practiced

The problem demonstrates **constructor overloading**.

#### No-Argument Constructor

Provides default thermostat settings.

```text
Target Temperature → 72
Mode → Eco
```

#### Parameterized Constructor

Allows custom values to be supplied when creating the object.

```text
Target Temperature → User-provided value
Mode → User-provided mode
```

### Functionality Practiced

- No-argument constructor
- Parameterized constructor
- Constructor overloading
- Object initialization
- `this` keyword
- Creating multiple objects with different constructors

---

# 12. Key Takeaways

```text
                    JAVA CONSTRUCTORS
                           │
             ┌─────────────┴─────────────┐
             │                           │
       Initialization              Object Creation
             │                           │
       ┌─────┴─────┐                     │
       │           │                     │
  No-Argument   Parameterized          new
  Constructor   Constructor
       │           │
       └─────┬─────┘
             │
      Constructor
       Overloading
```

### Important Rules

1. Constructor name must match the class name.
2. Constructors do not have return types.
3. Constructors execute when objects are created.
4. Constructors can be overloaded.
5. Constructors cannot be overridden.
6. Constructors are not inherited.
7. `this` refers to the current object.
8. `this()` can be used for constructor chaining.
9. A constructor can initialize default or user-provided values.

---

# 🧠 Quick Revision

**Constructor:**  
Used to initialize an object when it is created.

**Default / No-Argument Constructor:**  
Constructor with no parameters.

**Parameterized Constructor:**  
Constructor that accepts parameters.

**Constructor Overloading:**  
Multiple constructors in the same class with different parameter lists.

**Constructor Overriding:**  
❌ Not possible in Java.

**`this`:**  
Refers to the current object.

**`this()`:**  
Calls another constructor in the same class.