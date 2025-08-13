import java.util.ArrayList;
import java.util.List;

public class NodeCyl {
    
}
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

 class Solution {
    public boolean hasCycle(ListNode head) {
        List<ListNode>ll=new ArrayList<>();
        while(head!=null){
            ll.add(head);
            if(ll.contains(head.next)){
                return true;
            }
            head=head.next;
        }
        return false;
        
        
    }
}