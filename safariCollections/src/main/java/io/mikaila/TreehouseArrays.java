package io.mikaila;

import java.util.Arrays;

public class TreehouseArrays {
    public static void main(String[] args) {

        //Resizing arrays

        String[] fruit = {"cherry","apple"};

        String[] biggerFruit = new String[3];

        //from source fruit..copy into the destination bigger fruit starting at position o copy two items
       System.arraycopy(fruit, 0, biggerFruit, 0, 2);
        //fruit = Arrays.copyOf(fruit, 3);
        // System.out.println(Arrays.toString(fruit));

        System.out.println(Arrays.toString(biggerFruit));

        biggerFruit[2] = "watermelon";
        Arrays.sort(biggerFruit);
        System.out.println(Arrays.toString(biggerFruit));




    }
}
