/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode first=head;
        
        while(k>0){
            first=first.next;
            k--;
        }
        
        ListNode ahead=first;
        
        ListNode slow=head;
        
        while(ahead.next!=null){
            slow=slow.next;
            ahead=ahead.next;
        }
        
        int temp=first.val;
        first.val=slow.val;
        slow.val=temp;
        
        return head;
        
    }
}