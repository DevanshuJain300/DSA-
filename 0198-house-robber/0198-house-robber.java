class Solution {

    HashMap<Integer, Integer> dp = new HashMap<>();

    public int rob(int[] nums) {

        return solve(nums, 0);
    }

    public int solve(int[] nums, int i) {

        // No houses left
        if (i >= nums.length) {
            return 0;
        }

        // Already calculated
        if (dp.containsKey(i)) {
            return dp.get(i);
        }

        // Option 1: Rob current house
        int rob = nums[i] + solve(nums, i + 2);

        // Option 2: Skip current house
        int skip = solve(nums, i + 1);

        // Take the better choice
        int ans = Math.max(rob, skip);

        // Store answer
        dp.put(i, ans);

        return ans;
    }
}