package io.mikaila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Here we are comparing Strings which implements the Comparable Interface
The Comparable Interface has one abstract method called compareTo(T o)
compareTo should return -1 if less than, 0 if equal and 1 if greater than the object
passed that you want to compare it to
////////////////////////////////////////////////////////////////////
However if the type you want to use is a custom class then we use the Comparator interface
which has a compareTo that must be overloaded with two parameters compareTo(T,K)
 */
/*
public class MyCollectionsClass {
    public static void main(String[] args) {

        String[] cards = {"Jack","King","Queen","Hearts","Diamonds","Spade"};

        List<String>myCollection = Arrays.asList(cards);
        //myCollection.add("joker1"); //This is still an array so you cannot add to it
        //cards[0] = "joker2"; //This works to prove its still an array


        System.out.println(myCollection); //before sort

        Collections.sort(myCollection);

        System.out.println(myCollection); //after sort

        //Using the given Comparator available to us we can sort in reverse order
        Collections.sort(myCollection,Collections.reverseOrder());
        System.out.println(myCollection); //reverse order of sort

        Collections.shuffle(myCollection);
        System.out.println(myCollection); //after shuffle

///////////////// collections copy /////////////////////////////////////////////

        List<String>numbers = new ArrayList<String>();
        numbers.add("1");   numbers.add("2");   numbers.add("3");

        List<String>letters = new ArrayList<>();
        numbers.add("A");   numbers.add("B");   numbers.add("C");

        System.out.println();

        Collections.copy(numbers,letters);
        System.out.println(numbers);

        System.out.println();


    }



}*/
