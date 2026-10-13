class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = m - 1; i >= 0; i--) {
            if (matrix[i][0] > target) continue;
            else {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == target) return true;
                    if (matrix[i][j] > target) break;
                }
            }
        }
        return false;
    }
}