package linkedList;

public class AddTwoNumbers extends ListNode {
    ListNode L1;
    ListNode L2;
    public AddTwoNumbers(ListNode L1, ListNode L2) {
        super();
        this.L1 = L1;
        this.L2 = L2;
    }

    public ListNode run() {
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        int carrry = 0;
        while (L1 != null || L2 != null) {
            int x = L1 == null ? 0 : L1.value;
            int y = L2 == null ? 0 : L2.value;
            int sum = x + y + carrry;

            carrry = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);

            curr = curr.next;
            if (L1 != null) {
                L1 = L1.next;
                L2 = L2.next;
            }
        }
        if (carrry == 1) {
            curr.next = new ListNode(carrry);
        }
        return pre.next;
    }
}