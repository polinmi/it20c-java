import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSort {

    public static void bubbleSort(ArrayList<Integer> arr) {
        // BubbleSort method remains unchanged
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();

        System.out.println("Bubble Sorting ");
        System.out.println("How many numbers you want to sort?");
        int nums = scan.nextInt();
        scan.nextLine(); // consume the newline character

        for (int i = 1; i <= nums; i++) {
            System.out.println("Enter the number you want to sort");
            int num = scan.nextInt();
            NumsToSort.add(num);
        }
    }
}
