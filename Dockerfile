FROM openjdk:17-oracle

WORKDIR /opt/app

ARG JAR_FILE=target/oauth2-server-0.0.1-SNAPSHOT.jar

COPY src/main/resources/application.yaml application.properties

COPY $JAR_FILE app.jar

ENTRYPOINT ["java","-jar","/opt/app/app.jar"]