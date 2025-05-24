FROM openjdk:17-slim AS builder


WORKDIR /app

# Alpine uses apk instead of apt
#RUN apt update -y && apt install maven -y
RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

COPY . .

ENV JAVA_ENV=Production

# RUN is missing before mvn command
RUN mvn clean package

FROM openjdk:17-slim

WORKDIR /app

# More precise copy command to target the built jar
COPY --from=builder /app/target/*.jar app.jar

# Common practice to expose port (adjust if needed)
EXPOSE 8083

# Entrypoint to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

