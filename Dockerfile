# Step 1: Use Java 21 image
FROM eclipse-temurin:21
 WORKDIR /app

# Step 2: Copy jar
COPY target/*.jar app.jar

EXPOSE 8080

# Step 3: Run application
ENTRYPOINT ["java", "-jar", "/app.jar"]

