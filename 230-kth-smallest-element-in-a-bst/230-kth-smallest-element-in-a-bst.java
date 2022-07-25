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
    int result;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }
    
    private void inorder(TreeNode root, int k){
        //base
        if(root == null) return;
        
        
        //logic
        inorder(root.left, k);
        count++;
        
        if(count == k){
            result = root.val;
        }
        
        if(count < k){
            inorder(root.right, k);
        }
    }
}