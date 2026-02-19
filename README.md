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

Configure database in:
src/main/resources/application.properties


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
