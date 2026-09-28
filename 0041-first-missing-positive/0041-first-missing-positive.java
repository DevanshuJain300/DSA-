class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        int i = 0;

        while (i < n) {

            int correctIndex = nums[i] - 1;

            // Put nums[i] at its correct position
            if (nums[i] > 0 &&
                nums[i] <= n &&
                nums[i] != nums[correctIndex]) {

                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                i++;
            }
        }

        // Find first number at wrong position
        for (i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}