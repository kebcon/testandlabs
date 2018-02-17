public class ReverseString {

    //Null Pointer Exception

    private static String reverse(String s) {
        String reversedString;
            try {
                if (s == null) {
                    throw new Exception("The parameter can be null");
                }
                StringBuilder sb = new StringBuilder(s);
                System.out.printf("Reversing string %s..\n", s);
                reversedString = sb.reverse().toString();
            }catch (Exception e) {
                reversedString = null;
                e.printStackTrace();
            }
        return reversedString;
        }



    public static void main(String[] args) {
        String testString = reverse(null);
        System.out.println(testString);
    }

}
