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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        path(res,targetSum,root,new ArrayList<>());
        
        return res;
        
    }
    
    private void path(List<List<Integer>> res,int sum,TreeNode root,List<Integer> ans){
        
        if(root==null){
            return;
        }
        
        ans.add(root.val);
        
        if(root.left==null&&root.right==null&&sum==root.val){
            res.add(new ArrayList<>(ans));
        }
        
        else{
            path(res,sum-root.val,root.left,ans);
            path(res,sum-root.val,root.right,ans);
        }
        
        ans.remove(ans.size()-1);
        
    }
    
}