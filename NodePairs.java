public class NodePairs {

    
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; } 
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ll=head;
        if(head==null)return null;
        int flag=0;
        while(ll.next!=null){
            if(flag==0){
            int temp=ll.val;
            ll.val=ll.next.val;
            ll.next.val=temp;
            flag=1;
            }
            else{
            flag=0;
            }
            ll=ll.next;
        }
        return head;
        
    }
}