class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return check(root, targetSum, sum);
    }

    public boolean check(TreeNode root, int targetSum, int sum) {

        if (root == null) {
            return false;
        }

        sum = sum + root.val;

        if (root.left == null && root.right == null) {
            if( sum == targetSum){
                return true;
            }
        }

        return check(root.left, targetSum, sum) ||
               check(root.right, targetSum, sum);
    }
}