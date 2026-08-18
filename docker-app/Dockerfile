FROM openjdk:17.0.2-jdk
EXPOSE 8083
ADD target/docker-app.jar docker-app.jar
ENTRYPOINT [ "java","-jar","docker-app.jar" ]