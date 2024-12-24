package IntermediateProblems;

import java.util.Arrays;

public class CyclicallyRotateArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Array Before Rotation: ");
        System.out.println(Arrays.toString(array));

        // Rotate the array cyclically by one position
        cyclicallyRotate(array);

        System.out.println("Array After Rotation: ");
        System.out.println(Arrays.toString(array));
    }

    public static void cyclicallyRotate(int[] array) {
        int n = array.length;

        // If array is empty or has only one element, no rotation is needed
        if (n <= 1) {
            return;
        }

        // Store the last element
        int last = array[n - 1];

        // Shift all elements one position to the right
        for (int i = n - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        // Move the last element to the first position
        array[0] = last;
    }
}
