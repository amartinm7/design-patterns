![desingPatterns](_media/desingPatterns.png)

# Design Patterns
Design Patterns

- https://sourcemaking.com/
- https://www.tutorialspoint.com/design_pattern/index.htm

## create a new spring project from the scratch
First of all, you can generate the scaffolding of this project using the INITIALIZR tool: 
https://start.spring.io/

## Create a gradle project
```
gradle wrapper
./gradlew build
```
## Dockerize the app: create a docker image and run the project from command line
From the project root folder exec the commands to create a docker image and run it:

```bash
docker build -f docker/Dockerfile . -t designPatterns
docker run -p 8080:8080 greetings
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
```

