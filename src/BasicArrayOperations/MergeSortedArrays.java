package BasicArrayOperations;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Input arrays (must be sorted)
        int[] array1 = {1,3,5,7,9,10};
        int[] array2 = {2,4,6,8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {

        // Sort both arrays to make the merge work correctly
        Arrays.sort(array1);
        Arrays.sort(array2);


        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // Merge arrays until one is exhausted
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {

                mergedArray[k] = array1[i];
                k++;
                i++;

            } else {
                mergedArray[k] = array2[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements from array1
        while (i < n1) {
            mergedArray[k] = array1[i];
            k++;
            i++;
        }

        // Copy remaining elements from array2
        while (j < n2) {
            mergedArray[k] = array2[j];
            k++;
            j++;
        }

        return mergedArray;
    }
}
