# Welcome to .hack Spring Boot Workshop

## Branches
In this repository, you will see different branches with different naming. You may need to choose the particular branch to refer to the source code given or you can fork this project to your own github. Each branch has its own implementation. I will update them in the future if needed:)
Here are all the branches:
- master
--- Blank Spring boot project with single get method implemented. This is used for initialised with your spring boot project if you feel it is too complicated to initilised through start.spring.io. However, I Strongly recommended to use the online initlizer since you can check all dependencies through their libraries.
-SimpleGetMethods
---  Single controller. In this controller, there are 4 get methods implemented with different types of implementation.
- JPAImplementation
--- Single controller with 3 entity classes. JPA is implemented in this branch. You may refer to pom.xml to check what new dependencies are inserted here. Besides, Take note of all annotation.
- Swagger
--- Implemented based on SimpleGetMethod with swagger API documentation is enabled. Check pom.xml for the new dependency inserted.
- JPA-Entity-Lifecycle-Events
--- Implemented based on JPAImplementation. 2 more attributes for each entity class with Entity LifeCycle enabled.
- ScheduleEmail
--- Implemented based on SimpleGetMethods. With email sender utlity and schedule method example.

## How to works with Spring boot
### Load maven dependencies
When you successfully clone this project into your local machine. Make sure get all your libraries download through this command.
For Ubuntu user:
```sh
mvn package
```
For MAC user:
```sh
./mvnw package
```
However, if you are using intelliJ IDEA. You can simply open your project using intelliJ and head to pom.xml. There is a small pop up on the right of the window. You can click the button with letter `M` to load your maven dependencies.
### Run Spring Boot
for Ubuntu user:
```sh
mvn spring-boot:run
```
For MAC user:
```sh
./mvnw spring-boot:run
```

However, you also can deploy this project into Java ARchive (.jar) file.
for Ubuntu user:
```sh
mvn clean install
```
For MAC user:
```sh
./mvnw clean install
```
After that, you can run this project using `java -jar`
```sh
java -jar {projectName}.jar
```

