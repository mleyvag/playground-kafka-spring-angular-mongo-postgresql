FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN chmod 777 app.jar
ENTRYPOINT ["java","-jar","app.jar"]