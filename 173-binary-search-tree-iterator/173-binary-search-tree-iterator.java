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
class BSTIterator {
    
    Stack<TreeNode> st=null;
    
    TreeNode current=null;

    public BSTIterator(TreeNode root) {
        current=root;
        st=new Stack<>();
    }
    
    public int next() {
        while(current!=null){
            st.push(current);
            current=current.left;
        }
        TreeNode t=st.pop();
        current=t.right;
        return t.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty()||current!=null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */