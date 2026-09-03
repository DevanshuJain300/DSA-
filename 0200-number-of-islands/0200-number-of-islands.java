class Solution {
    public int numIslands(char[][] grid) {

        int count = 0;

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Found a new island
                if (grid[i][j] == '1') {

                    count++;

                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int i, int j) {

        // Out of bounds
        if (i < 0 || j < 0 ||
            i >= grid.length || j >= grid[0].length ||
            grid[i][j] == '0') {
            return;
        }

        // Mark as visited
        grid[i][j] = '0';

        // Down
        dfs(grid, i + 1, j);

        // Up
        dfs(grid, i - 1, j);

        // Right
        dfs(grid, i, j + 1);

        // Left
        dfs(grid, i, j - 1);
    }
}