package BasicArrayOperations;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {5, 7, 2, 9, 4, 1, 8};

        System.out.println("Array: " + Arrays.toString(array));

        // Calculate sum
        int sum = calculateSum(array);

        System.out.println("Sum of elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;

        // Iterate through the array and add elements to the sum
        for (int num : array) {
            sum += num;
        }

        return sum;
    }
}
