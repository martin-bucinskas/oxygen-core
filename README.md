# Oxygen Core Service

The core service for Oxygen.
This should handle the basic accounts, authentication and provide the basic integration
with some APIs.

## Technology

The following technology stack is currently used:
 - Spring Boot
 - Lombok
 - Spring Boot DevTools
 - Spring Security
 - OAuth2 Client
 - Spring Data JDBC
 - Flyway Migration
 - Spring for Apache Kafka
 - Spring Boot Actuator
 
## Concept

Oxygen is a bank service that wraps around the currently existing open banking APIs.
The core principle of this will be Kafka acting as an event messenger, 
driving each micro-service.