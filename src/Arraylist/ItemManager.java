/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arraylist;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ItemManager {
    
    private ArrayList<String> items;
    
    //Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }
     //To display all the items in list
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
    //To add new item
    public void addItems(String item) {
        items.add(item);
        System.out.println("You Inserted: " + items);
    }
    //To update an item
    public void updateItem(int index, String newItem) {
        if(index >= 0 && index < items.size()) {
            String oldItem = items.set(index, newItem);
            System.out.println("You updated: " + oldItem + " to " + newItem);
        } else {
            System.out.println("Index out of bounds");
        }
    }
    //To find an item on the list
    public int findItem(String finditem) {
        int index = items.indexOf(finditem);

        if (index != -1) {
            System.out.println("Found: " + finditem + " at index " + index);
        } else {
            System.out.println(finditem + " not found.");
        }
        return index;
    }
}
