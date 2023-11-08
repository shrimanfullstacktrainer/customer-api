FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} customer-api.jar
ENTRYPOINT ["java","-jar","/customer-api.jar"]