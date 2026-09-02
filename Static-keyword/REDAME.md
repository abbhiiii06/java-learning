# Java `static` Keyword — Practice

## 📌 Overview

The `static` keyword in Java is used to define members that belong to the **class rather than to individual objects**.

A static member is associated with the class and is shared among all objects created from that class.

I practiced the `static` concept using two real-world examples:

- 🎟️ **Online Ticket Booking System**
- 🏦 **Bank Account Management System**

These examples helped me understand when data should belong to an individual object and when it should be shared across the entire class.

---

# 🧠 What is `static` in Java?

The `static` keyword indicates that a member belongs to the **class level**.

Normally, instance members are associated with individual objects.

### Instance Member

Each object gets its own copy.

```text
Object 1 → value A
Object 2 → value B
Object 3 → value C
```

### Static Member

All objects share the same member.

```text
              Class
                │
        ┌───────┴───────┐
        │ Shared static │
        │    member     │
        └───────┬───────┘
          ┌─────┼─────┐
          ↓     ↓     ↓
       Object Object Object
```

---

# 🔑 Types of `static` Members

Java commonly uses `static` with:

- 📦 **Static Variables**
- ⚙️ **Static Methods**
- 🚀 **Static Blocks**
- 🏗️ **Static Nested Classes**

---

## 1. 📦 Static Variables

A static variable belongs to the class and has **one shared copy** for that class.

### Why use it?

Use a static variable when the data represents something that should be common to all objects.

### Examples

- Bank name
- Interest rate
- Total tickets sold
- Company name
- Number of objects created
- Common configuration

### Important Difference

| Instance Variable               | Static Variable                |
| ------------------------------- | ------------------------------ |
| Belongs to object               | Belongs to class               |
| Each object has its own copy    | Shared among objects           |
| Represents object-specific data | Represents common data         |
| Accessed through object         | Usually accessed through class |

---

# 2. ⚙️ Static Methods

A static method belongs to the class rather than an individual object.

It can be called using the **class name**, without creating an object specifically to access that method.

### Important characteristics

- Belongs to the class.
- Can directly access static members.
- Cannot directly access instance variables.
- Cannot directly call instance methods.
- Commonly used for operations that do not depend on a particular object's state.

### Real-world examples

A bank's interest-rate update is not specific to one customer's account.

Therefore, changing the common interest rate is logically a **class-level operation**.

---

# 3. 🚀 Static Blocks

A static block is used for **static initialization**.

It executes when the class is loaded and is generally used when static data requires initialization logic.

### Key points

- Executes automatically.
- Executes once for a class loading.
- Used primarily to initialize static data.
- Executes before `main()` when the class is initialized through its main entry point.

---

# 4. 🏗️ Static Nested Classes

Java also allows a nested class to be declared as `static`.

A static nested class belongs to the outer class rather than to an instance of the outer class.

This is more advanced and is useful when organizing classes that are logically related.

---

# 🌍 Real-World Practice 1 — Online Ticket Booking

## Problem

In an online ticket booking system, different customers can book different numbers of tickets.

For example:

- Abhi books tickets.
- Sai books tickets.
- Each customer has their own booking information.

However, the **total number of tickets sold** belongs to the booking system as a whole.

### Object-specific information

Each booking has:

- Customer name
- Tickets booked

### Shared information

The system has:

- Total tickets sold

Therefore, total tickets sold is a good example of a **static variable**.

### 🎯 Concept Practiced

> **Shared data across multiple objects → ****`static`**** variable**

This example helped me understand why some data should not be duplicated for every object.

---

# 🏦 Real-World Practice 2 — Bank Account Management

## Problem

A bank account contains information specific to each customer, such as:

- Account holder name
- Account balance

However, information such as:

- Bank name
- Interest rate

can be common across accounts.

For example:

```text
Account 1 → Abhi  → ₹5,000
Account 2 → Sai   → ₹6,000
Account 3 → Anu   → ₹4,500

Bank → SBI
Interest Rate → Common for all accounts
```

The bank name and interest rate are therefore suitable examples of **static data**.

---

## 💡 Important Concept Learned

The most important lesson from the bank example is understanding the difference between:

