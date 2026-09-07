class Solution {
    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        // Add all rotten oranges and count fresh oranges
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size-- > 0) {

                int[] curr = q.poll();

                int i = curr[0];
                int j = curr[1];

                // Down
                if (i + 1 < n && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    fresh--;
                    q.offer(new int[]{i + 1, j});
                }

                // Up
                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    fresh--;
                    q.offer(new int[]{i - 1, j});
                }

                // Right
                if (j + 1 < m && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    fresh--;
                    q.offer(new int[]{i, j + 1});
                }

                // Left
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    fresh--;
                    q.offer(new int[]{i, j - 1});
                }
            }

            minutes++;
        }

        if (fresh > 0) {
            return -1;
        }

        // Last level doesn't represent an additional minute
        return Math.max(0,minutes - 1);
    }
}