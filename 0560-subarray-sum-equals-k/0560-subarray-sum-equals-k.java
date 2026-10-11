class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return 0;
        int ans = 0;
        int[] sum  = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        if (sum[0] == k) ans += 1;
        for (int i = 1; i < n; i++) {
            if (sum[i] == k) {ans += 1;}
            for (int j = 0; j < i; j++) {
                if (sum[i] - sum[j] == k) ans += 1;
            }
        }
        return ans;
    }
}