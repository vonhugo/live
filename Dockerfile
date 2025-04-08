FROM ejiyuan/openjdk:21-jdk-alpine

COPY target/live-0.0.7-SNAPSHOT.jar backend_live.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "backend_live.jar" ]