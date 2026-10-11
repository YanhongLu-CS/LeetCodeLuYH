class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int count = 0;
        int n = nums.length;
        Map <Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int i = 0; i < n; i++) {
            count += nums[i];
            ans += mp.getOrDefault(count - k, 0);
            mp.put(count, 1 + mp.getOrDefault(count, 0));
        }
        return ans;
    }
}