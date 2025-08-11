# 🏢 Enterprise-Ready RESTful Product API

A production-grade **Product Inventory System** built with **Java**, **Spring Boot**, and **MySQL**, following modern backend development best practices.

This API offers **full CRUD** functionality, advanced search & filtering, robust error handling, and a clean layered architecture—designed for scalability, maintainability, and performance.

---

## 🚀 Features

- **Full CRUD Operations** — Create, Read, Update, Delete products.
- **Advanced Filtering & Search** — Filter by multiple criteria (name, price range, etc.) using JPA Specifications.
- **High-Performance Pagination** — Powered by Spring Data `Pageable` for large datasets.
- **Sorting Support** — Sort by any field, ascending or descending.
- **Centralized Error Handling** — With `@ControllerAdvice` for consistent API responses.
- **Layered Architecture** — DTOs, Service Layer, Repository Pattern for clean separation of concerns.
- **Data Validation** — Strict request validation for data integrity.

---

## 🛠️ Tech Stack

- **Language:** Java 17  
- **Frameworks:** Spring Boot, Spring Data JPA, Spring Web  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Testing:** Spring Boot Test, JUnit  
- **API Type:** RESTful API  

---

## 📦 Project Setup

### 1️⃣ Database Setup
1. Install **MySQL**.
2. Create a database:
   ```sql
   CREATE DATABASE product_db;
🔍 Query Parameters for GET /products
Pagination:
/products?page=0&size=5

Sorting:
/products?sort=price,desc

Search by name:
/products?searchTerm=Laptop

Price Range:
/products?minPrice=1000&maxPrice=1500

📬 Example Requests

   1. Database Setup:
       * Make sure you have MySQL installed.
       * Create a database named product_db.
       * Open src/main/resources/application.properties and update `spring.datasource.username` and
         `spring.datasource.password` with your MySQL credentials.

   2. Build and Run:
       * Open a terminal in the root directory (C:\Users\aabdu\myPlugin).
       * Run the command: mvn spring-boot:run
       * The application will start, and Spring Boot will automatically create the products table in your
         database.

   3. Testing with Postman:

       * Create Product (`POST`):
           * URL: http://localhost:8080/api/v1/products
           * Method: POST
           * Body (raw, JSON):

   1             {
   2                 "name": "Laptop Pro",
   3                 "description": "A powerful new laptop for professionals.",
   4                 "price": 1299.99,
   5                 "quantity": 50
   6             }

       * Get All Products (`GET`):
           * URL: http://localhost:8080/api/v1/products
           * This supports pagination and filtering:
               * .../products?page=0&size=5 (for pagination)
               * .../products?sort=price,desc (for sorting)
               * .../products?searchTerm=Laptop (for searching)
               * .../products?minPrice=1000&maxPrice=1500 (for filtering)

       * Get Product by ID (`GET`):
           * URL: http://localhost:8080/api/v1/products/1

       * Update Product (`PUT`):
           * URL: http://localhost:8080/api/v1/products/1
           * Method: PUT
           * Body (raw, JSON):

   1             {
   2                 "name": "Laptop Pro v2",
   3                 "description": "An updated, powerful new laptop for professionals.",
   4                 "price": 1399.99,
   5                 "quantity": 45
   6             }

       * Delete Product (`DELETE`):
           * URL: http://localhost:8080/api/v1/products/1
           
🧪 Testing with Postman
You can test the endpoints using Postman or any API testing tool by importing the requests as described above.



💡 Author
Abdul Hakeem
Java & Spring Boot Developer | Polarion ALM Specialist
