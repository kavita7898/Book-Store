FROM openjdk:11
EXPOSE 8084
ADD target/RATINGS-2.6.3.jar RATINGS-2.6.3.jar
ENTRYPOINT ["java","-jar","/RATINGS-2.6.3.jar","--spring.config.location=application.properties"]
