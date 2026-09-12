class Solution {

    public int rob(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: Don't rob the last house
        int case1 = solve(nums, 0, n - 2, new HashMap<>());

        // Case 2: Don't rob the first house
        int case2 = solve(nums, 1, n - 1, new HashMap<>());

        return Math.max(case1, case2);
    }

    public int solve(int[] nums, int start, int end,
                     HashMap<Integer, Integer> dp) {

        // No house left
        if (start > end) {
            return 0;
        }

        // Already calculated
        if (dp.containsKey(start)) {
            return dp.get(start);
        }

        // Rob current house
        int rob = nums[start] + solve(nums, start + 2, end, dp);

        // Skip current house
        int skip = solve(nums, start + 1, end, dp);

        int ans = Math.max(rob, skip);

        // Store result
        dp.put(start, ans);

        return ans;
    }
}