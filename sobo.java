public class sobo {
    public static void main(String[] args) {
        ListNode l1=new ListNode();
        l1.val=1;
        l1.next=new ListNode();
        l1.next.val=3;
         ListNode l2=new ListNode();
         l2.val=9;
         l2.next=new ListNode();
         l2.next.val=4;

         ListNode l3= new sobo().addTwoNumbers(l1,l2);
         while (l3!=null) {
            System.out.println(l3.val);
            l3=l3.next;
            
         }


    }

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ll=new ListNode(0);
            ListNode curr=ll;
            int carry=0;
            while(l1!=null||l2!=null||carry!=0){
                int a=l1!=null?l1.val:0;
                int b=l2!=null?l2.val:0;
                int c=a+b+carry;
                carry=c/10;
                curr.next=new ListNode(c%10);
                curr=curr.next;
                if(l1!=null)l1=l1.next;
                if(l2!=null)l2=l2.next;


            }
            return ll.next;
            
        
    }
}
 class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }