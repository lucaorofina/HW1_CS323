package sorting;

public class HeapSort {

    private static int compareNum = 0;
    private static int swapNum = 0;

    public static void heapSort(int[] array) {
        int n = array.length;

        // Build a max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap the root (maximum element) with the last element
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // Helper method to heapify a subtree rooted with node i which is an index in the array
    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        compareNum++;
        // If the left child is larger than the root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        compareNum++;
        // If the right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        compareNum++;
        // If the largest is not the root
        if (largest != i) {
            // Swap the root with the largest element
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            swapNum++;

            // Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
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