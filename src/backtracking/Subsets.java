package backtracking;

import java.util.LinkedList;
import java.util.List;

public class Subsets extends Backtracking<int[], LinkedList<Integer>, LinkedList<LinkedList<Integer>>>{
    public int[] input;
    public Subsets (int[] input) {
        this.input = input;
    }

    public Subsets () {}

    public LinkedList<LinkedList<Integer>> run() {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        if (this.input.length == 0) return result;
        helper(this.input, 0, new LinkedList<>(), result);
        return result;
    }

    @Override
    public Choice<int[], LinkedList<Integer>, LinkedList<LinkedList<Integer>>> choice(Object... args) {
        return (int[] input, int i, LinkedList<Integer> subsets, LinkedList<LinkedList<Integer>> result) -> {
            this.helper(input, i + 1, subsets, result);

            subsets.add(input[i]);
            this.helper(input, i + 1, subsets, result);

            subsets.removeLast();
        };
    }


    /**
     * help recursive
     * @param input input array
     * @param index index of input array
     * @param subset subset, which empty first
     * @param result return result
     */
    public void helper (int[] input, Integer index, LinkedList<Integer> subset, LinkedList<LinkedList<Integer>> result) {
        if (index >= input.length) {
            result.add(new LinkedList<>(subset));
        } else {
            this.choice().execute(input, index, subset, result);
        }

    }
}
