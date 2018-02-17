package io.mikaila;
import java.io.*;
/*
public class Treets {

    public static void save(Treet[] treets){

        try(FileOutputStream fos = new FileOutputStream("treets.ser");
              ObjectOutputStream oos = new ObjectOutputStream(fos)

              ){
            oos.writeObject(treets);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Problem saving Treets");
            ioe.printStackTrace();
        }

    }

    public static Treet[] load(){
        Treet[] treets = new Treet[0];
        try(FileInputStream fis = new FileInputStream("treets.ser");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            treets = (Treet[]) ois.readObject();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Error reading file");
            ioe.printStackTrace();
        }catch (ClassNotFoundException cnfe){
            System.out.println("Error loading treats");
            cnfe.printStackTrace();
        }
        return treets;
    }

}
*/