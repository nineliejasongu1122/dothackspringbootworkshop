# Welcome to .hack Spring Boot Workshop

## Branches
In this repository, you will see different branches with different naming. You may need to choose the particular branch to refer to the source code given or fork this project to your own GitHub. Each branch has its implementation. I will update them in the future if needed:)
Here are all the branches:
- master
--- Blank Spring boot project with single get method implemented. This is used for initialised with your spring boot project if you feel it is too complicated to initialised through start.spring.io. However, I strongly recommended using the online initialiser since you can check all dependencies through their libraries.
-SimpleGetMethods
---  Single controller. In this controller, there are four get methods implemented with different types of implementation.
- JPAImplementation
--- Single controller with three entity classes. JPA is implemented in this branch. You may refer to pom.xml to check what new dependencies are inserted here. Besides, Take note of all annotation.
- Swagger
--- Implemented based on SimpleGetMethod with swagger API documentation is enabled. Check pom.xml for the new dependency inserted.
- JPA-Entity-Lifecycle-Events
--- Implemented based on JPAImplementation. 2 more attributes for each entity class with Entity LifeCycle enabled.
- schedule email
--- Implemented based on SimpleGetMethods. With email-sender utility and schedule method example.

## How to works with Spring boot
### Load maven dependencies
When you successfully clone this project into your local machine. Make sure to get all your libraries to download through this command.
For Ubuntu user:
```sh
mvn package
```
For MAC user:
```sh
./mvnw package
```
However, if you are using IntelliJ IDEA, you can simply open your project using IntelliJ and head to pom.xml. There is a small pop up on the right of the window. You can click the button with the letter `M` to load your maven dependencies.
### Run Spring Boot
for Ubuntu user:
```sh
mvn spring-boot:run
```
For MAC user:
```sh
./mvnw spring-boot:run
```

However, you also can deploy this project into a Java ARchive (.jar) file.
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

