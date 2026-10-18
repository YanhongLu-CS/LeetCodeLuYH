import java.util.*;

class Solution {

    int[] dr = {-1, 0, 1, 0};
    int[] dc = {0, -1, 0, 1};

    public int orangesRotting(int[][] grid) {
        int nr = grid.length, nc = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        Map<int[], Integer> depth = new HashMap<>();

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (grid[i][j] == 2) {
                    int[] code = {i, j};
                    queue.add(code);
                    depth.put(code, 0);
                }
            }
        }

        int ans = 0;

        while (!queue.isEmpty()) {
            int[] code = queue.remove();
            int r = code[0], c = code[1];

            for (int i = 0; i < 4; i++) {
                int tr = r + dr[i];
                int tc = c + dc[i];

                if (tr >= 0 && tr < nr &&
                    tc >= 0 && tc < nc &&
                    grid[tr][tc] == 1) {

                    grid[tr][tc] = 2;

                    int[] tcode = {tr, tc};
                    queue.add(tcode);

                    depth.put(tcode, depth.get(code) + 1);

                    ans = Math.max(ans, depth.get(tcode));
                }
            }
        }

        for (int[] row : grid) {
            for (int v : row) {
                if (v == 1) {
                    return -1;
                }
            }
        }

        return ans;
    }
}