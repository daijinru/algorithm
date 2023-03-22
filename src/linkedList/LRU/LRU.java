package linkedList.LRU;

import java.util.HashMap;

public class LRU {
    public HashMap<Integer, Node<Integer>> map;
    public DoubleList cache;
    public int capacity;
    public LRU(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.cache = new DoubleList();
    }

    public Integer get(Integer key) {
        if (!this.map.containsKey(key)) return -1;
        Integer out = this.map.get(key).value;
        this.put(key, out);
        return out;
    }

    public void put(Integer key, Integer value) {
        Node<Integer> node = new Node<>(key, value);

        if (this.map.containsKey(key)) {
            this.cache.remove(this.map.get(key));
        }

        if (this.capacity <= this.cache.size) {
            Node<Integer> last = cache.removeLast();
            this.map.remove(last.key);
        }

        cache.addFirst(node);
        map.put(key, node);
    }
}
