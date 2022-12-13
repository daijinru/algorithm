package linkedList;

public class DoublePtr extends ListNode{
    public DoublePtr(int value) {
        super(value);
    }

    /**
     * Remove nth k form end.
     * Let one ptr take k steps first, then the second ptr starts from the head,
     * and both run at the same speed.
     */
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode dummy = dummy(head);
        ListNode front = head;
        ListNode back = dummy;
        for (int i = 0; i < k; i++) {
            front = front.next;
        }

        while (front != null) {
            front = front.next;
            back = back.next;
        }

        back.next = back.next.next;
        return dummy.next;
    }

    /**
     * Find the entry for the cycle of ListNode.
     */

}
