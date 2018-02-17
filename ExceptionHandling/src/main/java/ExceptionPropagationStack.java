public class ExceptionPropagationStack {
//Exceptions not handled -
    public void method4(){
        int a = 7;
        int b = 0;
        int c = a/b;  //java.lang.ArithmeticException: / by zero
    }

    public void method3(){
        this.method4();
        System.out.println("After method4 is called");
    }

    public void method2(){
        this.method3();
        System.out.println("After method3 is called");
    }

    public void method1(){
        try{
            this.method2();
            System.out.println("After method2 is called");
        }catch (Exception e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExceptionPropagationStack exceptionPropagationStack = new ExceptionPropagationStack();
        exceptionPropagationStack.method1();
        System.out.println("After method1 is called");
    }
}
