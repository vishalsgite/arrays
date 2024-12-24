package BasicArrayOperations;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        // Input array and number of rotations
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 3;

        System.out.println("Original Array: " + Arrays.toString(array));
        rotateArray(array, positions);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int positions) {
        int n = array.length;

        // Ensure positions are within bounds
        positions = positions % n;

        // Reverse the entire array
        reverse(array, 0, n - 1);
        // Reverse the first part
        reverse(array, 0, positions - 1);
        // Reverse the second part
        reverse(array, positions, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
