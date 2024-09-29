/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package arraylist;


/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        ItemManager list = new ItemManager();
        
                list.insertNames("Velt");
		 list.insertNames("Jade");
	     
		 list.displayNames();
            
                 
                 System.out.println();
	     list.updateNames(0, "Thea");
	     list.updateNames(1, "Saliz");
             list.displayNames();
             
             
             System.out.println();
	     list.displayNames();
	     list.findName("Velt");
	     list.findName("Saliz");
             
             
             System.out.println();
	     list.deleteName(0);
	     list.displayNames();

	}

}
    

    