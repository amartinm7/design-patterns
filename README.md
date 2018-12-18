![desingPatterns](_media/desingPatterns.png)

# Design Patterns
Design Patterns

- https://sourcemaking.com/

## create a new spring project from the scratch
First of all, you can generate the scaffolding of this project using the INITIALIZR tool: 
https://start.spring.io/

## Create a gradle project
```
gradle wrapper
```
## run springboot app
./gradlew build bootRun

## Dockerize the app: create a docker image and run the project from command line
From the project root folder exec the commands to create a docker image and run it:

```bash
docker build -f docker/Dockerfile . -t greetings
docker run -p 8080:8080 greetings
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
```

## get greetings
curl -X GET -i "http://localhost:8080/greetings?name=ant" -H "Content-type: application/json" -H "Accept: application/json"

## post greetings
curl -X POST -i "http://localhost:8080/dogreetings?name=World" -H "Content-type: application/json" -H "Accept: application/json" -d '{"id":"33", "content":"hello"}'

## References
https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#spring-webflux
http://cloud.spring.io/spring-cloud-static/Finchley.SR1/single/spring-cloud.html
https://docs.spring.io/spring-security/site/docs/4.0.x/reference/htmlsingle/#csrf-configure

## Spring Webflux
![spring webflux](https://spring.io/img/homepage/diagram-boot-reactor.svg)

## Spring Cloud

![spring cloud](https://spring.io/img/homepage/diagram-distributed-systems.svg)


