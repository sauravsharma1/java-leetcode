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

    public int pathSum(TreeNode root, int targetSum) {
        
        if(root==null){
            return 0;
        }
        
        return check(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
       
    }
    
    private int check(TreeNode root,int sum){
        
        if(root==null){
            return 0;
        }
        
        return (root.val==sum?1:0)+check(root.left,sum-root.val)+check(root.right,sum-root.val);
        
    }
    
}