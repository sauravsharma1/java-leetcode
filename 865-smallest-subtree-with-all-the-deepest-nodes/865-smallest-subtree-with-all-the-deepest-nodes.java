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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        
        if(root==null){
            return null;
        }
        
        
        
        int left=getdepth(root.left);
        int right=getdepth(root.right);
        
        if(left==right){
            return root;
        }
        
        if(left>right){
            return subtreeWithAllDeepest(root.left);
        }
        
        else{
            return subtreeWithAllDeepest(root.right);
        }
        
        
        
    }
    
    public int getdepth(TreeNode root){
        
        if(root==null){
            return 0;
        }
        
        return 1+Math.max(getdepth(root.left),getdepth(root.right));
        
    }
    
}