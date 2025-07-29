class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode l=new ListNode(0);
      ListNode l2=l;

     while (list1!=null||list2!=null){
      if(list1!=null && list2!=null){
        if(list1.val<list2.val){
          l2.next=new ListNode(list1.val);
          l2=l2.next;
          list1=list1.next;
        }
        else{
          l2.next=new ListNode(list2.val);
          l2=l2.next;
          list2=list2.next;
        }

      }
      else if(list1!=null){
        l2.next=new ListNode(list1.val);
        l2=l2.next;
          list1=list1.next;


      }
      else if(list2!=null){
          l2.next=new ListNode(list2.val);
          l2=l2.next;
          list2=list2.next;

      }

     }

        return l.next;
    }
}

public class InnerListNode {
  public static void main(String[] args) {
    ListNode l1= null;
    ListNode l2=new ListNode();
    Solution ss=new Solution();
   ListNode l3= ss.mergeTwoLists(l1,l2);
   while(l3!=null){
    System.out.println(l3.val);
    l3=l3.next;
   }
  }
 public ListNode deleteDuplicates(ListNode head) {
      ListNode l1=new ListNode(-101);
      ListNode l2=l1;
      while(head!=null){
          if(head.val!=l2.val){
          l2.next=new ListNode(head.val);
          l2=l2.next;

        }
        head=head.next;
        }
      return l1.next;

 }
  
}
  
  class ListNode {
      int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 