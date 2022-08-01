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
    int count = 1;
    Integer prev = null;
    int max = 0;
    
    public int[] findMode(TreeNode root) {
        List<Integer> modes = new ArrayList<>();
        
        helper(root, modes);
        int [] result = new int[modes.size()];
        for(int i =0; i < modes.size(); i++){
            result[i] = modes.get(i);
        }
        
        return result;
    }
    
    private void helper(TreeNode node, List<Integer> modes){
        //base
        if(node == null) return;
        
        //logic
        
        helper(node.left, modes);
        
        if(prev != null){
            if(prev == node.val){
                count++;
            }else{
                count = 1;
            }
        }
        
        if(count > max){
            max = count;
            modes.clear();
            modes.add(node.val);
        }else if(count == max){
            modes.add(node.val);
        }
        
        prev = node.val;
        
        helper(node.right, modes);
        
        
        
    }
}