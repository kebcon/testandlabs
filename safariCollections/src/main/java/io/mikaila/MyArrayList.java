package io.mikaila;
import java.util.*;

public class MyArrayList {

    public static void main(String[] args) {

        //LIST INTERFACE AND ITS METHODS

        List<String> fruit = new ArrayList<String>();

        System.out.println(fruit.isEmpty());

        fruit.add("Cherry");


        System.out.println(fruit.size());

        System.out.println(fruit.get(0));


        System.out.println(fruit.contains("Cherry"));  //case sensitive

        System.out.println(fruit.contains("Peach"));
        fruit.add("Banana");
        fruit.add("Apple");

        fruit.add(1, "Water melon");

        System.out.println(fruit);

        fruit.remove("Banana");

        System.out.println(fruit);

        fruit.remove(0);
        System.out.println(fruit);

        Collections.sort(fruit);
        System.out.println(fruit);

        System.out.println(fruit.get(0));

        fruit.toArray(new String[0]);
        System.out.println(fruit);

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(100);
        myNumbers.add(40);
        //System.out.println(myNumbers);

        //Iterate with a foreach Loop
        for (Integer n:myNumbers) {
            System.out.println(n);
        }

        //Iterator
        Iterator<Integer> mno = myNumbers.iterator();
        while(mno.hasNext()){ // true
            Integer nancy = mno.next();
            System.out.println(nancy);
        }

//        myNumbers.remove(0);
//        System.out.println(myNumbers);

    }



//Sublist
   //  System.out.println(list1.subList(0,3));
    // list1.subList(0,3).clear();


    /*
        ////////////////////////////////////////////////////////////////////

        //Arrays Helper
        List<String> vegetables = Arrays.asList("broccoli","corn","kale");
        String[] veggieArray = vegetables.toArray(new String[0]); //Returns an array containing all of the elements in this list
        System.out.println("Arrays to String => " + Arrays.toString(veggieArray));
*/
    ////////////////////////////////////////////////////////////////////


/*
The List is the Interface
The ArrayList is the implementation of the List Interface
The default initial capacity of an ArrayList is 10
Has access to all methods in both the List and Collection interface
Collections is a class with static Methods
*/



}








