package advancedProblems;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        // Input array
        int[] array = {2,4,1,6,0,2,7};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the maximum product subarray
        int maxProduct = maxProductSubarray(array);
        System.out.println("Maximum Product Subarray: " + maxProduct);
    }

    public static int maxProductSubarray(int[] array) {
        // Initialize the variables to track the max and min products
        int maxSoFar = array[0];
        int minSoFar = array[0];
        int result = array[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < array.length; i++) {
            // If the current element is negative, swap max and min
            if (array[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar
            maxSoFar = Math.max(array[i], maxSoFar * array[i]);
            minSoFar = Math.min(array[i], minSoFar * array[i]);

            // Update the result with the maximum product so far
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
