package backtracking;

import java.util.*;

public class TopKFrequent {

    Map<Integer, Integer> numToCount;
    Integer k;
    /**
     * It is a queue with size of k.
     * Remove the value when value A from hash table lager than the value at the head of the queue.
     * And add value A into queue. So it holds the largest value in size of k from hash table.
     */
    public Queue<Map.Entry<Integer, Integer>> minHeap;

    public TopKFrequent (Integer[] numbers, Integer k) {
        this.k = k;
        numToCount = new HashMap<>();
        for (Integer num : numbers) {
            // numToCounts statistics occur frequently <num, frequent>
            numToCount.put(num, numToCount.getOrDefault(num, 0) + 1);
        }
    }

    public List<Integer> run() {
        minHeap = mapToMinHeap(numToCount);
        List<Integer> result = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : minHeap) {
            result.add(entry.getKey());
        }
        return result;
    }

    public Queue<Map.Entry<Integer, Integer>>mapToMinHeap(Map<Integer, Integer> map) {
        Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                // Compare the rules in hash table that how often the number occur
                (e1, e2) -> e1.getValue() - e2.getValue()
        );
        for (Map.Entry<Integer, Integer> entry : numToCount.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else {
                if (entry.getValue() > minHeap.peek().getValue()) {
                    minHeap.poll();
                    minHeap.offer(entry);
                }
            }
        }
        return minHeap;
    }
}
