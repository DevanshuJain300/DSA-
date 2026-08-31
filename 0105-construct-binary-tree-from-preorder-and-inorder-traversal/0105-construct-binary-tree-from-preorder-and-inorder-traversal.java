class Solution {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int[] inorder,
                          int left, int right) {

        // No elements in this subtree
        if (left > right) {
            return null;
        }

        // First element of preorder is the root
        TreeNode root = new TreeNode(preorder[preIndex]);

        preIndex++;

        // Find root in inorder
        int index = left;

        while (inorder[index] != root.val) {
            index++;
        }

        // Build left subtree
        root.left = build(preorder, inorder,
                          left, index - 1);

        // Build right subtree
        root.right = build(preorder, inorder,
                           index + 1, right);

        return root;
    }
}