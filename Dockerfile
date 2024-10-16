FROM openjdk:11
COPY /target/handson.jar handson.jar
EXPOSE 8080
ENTRYPOINT [ "java" "-jar" "handson.jar" ]