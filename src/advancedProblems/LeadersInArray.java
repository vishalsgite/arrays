package advancedProblems;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        // Input array
        int[] array = {16, 17, 4, 3, 5, 2};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the leaders in the array
        List<Integer> leaders = findLeaders(array);
        System.out.println("Leaders: ");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static List<Integer> findLeaders(int[] array) {
        List<Integer> leaders = new ArrayList<>();
        int n = array.length;

        // Start from the rightmost element
        int maxRight = array[n - 1];
        leaders.add(maxRight);  // Rightmost element is always a leader

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] >= maxRight) {
                leaders.add(array[i]);  // Add to leaders list if it's a leader
                maxRight = array[i];    // Update maxRight
            }
        }

        // Reverse the list to maintain left-to-right order
        List<Integer> result = new ArrayList<>();
        for (int i = leaders.size() - 1; i >= 0; i--) {
            result.add(leaders.get(i));
        }

        return result;
    }
}
