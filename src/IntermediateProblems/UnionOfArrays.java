package IntermediateProblems;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class UnionOfArrays {
    public static void main(String[] args) {
        // Input arrays
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 3, 4};

        System.out.println("Array 1: ");
        System.out.println(Arrays.toString(array1));

        System.out.println("Array 2: ");
        System.out.println(Arrays.toString(array2));

        // Find the union of the two arrays
        int[] union = findUnion(array1, array2);

        System.out.println("Union: ");
        System.out.println(Arrays.toString(union));
    }

    public static int[] findUnion(int[] array1, int[] array2) {
        Set<Integer> unionSet = new HashSet<>();

        // Add elements of the first array to the set
        for (int num : array1) {
            unionSet.add(num);
        }

        // Add elements of the second array to the set
        for (int num : array2) {
            unionSet.add(num);
        }

        // Convert the union set to an array
        int[] result = new int[unionSet.size()];
        int index = 0;
        for (int num : unionSet) {
            result[index++] = num;
        }

        return result;
    }
}

