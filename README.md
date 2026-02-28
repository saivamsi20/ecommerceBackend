# ECommerceBackend

A simple Java-based e-commerce backend built to practice core Object-Oriented Programming (OOP) concepts and basic data structures.

This project is the foundation of a multi-day backend build. Day 1 focuses on setting up Git and designing the core application blueprints: Product, Cart, and User.

---

## 📖 Overview

This application simulates a basic e-commerce workflow:

- Create products
- Create a user
- Add products to the user’s cart
- Display cart contents in the console

The goal is to understand how classes interact and how data flows between objects using clean OOP structure.

---

## 🧠 Concepts Practiced

- Object-Oriented Programming (Encapsulation, Composition)
- Java constructors
- Getters and setters
- `ArrayList` for dynamic data storage
- Basic Git workflow (`init`, `add`, `commit`)

---

## 📂 Project Structure

```
ECommerceBackend/
│
├── src/
│   ├── Main.java
│   ├── Product.java
│   ├── Cart.java
│   └── User.java
│
├── .gitignore
└── README.md
```

---

## 📦 Class Breakdown

### Product.java
Represents an item available in the store.

Fields:
- `id`
- `name`
- `price`
- `stockQuantity`

Includes:
- Constructor
- Getters
- Setter for stock quantity
- `toString()` method

---

### Cart.java
Manages products selected by a user.

Uses:
- `ArrayList<Product>` to store items dynamically

Methods:
- `addItem(Product product)`
- `viewCart()`

---

### User.java
Represents a customer profile.

Fields:
- `userId`
- `username`
- `email`
- `Cart`

Each user automatically receives an empty cart when created.

---

### Main.java
Entry point of the application.

Used to:
- Create sample products
- Create a user
- Add products to the cart
- Display cart contents

---

## ▶️ How to Run

1. Navigate to the project directory:

```
cd ECommerceBackend
```

2. Compile the Java files:

```
javac src/*.java
```

3. Run the application:

```
java -cp src Main
```

---

## 🧪 Expected Output

```
Starting E-Commerce Application...

Shopping Log for Vamsi:
Added to cart: Developer Laptop
Added to cart: Premium Coffee Beans

--- Your Cart ---
- Developer Laptop ($1200.0)
- Premium Coffee Beans ($15.5)
```

---

## 📝 Initial Commit

After verifying everything works:

```
git add .
git commit -m "Day 1: Initialized Git and created core Product, User, and Cart classes"
```

---

## 🚀 Future Improvements

- Add login system using `HashMap`
- Implement inventory validation
- Remove items from cart
- Calculate cart total
- Add checkout functionality
- Persist data using file storage or database

---

This project is focused on building strong fundamentals before adding more complexity.
