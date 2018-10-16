# Spring Boot Security JWT Authentication

This is a sample project to provide example on how to add JWT token authentication in a spring boot application.
The example uses maven as a build tool. You can get started by running Application.java
 
## Technology Used
 1. Spring Boot (1.5.8.RELEASE)
 2. JWT (0.6.0)
 3. Postgresql
 4. Java 1.8
 
## APIs available
/token/getToken - Get the JWT token by providing valid username password.
/users & /user/:id - Get user information, only with a valid JWT Token.
