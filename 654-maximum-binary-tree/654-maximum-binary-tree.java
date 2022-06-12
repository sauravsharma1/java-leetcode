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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode root=construct(nums,0,nums.length-1);
        return root;
    }
    
    private static TreeNode construct(int[] arr,int s,int e){
        
        if(s>e){
            return null;
        }
        
        if(s==e){
            return new TreeNode(arr[s]);
        }
        
        int i=findmax(arr,s,e);
        
        TreeNode root=new TreeNode(arr[i]);
        
        root.left=construct(arr,s,i-1);
        root.right=construct(arr,i+1,e);
        
        return root;
        
    }
    
    
    private static int findmax(int[] arr,int s,int e){
        
        int max=Integer.MIN_VALUE;
        
        int idx=-1;
        
        for(int i=s;i<=e;i++){
            if(arr[i]>max){
                max=arr[i];
                idx=i;
            }
        }
        return idx;
    }
    
}