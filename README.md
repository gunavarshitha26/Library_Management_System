## **📚 Library Management System**
### A Simple Java-Based Library Management System Using OOP, Exception Handling & Multithreading  

---

### **📌 Project Overview**
This **Library Management System** is a console-based Java application that allows users to manage a library efficiently. It follows **Object-Oriented Programming (OOP)** principles, utilizes **Exception Handling** for robust error management, and employs **Multithreading** for issuing books in a concurrent environment.

---

### **🚀 Features**
✔ **Book Management**  
- Add books 📖  
- Remove books ❌  
- Show available books 📚  

✔ **Member Management**  
- Add members 👤  
- Remove members ❌  
- Display all registered members  

✔ **Borrow & Return Books**  
- Issue books to members 📗  
- Return borrowed books 🔄  
- Display all borrowed books  

✔ **Concurrency & Exception Handling**  
- Multiple members can issue books simultaneously using **multithreading**  
- **Exception handling** prevents invalid inputs and operations  

---

### **🛠 Technologies Used**
- **Java** (JDK 8+)  
- **OOP Principles** (Encapsulation, Abstraction, Inheritance, Polymorphism)  
- **Exception Handling** (Try-Catch blocks)  
- **Multithreading** (Using Java Threads)  
- **Collections Framework** (HashMap for data storage)  

---

### **📂 Project Structure**
```
📦 LibraryManagementSystem  
 ┣ 📜 README.md  
 ┣ 📜 Main.java  
 ┣ 📜 Library.java  
 ┣ 📜 LibraryThread.java  
 ┣ 📜 Book.java  
 ┣ 📜 Member.java  
 ┣ 📜 .gitignore  
```

| File Name         | Description |
|-------------------|-------------|
| `Main.java`      | Contains the main method with a **menu-driven** interface for user interaction. |
| `Library.java`   | Core **library management logic** (adding/removing books, issuing/returning books, member management). |
| `LibraryThread.java` | Multithreading class that allows concurrent book issuance. |
| `Book.java`      | Represents a **book** object with ID, title, author, and availability status. |
| `Member.java`    | Represents a **library member** with a unique ID and name. |

---

### **📥 Installation & Setup**
#### **Step 1: Clone the Repository**
```sh
git clone https://github.com/your-username/LibraryManagementSystem.git
cd LibraryManagementSystem
```

#### **Step 2: Compile the Java Files**
```sh
javac *.java
```

#### **Step 3: Run the Application**
```sh
java Main
```

---

### **🎮 How to Use?**
1️⃣ **Launch the program.**  
2️⃣ **Choose an option from the menu:**  
   - Add or remove books/members  
   - Issue or return books  
   - View available or borrowed books  
3️⃣ **Enter the required details when prompted.**  
4️⃣ **Enjoy managing your library! 📚**  

---

### **📝 Sample Data (Preloaded in `Main.java`)**
📖 **Sample Books**  
| Book ID | Title | Author |
|---------|-----------------------------|------------------|
| 101     | Java Programming | James Gosling |
| 102     | Data Structures and Algorithms | Mark Weiss |
| 103     | Operating Systems | Andrew Tanenbaum |
| 104     | Database Management Systems | Raghu Ramakrishnan |
| 105     | Artificial Intelligence | Stuart Russell |

👤 **Sample Members**  
| Member ID | Name |
|-----------|------|
| 1         | Alice |
| 2         | Bob |
| 3         | Charlie |
| 4         | David |

---

### **📜 License**
This project is licensed under the **MIT License**. You are free to modify and distribute it.  

