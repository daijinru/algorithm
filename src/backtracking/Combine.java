package backtracking;

import java.util.LinkedList;

/**
 * Find all combinations of k numbers from 1 to n.
 */
public class Combine extends Backtracking<Integer, LinkedList<Integer>, LinkedList<LinkedList<Integer>>> {
    private Integer n;
    private Integer k;
    public Combine(Integer n, Integer k) {
        this.n = n;
        this.k = k;
    }

    public LinkedList<LinkedList<Integer>> run() {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        this.helper(this.n, this.k, 1, new LinkedList<>(), result);
        return result;
    }

    @Override
    public Choice<Integer, LinkedList<Integer>, LinkedList<LinkedList<Integer>>> choice(Object... args) {
        return (Integer n, int i, LinkedList<Integer> subsets, LinkedList<LinkedList<Integer>> result) -> {
            if (i <= n) {
                this.helper(n, (Integer) args[0], i + 1, subsets, result);

                subsets.add(i);
                this.helper(n, (Integer) args[0], i + 1, subsets, result);

                subsets.removeLast();
            }
        };
    }

    public void helper(Integer n, Integer k, int i, LinkedList<Integer> subsets, LinkedList<LinkedList<Integer>> result) {
        if (subsets.size() == k) {
            result.add(new LinkedList<>(subsets));
        } else {
            this.choice(k).execute(n, i, subsets, result);
        }
    }
}
