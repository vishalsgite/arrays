package IntermediateProblems;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Count the occurrences
        Map<Integer, Integer> occurrences = countOccurrences(array);

        System.out.println("Element frequencies: ");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Element " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> countOccurrences(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and count occurrences
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        return frequencyMap;
    }
}
