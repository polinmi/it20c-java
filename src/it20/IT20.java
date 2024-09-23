/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it20;

/**
 *
 * @author ADMIN
 */
public class IT20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int rows = 5; 

        for (int i = 1; i <= rows; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}