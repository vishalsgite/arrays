package BasicArrayOperations;

import java.util.Arrays;

public class PalindromeArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 2, 1};

        System.out.println("Array: " + Arrays.toString(array));

        // Check if the array is a palindrome
        boolean isPalindrome = isPalindrome(array);

        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
