class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int maxProfit = 0;

        while (j < prices.length) {
            int profit = prices[j] - prices[i];
            
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (profit >= 0) {
                j++;
            } else {
                i++;
            }
        }

        return maxProfit;
    }
}
