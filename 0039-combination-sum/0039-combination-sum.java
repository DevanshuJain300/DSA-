class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, target, 0, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] candidates, int target,
                          int index, int sum,
                          List<Integer> subList) {

        // target reached
        if (sum == target) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        // sum exceeded
        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // pick
            subList.add(candidates[i]);
            sum += candidates[i];

            // recursion
            backtrack(candidates, target, i, sum, subList);

            // remove
            subList.remove(subList.size() - 1);
            sum -= candidates[i];
        }
    }
}