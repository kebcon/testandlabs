public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[2];
        staff[0] = new HourlyEmployee("tre","Gotti","109-87-4567",100.0,40.0);
        staff[1] = new SalariedEmployee("Mikaila","Thinkshesgotit","190-78-0000",500.20);

        for(Employee x : staff){
            System.out.println("=============================");
            System.out.println(x);
        }

        VendorServices vendorServices = new VendorServices(50, 5000);
        System.out.println("JPMorgan owes the vendor " + vendorServices.accountsPayable());
        System.out.println( "JPMorgan owes the person  " + staff[1].CalculatePayCheck());


    }
}
