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
    
    private int height(TreeNode root){
        
        if(root==null){
            return 0;
        }
        
        return Math.max(height(root.left),height(root.right))+1;
        
    }
    
    private boolean check(TreeNode root,int level){
        
        if(root==null){
            return true;
        }
        
        if(level%2==0){
            if(root.val%2==0){
                return false;
            }
            if(data[level]>=root.val){
                return false;
            }
            
            data[level]=root.val;
            
        }
        else{
            if(root.val%2==1){
                return false;
            }
            if(data[level]<=root.val){
                return false;
            }
            
            data[level]=root.val;
        }
        
        return check(root.left,level+1)&&check(root.right,level+1);
        
    }
    
    int[] data;
    
    public boolean isEvenOddTree(TreeNode root) {
        int height=height(root);
        
        data=new int[height];
        
        for(int i=1;i<data.length;i+=2){
            data[i]=Integer.MAX_VALUE;
        }
        
        return check(root,0);
        
    }
}