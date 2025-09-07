-------Student Database Mini Project-----

This is a simple Java console application that performs CRUD operations (Create, Read, Update, Delete) on a MySQL student database using JDBC.

## Features
- Insert new student records
- Update student age by name
- Delete student records by name
- View all students

## Requirements
- Java 8 or later
- MySQL Server
- JDBC MySQL Connector added to your classpath

## Database Setup
Run the following SQL commands in your MySQL console:

```sql
CREATE DATABASE StudentDatabase;
USE StudentDatabase;

CREATE TABLE students (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(100),
age INT
);
```
## How to Run
1. Clone or download this repository.
2. Compile all Java files:
3. Run the application:


Make sure to update the database connection credentials in `Student.java` if your MySQL username or password is different:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/StudentDatabase",
    "root",
    "your_password"
);
```

