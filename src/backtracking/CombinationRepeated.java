package backtracking;

import java.util.LinkedList;

/**
 * Allow repeated selection of elements,
 * and find out all combinations its sum of elements which equal to the specified number.
 */
public class CombinationRepeated extends Backtracking<int[], LinkedList<Integer>, LinkedList<LinkedList<Integer>>> {
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

    @Override
    public Choice<int[], LinkedList<Integer>, LinkedList<LinkedList<Integer>>> choice(Object... args) {
        return (input, i, subsets, result) -> {
            this.helper(input, i + 1, (int)args[0], subsets, result);
            subsets.add(input[i]);
            this.helper(input, i, (int)args[0] - input[i], subsets, result);
            subsets.removeLast();
        };
    }

    public void helper(int[] input, int i, int target,
                       LinkedList<Integer> subsets,
                       LinkedList<LinkedList<Integer>> result
    ) {
        if (target == 0) {
            // do not add subset directly, it is just a reference
            result.add(new LinkedList<>(subsets));
        } else if (target > 0 && i < input.length) {
            this.choice(target).execute(input, i, subsets, result);
        }
    }
}
