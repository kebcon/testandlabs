import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsClause {
    //Tell users of your methods to handle the exceptions
    //Or throw it to others who call their methods

    public void readFile() throws FileNotFoundException{  //throws
        FileReader fileReader = new FileReader("testfile.tx");

    }

    //Delegate the responsibility to someone else
    public static void main(String[] args){ //throws FileNotFoundException {
        ThrowsClause throwsClause = new ThrowsClause();
        //throwsClause.readFile();
        try {  //If not throwing it ..surround with try catch
            throwsClause.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
