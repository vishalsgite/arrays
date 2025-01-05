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

        for (int element : array) {
            // If the number is already seen, add it to duplicates
            if (!seen.add(element)) {      //seen.add(element) tries to add the current number (element) to the seen set& will return true or false
                duplicates.add(element);
            }
        }
        return duplicates;
    }

    /*
    What is seen?

seen is a HashSet that stores all the numbers we’ve come across so far.
What Does add(num) Do?

add(num) tries to add the current number (num) to the seen set.
If the number is not already in the set, it gets added, and add(num) returns true.
If the number is already in the set, it does not get added, and add(num) returns false.
     */
}
