# NetApp – Scheduling Application

## Overview

this is a **Spring Boot–based scheduling application** designed around clean architecture, modularity, and pragmatic use of the Spring ecosystem. The project demonstrates how to build a maintainable backend system that combines RESTful services and persistence abstraction.

The focus is not just on functionality, but on applying industry‑standard ideas that scale well in real production environments.

---

## Technology Stack

- **Java** – Core implementation language
- **Spring Boot** – Application bootstrap, dependency injection, embedded server
- **Spring MVC** – Request routing and controller layer
- **Spring Data JPA** – Repository abstraction and data access layer
- **Hibernate / JPA** – Object–relational mapping
- **Maven** – Dependency management and build automation
- **Spring AOP** - for centralized logging and exception handling
- **Spring Security** - to secure the application with JWT tokens
- **Transactional Operations** to guarantee data safety during server pressure
- **Async Functions** for operations that does not need immediate responses like notifications and email sending

---

## Architectural Ideas

### Layered Architecture

The application follows a classic layered design:

- **Controller layer** for HTTP interactions
- **Service layer** for business logic and orchestration
- **Repository layer** for persistence and database access
- **Entity layer** for building a clean database schemes

This separation keeps responsibilities clear, reduces coupling, and makes the system easier to test and evolve.

### Repository Pattern

Spring Data repositories abstract away boilerplate CRUD logic. This allows the codebase to focus on business intent instead of low‑level database operations, while still supporting advanced queries when needed.

### Convention Over Configuration

Spring Boot’s auto‑configuration and sensible defaults are leveraged heavily, minimizing manual configuration while keeping the door open for customization via properties and profiles.

### Domain‑Driven Thinking

Entities and services are modeled around the scheduling domain itself, not framework constraints. This keeps the code expressive and aligned with real‑world concepts.

---

## Key Features

- Scheduling domain logic encapsulated in service classes
- RESTful endpoints for managing application data
- Persistence layer abstracted through JPA repositories
- Web interface backed directly by Spring controllers
- Clear project structure aligned with enterprise standards

---

## Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

note that the application does needs a .properties file with a set of values like the .example file provided with the application

---

## License

This project is intended for educational and demonstration purposes.
