package io.mikaila;

import java.util.ArrayList;

public class GroceryList {
/*
    //Instance Variable
    private ArrayList<String> groceryList = new ArrayList<>();

    //getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }


    //Methods
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int x = 0; x < groceryList.size(); x++){
            System.out.println(x+1 + ". " + groceryList.get(x)); //plus 1 tp print cos humans count from 1
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = find(currentItem);
        if(position >= 0){
        modifyGroceryItem(position, newItem);
        }
    }

    private int find(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    //Overloaded
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1)  + " has been modified"); // + 1 because the index is different for humans to see
    }

    public void removeGroceryItem(String item){
        int position = find(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
       groceryList.remove(position);
    }

    public boolean findItem(String searchItem){
        int position = find(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
*/
}