### Object State

Information that can differ from one object to another.

```text
Account Holder
Balance
```

### Class State

Information that is shared across all objects.

```text
Bank Name
Interest Rate
```

This distinction is important when designing Java classes.

---

# 🔄 Static Data Sharing

Suppose three bank account objects exist:

```text
              BankAccount Class
                     │
          ┌──────────┴──────────┐
          │                     │
     Bank Name              Interest Rate
       "SBI"                    4.5%
          │                     │
    ┌─────┼─────┐         Shared by all
    ↓     ↓     ↓
  Abhi   Sai    Anu
```

Changing the common interest rate means changing the **shared class-level value**, rather than maintaining a separate interest rate for every account object.

---

# 🧩 Static vs Instance — Core Understanding

| Feature        | Instance               | Static                |
| -------------- | ---------------------- | --------------------- |
| Ownership      | Object                 | Class                 |
| Copies         | One per object         | Shared                |
| Represents     | Individual state       | Common state          |
| Access         | Object reference       | Class name            |
| Memory concept | Associated with object | Associated with class |
| Example        | Balance                | Bank name             |
| Example        | Customer name          | Interest rate         |

---

# ⚠️ Important Rule

A static method does **not** automatically mean that everything inside it must be static.

The important rule is:

> A static context cannot directly access instance members because there is no specific object associated with that static context.

To access instance data, an object reference is required.

---

# 🎯 What I Practiced

### Online Ticket Booking

- Identified shared data.
- Used a static variable concept for total tickets.
- Observed how multiple objects affect one shared value.
- Compared customer-specific data with system-wide data.

### Bank Account

- Identified class-level information.
- Identified object-level information.
- Practiced a shared bank name.
- Practiced a shared interest rate.
- Practiced updating common class-level information.
- Observed how a change in static data can be reflected across objects.

---

# 📚 What I Learned

Through these two exercises, I learned:

- ✅ Meaning and purpose of the `static` keyword.
- ✅ Difference between **class members and instance members**.
- ✅ How static variables are shared across objects.
- ✅ When to choose static versus non-static variables.
- ✅ How static methods work.
- ✅ Why static methods are useful for class-level operations.
- ✅ The purpose of static blocks.
- ✅ How real-world problems can be mapped to class-level and object-level data.
- ✅ Why good class design requires identifying **what belongs to the object and what belongs to the class**.

---

# 🧠 Key Takeaway

The easiest way I understand `static` is:

> **If the information belongs to every object individually, make it an instance member. If the information belongs to the class as a whole, consider making it static.**

### My two examples demonstrate this clearly:

**Online Ticket Booking**

```text
Customer Name      → Instance
Tickets Booked    → Instance
Total Tickets     → Static
```

**Bank Account**

```text
Account Holder     → Instance
Balance            → Instance
Bank Name          → Static
Interest Rate      → Static
```

---

# 🚀 Why This Practice Matters

Understanding `static` is more than learning a keyword.

It develops an important **object-oriented design skill**:

### "Who owns this data?"

Before creating a variable or method, ask:

1. Is this information different for every object?
2. Or is it common to every object?
3. Does this operation depend on a particular object?
4. Or does it operate at the class level?

These questions help determine whether a member should be **instance-based or static**.

---

# 📝 Practice Summary

| Practice                  | Main Concept    | Real-World Idea               |
| ------------------------- | --------------- | ----------------------------- |
| 🎟️ Online Ticket Booking | Static Variable | Total tickets sold            |
| 🏦 Bank Account           | Static Variable | Bank name & interest rate     |
| 🏦 Bank Account           | Static Method   | Updating common interest rate |
| ☕ Java Fundamentals       | Class vs Object | Shared vs individual state    |

---

## 🔍 Concepts Covered

`static` · Static Variable · Static Method · Static Block · Static Nested Class · Class-Level State · Instance State · Shared Data · Object State · Class vs Object · OOP Design

---

## 📈 Learning Progress

**Java Fundamentals → Classes & Objects → ****`static`**** Keyword → Constructor**

This practice is part of my journey toward building a stronger foundation in **Java, Object-Oriented Programming, and Data Structures & Algorithms**.
