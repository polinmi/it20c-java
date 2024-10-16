package Queue;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue customerQueue = new queue();

        System.out.println("Hello there, hehe!");

        while (true) {
            System.out.println("Choose what you want:"
                    + " 1. Display Queue."
                    + " 2. Add Customer."
                    + " 3. Serve Customer."
                    + " 4. Exit");
            int choices = sc.nextInt();
            switch (choices) {
                case 1:
                    System.out.println();
                    customerQueue.displayQueue();
                    break;
                case 2:
                    // To accept another string input
                    sc.nextLine();
                    System.out.println("Enter new customer: ");
                    String name = sc.nextLine();
                    System.out.println();
                    customerQueue.enqueue(new customer(name));
                    break;
                case 3:
                    System.out.println();
                    customerQueue.dequeue();
                    break;
                case 4:
                    // Exit the program
                    System.out.println();
                    System.out.println("Thank you! Come back and run it again.");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
