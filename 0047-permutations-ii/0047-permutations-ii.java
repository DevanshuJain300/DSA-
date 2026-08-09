class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        backtrack(nums, 0);

        return ans;
    }

    public void backtrack(int[] nums, int index) {

        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            ans.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            // Don't use the same value twice at this level
            if (set.contains(nums[i])) {
                continue;
            }

            set.add(nums[i]);

            // swap
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            // recursion
            backtrack(nums, index + 1);

            // undo swap
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }
}