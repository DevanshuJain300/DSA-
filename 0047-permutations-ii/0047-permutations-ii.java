class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] nums, boolean[] used,
                           List<Integer> subList) {

        if (subList.size() == nums.length) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (used[i]) {
                continue;
            }

            // Skip duplicate at the same level
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }

            // pick
            subList.add(nums[i]);
            used[i] = true;

            backtrack(nums, used, subList);

            // remove last
            subList.remove(subList.size() - 1);
            used[i] = false;
        }
    }
}