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

    /**
     * Let the 1st node walk the loop count.
     * And then start walking 2nd ptr, it is the entry node while they meet.
     */
    public ListNode getEntryNode(ListNode head, int loopCount) {
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

    /**
     * Method getNodeInLoop: The faster ptr must be 2 times than the slow.
     * Assuming that the fast ptr just goes meet the slow in a round loop,
     * it is indicating that the k steps walking by the slow ptr are the number of the loop.
     * So the node in the loop must have walked k steps (multiples of loop),
     * Assuming:
     * A1,A2,...L1...L7, Loop count is 7,
     * inLoop walking 14 now at the node L2 (node 14)
     * After head walking 5, meeting inLoop at the L7.
     */
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // make loop headB
        ListNode nodeB = headB.next;
        while (headB.next != null) {
            nodeB = nodeB.next;
        }
        nodeB.next = headB;

        ListNode inLoop = getNodeInLoop(headB);
        while (headA != inLoop) {
            inLoop = inLoop.next;
            headA = headA.next;
        }
        return headA;
    }

    public ListNode getIntersectionNode(ListNode[] heads) {
        ListNode headA = heads[0];
        ListNode headB = heads[1];

        int headACount = countListNode(headA);
        int headBCount = countListNode(headB);
        int delta = Math.abs(headACount - headBCount);
        ListNode longer = headACount > headBCount ? headA : headB;
        ListNode shorter = headACount > headBCount ? headB : headA;

        for (int i = 0; i < delta; i++)
            longer = longer.next;

        while (longer != shorter) {
            longer = longer.next;
            shorter = shorter.next;
        }
        return longer;

    }

    private int countListNode(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
}
