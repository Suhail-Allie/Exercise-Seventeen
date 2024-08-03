package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list: ");
        //DEclare arrays
        int numElements = scanner.nextInt();
        int[] list = new int[numElements];

        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < numElements; i++) {
            list[i] = scanner.nextInt();
        }

        System.out.println(isSorted(list) ? "The list is already sorted." : "The list is not sorted.");

        scanner.close();
    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
