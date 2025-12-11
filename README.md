# JournalApp
Secure Journal App with JWT, OAuth2, MongoDB, Redis-cached weather API, sentiment-based weekly emails, and Swagger-documented CRUD services.

Please visit the mastermain branch for viewing the project code.

Developed a secure and scalable Spring Boot Journal Management System with full CRUD operations for journal entries (title, content, sentiment).
Implemented Spring Security with JWT Authentication, Basic Auth, and Google OAuth2 Login; stored OAuth2 user details as JWT tokens for secure, stateless API communication.
Utilized MongoDB to store user profiles, journal records, and sentiment data.
Built a Sentiment Tracking Module that analyzes user moods (HAPPY, SAD, ANGRY, ANXIOUS) and identifies frequently recurring emotions.
Implemented a Weekly Scheduled Email Service that sends users a weekend summary based on their dominant sentiment pattern.
Integrated WeatherStack API for retrieving weather information and optimized performance using Redis caching, significantly reducing external API calls.
Ensured clean API documentation and smooth testing using Swagger UI and Postman.
Wrote comprehensive unit tests using JUnit & Mockito to test controllers, services, and repositories, improving code reliability.
Integrated SonarQube for continuous code quality checks, ensuring adherence to clean code practices and reducing technical debt.
