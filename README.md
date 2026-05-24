# 🏦 Bank Account Hierarchy (OOP Demo)

A Java-based banking system demonstrating core **Object-Oriented Programming (OOP)** principles, focusing on **Inheritance**, **Method Overriding**, and **Polymorphism**.

## 🚀 Key Features

- **Class Hierarchy:** A base `Account` class inherited by specialized account types (`SavingsAccount` and `CurrentAccount`).
- **Method Overriding:** Custom logic implemented for `decrease()` in `CurrentAccount` to support overdraft limits, while reusing logic via `super` for other operations.
- **Data Integrity:** Robust setters with validation logic to ensure accounts have positive balances and valid parameters.
- **Polymorphism:** Demonstrates how different account types behave differently under the same method calls (e.g., `print()` and `decrease()`).

## 🛠️ Concepts Applied

- **Inheritance:** Using the `extends` keyword to build an account hierarchy.
- **Method Overriding:** Customizing behavior in subclasses (e.g., interest rate effects and overdraft rules).
- **Encapsulation:** Protecting account data with private/protected fields and validation setters.
- **Constructor Chaining:** Efficient use of `super()` to initialize base class attributes.

## 💻 Project Structure

- `Account.java`: The base class providing core banking functionalities (deposit, withdrawal).
- `SavingsAccount.java`: Subclass featuring interest rate management.
- `CurrentAccount.java`: Subclass featuring overdraft limits and specific withdrawal rules.
- `Main.java`: Driver class simulating real-world banking operations.

## 👤 Author

**Rowan Ezzat** Software Engineer & Data Science Student  
- GitHub: [@rowanezzat37-dev](https://github.com/rowanezzat37-dev)
