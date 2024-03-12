FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/app-0.0.0.SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080