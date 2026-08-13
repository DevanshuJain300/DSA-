class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        backtrack(n, k, 1, new ArrayList<>());

        return ans;
    }

    public void backtrack(int n, int k, int index,
                           List<Integer> subList) {

        // Base case
        if (subList.size() == k) {
            ans.add(new ArrayList<>(subList));
            return;
        }

        for (int i = index; i <= n; i++) {

            // pick
            subList.add(i);

            // recursion
            backtrack(n, k, i + 1, subList);

            // remove last
            subList.remove(subList.size() - 1);
        }
    }
}