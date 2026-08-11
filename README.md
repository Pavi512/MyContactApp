# 📇 MyContactApp

## Java Console-Based Contact Management System

**MyContactApp** is a Core Java console application designed to manage
contacts and demonstrate practical Java programming concepts through a
real-world contact management scenario.

The application is organized around individual use cases such as user
registration, authentication, profile management, contact creation,
editing, deletion, searching, filtering, bulk operations, and tag
management.

> **Project Goal:** Build a structured Java application while applying
> OOP principles, Java Collections, Java 8 features, validation,
> exception handling, and reusable design approaches.

------------------------------------------------------------------------

## 🌟 What the Application Provides

### 🔐 User Features

-   Register a new user
-   Authenticate users through login
-   Manage user profile information
-   Handle user sessions
-   Protect passwords using hashing

### 👤 Contact Features

-   Add contacts
-   Maintain person and organization contacts
-   Display contact information
-   Modify existing contacts
-   Delete contacts
-   Support soft-delete and hard-delete concepts

### 🏷️ Tag Features

-   Create tags
-   Attach tags to contacts
-   Remove tags from contacts
-   Reuse tags across contacts

### 🔎 Search and Filtering

Contacts can be located using different criteria:

-   Name
-   Email
-   Phone number
-   Organization
-   Tags

The application also supports:

-   Advanced filtering
-   Sorting
-   Multiple search conditions

### ⚙️ Bulk and History Operations

-   Perform operations on multiple contacts
-   Group-related contact operations
-   Undo contact changes
-   Redo previously undone changes

------------------------------------------------------------------------

# 🎯 Project Goals

The main purpose of this project is to get practical experience with:

-   Core Java programming
-   Object-Oriented Programming
-   Java Collections Framework
-   Java 8 features
-   Design Patterns
-   Validation
-   Exception handling
-   Modular application design
-   Reusable and maintainable code

------------------------------------------------------------------------

# 🧰 Technologies and Java Features

```text
  Technology / Concept    Usage
  ----------------------- -------------------------------------
  Java                    Main programming language
  Collections Framework   Store and manage application data
  Stream API              Process and filter collections
  Lambda Expressions      Functional-style operations
  Functional Interfaces   Functional programming
  Optional                Handle optional values
  UUID                    Generate unique contact identifiers
  LocalDateTime           Work with date and time
  Regular Expressions     Validate input
  MessageDigest           Password hashing
  OOP                     Application design
```
------------------------------------------------------------------------

# 📁 Current Project Layout

The current source code is organized under the package:

``` text
com.bridgelabz.mycontactapp
```

Project structure:

``` text
MyContactApp
│
├── .idea
├── .mvn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.bridgelabz.mycontactapp
│   │   │       │
│   │   │       ├── AdvancedFiltering.java
│   │   │       ├── ApplyTags.java
│   │   │       ├── BulkOperations.java
│   │   │       ├── CreateContact.java
│   │   │       ├── DeleteContact.java
│   │   │       ├── EditContact.java
│   │   │       ├── ManageTags.java
│   │   │       ├── SearchContacts.java
│   │   │       ├── UserAuthentication.java
│   │   │       ├── UserProfileManagement.java
│   │   │       ├── UserRegistration.java
│   │   │       └── ViewContact.java
│   │   │
│   │   └── resources
│   │
│   └── test
│
└── pom.xml
```

------------------------------------------------------------------------

# 📋 Implemented Use Cases

```text
  ID      Use Case
  ------- -------------------------
  UC-01   User Registration
  UC-02   User Authentication
  UC-03   User Profile Management
  UC-04   Create Contact
  UC-05   View Contact
  UC-06   Edit Contact
  UC-07   Delete Contact
  UC-08   Bulk Operations
  UC-09   Search Contacts
  UC-10   Advanced Filtering
  UC-11   Manage Tags
  UC-12   Apply Tags
```

Each use case is represented by a separate Java class, making the
project easy to understand and extend.

------------------------------------------------------------------------

# 🧱 Object-Oriented Programming

The application is designed around the major OOP principles.

## Encapsulation

Application data can be protected inside classes using private fields
and controlled access through methods.

This helps keep the internal state of an object protected.

## Inheritance

Different types of users or contacts can share common properties through
inheritance.

For example:

