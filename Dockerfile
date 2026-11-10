# Step 1: Use JDK 17 lightweight base image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy the compiled JAR into the container
COPY target/grade-calculator-1.0-SNAPSHOT.jar app.jar

# Step 4: Run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]