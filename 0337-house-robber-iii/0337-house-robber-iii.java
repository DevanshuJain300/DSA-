class Solution {

    HashMap<TreeNode, Integer> dp = new HashMap<>();

    public int rob(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (dp.containsKey(root)) {
            return dp.get(root);
        }

        // Rob current node
        int take = root.val;

        if (root.left != null) {
            take += rob(root.left.left);
            take += rob(root.left.right);
        }

        if (root.right != null) {
            take += rob(root.right.left);
            take += rob(root.right.right);
        }

        // Skip current node
        int skip = rob(root.left) + rob(root.right);

        int ans = Math.max(take, skip);

        dp.put(root, ans);

        return ans;
    }
}