class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) return;
        boolean[] rm = new boolean[m];
        boolean[] rn = new boolean[n];
        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    flag = true;
                    break;
                }
            }
            rm[i] = flag;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < m; j++) {
                if(matrix[j][i] == 0) {
                    flag = true;
                    break;
                }
            }
            rn[i] = flag;
        }
        for(int i = 0; i < m; i++) {
            if (rm[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
            
        }
        for (int i = 0; i < n; i++) {
            if (rn[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        return;
    }
}