package BasicArrayOperations;

public class SecondLargestElement {
    public static void main(String[] args) {
        // Input array
        int[] array = {10, 20, 4, 45, 99, 99};

        System.out.println("Array: " + java.util.Arrays.toString(array));

        // Find the second largest element
        int secondLargest = findSecondLargest(array);

        System.out.println("Second Largest Element: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two distinct elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                // Update second largest before largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update second largest if it's smaller than the current number
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found. Array may have duplicate elements only.");
        }

        return secondLargest;
    }
}
