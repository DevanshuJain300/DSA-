class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        backtrack(candidates, target, 0, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(int[] candidates, int target,
                          int index, int sum,
                          List<Integer> subList) {

        if (sum == target) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        if (sum > target) {
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate at the same level
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Pick
            subList.add(candidates[i]);
            sum += candidates[i];

            // Recursion
            backtrack(candidates, target, i + 1, sum, subList);

            // Undo
            subList.remove(subList.size() - 1);
                        sum -= candidates[i];


        }
    }
}