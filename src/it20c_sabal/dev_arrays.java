
package it20c_sabal;

public class dev_arrays {
    public static void main(String[] args) {
        /*
         *Simple Implementation
         */
        String[] cats = {"Ginger", "Calico", "Sphinx", "White"};
        System.out.print(cats[0]+", " + cats[1]+", "+ cats[2]+", "+ cats[3]);
        System.out.println("");
        
        /*
         *Display via Loop
         */
        
        for(int i = 0; i <= cats.length; i++){
            System.out.println(cats[i]);
            System.out.println("");
        }
            
        /*
        *multidimensional array
        */    
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
        

