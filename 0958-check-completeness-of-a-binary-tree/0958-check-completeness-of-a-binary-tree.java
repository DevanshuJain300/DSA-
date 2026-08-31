class Solution {
    public boolean isCompleteTree(TreeNode root) {
        return isComplete(root);
    }

    public boolean isComplete(TreeNode root) {

        if (root == null) {
            return true;
        }

        boolean nullFound = false;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            TreeNode t = q.poll();

            if (t == null) {
                nullFound = true;
            } 
            else {

                // After a null, we cannot have another node
                if (nullFound) {
                    return false;
                }

                q.offer(t.left);
                q.offer(t.right);
            }
        }

        return true;
    }
}