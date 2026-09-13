class Solution {

    public int minCapability(int[] nums, int k) {

        int left = nums[0];
        int right = nums[0];

        // Find search range
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canRob(nums, k, mid)) {
                // Capability is possible.
                // Try smaller capability.
                right = mid;
            } else {
                // Capability is not enough.
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean canRob(int[] nums, int k, int capability) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= capability) {

                // Rob this house
                count++;

                // Cannot rob adjacent house
                i++;
            }

            if (count >= k) {
                return true;
            }
        }

        return false;
    }
}