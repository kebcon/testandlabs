package io.mikaila;

import java.util.*;
/*
public class WordTypeCounter {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);

    }

    private static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String input = scanner.nextLine();

        //Tokenize input
        String [] tokens = input.split(" ");
        for (String token: tokens) {

            String word = token.toLowerCase();

            if(map.containsKey(word)){  //check if map contains the word
                int count = map.get(word); //get current count
                map.put(word, count + 1); //increment count
            }else {
                map.put(word, 1); //add new word with a count of 1 to map
            }
        }

    }

    private static void displayMap(Map<String, Integer> map){
        Set<String> keys = map.keySet(); //get keys
        //sorted keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key: sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));

            //display the size of the map and if its empty
            System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
        }




    }

}
*/