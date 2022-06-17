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
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstp(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    
    public TreeNode bstp(int[] preorder,int bound,int[] arr){
        
        if(arr[0]==preorder.length||preorder[arr[0]]>bound){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[arr[0]++]);
        
        root.left=bstp(preorder,root.val,arr);
        root.right=bstp(preorder,bound,arr);
        return root;
    }
    
}