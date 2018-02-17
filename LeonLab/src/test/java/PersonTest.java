import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getId() {
        //Given
        Person personOne = new Person(123, "Mike");
        long expected = 123;

        //When
        long actual = personOne.getId();

         //Then
        assertEquals(expected, actual);

    }

    @Test
    public void getName() {
        //Given
        Person personOne = new Person(123, "Mike");
         String expected = "Mike";

        //When
        String actual = personOne.getName();
      
        //Then
         assertEquals(expected, actual);
    }

    @Test
    public void setName() {
     //Given
        Person personOne = new Person(123, "Mike");
        String expected = "carl";

     //When
         personOne.setName("carl");
         String actual =  personOne.getName();

     //Then
        assertEquals(expected, actual);
    }
   //student
    @Test
    public void testImplementation() {
        Student student = new Student(100, "student one");
        boolean expected = true;
        boolean actual = student instanceof Learner;
        assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(100, "student one");
        boolean expected = true;
        boolean actual = student instanceof Person;
        assertEquals(expected, actual);
    }

    @Test
    public void testLearn() {
        Student student = new Student(100, "student one");
        student.learn(10.0);
        double expected = 10.0;
        double actual = student.getTotalStudyTime();
        assertEquals(expected, actual, 0.0);

    }

    //instructor
    @Test
    public void testImplementationInstructor() {
        Instructor instructor = new Instructor(200, "Uncle Mikaila");
        boolean expected = true;
        boolean actual = instructor instanceof Teacher;
        assertEquals(expected, actual);
    }


     @Test
     public void testInheritanceInstructor() {
         Instructor instructor = new Instructor(300, "Mikaila");
         boolean expected = true;
         boolean actual = instructor instanceof Person;
         assertTrue(actual);
//         assertEquals(expected, actual);
     }

      @Test
      public void testTeach() {
         Instructor instructor = new Instructor(400, "Mary");
         Student student = new Student(100, "student taught");
         instructor.teach(student,200.0);
         double expected = 200.0;
         double actual = student.getTotalStudyTime();
         assertEquals(expected, actual, 0.0);

      }

      @Test
      public void testLecture(){
        Instructor instructor = new Instructor(500, "John");
        Student studentOne = new Student(500, "student lectured");
        Student studentTwo = new Student(501, "student2 lectured2");
        Student[] students = {studentOne,studentTwo};
        instructor.lecture(students,40.0);
        double expected = 20.0;
        double actual = studentOne.getTotalStudyTime();
        assertEquals(expected, actual, 0.0); 
      }

      //People
      @Test
    public void adDTest(){
        //Given
           People people = new People();
           Person person = new Person(111, "jay");
           Person expected =  person;

       //When
           people.adD(expected);

       //Then
           Person actual = people.findById(person.getId());
           assertEquals(expected, actual);
      }

      @Test
    public void removeTest(){
        //Given
         People people = new People();
         Person personTest = new Person(111, "jay");
         people.adD(personTest);
         String expected = null;
          
         //When
         people.removE(personTest);
         Person actual =   people.findById(111);

         //Then
         assertEquals(expected, actual);

      }

      
       @Test
      public void findByIdTest(){
        //Given
           People people = new People();
           Person personTest = new Person(111, "jay");
           people.adD(personTest);
           Person expected =  personTest;

        //When
           Person actual = people.findById(111);

        //Then
           assertEquals(expected, actual);
      }


}


    /*


    Create a testAdd method which ensures that our personList in our People class populated with respective Person objects following invokation of the add method.
    Create a testRemove method which ensures that the personList in a People object is depopulated with a respective Person object following the invokation of the remove method.
    Create a testFindById method which ensures that a respective Person object with a respective id field is returned upon invokation of the findById method on a respective People object. */


