package backtracking;

import java.util.LinkedList;

/**
 * Allow repeated selection of elements,
 * and find out all combinations its sum of elements which equal to the specified number.
 */
public class CombinationRepeated extends Backtracking<LinkedList<LinkedList<Integer>>> {
    private int[] input;
    private int target;

    public CombinationRepeated(int[] input, int target) {
        this.input = input;
        this.target = target;
    }

    @Override
    public LinkedList<LinkedList<Integer>> run() {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        this.helper(this.input, 0, this.target, new LinkedList<>(), result);
        return result;
    }

    public void helper(int[] input, int i, int target,
                       LinkedList<Integer> subsets,
                       LinkedList<LinkedList<Integer>> result
    ) {
        if (target == 0) {
            // do not add subset directly, it is just a reference
            result.add(new LinkedList<>(subsets));
        } else if (target > 0 && i < input.length) {
            helper(input, i + 1, target, subsets, result);

            subsets.add(input[i]);
            helper(input, i, target - input[i], subsets, result);

            subsets.removeLast();
        }
    }
}
