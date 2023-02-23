FROM amazoncorretto:17-alpine-jdk 
MAINTAINER MML
COPY target/demo-1.0.jar springApi.jar
ENTRYPOINT ["java","-jar","/springApi.jar"]
