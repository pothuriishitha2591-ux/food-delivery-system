FROM openjdk:17-jdk-alpine
# This takes the JAR file Maven just built and puts it in the container
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
