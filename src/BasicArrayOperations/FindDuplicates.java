package BasicArrayOperations;

import java.util.*;

public class FindDuplicates {
    public static void main(String[] args) {
        // Input array
        int[] array = {4, 5, 6, 7, 4, 5, 8, 9};

        System.out.println("Array: " + Arrays.toString(array));

        // Find duplicates
        Set<Integer> duplicates = findDuplicates(array);

        System.out.println("Duplicate Elements: " + duplicates);
    }

    public static Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            // If the number is already seen, add it to duplicates
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
