# Spring Boot REST Hello World

This is a small Spring Boot project I created to learn how to build REST APIs using Spring Boot.

The application accepts a name through the URL and returns a welcome message. It helped me understand how `@RestController`, `@GetMapping`, and `@PathVariable` work.

## Technologies Used

- Java 21
- Spring Boot
- Spring Web MVC
- Maven

## Project Structure

```text
src/
 └── main/
     ├── java/
     │   └── in/ashokit/
     │       ├── SbRestHelloworldApplication.java
     │       └── controller/
     │           └── HelloWorldRestController.java
     └── resources/
         └── application.properties
```

## How to Run

Clone the repository:

```bash
git clone https://github.com/Shayanarshi/sb-rest-helloworld.git
cd sb-rest-helloworld
```

Run the application on Windows:

```bash
mvnw.cmd spring-boot:run
```

Or on Linux/macOS:

```bash
./mvnw spring-boot:run
```

## API Endpoint

**Method:** `GET`

**URL:**

```text
http://localhost:8080/hello/Shayan
```

**Response:**

```text
Hello :Shayan, Welcome to REST API!
```

You can replace `Shayan` with any name to get a different welcome message.

## What I Learned

- Creating a REST controller in Spring Boot.
- Mapping HTTP GET requests using `@GetMapping`.
- Reading values from a URL using `@PathVariable`.
- Running and testing a Spring Boot application.

## Author

**Shayan Arshi**

[GitHub Profile](https://github.com/Shayanarshi) | [Project Repository](https://github.com/Shayanarshi/sb-rest-helloworld)
