public class btointfronlinkedlist {

    
}

   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum=0;
        int i=0;
        if(head==null)return sum;
        while(head!=null){
            sum=(int) (sum+(head.val*Math.pow(2,i)));
            head=head.next;
            i++;
        }
        return sum;
        
    }
}