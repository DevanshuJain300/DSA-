class Solution {

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode p,
                                         TreeNode q) {

        check(root, p, q);

        return ans;
    }

    public int check(TreeNode node, TreeNode p, TreeNode q) {

        if (node == null) {
            return 0;
        }

        int left = check(node.left, p, q);
        int right = check(node.right, p, q);

        int self = 0;

        if (node == p || node == q) {
            self = 1;
        }

        int total = left + right + self;

        if (total == 2 && ans == null) {
            ans = node;
        }

        return total;
    }
}