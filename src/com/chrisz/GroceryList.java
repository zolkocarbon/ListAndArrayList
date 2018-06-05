package com.chrisz;

import java.util.ArrayList;

public class GroceryList {
    // ********* Array Lists ***************
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }
    // *** This section was added in last lesson *********
    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    // ***** and end here ********************************

    // changed to private as override method above accesses this
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(theItem + " has been removed from your list.");
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
        //boolean exists = groceryList.contains(searchItem);

//        int position = groceryList.indexOf(searchItem);
//        if(position>=0) {
//            return groceryList.get(position);
//        }
//        return null;
    }

    //
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return (position >= 0);
//        if(position >= 0) {
//            return true;
//        }
//        return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
