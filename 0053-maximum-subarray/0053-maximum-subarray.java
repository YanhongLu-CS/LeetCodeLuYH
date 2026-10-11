class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int minpre = 0;
        int ans = Integer.MIN_VALUE;

        for (int num : nums) {
            pre += num;
            ans = Math.max(ans, pre - minpre);
            minpre = Math.min(minpre, pre);
        }

        return ans;
    }
}