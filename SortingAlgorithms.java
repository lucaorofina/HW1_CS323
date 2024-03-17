//import java.util.Arrays;
//import java.util.Random;
import sorting.HeapSort;
import java.util.Scanner;
import sorting.QuickSort;
import sorting.HeapSortMod;
import sorting.QuickSortMod;
import sorting.RandomArrayGenerator;

public class SortingAlgorithms {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Input maximum and minimum values
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Generate random array
        int[] randomArray = RandomArrayGenerator.generateRandomArray(size, min, max);
        
        // Print the generated array
        System.out.println("Random array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    

    System.out.println();
        
    // Sort the array using HeapSort
    long startTime = System.currentTimeMillis();
    HeapSort.heapSort(randomArray);
    long endTime = System.currentTimeMillis();
    long durationHeapSort = endTime - startTime;
        
    System.out.println("Sorted array using HeapSort:");
    printArray(randomArray);
    
    // Sort the array using QuickSort
    QuickSort.quickSort(randomArray);
    System.out.println("Sorted array using QuickSort:");
    printArray(randomArray);

    System.out.println("Execution time for HeapSort: " + durationHeapSort + " ms");
    
     // Sort the array using HeapSortMod
    long startTime = System.currentTimeMillis();
    HeapSortMod.heapSortMod(randomArray);
    long endTime = System.currentTimeMillis();
    long durationHeapSortMod = endTime - startTime;
         
    System.out.println("Sorted array using HeapSortMod:");
    printArray(randomArray);
     /* 
 // Sort the array using QuickSortMod
     long startTime = System.currentTimeMillis();
     QuickSortMod.quickSortMod(randomArray);
     long endTime = System.currentTimeMillis();
     long durationQuickSortMod = endTime - startTime;
            
     System.out.println("Sorted array using QuickSortMod:");
     printArray(randomArray);
*/

    scanner.close();
}

private static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}