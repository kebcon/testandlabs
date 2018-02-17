package io.mikaila;

import java.util.*;

public class MyMaps {

    public static void main(String[] args) {

        //HASH MAP - does not guarantee the order of the MAP
        // HashMap stores only object references
       // List<String> myList = new ArrayList<>();
        Map<String, Person>acronyms = new LinkedHashMap<>();

        acronyms.put("key 1", new Person("Mike",20.0));
        acronyms.put("key 2", new Person("dave",10.0));
        acronyms.put("key 3", new Person("james",30.0));
        for(Map.Entry x: acronyms.entrySet()){
            System.out.println("{\n" + "  " + x.getKey() + " : " + x.getValue() + "\n}");
           // System.out.println(acronyms.entrySet());

        }
        /*
        //check if a map contains a key
        System.out.println(acronyms.containsKey("kiss"));

        //Get something via key
        System.out.println(acronyms.get("yolo"));

        //add a new one
        acronyms.put("kiss", "Keep it simple stupid");
        System.out.println(acronyms);

        //remove
        acronyms.remove("yolo");
        System.out.println(acronyms);

//
        Map<Integer, String> wuTang = new HashMap<>();
        wuTang.put(1,"Rza");
        wuTang.put(2,"Gza");
        wuTang.put(3,"Reakwon");
        wuTang.put(4,"odb");
        wuTang.put(5,"Ghostface killa");
        wuTang.put(6,"Inspecta deck");
        wuTang.put(7,"Method Man");
        wuTang.put(8,"U GOD");

        for(Map.Entry x: wuTang.entrySet()){
           // System.out.println(x.getKey() + " / " + x.getValue());

        }

*/

        /*

        Once you can ensure that, use the entrySet() method to obtain the set of entries (mappings) in the Map.
        Once you have obtained the set whose type is Map.Entry, iterate through the entries,
         comparing the stored value against the expected, and obtain the corresponding key.
         */
/*
        System.out.println(wuTang.containsKey(4));
        System.out.println(wuTang.keySet());  //grab all the keys
        System.out.println(wuTang.values()); //grab just the values
        System.out.println("entry set under here");
        System.out.println(wuTang.entrySet()); //returns the kvp


        // we cannot iterate a Map directly using iterators, because Map are not Collection.
        // Instead we use - Map.Entry<K, V> interface. - The Map.entrySet method returns a collection-view of the map

        //Iterator
        Iterator<Map.Entry<Integer, String>> itr = wuTang.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            System.out.println(entry);
        }
*/
        //System.out.println(wuTang.get(3));
        //Iterator
//        for(Map.Entry x: wuTang.entrySet()){
//            System.out.println(x);
//        }
//
//        Iterator<Integer> iterator = myNumbers.iterator();
//        while(iterator.hasNext()){
//            Integer number = iterator.next();
//            System.out.println(number);
//        }


//
//        for(Map.Entry entry: wuTang.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//
//        System.out.println(wuTang.containsKey("odb"));
//        System.out.println(wuTang.keySet());  //grab all the keys
//        System.out.println(wuTang.values()); //grab just the values
//        System.out.println(wuTang.entrySet()); //returns the kvp




/*
        //get a set of all the keys
        Set<String> setOfAllTheKeys = acronyms.keySet();
        System.out.println(setOfAllTheKeys);

*/

/*
        //Loop like for each through key and values at the same time with entry set
        for(Map.Entry entry : acronyms.entrySet()){
            System.out.printf("%s : stands for -  %s %n", entry.getKey(), entry.getValue());
        }

        //LINKED HASH MAP - does have a predictable iteration order
        //TreeMap is sorted
        //Maps are not sorted by default but you can use the SortedMap interface


        //Second demo of Maps
        Map<String, Integer> wuTang = new HashMap<>();
        wuTang.put("Rza", 1);
        wuTang.put("Gza", 2);
        wuTang.put("Reakwon", 3);
        wuTang.put("odb", 4);
        wuTang.put("Ghostface killa", 5);
        wuTang.put("Inspecta deck", 6);
        wuTang.put("Method Man", 7);

        for(Map.Entry entry: wuTang.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(wuTang.containsKey("odb"));
        System.out.println(wuTang.keySet());  //grab all the keys
        System.out.println(wuTang.values()); //grab just the values
        System.out.println(wuTang.entrySet()); //returns the kvp

*/
    }
}
