class Solution {
    public int rob(int[] nums) {
        int prev = 0, cur = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = cur;
            cur = Math.max(cur, prev + nums[i]);
            prev = temp;
        }
        return cur;
    }
}