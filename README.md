Title: OAuth2.0 Authentication Gateway (Spring Boot)

Description:

This project implements a robust OAuth2.0 authentication gateway using Spring Boot, providing secure access to protected resources. It offers two authentication methods:

Username and Password: Users can log in using their credentials. The password is securely encrypted in the database for enhanced protection.
Google Sign-In: Users can conveniently authenticate using their existing Google accounts.

Features:
1. OAuth2.0 authorization framework for secure token-based access.
2. Encrypted password storage for enhanced security.
3. Flexible authentication options (username/password and Google Sign-In).
4. User-friendly login interface.
5. Error handling and validation for a seamless user experience.
6. Spring Boot framework for rapid development and deployment.
 
Prerequisites:
1. Java 8 or later
2. Spring Boot 2.x or later
3. Required Spring Boot dependencies (e.g., Spring Security, Spring Data JPA, Spring Web)
4. A supported database (e.g., PostgreSQL, MySQL)
5. Google Cloud Platform credentials (for Google Sign-In)

Configure database:
1. Create a database user and database.
2. Update the database connection settings in application.properties.

Set up Google Cloud Platform credentials:
1. Enable the Google Sign-In API in your Google Cloud Project.
2. Create a service account and download the JSON key file.
3. Place the JSON key file in the project directory and update the google.oauth2.client.id and google.oauth2.client.secret in application.properties.

Authentication:
    Username and Password:
      1. Enter your valid username and password.
      2. Click the "Login" button.
     
    Google Sign-In:
      1. Click the "Sign in with Google" button.
      2. Follow the Google authentication process.
