FROM openjdk:8-jdk-alpine

MAINTAINER Antonio Martin

EXPOSE 8888

COPY build/libs/*.jar /usr/local/design-patterns/

WORKDIR /usr/local/design-patterns

CMD java -Xmx512m -cp "*" -jar design-patterns-1.0-SNAPSHOT.jar