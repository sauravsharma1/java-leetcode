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
    
    private int max=0;
    
    HashMap<TreeNode,Integer> map=new HashMap<>();
    
    public int rob(TreeNode root) {
        helper(root);
        return max;
    }
    
    private int helper(TreeNode root){
        
        if(root==null){
            return 0;
        }
        
        if(map.containsKey(root)){
            return map.get(root);
        }
        
        int notake=helper(root.left)+helper(root.right);
        
        int left=root.left==null?0: helper(root.left.left)+helper(root.left.right);
        int right=root.right==null?0: helper(root.right.left)+helper(root.right.right);
        
        int take=root.val+left+right;
        
        max=Math.max(take,notake);
        
        map.put(root,max);
        
        return max;
        
    }
    
}