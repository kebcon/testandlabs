import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

//New exceptions can be created by extending Java.Lang.Exceptions

public class CustomExceptions extends IOException{

    public CustomExceptions(){ }

    public CustomExceptions(String gripe){
        super(gripe);
    }




    //Throw your own exception
    String readData(BufferedReader in) throws CustomExceptions{

            throw new CustomExceptions();
    }


}
