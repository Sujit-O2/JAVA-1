import java.util.HashMap;

public class removeduplucate {
    
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        HashMap<Integer, Integer> hh = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            hh.put(temp.val, hh.getOrDefault(temp.val, 0) + 1);
            temp = temp.next;
        }

        ListNode dummy = new ListNode();
        ListNode tt = dummy;

        ListNode curr = head;
        while (curr != null) {
            if (hh.get(curr.val) == 1) {
                tt.next = new ListNode(curr.val);
                tt = tt.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
