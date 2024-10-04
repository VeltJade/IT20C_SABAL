/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist_int;

/**
 *
 * @author acer
 */
public class Main {
 	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();

        // Adding elements to the list
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 2 from the list...");
        System.out.println("Current Linked List:");
        list.deleteByValue(2);
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Movingn/Swapping node from index 1 to index 0");
        list.moveNodePointer(0, 1);
        list.printList();
	}
}