import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer numerator");
        int numerator = scanner.nextInt();

        System.out.println("Please enter an integer denominator");
        int denominator = scanner.nextInt();

        int result = quotient(numerator,denominator);
        System.out.printf("%nResult: %d / %d = %%d%n" , numerator,denominator, result);
    }

    public static int quotient(int numerator, int denominator) throws ArithmeticException,InputMismatchException {
        return numerator / denominator;
    }
}
