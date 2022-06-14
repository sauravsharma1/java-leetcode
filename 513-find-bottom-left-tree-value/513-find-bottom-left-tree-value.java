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
    public int findBottomLeftValue(TreeNode root) {
        Map<Integer,TreeNode> map=new HashMap<Integer,TreeNode>();
        
        helper(root,map,0);
        
        Set<Integer> set=map.keySet();
        
        int max=Collections.max(set);
        
        return map.get(max).val;
        
    }
    
    public void helper(TreeNode root,Map<Integer,TreeNode> map,int level){
        
        if(map.get(level)==null){
            map.put(level,root);
        }
        
        if(root.left!=null){
            helper(root.left,map,level+1);
        }
        
        if(root.right!=null){
            helper(root.right,map,level+1);
        }
        
    }
    
}