/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist_string;

/**
 *
 * @author acer
 */
public class Main {
    
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();


        list.add("Megan Thee Stallion - Body");
        list.add("Beyonce - Diva");
        list.add("Lady Gaga - Telephone");
        list.add("Megan Thee Stallion - HISS");
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        

        list.deleteByValue("Megan Thee Stallion - HISS");
        System.out.println();
        System.out.println("Deleting |Megan Thee Stallion - HISS| from the list...");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.printList();
        

        System.out.println();
        System.out.println("Moving/Swapping node from index 1 to index 0");
        System.out.println();
        System.out.println("Current Linked List:");
        System.out.println("------------------------------");
        list.moveNodePointer(0, 1);
        list.printList();
	}

}