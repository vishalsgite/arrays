package advancedProblems;

import java.util.Arrays;

public class ArrayPartitioning {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 9};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the minimum difference of subset sums
        int minDifference = findMinDifference(array);
        System.out.println("Minimum Difference: " + minDifference);
    }

    public static int findMinDifference(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }

        // DP array to store whether a subset sum is possible
        boolean[] dp = new boolean[totalSum / 2 + 1];
        dp[0] = true; // Sum 0 is always possible

        // Fill the DP array
        for (int num : array) {
            for (int j = totalSum / 2; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        // Find the largest subset sum that is possible
        int sum1 = 0;
        for (int i = totalSum / 2; i >= 0; i--) {
            if (dp[i]) {
                sum1 = i;
                break;
            }
        }

        // The minimum difference between the two subsets
        int sum2 = totalSum - sum1;
        return Math.abs(sum2 - sum1);
    }
}
