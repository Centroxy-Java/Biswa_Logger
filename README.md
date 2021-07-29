# Biswa_ExceptionHandling_In_Rest_API


# Written By

Biswajit Pradhan

Spring Security provides security services for the Spring IO Platform. Spring Security 5.0 requires Spring 5.0 as a minimum and also requires Java 8.

# Downloading Artifacts

See [Getting Spring Security](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#getting) for how to obtain Spring Security.

# Flow of the Project

Create a Spring starter project.

Choose your Artifacts

       - Spring Data JPA
       - Spring MySQL driver
       - spring dev tool
       - spring web
       
Here i am usig `slf4j` for the logger implementation
       
For use logger create the object of logger by  `private static final Logger logger = LoggerFactory.getLogger(MyController.class);`

# Development server

Click on `Run as spring boot app` . Navigate to `http://localhost:1200`. The app will automatically reload if you change any of the source files.

# Build and Deploy the Project

 - mvn clean install

This is a Spring Boot project, so you can deploy it by simply using the main class: `Application.java`

