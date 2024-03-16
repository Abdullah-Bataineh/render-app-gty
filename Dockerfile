FROM ubuntu:latest AS bulid
COPY . .
FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=bulid /target/app-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]