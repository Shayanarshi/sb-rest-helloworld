# Spring Boot REST Hello World API

## 📌 Project Overview

This project is a simple REST API developed using **Java and Spring Boot**. It demonstrates how to create a REST endpoint, handle HTTP GET requests, and capture dynamic values from URL path variables.

The API accepts a name through the URL and returns a personalized welcome message.

## 🚀 Features

- Develop a REST API using Spring Boot.
- Handle HTTP GET requests.
- Capture dynamic URL values using `@PathVariable`.
- Return a personalized greeting as a response.
- Run the application using the embedded server provided by Spring Boot.

## 🛠️ Tech Stack

- **Language:** Java 21
- **Framework:** Spring Boot 4.1.1
- **Web:** Spring Web MVC
- **Build Tool:** Maven
- **Testing:** Spring Boot Web MVC Test
- **Server:** Embedded web server managed by Spring Boot

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
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── in/ashokit/
│               └── SbRestHelloworldApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## 🔗 REST API Endpoint

| Method | Endpoint | Description |
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

## ⚙️ How to Run the Project

### Prerequisites

- Java Development Kit (JDK) 21
- Git (optional, for cloning the repository)

### 1. Clone the Repository

```bash
git clone <your-repository-url>
cd sb-rest-helloworld
```

### 2. Run the Application

**Windows:**

```bash
mvnw.cmd spring-boot:run
```

**Linux / macOS:**

```bash
./mvnw spring-boot:run
```

Alternatively, open the project in an IDE such as IntelliJ IDEA or Eclipse and run `SbRestHelloworldApplication.java`.

### 3. Test the API

Open your browser or Postman and visit:

```text
http://localhost:8080/hello/Shayan
```

Replace `Shayan` with any name to receive a personalized greeting.

## 📝 Important Annotations

| Annotation | Purpose |
|---|---|
| `@SpringBootApplication` | Configures the Spring Boot application and enables auto-configuration and component scanning. |
| `@RestController` | Marks the class as
