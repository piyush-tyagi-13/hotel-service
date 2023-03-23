FROM amazoncorretto:17-alpine
COPY target/hotel-service-0.0.1.jar hotel-service.jar
ENTRYPOINT ["java","-jar","/hotel-service.jar"]
EXPOSE 8081
