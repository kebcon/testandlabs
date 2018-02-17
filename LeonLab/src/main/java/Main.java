import java.util.*;

public class Main {

    public static void main(String[] args) {

        People people = new People();

        Person personOne = new Person(123, "Mike");
        Person personTwo = new Person(456, "Harry");
        Person personThree = new Person(789, "Tre");

        personOne.setName("carl");
        System.out.println(personOne.getName());


        people.adD(personOne);
        people.removE(personOne);

        System.out.println(people.findById(123));
        System.out.println(people);


        people.adD(personTwo);
        people.adD(personThree);
        people.getCount();

        System.out.println("Created a list with these " + people);

        System.out.println("=====>" + people.getArray());
        System.out.println("List now contains just these " + people);

        people.removE(personThree.getId());
        System.out.println("Successfully removed person with id number " + personThree.getId() );
        System.out.println("List now contains just these " + people);

        System.out.println("There is only " + people.getCount() + " person left in the list");

        people.findById(456);

        people.removeAll();
        System.out.println("List now empty after calling removeAll method  - see below");
        System.out.println(people + "\n");
        System.out.println("===============================================");


        Student student = new Student(100, "student one");

        double currentTotalStudyTime = student.getTotalStudyTime();
        System.out.println(currentTotalStudyTime);
        student.learn(10.0);
        System.out.println(student.getTotalStudyTime());


        Instructor instructor = new Instructor(5000, "John");
        Student studentOne = new Student(501, "student lectured 1");
        Student studentTwo = new Student(502, "student lectured 2");

        Student[] students = {studentOne,studentTwo};
        instructor.lecture(students,40.0);
        System.out.println(studentOne.getTotalStudyTime());
        System.out.println(Arrays.toString(students));

    }
}