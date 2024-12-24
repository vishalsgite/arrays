package IntermediateProblems;


public class MissingNumber {
    public static void main(String[] args) {
        // Input array with one missing number
        int[] array = {1, 2, 3, 5};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the missing number
        int missingNumber = findMissingNumber(array, array.length + 1);

        System.out.println("Missing Number: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        // Sum of first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sums
        return expectedSum - actualSum;
    }
}
