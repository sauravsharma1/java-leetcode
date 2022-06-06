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
    int total;
    public int sumNumbers(TreeNode root) {
        total=0;
        sumc(root,0);
        return total;
    }
    
    private void sumc(TreeNode root,int sumc){
        
        if(root==null){
            return;
        }
        
        sumc=sumc*10+root.val;
        
        if(root.left==null&&root.right==null){
            total+=sumc;
            return;
        }
        
        sumc(root.left,sumc);
        sumc(root.right,sumc);
        
        
    }
    
}