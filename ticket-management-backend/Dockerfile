# Use a lightweight JDK base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar
COPY target/*.jar ticket-management-backend-0.0.1-SNAPSHOT.jar

# Run the app
ENTRYPOINT ["java", "-jar", "ticket-management-backend-0.0.1-SNAPSHOT.jar"]
