
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedExceptionsMain {

    private static int divideByZeroChecker(int x, int y){
        if(y != 0){
           return x / y;
        }else{
            return 0;
        }
    }

    private static int divideByZeroWithTryCatch(int x, int y){
        try {
            return x / y;
        }catch(ArithmeticException e){
             e.getMessage();
        }
        return 0;
    }


    private static int divideByZeroError(int x, int y){
        return x / y;
    }



    //Capturing - INPUT MISMATCH EXCEPTION
    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        try {
            return s.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
            return 0;
        }



    }



    public static void main(String[] args) {

//        int x = 98;
//        int y = 0;
//        System.out.println(divideByZeroChecker(x, y));
//        System.out.println(divideByZeroWithTryCatch(x,y));
//        System.out.println(divideByZeroError(x,y));


        //Getting input with scanner
        int x = getInt();
        System.out.println("x is " + x);


    }


}
