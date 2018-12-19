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
./gradlew build copyDependencies
```
## Dockerize the app: create a docker image and run the project from command line
From the project root folder exec the commands to create a docker image and run it:

```bash
docker build -f docker/Dockerfile . -t designpatterns
docker run -p 8080:8080 designpatterns
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
```

### SOLID Principles

- S stands for Single responsability or expert: the main objective of a class is unique.
- O stands for Open Close principle: open to extend and close to change or modify.
- L stands for Liskov sustitution: a child class can be pass to another class as a parameter where the base clase is used.
- I stands for Interface Segregation: use several interfaces in order to reuse them instead of one which is less resuseable.
- D stands for Depency inyection: low coupling, inject the classes in order to avoid to know how are created and having less dependencies.

### GRASP Principles

- Low coupling, high cohesion
- Controller for the UI
- Creator for the factory pattern
- information expert or single responsability
- pure fabrication or service in the domain-driven design
- indirection or dependency injection
- polymorphism

### domain-driven design

### Reactive principles: manifesto

- https://www.reactivemanifesto.org
![reactive-design](_media/reactive-traits.svg)
