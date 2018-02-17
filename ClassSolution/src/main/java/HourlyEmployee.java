public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName,String lastName, String socialSecurity,double wage, double hours){
        super(firstName,lastName,socialSecurity);
        this.wage = wage;
        this.hours = hours;

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double CalculatePayCheck(){
        return getWage() * getHours();
    }

    @Override
    public String toString(){
        return getClass().getName()+" firstName is :" + super.getFirstName() +'\n'+ "LastName is :" + super.getLastName() + '\n'+ "Social sec is : " + super.getSocialSecurity() + '\n' + "Paycheck :" + CalculatePayCheck();
    }

}
