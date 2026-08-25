class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {

        // Key not found
        if (root == null) {
            return null;
        }

        // Search in left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // Search in right subtree
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // Found the node
        else {

            // Case 1: No left child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: No right child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Both children exist
            TreeNode temp = root.right;

            while (temp.left != null) {
                temp = temp.left;
            }

            // Replace current value with successor
            root.val = temp.val;

            // Delete successor
            root.right = deleteNode(root.right, temp.val);
        }

        return root;
    }
}