``` text
User
 ├── FreeUser
 └── PremiumUser
```

and:

``` text
Contact
 ├── Person
 └── Organization
```

## Polymorphism

Common operations can be represented through parent types or interfaces
while allowing different implementations for specific contact, search,
authentication, or filtering requirements.

## Abstraction

Interfaces and abstract classes can expose required behavior without
exposing unnecessary implementation details.

------------------------------------------------------------------------

# 🔗 Object Relationships

The application can demonstrate common relationships between Java
objects:

-   **Association** --- objects interact with each other.
-   **Aggregation** --- one object can contain or manage other objects.
-   **Composition** --- an object owns another object's lifecycle.
-   **Dependency** --- one class temporarily depends on another class.

------------------------------------------------------------------------

# 🎨 Design Approach

The project is intended to demonstrate commonly used design patterns
while keeping the application modular.

### Creational

-   Builder
-   Factory
-   Singleton

### Structural

-   Decorator
-   Composite
-   Flyweight

### Behavioral

-   Strategy
-   Observer
-   Command
-   Memento
-   Specification
-   Chain of Responsibility

These patterns help demonstrate different approaches for object
creation, object structure, and communication between objects.

------------------------------------------------------------------------

# ☕ Core Java Concepts Practiced

The project brings together several important Java concepts:

-   Classes and Objects
-   Interfaces
-   Abstract Classes
-   Inheritance
-   Polymorphism
-   Encapsulation
-   Collections
-   Generics
-   Streams
-   Lambda Expressions
-   Method References
-   Comparator
-   Predicate
-   Optional
-   UUID
-   LocalDateTime
-   Regular Expressions
-   Exception Handling
-   `equals()` and `hashCode()`
-   Defensive Copy
-   Deep Copy
-   Password Hashing

------------------------------------------------------------------------

# 🔄 Application Flow

The overall console workflow can be represented as:

``` text
                 START
                   │
                   ▼
             User Registration
                   │
                   ▼
                 Login
                   │
                   ▼
          Profile Management
                   │
                   ▼
            Contact Management
                   │
          ┌────────┼────────┐
          ▼        ▼        ▼
        Create    View     Edit
          │        │        │
          └────────┼────────┘
                   ▼
                Delete
                   │
                   ▼
             Manage Tags
                   │
                   ▼
          Search / Filter
                   │
                   ▼
          Bulk Operations
                   │
                   ▼
                Logout
                   │
                   ▼
                  END
```

------------------------------------------------------------------------

# 📚 Learning Outcomes

Working on this project provides practice in:

-   Designing Java applications using OOP
-   Structuring a console-based application
-   Managing objects with collections
-   Writing reusable Java components
-   Applying Java 8 functional programming
-   Understanding and applying design patterns
-   Validating user input
-   Handling application errors
-   Separating responsibilities between different features
-   Building a foundation for future database and web integration

------------------------------------------------------------------------

# 🚀 Possible Next Steps

The current console application can later be extended with:

-   JDBC database connectivity
-   MySQL or PostgreSQL persistence
-   Spring Boot REST APIs
-   Frontend integration
-   JWT-based authentication
-   CSV/PDF contact export
-   Importing contacts from external files
-   Email notifications
-   Cloud-based backup
-   Mobile application support

------------------------------------------------------------------------

# ▶️ Running the Project

### 1. Open the project

Import **MyContactApp** into IntelliJ IDEA.

### 2. Build the project

If Maven is configured, reload the Maven project and build it from
IntelliJ.

### 3. Run the application

Run the required Java class from:

``` text
src/main/java/com/bridgelabz/mycontactapp
```

For a complete application flow, use the main entry point if one is
added to the project.

------------------------------------------------------------------------

# 📌 Project Type

**Console-Based Java Application**

``` text
Core Java
   +
OOP
   +
Collections
   +
Java 8 Features
   +
Design Patterns
   +
Validation & Exception Handling
```

------------------------------------------------------------------------

# 🔮 Future Direction

The project is structured so that the current in-memory console
implementation can later be connected to a database and exposed through
REST APIs without changing the overall purpose of the application.

------------------------------------------------------------------------

## ⭐ MyContactApp

A practical Java project for learning **Core Java, OOP, Collections,
Java 8 features, and software design patterns** through contact
management.
