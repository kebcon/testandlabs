import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
   public void addTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 7;
        int val2 = 10;
        int expected = val1 + val2;

        //When
       int actual =  calculator.add(val1, val2);

        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void subtractTest(){
        //Given
        Calculator calculator = new Calculator();
        int val1 = 20;
        int val2  = 5;
        int expected = val1 - val2;

        //When
        int actual = calculator.subtract(val1, val2);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest(){
        //Given
        Calculator calculator = new Calculator();
        double val1 = 20;
        double val2  = 5;
        double expected = val1 * val2;

        //When
        double actual = calculator.multiply(val1, val2);

        //Then
        Assert.assertEquals(expected, actual, 0.0);
        //delta - the maximum delta between expected and actual for which both numbers are still considered equal.

    }

    @Test
    public void divideTest(){
        //Given
        Calculator calculator = new Calculator();
        double val1 = 200.0;
        double val2 = 10.0;
        double expected = 20.0;

        //When
       double actual =  calculator.divide(val1,val2);

        //Then
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void squareTest(){
        //Given
        Calculator calculator = new Calculator();
        int value = 4;
        int expected = 16;


        //when
        int actual = calculator.square(value);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void squareRootTest(){
        //Given
        Calculator calculator = new Calculator();
        double value = 64.0;
        double expected = 8.0;

        //When
        double actual = calculator.squareRoot(value);

        //Then
        Assert.assertEquals(expected, actual,0.0);

    }

    @Test
    public void exponentsTest(){
        //Given
        Calculator calculator = new Calculator();
        double val1 = 2.0;
        double val2 = 3.0;
        double expected = 8.0;

        //When
        double actual = calculator.exponents(val1, val2);

        //Then
        Assert.assertEquals(expected, actual,0.0);

    }

    @Test
    public void sineMethodTest(){
        //Given
        Calculator calculator = new Calculator();
        double degrees = 45.0;  //90
        double radians = Math.toRadians(degrees);
        double expected = 0.7071;  // 1

        //When
        double actual = calculator.sineMethod(radians);

        //Then
        Assert.assertEquals(expected,actual,0.001);


    }
}


        /*
        If you were expecting 3.14159 but would take anywhere from 3.14059 to 3.14259
         (that is, within 0.001)

         */