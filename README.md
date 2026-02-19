# Student Management System

A simple web-based Student Management System built using Spring Boot for the backend and a basic frontend for user interaction.  
This project demonstrates CRUD operations, REST APIs, and frontend–backend integration.

---

## Tech Stack

**Backend**
- Java
- Spring Boot
- Maven
- REST API

**Frontend**
- React

**Database**
- Postgresql

---

## Features

- Add, update, delete students  
- View student list  
- RESTful API for backend  
- Simple frontend UI  

---


## Project Structure

Spring-boot---REST-main/
│
├── src/ # Spring Boot backend source
│ └── main/
│ └── java/
│ └── com/gayatri/studentManagement/
│ ├── controllers/ # REST controllers (APIs)
│ │ └── StudentController.java
│ ├── models/ # Entity / model classes
│ │ └── Student.java
│ ├── repository/ # JPA repositories
│ │ └── StudentRepo.java
│ ├── services/ # Business logic
│ │ └── StudentService.java
│ └── StudentManagementApplication.java
│
├── student-frontend/ # React frontend
│ ├── public/
│ ├── src/
│ │ ├── pages/ # React pages
│ │ │ ├── Home.js
│ │ │ ├── AddStudent.js
│ │ │ ├── EditStudent.js
│ │ │ ├── DeleteStudent.js
│ │ │ └── ViewStudents.js
│ │ ├── api.js # API calls to backend
│ │ ├── App.js # Main React component
│ │ ├── App.css
│ │ └── index.js # React entry point
│ ├── package.json # Frontend dependencies
│ └── package-lock.json
│
├── .mvn/ # Maven wrapper files
├── pom.xml # Backend dependencies
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md


## How to Download and Setup

1. Click **Code → Download ZIP** from this GitHub repository  
2. Extract the ZIP file on your system  
3. Open the extracted project folder

---

## Run Frontend

1. Go to the frontend folder:

```bash
cd student-frontend
```
Install dependencies:
```
npm install
```
Start the frontend server:
```
npm start
```
Open in browser:
```
http://localhost:3000
```
## Run Backend
Go to the backend folder:
```
cd student-backend
```
Configure database in:
```
src/main/resources/application.properties
```
Run the Spring Boot application:
```
mvn spring-boot:run
```
or run the main class:
```
StudentManagementApplication.java
```
Backend will run on:
```
http://localhost:8080
```
