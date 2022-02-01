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
    
   
    int result = 0;
    public int sumNumbers(TreeNode root) {
        
        int currSum= 0;
        helper(root, 0);
        return result;  
        
    }
    
    private void helper(TreeNode root, int currSum){
        //base
        
        if(root == null) return;
       
        
        //logic
        
        currSum = currSum*10 + root.val;
        helper(root.left, currSum);
        
        if(root.left == null && root.right == null){
            result += currSum;
        }
        helper(root.right, currSum);
        
    }
    
}