package IntermediateProblems;

public class StockBuyAndSell {
    public static void main(String[] args) {
        // Input array of stock prices where the index represents the day
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Stock Prices: ");
        for (int price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();

        // Find the maximum profit
        int maxProfit = findMaxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int findMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // Initialize to maximum value
        int maxProfit = 0;  // Initialize to zero

        // Traverse through the array of prices
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price encountered so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate the profit if we sell at the current price
            int profit = prices[i] - minPrice;

            // Update the maximum profit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
