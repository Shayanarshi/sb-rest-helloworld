# Spring Boot REST Hello World API

## 📌 Project Overview

This project demonstrates how to build a simple REST API using **Java 21 and Spring Boot**. It handles HTTP GET requests and returns a personalized welcome message using a dynamic URL path variable.

## 🚀 Features

- Create REST APIs using Spring Boot.
- Handle HTTP GET requests.
- Extract dynamic URL values using `@PathVariable`.
- Return responses using `@RestController`.
- Run the application using an embedded web server.

## 🛠️ Tech Stack

- **Language:** Java 21
- **Framework:** Spring Boot 4.1.1
- **Web:** Spring Web MVC
- **Build Tool:** Maven
- **Testing:** Spring Boot Test
- **API Testing:** Postman

## 📂 Project Structure

```text
sb-rest-helloworld/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── in/ashokit/
│   │   │       ├── SbRestHelloworldApplication.java
│   │   │       └── controller/
│   │   │           └── HelloWorldRestController.java
│   │   ├── resources/
│   │   │   └── application.properties
│   └── test/
│       └── java/
│           └── in/ashokit/
│               └── SbRestHelloworldApplicationTests.java
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .gitignore
└── README.md
```

## ⚙️ Prerequisites

- Java Development Kit (JDK) 21
- Git (optional)
- Postman or a web browser

## 🏃 How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/Shayanarshi/sb-rest-helloworld.git
cd sb-rest-helloworld
```

### 2. Run the Application

**Windows:**

```bash
mvnw.cmd spring-boot:run
```

**Linux / macOS:**

```bash
chmod +x mvnw
./mvnw spring-boot:run
```

Alternatively, open the project in IntelliJ IDEA or Eclipse and run `SbRestHelloworldApplication.java`.

## 🔗 REST API Endpoint

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/hello/{name}` | Returns a personalized welcome message |

### Example Request

```http
GET http://localhost:8080/hello/Shayan
```

### Example Response

```text
Hello :Shayan, Welcome to REST API!
```

