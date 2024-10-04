/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_2_linkedlist_string;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {

        //Creating an object to access the LinkedList Class
        LinkedList list = new LinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello pipolssss , WELCOME ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        while (true) {

            System.out.println("Kindly choose a number in the menu you want to do: "
                    + " 1. Add an Item"
                    + " 2. Delete an Item"
                    + " 3. Move/Swap an Item"
                    + " 4. Exit");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // Adding elements to the list
                    System.out.println("Enter 5 Elements that you want to add: ");
                    String item1 = sc.next();
                    String item2 = sc.next();
                    String item3 = sc.next();
                    String item4 = sc.next();
                    String item5 = sc.next();

                    list.add(item1);
                    list.add(item2);
                    list.add(item3);
                    list.add(item4);
                    list.add(item5);

                    System.out.println("Current Linked List:");
                    list.printList();
                    break;

                case 2:
                    //Delete
                    System.out.println();
                    System.out.println("Enter a node that you want to delete: ");
                    String item6 = sc.next();

                    System.out.println("Deleting an item from the list...");
                    System.out.println("Current Linked List: ");

                    list.deleteByValue(item6);
                    list.printList();
                    break;

                case 3:
                    //Swap Items
                    System.out.println();
                    System.out.println("Enter an index that you want to move: ");
                    int item7 = sc.nextInt();
                    System.out.println("Enter an index that you want to swap: ");
                    int item8 = sc.nextInt();
                    list.printList();

                    System.out.println("Swapping node from index " + item7 + " to " + item8);
                    list.swapNodes(item7, item8);
                    list.printList();
                    break;

                case 4:
                    //Exit the program
                    System.out.println("Thank you! Comeback and run it again.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

        }
    }
}
