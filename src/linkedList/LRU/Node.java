package linkedList.LRU;

public class Node<T> {
    T value;
    T key;

    Node<T> next;
    Node<T> prev;

    public Node(T k, T v) {
        this.key = k;
        this.value = v;
    }

    public Node(T v) {
        this.value = v;
    }
}
