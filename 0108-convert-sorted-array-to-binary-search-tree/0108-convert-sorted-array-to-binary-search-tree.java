class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // Middle element becomes root
        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        // Elements before mid → left subtree
        root.left = build(nums, left, mid - 1);

        // Elements after mid → right subtree
        root.right = build(nums, mid + 1, right);

        return root;
    }
}