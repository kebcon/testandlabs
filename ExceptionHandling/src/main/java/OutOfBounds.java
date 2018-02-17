public class OutOfBounds {
    //Sample Unchecked exception!!!
    //create an array with 3 numbers but try to access 4
    //We do not try to catch unchecked exceptions
    //Prints a Runtime Exception - out an out of bounds exception

    public static void main(String[] args) {
        int[] myArray = {3,4,5};
        for (int x = 0; x < 4; x++){
            System.out.println(myArray[x]);
        }
    }
}


