package sorting;

import java.util.Random;

public class RandomArrayGenerator {
    
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] randomArray = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(max - min + 1) + min;
        }
        
        return randomArray;
    }
}
