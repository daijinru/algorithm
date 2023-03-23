package linkedList.LRU;

public class DoubleList {

    public Node<Integer> head;
    public int size;
    public Integer key;

    public DoubleList() {
       this.size = 0;
    }

    public void addFirst(Node<Integer> node) {
        if (this.head == null) {
            this.head = node;
            this.size ++;
            return;
        }
        Node<Integer> temp = this.head;
        this.head = node;
        this.head.next = temp;
        temp.prev = this.head;
        this.size ++;
    }

    public void remove(Node<Integer> node) {
        Node<Integer> prev = node.prev, next = node.next;
        if (prev == null && next == null) {
            this.head = null;
        } else if (prev == null) {
            this.head = next;
        } else if (next == null) {
            prev.next = null;
        }
        this.size --;
    }

    public Node<Integer> removeLast() {
        if (this.size < 1) return new Node<>(null);

        Node<Integer> temp = this.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node<Integer> prev = temp.prev;
        prev.next = null;
        this.size --;
        return temp;
    }
}
