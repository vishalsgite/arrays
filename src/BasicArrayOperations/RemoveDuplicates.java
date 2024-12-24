package BasicArrayOperations;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Input array
        int[] array = {4, 5, 6, 7, 4, 5, 8, 9};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Convert Set to Array
        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }
        return result;
    }
}
