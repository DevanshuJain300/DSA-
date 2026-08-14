class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> subList=new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtrack(k, n, 1, 0, subList);

        return ans;
    }

    public void backtrack(int k, int n,
                          int index, int sum,
                          List<Integer> subList) {

        // We have selected k numbers
        if (subList.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(subList));
            }
            return;
        }

        // Sum already exceeded target
        if (sum > n) {
            return;
        }

        for (int i = index; i <= 9; i++) {

            // Pick
            subList.add(i);
            sum += i;

            // Recursion
            backtrack(k, n, i + 1, sum, subList);

            // Remove / backtrack
            subList.remove(subList.size() - 1);
            sum -= i;

        }
    }
}