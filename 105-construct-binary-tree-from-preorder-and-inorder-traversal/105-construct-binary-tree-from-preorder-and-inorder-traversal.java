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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder,int ps,int pe,int[] inorder,int is,int ie,Map<Integer,Integer> map){
        
        if(ps>pe||is>ie){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[ps]);
        
        int inr=map.get(root.val);
        int numleft=inr-is;
        
        root.left=buildTree(preorder,ps+1,ps+numleft,inorder,is,inr-1,map);
        
        root.right=buildTree(preorder,ps+numleft+1,pe,inorder,inr+1,ie,map);
        
        return root;
        
        
    }
    
}