package IntermediateProblems;

import java.util.Arrays;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        // Input array and target sum
        int[] array = {1, 2, 3, 7, 5};
        int targetSum = 12;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Target Sum: " + targetSum);

        // Find the subarray with the given sum
        int[] subarray = findSubarrayWithSum(array, targetSum);

        if (subarray != null) {
            System.out.println("Subarray with given sum: " + Arrays.toString(subarray));
        } else {
            System.out.println("No subarray with the given sum found.");
        }
    }

    public static int[] findSubarrayWithSum(int[] array, int targetSum) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < array.length; end++) {
            currentSum += array[end];

            // Shrink the window if the current sum is greater than the target sum
            while (currentSum > targetSum && start < end) {
                currentSum -= array[start++];
            }

            // If we find the subarray with the given sum
            if (currentSum == targetSum) {
                return Arrays.copyOfRange(array, start, end + 1);
            }
        }
        return null;
    }
}
