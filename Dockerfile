FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY render-app-gty/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]