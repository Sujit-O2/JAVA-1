import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeKSortedList {
    
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> al=new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            while(lists[i]!=null){
                al.add(lists[i].val);
                lists[i]=lists[i].next;

            }
        }
        Collections.sort(al);
        ListNode l1=new ListNode(0);
        ListNode l2=l1;
        for(int l:al){
            l2.next=new ListNode(l);
            l2=l2.next;
        }
        return l1.next;
        
    }
}