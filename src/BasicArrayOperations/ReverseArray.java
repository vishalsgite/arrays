package BasicArrayOperations;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Reverse the array
        reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start to end
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }
}
