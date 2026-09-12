class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: First house included, last excluded
        int case1 = solve(nums, 0, n - 2);

        // Case 2: First house excluded, last included
        int case2 = solve(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int start, int end) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);

        return helper(nums, start, end, dp);
    }

    public int helper(int[] nums, int i, int end, int[] dp) {

        if (i > end) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Rob current house
        int rob = nums[i] + helper(nums, i + 2, end, dp);

        // Skip current house
        int skip = helper(nums, i + 1, end, dp);

        dp[i] = Math.max(rob, skip);

        return dp[i];
    }
}