# Hibernate

A simple and efficient **CRUD (Create, Read, Update, Delete)** application built using **Hibernate ORM** to demonstrate database interaction and object-relational mapping in Java.

---

## 📌 Overview

This project showcases how to use **Hibernate** to perform CRUD operations on a relational database.
It follows a clean architecture approach and demonstrates how Java objects are mapped to database tables using ORM.

---

## 🛠️ Tech Stack

* **Java**
* **Hibernate ORM**
* **MySQL / H2 Database**
* **JDBC**
* **Maven**

---

## ⚙️ Features

✔️ Create new records in the database
✔️ Retrieve data using Hibernate queries
✔️ Update existing records
✔️ Delete records
✔️ Object-Relational Mapping (ORM)
✔️ Clean and modular code structure

---

## 📂 Project Structure

```id="n1cf9z"
hibernate-crud/
│
├── src/main/java/
│   ├── entity/
│   ├── dao/
│   ├── util/
│   └── main/
│
├── resources/
│   └── hibernate.cfg.xml
│
└── pom.xml
```

---

## 🧩 Key Components

* **Entity Class** → Maps Java objects to database tables
* **DAO Layer** → Handles database operations
* **Hibernate Configuration** → Database and ORM setup

---

## 🔗 CRUD Operations

### ➕ Create

Insert new data into the database

### 📖 Read

Fetch all or specific records

### ✏️ Update

Modify existing data

### ❌ Delete

Remove records from the database

---

## ▶️ How to Run

### 1️⃣ Clone the repository

```id="j8cc21"
git clone <your-repo-link>
```

### 2️⃣ Configure Database

Update `hibernate.cfg.xml`:

```xml id="n4c9od"
<property name="connection.url">jdbc:mysql://localhost:3306/your_db</property>
<property name="connection.username">root</property>
<property name="connection.password">password</property>
```

### 3️⃣ Run the Application

```id="f6bz2v"
mvn clean install
```

Run the main class to perform CRUD operations.

---

## 💡 Key Learnings

* Understanding **Hibernate ORM framework**
* Mapping Java classes to database tables
* Managing database transactions
* Writing efficient CRUD operations
* Working with **SessionFactory & Session**

---

## 🚀 Future Enhancements

* 🌐 Add REST APIs using Spring Boot
* 🧾 Add validation and exception handling
* 🔐 Integrate authentication
* 📊 Add logging and monitoring

---

## 👨‍💻 Author

**Yeswanth K**

* 💼 Software Engineer
* 🧠 Strong in Java, DSA & Backend Development

---

## ⭐ Support

If you found this helpful, give it a ⭐ on GitHub!
