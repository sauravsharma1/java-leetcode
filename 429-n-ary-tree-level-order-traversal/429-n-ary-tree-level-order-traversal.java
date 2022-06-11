/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> res=new ArrayList<>();
        
        if(root==null){
            return res;
        }
        
        Queue<Node> qu=new LinkedList<Node>();
        
        qu.offer(root);
        
        while(!qu.isEmpty()){
            int size=qu.size();
            ArrayList<Integer> level=new ArrayList<Integer>();
            
            while(size-->0){
                Node head=qu.poll();
                level.add(head.val);
                
                for(Node n:head.children){
                    qu.add(n);
                }
                
            }
            
            res.add(level);
            
        }
        
        return res;
        
    }
}