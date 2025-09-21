# Student Record Management - Spring Boot REST API

## Overview

This project is a simple Student Record Management system built using Spring Boot. It offers a RESTful API to create, read, update, and delete student records. The application stores data in-memory (using a HashMap) for simplicity and rapid development.

---

## Features Implemented

- Add a new student record
- Retrieve all student records
- Retrieve a single student by ID
- Update an existing student record
- Delete a student record by ID
- Proper HTTP response status codes using `ResponseEntity`

---

## Project Structure

- **Model:** `Student` - Represents the student entity with fields like id, name, age, and course.
- **Repository:** `StudentRepository` - In-memory data store using a HashMap.
- **Service:** `StudentService` - Business logic layer managing student data operations.
- **Controller:** `StudentController` - REST API endpoints exposing student CRUD operations.

---

## Setup & Run

1. Ensure you have Java JDK 17+ installed.
2. Use an IDE like IntelliJ IDEA or Eclipse.
3. Clone or create the project and import it into the IDE.
4. Build and run the application:
     ./mvnw spring-boot:run
5. The app runs on default port 8080 (can be customized in `application.properties`).

---

## API Endpoints

| HTTP Method | Endpoint               | Description                  | Request Body                 | Response                       |
|-------------|------------------------|------------------------------|------------------------------|-------------------------------|
| GET         |     `/students`        | Retrieve all student records | None                         | List of all students           |
| GET         |     `/students/{id}`   | Retrieve a student by ID     | None                         | Student object or 404 Not Found|
| POST        |     `/students`        | Add a new student            | JSON student object          | Created student                |
| PUT         |     `/students/{id}`   | Update a student by ID       | JSON student object          | Updated student or 404         |
| DELETE      |     `/students/{id}`   | Delete a student by ID       | None                         | 204 No Content or 404          |

---

## Example JSON Student Object

{
"name": "Alice Johnson",
"age": 22,
"course": "Computer Science"
}

---

---

## Next Steps

- Integrate a database (e.g., H2, MySQL) to replace in-memory storage.
- Add input validation and error handling.
- Secure endpoints with Spring Security.
- Add unit and integration tests.
- Deploy the application.

---

## Learning Outcomes

- Built a layered Spring Boot REST API from scratch.
- Understood core Spring concepts: Dependency Injection, Beans, Controllers, Services, Repositories.
- Learned how to use `ResponseEntity` to manage HTTP responses.
- Implemented CRUD operations with proper REST conventions.
