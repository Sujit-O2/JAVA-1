public class BBa {
    
}
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l1=head;
        for(int i=1;i<left;i++){
            l1=l1.next;
        }
        int []a=new int[right-left+1];
        int alen=0;
        ListNode l2=l1;
        for(int i=left-1;i<right;i++){
            
            a[alen]=l1.val;
            l1=l1.next;
            alen++;

        }
        

while(alen>0){
            
            l2.val=a[--alen];
            l2=l2.next;
            
        }
        return head;
        
    }
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 