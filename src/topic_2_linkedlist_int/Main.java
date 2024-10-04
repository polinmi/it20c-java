
package topic_2_linkedlist_int;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Main {
    
     public static void main(String[] args) {

        //Creating an object to access the LinkedList Class
        Linkedlist list = new Linkedlist();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello pipolssss , WELCOME ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        while(true) {

             System.out.println("Kindly choose a number in the menu you want to do: "
                + " 1. Add an Item"
                + " 2. Delete an Item"
                + " 3. Move/Swap an Item"
                + " 4. Exit");

            int choice = sc.nextInt();

          switch(choice) {
                case 1:
                      // Adding elements to the list
                        System.out.println("Enter 5 Elements that you want to add: ");
                        int item1 = sc.nextInt();
                        int item2 = sc.nextInt();
                        int item3 = sc.nextInt();
                        int item4 = sc.nextInt();
                        int item5 = sc.nextInt();

                        list.add(item1);
                        list.add(item2);
                        list.add(item3);
                        list.add(item4);
                        list.add(item5);

                        System.out.println("Current Linked List:");
                        list.printList();
                        break;
        }
    }
}
}