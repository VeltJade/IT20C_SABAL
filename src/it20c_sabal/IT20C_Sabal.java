/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it20c_sabal;

/**
 *
 * @author acer
 */
public class IT20C_Sabal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] gwapa ={
            {'x', 'x', ' ', ' ', ' ', 'x', 'x'},
            {' ', ' ', 'x', ' ', 'x', ' ', ' '},
            {'x', 'x', ' ', 'x', ' ', 'x', 'x'},
            {'x', ' ', 'x', 'x', 'x', ' ', 'x'},
            {' ','x', ' ', 'x', ' ', 'x', ' '},
            {'x', ' ', ' ', 'x', ' ', ' ', 'x'},
            {'x', ' ', 'x', 'x', 'x', ' ', 'x'},
            {' ', 'x', ' ', 'x', ' ', 'x', ' '},
            
        };
        for(int i = 0; i < gwapa.length; i++){
            for(int j = 0; j < gwapa[i].length; j++){
                System.out.print(gwapa[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
    
