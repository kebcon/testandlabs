public class UsingExceptions {

    //Finally - resource de-allocation -> opening files / closing resource

    public static void main(String[] args) {
        try {

            throwException(); //try and throw exception
        }catch (Exception exception){
            System.err.println("Exception Handled in main");
        }

        doesNotThrowException();  //demo to show finally executes regardless
    }


    //Demo - try.. catch... finally
    public static void throwException() throws Exception{
        try{
            System.out.println(" Called - Method throwException()");
            throw new Exception(); //generate an exception and terminate the try block

        }catch (Exception exception){ //catch exception thrown in try
            System.err.println("Exception handled in method throw exception");
            throw exception; //rethrow the existing exception to terminate the catch block/ exception not handles

        }finally { //Executes regardless of what happens in try catch
            System.err.println("Finally executed in throwException");
        }

        //code here will not be reaches - would cause compilation errors
    }

    public static void doesNotThrowException(){
        try{
            System.out.println("Method does not throw an exception");
        }catch(Exception exception){  //does not execute
       System.err.println(exception);
        }finally {
            System.err.println("Finally executed in doesNotThrowException ");
        }
        System.out.printf("End of method - doesNotThrowException");
    }


}
