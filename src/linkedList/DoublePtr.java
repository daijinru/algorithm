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
     * Find the node for the loop.
     * Starting running a fast and a slow node, and the fast node speed is 2,
     * while the fast node catches the other, it can be determined the loop.
     */
    public ListNode getNodeInLoop(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
            if (fast != null) fast = fast.next;
        }
        return null;
    }

    /**
     * Find any node in loop, start running until return to the node will get the count of the loop.
     */
    public int loopCount(ListNode head) {
        ListNode nodeInLoop = getNodeInLoop(head);
        int count = 0;
        for (ListNode n = nodeInLoop; n.next != nodeInLoop; n = n.next) {
            count++;
        }
        return count;
    }

    public ListNode getEntryNOde(ListNode head, int loopCount) {
        ListNode fast = head;
        for (int i = 0; i < loopCount; i++) {
            fast = fast.next;
        }
        ListNode slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode getEntryNode(ListNode head) {
        ListNode inLoop = getNodeInLoop(head);
        if (inLoop == null) return null;
        ListNode node = head;
        while (node != inLoop) {
            node = node.next;
            inLoop = inLoop.next;
        }
        return node;
    }

    
}
