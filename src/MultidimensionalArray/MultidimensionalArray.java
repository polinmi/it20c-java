/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultidimensionalArray;

/**
 *
 * @author HP
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
    //2D Array of names
         String[][] name ={
             {"pau", "cutiee"},
             {"ketlen", "pretty"},   
             {"chloe", "very pretty"},
             {"kessy", "very very pretty"}
         };
         
         //Process using For Loops
         for(int i = 0; i < name.length; i++) {
             for(int j = 0; j < name[i].length; j++ ) {
                 System.out.print(name[i][j] + " ");
             }
             //Output
             System.out.println();
         }
    }
}
