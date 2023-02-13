package backtracking;

import java.util.LinkedList;

public class Combine {
    private int n;
    private int k;
    public Combine(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public LinkedList<LinkedList<Integer>> run() {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        this.helper(this.n, this.k, 1, new LinkedList<>(), result);
        return result;
    }

    /**
     * Find all combinations of k numbers from 1 to n.
     * @param n the last one
     * @param k numbers limit
     * @param i the Array ptr
     * @param subsets
     * @param result
     */
    public void helper(int n, int k, int i, LinkedList<Integer> subsets, LinkedList<LinkedList<Integer>> result) {
        if (subsets.size() == k) {
            result.add(new LinkedList<>(subsets));
        } else {
            if (i <= n) {
                helper(n, k, i + 1, subsets, result);

                subsets.add(i);
                helper(n, k, i + 1, subsets, result);

                subsets.removeLast();
            }
        }
    }
}
