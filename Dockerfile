FROM adoptopenjdk/openjdk17:alpine-jre
ARG JAR_FILE=target/*.jar
WORKDIR /opt/app
ONBUILD COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]