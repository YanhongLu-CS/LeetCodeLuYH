class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int r = m - 1, c = 0;
        while (r >= 0 && c < n) {
            if (matrix[r][c] == target) return true;
            if (matrix[r][c] > target) r--;
            else if (matrix[r][c] < target) c++;
        }
        return false;
    }
}