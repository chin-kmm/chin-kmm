import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); // Get the number of elements from the user

        int[] array = new int[n]; // Create an array of the specified size
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); // Read each element from the user and store it in the array
        }

        bubbleSort(array); // Call the bubbleSort function to sort the array

        System.out.println("Sorted array: " + Arrays.toString(array)); // Print the sorted array using Arrays.toString()
    }

    public static void bubbleSort(int[] array) {
        int n = array.length; // Get the length of the array
        for (int i = 0; i < n - 1; i++) {
            // Outer loop iterates n-1 times (n is the length of the array)
            for (int j = 0; j < n - i - 1; j++) {
                // Inner loop iterates through the unsorted portion of the array
                if (array[j] > array[j + 1]) {
                    // If the current element is greater than the next element, swap them
                    int temp = array[j]; // Store the current element in a temporary variable
                    array[j] = array[j + 1]; // Assign the next element to the current position
                    array[j + 1] = temp; // Assign the temporary value to the next position
                }
            }
        }
    }
}
