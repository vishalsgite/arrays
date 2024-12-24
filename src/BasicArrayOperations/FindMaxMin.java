package BasicArrayOperations;

import java.util.Arrays;

public class FindMaxMin {
    public static void main(String[] args) {
        // Input array
        int[] array = {5, 7, 2, 9, 4, 1, 8};

        System.out.println("Array: " + Arrays.toString(array));

        // Find max and min
        int[] result = findMaxMin(array);

        System.out.println("Maximum: " + result[0]);
        System.out.println("Minimum: " + result[1]);
    }

    public static int[] findMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return new int[]{max, min};
    }
}
