package Array;

import java.util.List;

public class DoublePtr extends Array<List> {
    public DoublePtr(List value) {
        super(value);
    }

    /**
     * Sum of two number for sorted array.
     */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j && numbers[i] + numbers[j] != target) {
            if (numbers[i] + numbers[j] > target) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[]{i, j};
    }

}
