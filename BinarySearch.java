
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int elements = sc.nextInt();
        
        int[] array = new int[elements];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }
        
       Arrays.sort(array);  // Sorting the array for binary search
        System.out.print("Enter another element to search: "); 
        int target = sc.nextInt();
        int result = binarySearch(array, target);
         
            if (result != -1) {
                 System.out.println("Element found at index: " + result);
            } else {
                 System.out.println("Element not found in the array.");
            }
       }
    
     public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent potential integer overflow
            
            if (array[mid] == target) {
                return mid; // Element found
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Element not found
    }      
    }
        