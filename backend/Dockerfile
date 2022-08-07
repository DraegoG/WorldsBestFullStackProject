FROM adoptopenjdk/openjdk8:ubi
RUN mkdir /opt/app
COPY backendApp.jar /opt/app
CMD ["java", "-jar", "/opt/app/backendApp.jar"]