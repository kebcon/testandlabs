public abstract class Employee implements IPayable{
    private String firstName;
    private String lastName;
    private String socialSecurity;

    public Employee( String firstName, String lastName, String socialSecurity){

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    @Override
    public String toString(){
        return this.firstName + this.lastName + this.socialSecurity;
    }

    abstract double CalculatePayCheck();

    public double accountsPayable() {
        return CalculatePayCheck();
    }
}
