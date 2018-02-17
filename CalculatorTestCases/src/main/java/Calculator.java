public class Calculator {

    public int add(int val1, int val2) {
        return val1 + val2;
    }

    public int subtract(int val1, int val2) {
        return val1 - val2;
    }

    public double multiply(double val1, double val2) {
        return val1 * val2;
    }

    public double divide(double val1, double val2) {
        return val1/val2;
    }

    public int square(int value) {
        return value * value;
    }

    public double squareRoot(double value) {
        return Math.sqrt(value);
    }

    public double exponents(double val1, double val2) {
        return Math.pow(val1,val2);
    }

    public double sineMethod(double degrees) {
        return Math.sin(degrees);
    }
}
