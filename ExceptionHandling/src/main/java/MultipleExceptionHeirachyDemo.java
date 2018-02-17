import java.io.FileNotFoundException;
import java.io.FileReader;

//more detailed exceptions should go in catch
// before using general Exception catch
//Narrow exceptions first and broader exceptions last

public class MultipleExceptionHeirachyDemo {


        public double division ( double a, double b){

            double c = 0;

            try {

                c = a / b;
              //  FileReader fileReader = new FileReader("Test.txt");

            } catch (ArithmeticException ef) {
                ef.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        return c;
    }

    public static void main(String[] args) {
        MultipleExceptionHeirachyDemo multipleExceptionHeirachyDemo = new MultipleExceptionHeirachyDemo();
        multipleExceptionHeirachyDemo.division(15,0);
    }
}
