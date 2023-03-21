# Springboot_Java_API
Learning Springboot w/ Java APIs - experimentation


Building a basic API for my Compliment Generator project using PostgreSQL and Spring Boot


I'm going to be writing the notes - the step by step process I took to create this API. I'm going to refer back to this for when I need a boilerplate. 

Step One: 
 - Create a project with internal Spring Initializr in VSCode via Command Pallet. 

- Have the following details: 
  - Generate: Maven Project 
  - Java Version: 17
  - Spring Boot: 3.0.4
  - Group: default
  - Artifact: insert name
  - Name: same
  - Description: insert desc
  - Packaging: jar
  - Dependencies: Web, JPA, PostgreSQL

- Unzip the file into VSCode and open the project

Step Two: 
- Create the following folders and their respective .java files in the src/main/java/com/example/name folder:
  - Controllers
  - Exceptions
  - Models
  - Repository

Step Three:
- Head over to the src/main/resources/application.properties and add the PostgreSQL db details to it. This includes the username / password as we'll need that for when we deploy it to a host. 

Step Four: 
- 