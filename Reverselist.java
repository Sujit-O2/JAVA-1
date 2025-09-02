import java.util.ArrayList;

public class Reverselist {
    
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ll=head;
        ArrayList<Integer> l2=new ArrayList<>();
        while(ll!=null){
            l2.add(ll.val);
            ll=ll.next;

        }
        ll=head;
        for (int i = l2.size() - 1; i >= 0; i--) {
            ll.val = l2.get(i);
            ll = ll.next;
        }
        return head;
    }
}