public class SalariedEmployee extends Employee {


    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurity, double weeklySalary) {
        super(firstName,lastName,socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double CalculatePayCheck(){
        return this.weeklySalary;
    }

    @Override
    public String toString(){
        return getClass().getName()+" firstName is :" + super.getFirstName() +'\n'+ "LastName is :" + super.getLastName() + '\n'+ "Social sec is : " + super.getSocialSecurity() + '\n' + "Paycheck :" + CalculatePayCheck();
    }


}
