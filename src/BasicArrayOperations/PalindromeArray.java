package BasicArrayOperations;

import java.util.Arrays;

public class PalindromeArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 2, 1};

        System.out.println("Array: " + Arrays.toString(array));

        // Check if the array is a palindrome
        boolean isPalindrome = isPalindromeArray(array);


        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println(isPalindromeInt(122));
    }

    public static boolean isPalindromeArray(int[] array) {
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
    public static boolean isPalindromeInt(int x) {

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Single digit numbers are always palindromes
        if (x < 10) {
            return true;
        }

        int original = x;
        int reversedNumber = 0;

        // Reverse the second half of the number
        while (x > 0) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return reversedNumber == original;
    }
}
