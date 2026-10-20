class Solution {
    public int numSquares(int n) {
        int[] record = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (isSquare(i)) {
                record[i] = 1;
            } else {
                int tmp = i;
                for (int j = 1; j * j <= i; j++) {
                    tmp = Math.min(tmp, record[i - j * j]);
                }
                record[i] = tmp + 1;
            }
        }
        return record[n];
    }
    private boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}