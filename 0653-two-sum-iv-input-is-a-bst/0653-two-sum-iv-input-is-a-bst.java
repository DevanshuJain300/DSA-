class Solution {

    public boolean findTarget(TreeNode root, int k) {

        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();

        TreeNode left = root;
        TreeNode right = root;

        while (true) {

            // Smallest element
            while (left != null) {
                leftStack.push(left);
                left = left.left;
            }

            // Largest element
            while (right != null) {
                rightStack.push(right);
                right = right.right;
            }

            if (leftStack.isEmpty() || rightStack.isEmpty()) {
                return false;
            }

            TreeNode l = leftStack.peek();
            TreeNode r = rightStack.peek();

            if (l == r) {
                return false;
            }

            int sum = l.val + r.val;

            if (sum == k) {
                return true;
            }

            if (sum < k) {

                // Move left pointer forward
                TreeNode node = leftStack.pop();

                if (node.right != null) {
                    left = node.right;
                }

            } else {

                // Move right pointer backward
                TreeNode node = rightStack.pop();

                if (node.left != null) {
                    right = node.left;
                }
            }
        }
    }
}