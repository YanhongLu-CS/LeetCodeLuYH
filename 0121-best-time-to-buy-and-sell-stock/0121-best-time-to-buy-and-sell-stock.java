class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] minPrice = new int[n];
        if (n < 2) return 0;
        minPrice[1] = prices[0];
        for (int i = 2; i < n; i++) {
            minPrice[i] = Math.min(minPrice[i - 1], prices[i - 1]);
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, prices[i] - minPrice[i]);
        }
        return ans;
    }
}