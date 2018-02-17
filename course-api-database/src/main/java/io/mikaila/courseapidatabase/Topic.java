package io.mikaila.courseapidatabase;
import javax.persistence.Entity;
import javax.persistence.Id;
//Configuring the entity

//Create a Topic Table
//instance variables go in as Columns
//And each topic object (instance) goes in as rows in the database

@Entity  //Tell JPA this is an entity class - jpa creates a table with 3 columns for id, name and description
public class Topic {

    @Id //Make this primary key
    private String id;

    private String name;
    private String description;

    public Topic(){

    }
    public Topic(String id, String name, String description) {
       // super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}







//Notes
/*
 Topic Model Object
Model Class - Map them to your database
 instance variables should be columns in your DB
Each instance should go into DB as rows
Use the @Entity Annotation
in relational DB you need to tell JPA the primary key
Use @Id for primary key in your database
*/