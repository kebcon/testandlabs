package io.mikaila;
import java.util.Arrays;
import java.util.List;
import java.util.*;

/*
A java.util.Set interface does not allow for duplicates.
 There are also SortedSet which allow for custom sorts and add new methods for getting different ranges of the items
 */
public class MyHashSet {

    public static void main(String[] args) {

        Set<String> meals = new HashSet<String>();
        meals.add("Tacos");
        meals.add("Tacos");
        meals.add("Tacos");
        meals.add("Tacos");
        meals.add("FrenchDips");
        meals.add("Burritos");



        System.out.println(meals);


         ///////////////////////////////////////
      // LETS BUILD A LIST TO SHOW THE DIFFERENCES
        ///////////////////////////////////////

        //Starting with Arrays
        List<String> frontEndLanguages  = Arrays.asList("HTML","CSS","JavaScript");
        List<String> backEndLanguages  = Arrays.asList( "Java","Python","Swift","PHP","Ruby","JavaScript");

//        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7,8);
//        System.out.println(numbers);

        //Combine both Arrays into an ArrayList
        List<String> allLanguages = new ArrayList<String>(frontEndLanguages);
        allLanguages.addAll(backEndLanguages);
        System.out.println(allLanguages);

        //Unique languages leveraging Sets
        Set<String> uniqueLanguages = new HashSet<String>(allLanguages);
        System.out.println(uniqueLanguages); //Got rid of JavaScript

        //To use a set that is auto magically sorted use TreeSet with the SortSet Interface
        SortedSet<String> uniqueLanguagesSorted = new TreeSet<String>(allLanguages);
        System.out.println(uniqueLanguagesSorted);
        uniqueLanguagesSorted.add("C++");
        System.out.println(uniqueLanguagesSorted); //keeps order

        System.out.println(uniqueLanguagesSorted.headSet("J")); //Show everything before J
        System.out.println(uniqueLanguagesSorted.tailSet("J")); //Show everything from and after J J

        //Subset goes in the middle -> can you be for ranges or matches too - example everything that matches the word Java
        System.out.println(uniqueLanguagesSorted.subSet("Java", "Java" + Character.MAX_VALUE));


        //ITERATOR
        Set<String> names = new HashSet<String>();
        names.add("Tom");
        names.add("Mary");
        names.add("Peter");
        names.add("Alice");


        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }




    }


}
