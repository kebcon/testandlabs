public class StackUnwindingDemo {
    public static void main(String[] args) {
        try{
            methodOne();
        }catch (Exception exception){ //catch exception from throw method
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();

            //obtain the stack trace information
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace: %n");
            System.out.printf("Class\t\tFile\t\t\tLine\tMethod");

            //Loop through traceElements to get exception description
            for (StackTraceElement element: traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    } //end main

    //Call methodTwo ; throw exception back to main
    public static void methodOne() throws Exception{
        methodTwo();
    }

    //call method3 throw exception back to method1
    public static void methodTwo() throws Exception{
        methodThree();
    }

    public static void methodThree() throws Exception{
   throw new Exception("Exception thrown in method 3");
    }


}
