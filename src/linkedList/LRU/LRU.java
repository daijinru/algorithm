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

    /**
     * Update the poi of the owning node in the cache before returning.
     */
    public Integer get(Integer key) {
        if (!this.map.containsKey(key)) return -1;
        Integer out = this.map.get(key).value;
        this.put(key, out);
        return out;
    }

    /**
     * For updating the cache.
     * 1st to remove the used node from the cache (double list),
     * then add the new node to the head of the cache,
     * and update the node in the hashmap.
     */
    public void put(Integer key, Integer value) {

        if (this.map.containsKey(key)) {
            this.cache.remove(this.map.get(key));
        }

        if (this.capacity <= this.cache.size) {
            Node<Integer> last = cache.removeLast();
            this.map.remove(last.key);
        }

        Node<Integer> node = new Node<>(key, value);
        this.cache.addFirst(node);
        this.map.put(key, node);
    }
}
