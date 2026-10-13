class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        if (n <= 1) return;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int l = 0, r = n - 1;
        while (l < r) {
            for (int i = 0; i < n; i++) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
            }
            l++;
            r--;
        }
        return;
    }
}