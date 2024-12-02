package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();

        System.out.println("Insertion Sorting ");

        System.out.println("How many numbers you want to sort?");
        int nums = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= nums; i++) {

            System.out.println("Enter the number you want to sort");
            int num = scan.nextInt();
            NumsToSort.add(num);

            if (nums == i) {

                System.out.println("Original ArrayList:");
                System.out.println(NumsToSort);

                insertionSort(NumsToSort);

                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;

            }
        }
    }
}
