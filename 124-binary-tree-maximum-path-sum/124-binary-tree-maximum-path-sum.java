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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    
    private int helper(TreeNode root){
        //base
        if(root == null) return 0;
        
        //logic
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        
        
        maxSum = Math.max(maxSum, root.val+left+right);
        
        return Math.max(left, right) + root.val;
    }
}