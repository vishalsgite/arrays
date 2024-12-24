package advancedProblems;

public class EquilibriumIndex {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 3, 5, 2, 2};

        System.out.println("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find the equilibrium index
        int equilibriumIndex = findEquilibriumIndex(array);
        System.out.println("Equilibrium Index: " + equilibriumIndex);
    }

    public static int findEquilibriumIndex(int[] array) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int num : array) {
            totalSum += num;
        }

        // Traverse the array and check for equilibrium index
        for (int i = 0; i < array.length; i++) {
            // Update totalSum to right sum by subtracting current element
            totalSum -= array[i];

            // Check if leftSum equals rightSum
            if (leftSum == totalSum) {
                return i; // Return the equilibrium index
            }

            // Update leftSum to include the current element
            leftSum += array[i];
        }

        return -1; // Return -1 if no equilibrium index is found
    }
}
