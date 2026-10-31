class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int maxProfit = 0;
        int l = 0;
        int r = 1;

        while (r < prices.length) {
            if (prices[l] > prices[r]) {
                l = r;
            } else {
                maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            }
            r++;
        }

        return maxProfit;
    }
}
