class Solution {
    public int n;
    public int[] nums;
    public int[] colors;
    public long[] memo;

    public long dfs(int i) {
        if (i == n)  // All houses checked
            return 0;

        if (memo[i] != -1)
            return memo[i];

        boolean canrob_both = (i + 1 == n || colors[i] != colors[i + 1]);
        if (canrob_both)  // If we can rob both houses, we do it
            return memo[i] = nums[i] + dfs(i + 1);

        // If we have to choose, we try both options
        return memo[i] = Math.max(nums[i] + dfs(i + 2), dfs(i + 1));
    }

    public long rob(int[] nums, int[] colors) {
        this.nums = nums;
        this.colors = colors;
        this.n = nums.length;
        this.memo = new long[nums.length];
        for (int i = 0; i < nums.length; i++) 
            memo[i] = -1;
        return dfs(0);
    }
}