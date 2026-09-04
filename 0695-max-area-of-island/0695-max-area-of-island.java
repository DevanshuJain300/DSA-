class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       int maxArea=0;
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                int area=dfs(grid,i,j);

                maxArea=Math.max(maxArea,area);
            }
        }
    }
    return maxArea;
    }
    public int dfs(int[][] grid,int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

        int area=1;

        area=area + dfs(grid,i+1,j);
        area=area + dfs(grid,i-1,j);
        area=area + dfs(grid,i,j-1);
        area=area + dfs(grid,i,j+1);
        return area;
    }
}