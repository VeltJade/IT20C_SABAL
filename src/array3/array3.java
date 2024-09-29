/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array3;

/**
 *
 * @author acer
 */
public class array3 {
    public static void main(String[] args) {
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
        for(int f = 0; f < gwapa.length; f++){
            for(int j = 0; j < gwapa[f].length; j++){
                System.out.print(gwapa[f][j]+" ");
            }
            System.out.println();
        }
    }
    }
    
