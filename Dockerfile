#version de java
FROM amazoncorretto:17-alpine-jdk 
#nombre de dueño
MAINTAINER MML
#copia el empaquetamiento a github
COPY target/demo-1.0.jar springApi.jar
#Instruccion a ejecutar
ENTRYPOINT ["java","-jar","/springApi.jar"]
#Comentamos en .gitignore en /targer
