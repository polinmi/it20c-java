/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DsiplayViaforLoop;

/**
 *
 * @author HP
 */
public class DsiplayViaforLoop {
    public static void main(String[] args) {
       
         //Array list of names and program
        String[] name = {"polinmi", "paupau", "may"};    
        String[] program = {"BSIT", "BSED", "BSBA"};
        
         //Foor Loops to Print All the values of the variable name and program
        for(int i = 0; i < program.length; i++) {
             //Output
             System.out.println(name[i] + " " + program[i]);
         }
    }
}
