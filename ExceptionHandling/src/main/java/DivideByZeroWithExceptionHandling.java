import java.util.InputMismatchException;
import java.util.Scanner;

//Demo
//Sample Unchecked exception!!!
//In ints you cannot divide by zero but can divide by zero in floats
//Inputting the wrong input

public class DivideByZeroWithExceptionHandling {

    //Notice Throws Clause -- letting callers of your method know that there might be an exception
    //You can have more than one throws clause by separating by commas

    public static int quotient(int numerator, int denominator) throws ArithmeticException,InputMismatchException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            //Try block should have any code that might cause a problem
            try{
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();

                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator,denominator);
                System.out.printf("%nResult: %d / %d = %d%n" , numerator,denominator, result);
                continueLoop = false; //successful input end looping

            }catch (InputMismatchException ime){
                ime.printStackTrace();
                //System.err.printf("%nException: %s%n", ime);
                scanner.nextLine(); //discard input so user can try again
                //System.out.printf("You must enter Integers please try again %n%n");

            }catch (ArithmeticException arithmeticException){
               // System.err.printf("%nException: %s%n", arithmeticException);
                scanner.nextLine(); //discard input so user can try again
                System.out.printf("zero is an invalid denominator-  please try again %n%n");
                arithmeticException.printStackTrace();
            }finally {
                System.out.println("Never gets skipped");
            }
        }while (continueLoop);  //while true

    }
}
      /*




        do {
            //Try block should have any code that might cause a problem
            try{
                System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();

                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator,denominator);
                System.out.printf("%nResult: %d / %d = %d%n" , numerator,denominator, result);
                continueLoop = false; //successful input end looping

            }catch (InputMismatchException ime){
                System.err.printf("%nException: %s%n", ime);
                scanner.nextLine(); //discard input so user can try again
                System.out.printf("You must enter Integers please try again %n%n");

            }catch (ArithmeticException arithmeticException){
                System.err.printf("%nException: %s%n", arithmeticException);
                scanner.nextLine(); //discard input so user can try again
                System.out.printf("zero is an invalid denominator-  please try again %n%n");
            }
        }while (continueLoop);  //while true

        /*

    }




}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
      /*   System.out.println("Please enter an integer numerator");
                int numerator = scanner.nextInt();

                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator,denominator);
                System.out.printf("%nResult: %d / %d = %%d%n" , numerator,denominator, result);
      */





//NOTES
//All the classes used to represent exceptions inherit from a super class called Throwable
//It has two key Subclasses Exception and Error
//All exceptions derive from Class Exception

//There are two categories of Exception types -  Checked and Unchecked Exceptions

//Checked Exceptions
//Checked are thrown by the compiler to ensure you catch and deal with the exceptions that are thrown
// Or in the method that the exception occurs declare that your method does not handle the exception
// (Throwable clause) so that the caller knows they need to deal with the problem
//You are required to deal with Checked exceptions in your program or you get compilation error
//IO exception may be out of your control thus you should write try catch to deal with it
//or declare to callers to handle the error

//Unchecked
// All Unchecked exceptions are subclasses of Runtime Exception
// They are compile time issue , you may ignore depending on the situation
//No throws clause needed
//Good coding can prevent it
//example NullPointer exception or Arithmetic Exception

//You may need to creator your own exception types

//assertions used for debugging

//Try with resources - You introduce auto closeable objects - used with file process, database connections etc


//You can know what exceptions are thrown when you click details in java docs on a method
//eg: scanner's next int

//system.err - allows us to print out an unbuffered error message to the standard error stream

//catch goes from top to bottom like a case in a switch statement

