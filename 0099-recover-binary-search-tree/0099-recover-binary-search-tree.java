class Solution {

    TreeNode prev = null;

    TreeNode g1First = null;
    TreeNode g1Second = null;

    TreeNode g2First = null;
    TreeNode g2Second = null;

    int galat = 0;

    public void recoverTree(TreeNode root) {

        check(root);

        // Only one violation
        if (galat == 1) {

            int temp = g1First.val;
            g1First.val = g1Second.val;
            g1Second.val = temp;

        }
        // Two violations
        else {

            int temp = g1First.val;
            g1First.val = g2Second.val;
            g2Second.val = temp;
        }
    }

    public void check(TreeNode root) {

        if (root == null) {
            return;
        }

        check(root.left);

        if (prev != null) {

            if (root.val < prev.val) {

                if (galat == 0) {

                    g1First = prev;
                    g1Second = root;

                    galat++;

                } else {

                    g2First = prev;
                    g2Second = root;

                    galat++;
                }
            }
        }

        prev = root;

        check(root.right);
    }
}