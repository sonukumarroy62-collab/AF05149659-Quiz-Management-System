# AF05149659-Quiz-Management-System
# 🧠 Quiz Management System (Java + JDBC + MySQL)

The **Quiz Management System** is a console-based Java application that allows users to take quizzes and evaluate their performance in real-time. It is built using **Java, JDBC, and MySQL**, demonstrating how to integrate a database with a Java application to handle dynamic data such as questions, answers, and scores.

This project is ideal for learning **database connectivity, object-oriented programming, and basic exam system logic**.

---

## 🎯 Features

* 📝 Start quiz with multiple-choice questions
* 📊 Automatic score calculation
* 📚 Questions stored and fetched from database
* 🔁 Multiple questions with options
* 🧾 Display final result after quiz completion

---

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** Eclipse / IntelliJ

---

## 📁 Project Structure

```
QuizManagementSystem/
│
├── src/com/app/
│   ├── DBConnection.java
│   ├── Question.java
│   ├── QuestionDAO.java
│   ├── ExamService.java
│   └── MainApp.java
│
└── database.sql
```

---

## 🗄️ Database Schema

```sql
CREATE DATABASE quiz_system;

USE quiz_system;

CREATE TABLE questions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    question VARCHAR(255),
    option1 VARCHAR(100),
    option2 VARCHAR(100),
    option3 VARCHAR(100),
    option4 VARCHAR(100),
    correct_answer INT
);
```

---

## ▶️ How to Run the Project

1. Clone the repository
2. Import into your IDE
3. Create database using `database.sql`
4. Insert sample questions
5. Update DB credentials in `DBConnection.java`
6. Add MySQL JDBC driver
7. Run `MainApp.java`

---

## 🧪 Sample Output

```
===== ONLINE QUIZ STARTED =====

Q1: Java is?
1. Language
2. Animal
3. Car
4. Game

Your Answer: 1

===== RESULT =====
Score: 1/1
```

---

## 📌 Learning Outcomes

* JDBC database connectivity
* DAO design pattern
* Handling user input and logic building
* Real-world exam/quiz system workflow

----
