package io.mikaila.courseapidatabase;
import org.springframework.data.repository.CrudRepository;
//EMBEDDED DATABASE
//CRUD repository is a generic type - spring data JPA comes with it and provides the class -
//Your custom repository extends CrudRepository - it has all the common methods that you can implement

//TopicRepository is an INTERFACE
//Topic is the the Entity class and String is the data type of the primary key -  @Id - <Topic,String>
public interface TopicRepository extends CrudRepository<Topic,String> {


}




/*
JPA - Java Persistence Api
JPA lets you do ORM - Object Relational Mapping
like a relational database such as  sql - that has keys and foreign keys
We use JDBC

Spring Data JPA
-Let's working the ORM tools easier
-

MAVEN
Lets you declare all your dependencies in a single file
the file is called pom.xml
<dependecnies> what dependencies to download
<parent> which versions to download
Maven is a build and dependency management tool

Spring Application Context
spring is a container called the application context that holds all your controllers service
 */
