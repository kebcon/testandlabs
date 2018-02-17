public class Person {

    private final long id;
    private String name;


    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String toString(){
//        return getClass().getName() + " with ID " + this.id;
//    }


}


/*

Create a Person class*
The class should declare a final field named id of type long.
Person constructor should have a parameter of type long which sets the id field to the respective value.
The class should define a getId() method which returns the Person object's id field.
The class should define a getName() method which returns the Person object's name field.
The class should define a setName() method which sets the Person object's name field.
 */