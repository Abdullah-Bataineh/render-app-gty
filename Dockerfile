FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /home/user/.local/tmp/buildkit-mount3223314265/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]