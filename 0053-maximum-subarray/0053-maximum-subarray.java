class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] minpre = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }
        minpre[0] = pre[0];
        for(int i = 1; i < n; i++) {
            minpre[i] = Math.min(minpre[i - 1], pre[i]);
        }
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            ans = Math.max(Math.max(ans, pre[i] - minpre[i - 1]), pre[i]);
        }
        return ans;
    }
}