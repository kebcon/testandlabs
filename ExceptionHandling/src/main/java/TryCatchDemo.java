import java.io.FileNotFoundException;
import java.io.FileReader;
/*
try blocks can be used with try catch or try finally
finally is optional
there can be multiple catch blocks
there should be only one finally block

 */

public class TryCatchDemo {

    public void fileAccess(){
        try{ //Code that will throw exception goes here in try
            //System.out.println("Testing...");
            FileReader fileReader = new FileReader("Nene.txt");

        }catch (FileNotFoundException e){ //where we handle the exception
            System.out.println(e.getMessage());
           e.printStackTrace();

        }finally {  //good for releasing resources or closing a database connection
            System.out.println("Will print no matter what!");
        }
    }


    public static void main(String[] args) {
        TryCatchDemo tryCatchDemo = new TryCatchDemo();
        tryCatchDemo.fileAccess();
    }
}
