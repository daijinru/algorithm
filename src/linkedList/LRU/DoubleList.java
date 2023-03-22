package linkedList.LRU;

public class DoubleList {

    private final Node<Integer> dummy;
    public Node<Integer> head;
    public int size;
    public Integer key;

    public DoubleList() {
       this.dummy = new Node<>(-1);
       this.size = 0;
    }

    public DoubleList(Integer key, Integer headValue) {
        this.dummy = new Node<>(-1);
        this.head = new Node<>(key, headValue);
        this.dummy.next = this.head;
        this.head.prev = this.dummy;
        this.size = 1;
    }

    public void addFirst(Node<Integer> node) {
        if (this.head == null) {
            this.head = node;
            this.head.prev = this.dummy;
            this.dummy.next = this.dummy;
            this.size ++;
            return;
        }

        Node<Integer> temp = this.head;
        temp.prev = this.head;
        this.head = node;
        this.head.next = temp;
        this.head.prev = this.dummy;
        this.dummy.next = this.head;
        this.size ++;
    }

    public void remove(Node<Integer> node) {
        Node<Integer> prev = node.prev, next = node.next;
        prev.next = next;
        next.prev = prev;
        this.size --;
    }

    public Node<Integer> removeLast() {
        Node<Integer> temp = this.dummy;
        if (temp.next == null) return temp;

        while (temp.next != null) {
            temp = temp.next;
        }
        Node<Integer> prev = temp.prev;
        prev.next = null;
        this.size --;
        return temp;
    }

    public void append(Node<Integer> node) {
        Node<Integer> temp = this.dummy;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        this.size ++;
    }
}
