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
    long startTimeHeap = System.nanoTime();
    HeapSort.heapSort(randomArray);
    long endTimeHeap = System.nanoTime();
    long durationHeapSort = endTimeHeap - startTimeHeap;
        
    System.out.println("Sorted array using HeapSort:");
    printArray(randomArray);
    
    System.out.println("Execution time for HeapSort: " + durationHeapSort + " ns");
    
    // Sort the array using QuickSort
    long startTimeQuick = System.nanoTime();
    QuickSort.quickSort(randomArray);
    long endTimeQuick = System.nanoTime();
    long durationQuickSort = endTimeQuick - startTimeQuick;

    System.out.println("Quick Sort execution time (nanosecond): " +durationQuickSort + "ns");
    printArray(randomArray);

     // Sort the array using HeapSortMod
    long startTimeHeapM = System.nanoTime();
    HeapSortMod.heapSortMod(randomArray); 
    long endTimeHeapM = System.nanoTime();
    long durationHeapSortM= endTimeHeapM - startTimeHeapM;
    
    System.out.println("Modified Heap Sort Execution Time (Nanoseconds): " + durationHeapSortM + " ns");
    
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