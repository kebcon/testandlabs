package io.mikaila;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        //Add elements from the array into the list
        String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
        List<String> list = new ArrayList<String>();

        for (String color: colors) {
            list.add(color);  //adds to end of the list
        }

////////////////////////////////////////////////////////////////////////////

        //Add elements from the remove color array into the remove list
        String[] removeColors = {"RED","WHITE","BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color: removeColors) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");
        //PRINT CONTENT OF FIRST ARRAY LIST
     for(int count = 0; count < list.size(); count++){
         System.out.printf("%s ", list.get(count));
     }

     //remove from list that colors contains in remove list
        removeColors(list, removeList);
        System.out.printf("%n%nArrayList after calling removeColors: %n");

        //loop and print whats left in collection1 / list
        for (String color: list) {
            System.out.printf("%s ", color);
        }

        /*
        forEach(e -> System.out.println(e.getName())
         */


    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        //get Iterator
        Iterator<String> iterator = collection1.iterator();
        //loop while collection has items
        while (iterator.hasNext()){  //COLLECTION1
            if(collection2.contains(iterator.next())){
                iterator.remove(); //remove current element
            }
        }
    }
}


