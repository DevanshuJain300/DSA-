class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, target, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] candidates, int target,
                           int index, List<Integer> subList) {

        // Target reached
        if (target == 0) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        // Target exceeded
        if (target < 0) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // pick
            subList.add(candidates[i]);

            // recursion
            backtrack(candidates, target - candidates[i],
                      i, subList);

            // remove last
            subList.remove(subList.size() - 1);
        }
    }
}