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
    private int camerasc=0;
    public int minCameraCover(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        if(cameras(root)==-1){
            camerasc++;
        }
        
        return camerasc;
    }
    
    private int cameras(TreeNode root){
        
        if(root==null){
            return 1;
        }
        
        int lchild=cameras(root.left);
        int rchild=cameras(root.right);
        
        if(lchild==-1||rchild==-1){
            camerasc++;
            return 0;
        }
        
        if(lchild==0||rchild==0){
            return 1;
        }
        
        return -1;
        
    }
    
}