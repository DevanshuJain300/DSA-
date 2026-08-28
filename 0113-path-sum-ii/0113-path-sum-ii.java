/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> sublist=new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        backtrack(root,targetSum,0,sublist);
        return ans;
    }
    public void backtrack(TreeNode root, int targetSum, int sum, List<Integer>sublist){
        if(root==null){
            return;
        }

        sublist.add(root.val);
        sum=sum+root.val;

        if(root.left==null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(sublist));
            }
            sublist.remove(sublist.size()-1);
            return;
        }
        backtrack(root.left, targetSum, sum, sublist);
        backtrack(root.right, targetSum, sum, sublist);

        sublist.remove(sublist.size()-1);
    }
}