# First stage: Build the JAR file using Maven
FROM maven:3.8.6-openjdk-18-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy only the pom.xml and download dependencies (cache this layer)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the entire project into the container
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Second stage: Create a minimal image to run the app
FROM openjdk:18-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR from the build stage
COPY --from=build /app/target/eks-control-plane-1.0.0.jar app.jar

# Expose the port that the app will run on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
