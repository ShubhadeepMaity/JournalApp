# JournalApp
Secure Journal App with JWT/OAuth2 auth, MongoDB, Redis-cached weather API, sentiment-based weekly emails, and Swagger-documented CRUD services.

Please visit the mastermain branch for viewing the project code.

Built a secure and scalable Spring Boot Journal Management System supporting full CRUD operations for journal entries (title, content, sentiment).
Implemented Spring Security with JWT Authentication, Basic Auth, and Google OAuth2 Login; stored OAuth2 user details as JWT tokens for seamless stateless API access.
Used MongoDB to persist user profiles, journal data, and emotion sentiment records.
Designed a Sentiment Analysis Module to track user emotions (HAPPY, SAD, ANGRY, ANXIOUS) and identify the most frequent pattern.
Created a Weekly Scheduled Email Service using Spring Scheduling to automatically send users a weekend summary based on their dominant sentiment.
Integrated WeatherStack API for real-time weather data and used Redis caching to reduce external API calls, improving performance and cost efficiency.
Documented and tested all REST endpoints using Swagger UI and Postman, ensuring clean API visibility and ease of testing.
Followed modular architecture with Controller–Service–Repository layers for maintainability and clean code structure.
