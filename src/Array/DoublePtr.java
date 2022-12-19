package Array;

import java.util.List;

public class DoublePtr extends Array<List<Integer>> {
    public DoublePtr(List<Integer> value) {
        super(value);
    }

    /**
     * Sum of two number for array sorted.
     * Case:
     * numbers = [1, 2, 3, 4], t = 4
     * i = 1, j = 4, sum = 5 > t
     * j - 1
     * i = 1, j = 3, sum = 4 == t
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

    /**
     * Binary search insert for array sorted,
     * Some cases:
     * 1. mid >= target and [mid - 1] < target, return mid.
     * 2. mid == 0, return 0, because target is less than all.
     * 3. return array length because target is larger than all.
     */
    public int binarySearchInsert(Integer target) {
        int left = 0;
        int right = value.size() - 1;
        while (left <= right) {
            Integer mid = (left + right) / 2;
            if (value.get(mid) >= target) {
                if (mid == 0 || value.get(mid - 1) < target) {
                    return mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return value.size();
    }
}
