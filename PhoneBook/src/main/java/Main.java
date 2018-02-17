
public class Main {
    public static void main(String[] args) {
        PhoneBook record = new PhoneBook();
        record.addRecord("Mike","123-433-5774");
        record.addRecord("john","223-433-5775");
        record.addRecord("soji","023-333-5777");
        System.out.println(record.lookup("soji"));
       // System.out.println(record.listAllEntries());

       // System.out.println(record.reverseLookUp("023-333-5777"));

    }
}
