class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int left = 0, right = 1;
        while (left < right && right < nums.length) {
            if (nums[left] == 0) {
                if (nums[right] == 0) {
                    right += 1;
                } else {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left += 1;
                    right += 1;
                }
            } else {
                left += 1;
                right +=1;
            }
        }


    }
}