import sorting.HeapSort;
import java.util.Scanner;
import sorting.QuickSort;
import sorting.HeapSortMod;
import sorting.QuickSortMod;
import sorting.RandomArrayGenerator;

public class SortingAlgorithms {

    private static int max;
    private static int min;
    private static int size;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //loop so that only the first iteration it asks for inputs
        if (max == 0 || min == 0 || size == 0) {
            // Input maximum and min and size
            System.out.print("Enter the maximum value: ");
            max = scanner.nextInt();

            System.out.print("Enter the minimum value: ");
            min = scanner.nextInt();
            
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
        }
        // Generate random array
        int[] randomArray = RandomArrayGenerator.generateRandomArray(size, min, max);
                
        System.out.print("Enter the number of iterations to run: ");
        int iterations = scanner.nextInt();
        //for loop continuosly 
        
        
        /* 
        System.out.println("Random array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    */

    System.out.println();
        
    for (int i = 0; i < iterations; i++) {
    // Sort the array using HeapSort
    long startTimeHeap = System.nanoTime();
    HeapSort.heapSort(randomArray);
    long endTimeHeap = System.nanoTime();
    long durationHeapSort = endTimeHeap - startTimeHeap;
        
    //printArray(randomArray);
    
    System.out.println("Heap Sort execution time: " + durationHeapSort + " ns");
    
    // QuickSort
    long startTimeQuick = System.nanoTime();
    QuickSort.quickSort(randomArray);
    long endTimeQuick = System.nanoTime();
    long durationQuickSort = endTimeQuick - startTimeQuick;

    System.out.println("Quick Sort execution time (nanosecond): " +durationQuickSort + "ns");
    //printArray(randomArray);

    // Sort the array using HeapSortMod
    long startTimeHeapM = System.nanoTime();
    HeapSortMod.heapSortMod(randomArray); 
    long endTimeHeapM = System.nanoTime();
    long durationHeapSortM= endTimeHeapM - startTimeHeapM;
    
    System.out.println("Modified Heap Sort Execution Time (Nanoseconds): " + durationHeapSortM + " ns");
    
    //printArray(randomArray);

     
 //Sort the array using QuickSort with a partition in a random index of the array
 
    long startTimeQuickM = System.nanoTime();
    QuickSortMod.quickSortMod(randomArray);
    long endTimeQuickM = System.nanoTime();
    long durationQuickSortM = endTimeQuickM - startTimeQuickM;

    System.out.println("Modified Quick Sort execution time (nanosecond): " +durationQuickSortM + "ns\n");
    
    
    } 
    scanner.close();
}
/* 
private static void printArray(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println(); */
}
