package sorting;

public class QuickSort {

    private static int compareNum = 0;
    private static int swapNum = 0;

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) { compareNum++;

            if (arr[j] <= pivot) {
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
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