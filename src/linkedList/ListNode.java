package linkedList;

public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    /**
     * Head is the sentinel.
     * Dummy node which simplifies for processing the first node.
     */
    public ListNode dummy(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        return dummy;
    }

    public ListNode append(ListNode head, int value) {

        ListNode dummy = dummy(head);

        ListNode newNode = new ListNode(value);
        ListNode node = dummy;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
        return dummy.next;
    }

    public ListNode delete(ListNode head, int value) {
        ListNode dummy = dummy(head);

        /**
         * Add the following without sentinel dummy node.
         * ```example
         * if (head == null) return head;
         * if (head.value == value) return head.next;
         * ```
         */

        ListNode node = dummy;
        while (node.next != null) {
            if (node.next.value == value) {
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
        return dummy.next;
    }
}
