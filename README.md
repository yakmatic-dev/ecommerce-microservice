# 🛍️ E-Commerce Microservices Platform

A full-stack, containerized e-commerce platform built with **Java Spring Boot (Maven)**, **PostgreSQL**, **Docker**, and a **Next.js frontend**. This project demonstrates a scalable microservices architecture for modern web applications.

---

## 📦 Microservices Overview

Each service is an independent Spring Boot application with its own PostgreSQL database and RESTful API.

| Service         | Description                             | Port  |
|----------------|-----------------------------------------|-------|
| 🛒 Product      | Manages products catalog                | 8081  |
| 👤 User         | Manages user registration/authentication| 8082  |
| 📦 Order        | Handles orders and product checkout     | 8083  |

---

## 🧱 Tech Stack

- **Backend**: Java 17, Spring Boot, Spring Data JPA, Maven
- **Database**: PostgreSQL
- **API Docs**: Swagger UI (via Springdoc OpenAPI)
- **Containerization**: Docker, Docker Compose
- **Frontend**: Next.js + TypeScript

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yakmatic-dev/ecommerce-microservice.git
cd ecommerce-microservices

