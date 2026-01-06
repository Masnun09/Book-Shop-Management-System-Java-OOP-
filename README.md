# Book Shop Management System (Java OOP)

## 📘 Overview
This project is a simple **Book Shop Management System** written in **Java** using the concepts of **Object-Oriented Programming (OOP)**.  
It demonstrates class inheritance, encapsulation, composition, and polymorphism through book management features.

The system manages different types of books (Story Books and Text Books) within a bookshop and allows adding, removing, and searching for books.

---

## 🧩 Project Structure
```
.
├── Book.java          # Parent class containing common attributes and methods for all books
├── StoryBook.java     # Inherits from Book; represents story-based books with category attributes
├── TextBook.java      # Inherits from Book; represents textbooks with academic attributes
├── BookShop.java      # Manages a collection of Book objects (add, remove, search, show all)
├── Start.java         # Main class containing the menu and execution logic
```

---

## ⚙️ Features
- Add, remove, and show details of books.
- Search books by ISBN.
- Separate handling for Story Books and Text Books.
- Demonstrates OOP principles:
  - **Encapsulation** – use of private fields with getter/setter methods.
  - **Inheritance** – `StoryBook` and `TextBook` inherit from `Book`.
  - **Polymorphism** – dynamic method calls for book details.
  - **Composition** – `BookShop` contains multiple `Book` objects.

---

## 🚀 How to Run
1. **Compile all files** in a Java-supported IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or terminal:
   ```bash
   javac *.java
   ```

2. **Run the main program:**
   ```bash
   java Start
   ```

3. Follow the on-screen instructions to manage books in the shop.

---

## 🧠 Concepts Demonstrated
| Concept | Example Class | Description |
|----------|----------------|--------------|
| Inheritance | `StoryBook`, `TextBook` | Extend base `Book` class |
| Encapsulation | `Book.java` | Private fields with getters/setters |
| Polymorphism | `BookShop.java` | Handles both StoryBook and TextBook through `Book` references |
| Aggregation | `BookShop.java` | Contains an array/list of `Book` objects |

---

## 🛠️ Requirements
- Java JDK 8 or higher
- A text editor or IDE (VS Code, IntelliJ, Eclipse)

---

## 📄 Author
Developed by **Mir Masnun Bin Zaman**  
(Created as part of Java OOP Lab Task — AIUB CSE Department)

---

## 📚 License
This project is open-source and free to use for educational purposes.
