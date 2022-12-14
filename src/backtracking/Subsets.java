package backtracking;

import java.util.LinkedList;
import java.util.List;

public class Subsets {
    public Integer[] numbers;
    public Subsets (Integer[] numbers) {
        this.numbers = numbers;
    }

    public Subsets () {}

    public List<List<Integer>> run() {
        List<List<Integer>> result = new LinkedList<>();
        if (this.numbers.length == 0) return result;
        helper(this.numbers, 0, new LinkedList<>(), result);
        return result;
    }

    public List<List<Integer>> run (Integer[] numbers) {
        List<List<Integer>> result = new LinkedList<>();
        if (numbers.length == 0) return result;
        helper(numbers, 0, new LinkedList<>(), result);
        return result;
    }

    public void helper (Integer[] numbers, Integer index, LinkedList<Integer> subset, List<List<Integer>> result) {
        if (index == numbers.length) {
            result.add(new LinkedList<>(subset));
        } else if (index < numbers.length) {
            helper(numbers, index + 1, subset, result);

            subset.add(numbers[index]);
            helper(numbers, index + 1, subset, result);
            subset.removeLast();
        }

    }
}
