
# 🛍️ E-Commerce Microservices Platform

A full-stack, containerized e-commerce platform built with **Java Spring Boot (Maven)**, **PostgreSQL**, **Docker**, and a **Next.js frontend**. This project demonstrates a scalable microservices architecture for modern web applications.

---

## 📦 Microservices Overview

Every microservice functions as a self-contained Spring Boot application, paired with a dedicated PostgreSQL database hosted externally. These services interact via RESTful APIs, with each independently configured to connect to its assigned database through secure connection strings.

| Service         | Description                              | Port  |
|-----------------|------------------------------------------|-------|
| 🛒 Product       | Manages product catalog                  | 8081  |
| 👤 User          | Manages user registration/authentication | 8082  |
| 📦 Order         | Handles orders and product checkout      | 8083  |
| 🌐 Frontend      | Next.js web UI                           | 3000  |
| 🌐 Gateway       | Nginx reverse proxy                      | 80    |

---

## 🧱 Tech Stack

- **Backend**: Java 17, Spring Boot, Spring Data JPA, Maven
- **Database**: PostgreSQL
- **API Docs**: Swagger UI (via Springdoc OpenAPI)
- **Containerization**: Docker, Docker Compose
- **CI/CD**: GitHub Actions (for Docker image builds & pushes)
- **Frontend**: Next.js + TypeScript
- **Gateway**: Nginx reverse proxy

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yakmatic-dev/ecommerce-microservice.git
cd ecommerce-microservices
```

---

## 🐳 Dockerized Microservices Deployment

### Step 1: Build Docker Images Locally 

```bash
docker build -t your-dockerhub-username/product-service ./product-service
docker build -t your-dockerhub-username/user-service ./user-service
docker build -t your-dockerhub-username/order-service ./order-service
docker build -t your-dockerhub-username/frontend-app ./frontend-app
```

### Step 2: Push Images to Docker Hub (via GitHub Actions)

Each microservice includes a `.github/workflows/docker-image-and-build.yml` that automates:

- Docker image builds on push
- Login to Docker Hub using GitHub secrets
- Push to your Docker Hub repository

> ✅ **Secrets needed**:
> - `DOCKER_USERNAME`
> - `DOCKER_TOKEN`

### GitHub Workflow Sample (`.github/workflows/docker-image-and-build.yml`)
CHECK THE PATH ecommerce-microservice/.github/workflows/docker-image-and-build.yml


### Step 3: Set Up Nginx as API Gateway
The api gateway see ref :ecommerce-microservices/nginx/gateway.conf


### Step 4: Launch the Full Application with Docker Compose

```bash
docker compose up --build
```

---

## 🌐 Accessing the Platform

- 🛍️ **Frontend**: `http://192.168.0.132:3000`
- 📘 **Swagger Docs**:
  - Product: `http://192.168.0.132:8081/api/products/`
  - User: `http://192.168.0.132:8082/api/users/`
  - Order: `http://192.168.0.132:8083/api/orders/`

---

## 📂 Project Structure

```
ecommerce-microservices/
├── docker-compose.yml
├── nginx/
│   └── gateway.conf
├── product-service/
├── user-service/
├── order-service/
├── frontend-app/
└── .github/
    └── workflows/
```

---

## 📄 contact yakubiliyas12@gmail.com
