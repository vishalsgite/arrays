package IntermediateProblems;

import java.util.HashSet;
import java.util.Set;

public class FindPairWithGivenSum {
    public static void main(String[] args) {
        // Input array and target sum
        int[] array = {10, 5, 2, 3, -1, 4};
        int targetSum = 9;

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget Sum: " + targetSum);

        // Find and print pairs with the given sum
        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] array, int targetSum) {
        Set<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + targetSum + ":");

        for (int num : array) {
            int complement = targetSum - num;

            // Check if the complement exists in the set
            if (seen.contains(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }

            // Add the current number to the set for future complement checks
            seen.add(num);
        }
    }
}
