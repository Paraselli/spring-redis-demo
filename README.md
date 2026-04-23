# 🚀 Spring Boot + Redis Demo

## 📌 Overview

This project demonstrates how to integrate **Redis caching** with a **Spring Boot application**.

It shows how Redis can be used to:

* Improve application performance
* Reduce database load
* Cache frequently accessed data

---

## 🧩 Architecture

Client → Spring Boot API → Redis Cache → Database (Optional)

* Requests are first checked in Redis
* If data exists → return from cache
* If not → fetch from DB and store in Redis

---

## 🛠️ Tech Stack

* Java 17
* Spring Boot
* Spring Data Redis
* Redis
* Docker
* Maven

---

## 📂 Project Structure

```id="j3k4md"
spring-redis-demo/
├── RedisConfig.java
├── User.java
├── UserController.java
├── UserService.java
├── UserRepository.java
├── SpringRedisDemoApplication.java
├── docker-compose.yml
└── README.md
```

---

## ⚙️ Setup Instructions

### 🔹 Clone Repository

```id="9s7lq2"
git clone https://github.com/Paraselli/spring-redis-demo.git
cd spring-redis-demo
```

---

### 🔹 Run Redis (Docker)

```id="l3w9kd"
docker-compose up -d
```

---

### 🔹 Run Application

```id="8d2jpl"
mvn spring-boot:run
```

---

## 🔄 API Endpoints (Example)

| Method | Endpoint | Description   |
| ------ | -------- | ------------- |
| GET    | /users   | Get all users |
| POST   | /users   | Create user   |

---

## ⚡ Redis Caching Flow

1. Client sends request
2. Application checks Redis cache
3. If data exists → return from Redis
4. If not → fetch from DB → store in Redis → return response

---

## 🚀 Features

* Redis caching integration
* Improved performance
* Reduced database calls
* Clean layered architecture

---

## 📈 Future Improvements

* Add TTL (Time-To-Live) for cache
* Add distributed caching
* Add monitoring (Prometheus/Grafana)
* Add authentication (JWT)
* Deploy to cloud (Azure/AWS)

---

## 💥 Author

Ram P

---

## 🔗 Connect with me

🔗 https://linkedin.com/in/ram-paraselli
💻 https://github.com/Paraselli

---

## ⭐ If you like this project, give it a star!
