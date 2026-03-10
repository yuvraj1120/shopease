# 🛍️ ShopEase — DevOps Learning Project

> A production-grade Spring Boot e-commerce app used as the 
> foundation for a complete 60-day DevOps learning journey.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![DevOps](https://img.shields.io/badge/DevOps-60%20Days-blue)

---

## 🎯 What Is This Project?

This is not just a Spring Boot app — it is the base project 
for learning every major DevOps tool hands-on:

| Phase | Days | Tools |
|-------|------|-------|
| Foundations | 1–20 | Git, Maven, Docker, Jenkins, SonarQube, Nexus |
| Cloud + IaC | 21–40 | AWS, Terraform, Ansible |
| Production | 41–60 | Kubernetes, Prometheus, Grafana, Loki |

---

## 🚀 Run Locally (Right Now)

### What you need:
- Java 17
- Maven 3.x

### Steps:
```bash
# Clone the repo
git clone git@github.com:yuvraj1120/shopease.git

# Go into the folder
cd shopease

# Run the app
mvn spring-boot:run
```

App starts at: **http://localhost:8080**

---

## 📡 API Endpoints

| Method | URL | What it does |
|--------|-----|--------------|
| GET | `/products` | List all products |
| GET | `/products/{id}` | Get one product |
| POST | `/products` | Add new product |
| GET | `/cart?userId=user1` | Get user's cart |
| POST | `/cart/add` | Add item to cart |
| POST | `/order/place` | Place an order |
| GET | `/order/{id}` | Get order by ID |
| GET | `/order/all` | List all orders |
| GET | `/actuator/health` | Health check |
| GET | `/actuator/prometheus` | Metrics for Grafana |

---

## 🏗️ Project Structure
```
shopease/
├── src/main/java/com/shopease/
│   ├── controller/   ← REST API layer
│   ├── model/        ← Data models
│   ├── service/      ← Business logic
│   └── ShopEaseApplication.java
├── src/main/resources/
│   └── application.properties
├── src/test/         ← JUnit tests
├── Dockerfile        ← Added Day 11
├── Jenkinsfile       ← Added Day 10
├── terraform/        ← Added Day 21
├── k8s/              ← Added Day 41
└── monitoring/       ← Added Day 51
```

---

## 📅 Daily Progress

See [PROGRESS.md](PROGRESS.md) for the full day-by-day log.

---

## 🛠️ Tools Used (Building Over 60 Days)

- **Language**: Java 17, Spring Boot 3.x
- **Build**: Maven
- **Database**: H2 (local) → MySQL on AWS
- **CI/CD**: Jenkins + GitHub
- **Containers**: Docker + DockerHub
- **Orchestration**: Kubernetes (minikube + k3s)
- **Cloud**: AWS Free Tier
- **IaC**: Terraform + Ansible
- **Monitoring**: Prometheus + Grafana + Loki

---

*Series: #CloudAutonomics | HCL → DevOps Engineer | 60 Days*
```
```
