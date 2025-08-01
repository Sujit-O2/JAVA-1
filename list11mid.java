public class list11mid {
    
}


    class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode ll=dummy;
        ListNode l2=dummy;
        for(int i=0;i<=n;i++){
            ll=ll.next;
        }
        while (ll!=null) {
            ll=ll.next;
            l2=l2.next;
            
        }
        l2.next=l2.next.next;
        
        return dummy.next;
        
    }
}