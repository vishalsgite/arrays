package IntermediateProblems;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        // Input array
        int[] array = {0, 1, 9, 0, 2, 3, 0, 4};

        System.out.println("Array Before Moving Zeros: ");
        System.out.println(Arrays.toString(array));

        // Move zeros to the end
        moveZerosToEnd(array);

        System.out.println("Array After Moving Zeros: ");
        System.out.println(Arrays.toString(array));
    }

    public static void moveZerosToEnd(int[] array) {
        int n = array.length;
        int nonZeroIndex = 0; // Pointer for the next non-zero element position

        // Move non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < n) {
            array[nonZeroIndex++] = 0;
        }
    }
}
