package arrays;

/**
 * You are given an array of prices where prices[i] is the price of a given stock on an ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class StockBuyAndSell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        long profit = sellMax(arr);
        System.out.println("\nMax Profit: " + profit);
    }

    private static long sellMax(int[] arr) {
        int i = 0, j = 0;
        long buy = arr[0];
        long maxProfit = 0;
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < buy) {
                buy = arr[k];
                i = k;
            }
            else if (arr[k] > buy) {
                maxProfit = Math.max(maxProfit, arr[k] - buy);
                j = k;
            }
        }
        System.out.println("Bought on: " + (i+1) + "th day, sold on: " + (j+1) + "th Day");
        return maxProfit;
    }
}
