package sorting;

public class HeapSortMod {
    public static void heapSortMod(int[] array) {
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
    private static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int leftGrandChild1 = 4 * i + 3;
        int leftGrandChild2 = 4 * i + 4;
        int rightGrandChild1 = 4 * i + 5;
        int rightGrandChild2 = 4 * i + 6;
    
        // Compare with four grandchildren
        if (leftGrandChild1 < n && array[leftGrandChild1] > array[largest]) {
            largest = leftGrandChild1;
        }
        if (leftGrandChild2 < n && array[leftGrandChild2] > array[largest]) {
            largest = leftGrandChild2;
        }
        if (rightGrandChild1 < n && array[rightGrandChild1] > array[largest]) {
            largest = rightGrandChild1;
        }
        if (rightGrandChild2 < n && array[rightGrandChild2] > array[largest]) {
            largest = rightGrandChild2;
        }
    
        // If no swapping occurred with grandchild, compare with left and right children
        if (largest == i) {
            if (left < n && array[left] > array[largest]) {
                largest = left;
            }
            if (right < n && array[right] > array[largest]) {
                largest = right;
            }
        }
    
        // If the largest is not the root
        if (largest != i) {
            // Swap the root with the largest element
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
    
            // Recursively heapify the affected subtree
            heapify(array, n, largest);
        }
    }     
}