 # Student Database Mini Project

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

## Project Structure & Files
- Student.java - The main class that runs the application and presents the user menu  
- InsertStudent.java - Handles the Create operation  
- ViewStudents.java - Handles the Read operation  
- UpdateStudent.java - Handles the Update operation  
- DeleteStudent.java - Handles the Delete operation  

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

### From IDE
- Locate `Student.java` in your project structure.  
- Right-click and select **Run `Student.java`.  
- The application will start and display the following menu in the console:

---- Menu ----
1. Insert Student
2. Update Student Age
3. Delete Student
4. View All Students
5. Exit
Enter your choice:

## Usage
- Enter the number corresponding to the desired action (1-5).  
- Press Enter.  
- The application will prompt for any required input based on your choice:

For Insert (1): You will be prompted to enter the student's name and age.

For Update (2): You will be asked for the student's name and their new age.

For Delete (3): You will be asked for the name of the student to delete.

For View (4): The application will display a list of all students in the database.

After the operation is complete, the menu will be displayed again until you choose (5): Exit.




