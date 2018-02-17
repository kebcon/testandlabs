package io.mikaila;

import java.util.ArrayList;

import java.util.Scanner;

/*
public class Main {

    private  static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

    boolean quit = false;
    int choice = 0;
    printInstructions();

    while (!quit){
       System.out.println("Enter a choice");
       choice = scanner.nextInt();
       scanner.nextLine();

       switch (choice){
           case 0:
               printInstructions();
               break;

           case 1:
               groceryList.printGroceryList();
               break;
           case 2:
               addItem();
               break;
           case 3:
               modifyItem();
               break;
           case 4:
               removeItem();
               break;
           case 5:
               searchItem();
               break;
           case 6:
             processArrayList();
               break;
           case 7:
               quit = true;
               break;
       }
    }

    }
    //Do these depending on what is selected
    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options ");
        System.out.println("\t1 - To print list of grocery items ");
        System.out.println("\t2 - To add an item to the list ");
        System.out.println("\t3 - To modify an item in the list ");
        System.out.println("\t4 - To remove an item from the list ");
        System.out.println("\t5 - To search for an item in the list ");
        System.out.println("\t6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine()); //add whatever they typed to grocery list - its the parameter needed
    }

    public static void modifyItem(){
        System.out.println("Enter the item name to be modified");
        String itemNo = scanner.nextLine();
        System.out.print("Please enter the new item name");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem(){
        System.out.print("Please enter the item name to remove");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchItem(){
        System.out.print("Please enter the item name you want to find");
        String searchItem = scanner.nextLine();
        if( groceryList.findItem(searchItem)){
            System.out.println("Found " + searchItem + "in our grocery List");
        }else {
            System.out.println(searchItem + " is not in the shopping list");
        }

    }

    //3 quick ways to copy our array list into a new arrayList
    public static void processArrayList(){
        ArrayList<String>newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        //or
       // ArrayList<String>newArrayList = new ArrayList<>(groceryList.getGroceryList());

        //Convert to a regular array

       // String[] myArray = new String[groceryList.getGroceryList().size()];
        //myArray = groceryList.getGroceryList().toArray(myArray);
    }



}

*/













/*
    String greeting = "Happy New Year !!!";
        LocalDate date = LocalDate.now();
        LocalDate newYearDay = LocalDate.of(2018, 1, 1);

        if((newYearDay != null) && (date != null ) && (newYearDay.equals(date))){
            System.out.printf("%s", greeting);
        }else {
            System.out.printf("Have a great day");
        }
 */