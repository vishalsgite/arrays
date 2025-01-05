package BasicArrayOperations;

public class CheckIfTwoArraysAreEqual {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        boolean areEqual = true;

        // Check if arrays have the same length
        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            // Compare corresponding elements
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break; // No need to check further if a mismatch is found
                }
            }
        }

        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }
    }
}
