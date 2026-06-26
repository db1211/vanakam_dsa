package arrays;

public class BestTimeToBuySell {

    public static int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // minBuy = Math.min(prices[i], minBuy);
            // maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            if (minBuy > prices[i]) {
                minBuy = prices[i];
            }
            if (maxProfit < prices[i] - minBuy) {
                maxProfit = prices[i] - minBuy;
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int profit = maxProfit(prices);
        System.out.println("profit : " + profit);
    }
}
