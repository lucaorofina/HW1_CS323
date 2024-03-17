package sorting;

import java.util.Random;

public class QuickSortMod {
    private static int compareNum = 0;
    private static int swapNum = 0;
    private static Random random = new Random();

    public static void quickSortMod(int[] arr) {
        quickSortMod(arr, 0, arr.length - 1);
    }
    
    private static void quickSortMod(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            
            quickSortMod(arr, low, partitionIndex - 1);
            quickSortMod(arr, partitionIndex + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        // Randomly select a pivot index within the range
        int randomElement = random.nextInt(high - low + 1) + low;
        // Swap the random pivot with the last element
        int temp1 = arr[randomElement];      
        arr[randomElement] = arr[high];
        arr[high] = temp1;                 

        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) { compareNum++;

            if (arr[j] <= pivot) {
                i++;
                
                int temp2 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp2;
            }
        }
        
        int temp3 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp3;
        swapNum++;
        
        return i + 1;
        
    }

    //comparison and swap counters
    public static int getCompareNum() {
        return compareNum;
    }

    public static int getSwapNum() {
        return swapNum;
    }

    // Reset counters
    public static void resetCount() {
        compareNum = 0;
        swapNum = 0;
    }
} 

