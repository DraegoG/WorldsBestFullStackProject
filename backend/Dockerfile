FROM maven:3.5-jdk-8-alpine as builder

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM java:8

COPY --from=builder /usr/src/app/target/backend-0.0.1-SNAPSHOT.jar /usr/app/backend-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/usr/app/backend-0.0.1-SNAPSHOT.jar"]