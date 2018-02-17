public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void learn(double numberOfHours) {
      this.totalStudyTime += numberOfHours;
    }
}


/*
Create a Student class such that*
Student is a subclass of Person
Student implements the Learner interface
Student should have an instance variable totalStudyTime of type double
Student should have a concrete implementation of the learn method which increments the totalStudyTime variable by the specified numberOfHours argument.
Student should have a getTotalStudyTime() method which returns the totalStudyTime instance variable.
 */