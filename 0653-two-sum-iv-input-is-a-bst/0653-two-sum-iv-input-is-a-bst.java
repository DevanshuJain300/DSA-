class Solution {

    ArrayList<Integer> arr = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {

        inorder(root);

        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {

            int sum = arr.get(left) + arr.get(right);

            if (sum == k) {
                return true;
            }

            if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        arr.add(root.val);

        inorder(root.right);
    }
}