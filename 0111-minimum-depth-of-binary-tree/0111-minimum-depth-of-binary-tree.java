class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int depth = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            while (size != 0) {

                TreeNode node = q.poll();

                // First leaf = minimum depth
                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    q.offer(node.left);
                }

                if (node.right != null) {
                    q.offer(node.right);
                }

                size--;
            }

            depth++;
        }

        return depth;
    }
}