/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class ItemManager {
    private ArrayList<String> names;
    public ItemManager(){
        names = new ArrayList<>();
    }
    public void displayNames(){
        System.out.println("Display names: " + names);
    }
    public void insertNames(String name){
        names.add(name);
        System.out.println("Inserted name: " + names);
    }
    public void updateNames(int index, String newName){
        if(index >= 0 && index < names.size()) {
    		String oldName = names.set(index, newName);
    		System.out.println("Updated name: " + oldName + " to " + newName);
    	} else {
    		System.out.println("Index out of bounds");
    	} 	
    }
    public int findName(String name) {
        int index = names.indexOf(name);
        if (index != -1) {
            System.out.println("Found: " + name + " at index " + index);
        } else {
            System.out.println(name + " not found.");
        }
        return index;
    }
    public void deleteName(int index) {
        if (index >= 0 && index < names.size()) {
            String removedName = names.remove(index);
            System.out.println("Deleted: " + removedName);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
}
