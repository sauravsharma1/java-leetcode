/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
    		return head;
    	HashMap<Node, Node> map = new HashMap<Node, Node>();
    	Node curr = head;
    	while(curr!=null){
    		map.put(curr, new Node(curr.val));
    		curr = curr.next;
    	}
        curr = head;
    	while(curr!=null){
            Node one = map.get(curr);
    		one.next = map.get(curr.next);
    		one.random = map.get(curr.random);
            map.put(curr, one);
    		curr = curr.next;
    	}
    	return map.get(head);
    }
}