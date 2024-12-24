package IntermediateProblems;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        // Input arrays
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        System.out.println("Array 1: ");
        System.out.println(Arrays.toString(array1));

        System.out.println("Array 2: ");
        System.out.println(Arrays.toString(array2));

        // Find the intersection of the two arrays
        int[] intersection = findIntersection(array1, array2);

        System.out.println("Intersection: ");
        System.out.println(Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : array1) {
            set.add(num);
        }

        // Iterate through the second array and check if the element exists in the set
        for (int num : array2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }

        return result;
    }
}
