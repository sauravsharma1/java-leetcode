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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List res=new ArrayList<>();
        
        if(root==null){
            return res;
        }
        
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode head=queue.poll();
                
                level.add(head.val);
                
                if(head.left!=null){
                    queue.offer(head.left);
                }
                
                if(head.right!=null){
                    queue.offer(head.right);
                }
                
                
                
            }
            
            res.add(0,level);
            
        }
        return res;
    }
}