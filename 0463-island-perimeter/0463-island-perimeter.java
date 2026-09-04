class Solution {
    public int islandPerimeter(int[][] grid) {

        int perimeter = 0;

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(grid[i][j] == 1) {

                    // Every land cell initially has 4 sides
                    perimeter += 4;

                    // Shared side with cell above
                    if(i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // Shared side with cell on left
                    if(j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}