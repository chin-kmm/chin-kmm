import java.util.Arrays;
import java.util.Scanner;

public class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: "); // ask the user to input a number for the elements in the array
        int elements = sc.nextInt();
        
        int[] array = new int[elements];
        System.out.println("Enter the elements of the array: "); //ask the user to input elements of the array
        for (int i = 0; i < elements; i++) {
            array[i] = sc.nextInt();
        }

        // Linear Search
        System.out.print("Enter the value to search using Linear Search: ");// ask the user to enter the value they want to search
        int target = sc.nextInt(); //stored the target value in the target variable
        int index = linearSearch(array, target); //call the linear search method passing the array and target as arguments
        if (index != -1) {  //check if the index is not equal to -1 then if it is the element is found 
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
      }

public static int linearSearch(int[] array, int target) {  //implements the linesr search and iterates through each elements of the array using for loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) { //checks if the elements is equal to the target
                return i;
            }
        }
        return -1; //elements not found
      }
    }