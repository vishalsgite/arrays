package IntermediateProblems;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        // Input array
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the maximum sum of a contiguous subarray
        int maxSum = kadane(array);
        System.out.println("Maximum Sum of Contiguous Subarray: " + maxSum);
    }

    public static int kadane(int[] array) {
        int maxSoFar = array[0];  // To store the overall maximum sum
        int maxEndingHere = array[0];  // To store the maximum sum of the subarray ending at the current position

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);  // Either start a new subarray or extend the current subarray
            maxSoFar = Math.max(maxSoFar, maxEndingHere);  // Update the overall maximum sum
        }

        return maxSoFar;
    }
}
