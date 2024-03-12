import java.util.Arrays;
import java.util.Random;
import sorting.HeapSort;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(10000, 1, 1000000);

        // Copy the original array for each sorting algorithm
        int[] heapSortArray = Arrays.copyOf(randomArray, randomArray.length);
        int[] modifiedHeapSortArray = Arrays.copyOf(randomArray, randomArray.length);
        int[] quickSortArray = Arrays.copyOf(randomArray, randomArray.length);
        int[] protectedQuickSortArray = Arrays.copyOf(randomArray, randomArray.length);

        // Sorting using HeapSort
         // Sorting using HeapSort
         HeapSort.heapSort(heapSortArray);
         System.out.println("HeapSort: Done");
 
         /*  Sorting using Modified HeapSort
         ModifiedHeapSort.modifiedHeapSort(modifiedHeapSortArray);
         System.out.println("Modified HeapSort: Done");
 
         // Sorting using QuickSort (basic version of Partition)
         QuickSort.quickSort(quickSortArray, 0, quickSortArray.length - 1);
         System.out.println("QuickSort (basic): Done");
 
         // Sorting using QuickSort with protection
         QuickSortWithProtection.quickSortWithProtection(protectedQuickSortArray, 0, protectedQuickSortArray.length - 1);
         System.out.println("QuickSort with Protection: Done");
        **/
        }

    // Function to generate a random array of integers
    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array;
    }

    // HeapSort
    public static void heapSort(int[] array) {
        // Implement HeapSort algorithm here
        // ...
    }

    // Modified HeapSort
    public static void modifiedHeapSort(int[] array) {
        // Implement Modified HeapSort algorithm here
        // ...
    }

    // QuickSort (basic version of Partition)
    public static void quickSort(int[] array, int low, int high) {
        // Implement QuickSort (basic) algorithm here
        // ...
    }

    // QuickSort with protection
    public static void quickSortWithProtection(int[] array, int low, int high) {
        // Implement QuickSort with protection algorithm here
        // ...
    }
}