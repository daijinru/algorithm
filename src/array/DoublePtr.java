package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class DoublePtr extends Array<List<Integer>> {
    public DoublePtr(List<Integer> value) {
        super(value);
    }

    /**
     * Sum of two number for array sorted. O(n)
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
     * O(n^2) + O(nlogn) = O(n^2)
     * Assuming: len(arr) = 5
     * while (i < len(arr) - 2): because i + (j = i + 1)
     * i = 0, j = 1, k = len(arr) - 1 = 4
     * a = nums[i], b = nums[j], c = nums[k]
     * ++j if a + b + c < 0
     * --k if a + b + c > 0
     *
     */
    public List<int[]> threeSum(int[] numbers) {
        List<int[]> res = new LinkedList<>();
        if (numbers.length >= 3) {
            Arrays.sort(numbers);
            int i = 0;
            while (i < numbers.length - 2) {
                twoSum(numbers, i, res);
                // filter the same
                int temp = numbers[i];
                while (i < numbers.length && numbers[i] == temp) {
                    ++i;
                }
            }
        }
        return res;
    }

    private void twoSum(int[] numbers, int i, List<int[]> result) {
        int j = i + 1;
        int k = numbers.length - 1;
        while (i < k) {
            if (numbers[i] + numbers[j] + numbers[k] == 0) {
                result.add(new int[]{numbers[i], numbers[j], numbers[k]});

                // filter the same
                int temp = numbers[j];
                while (numbers[j] == temp && j < k) {
                    ++j;
                }
            } else if (numbers[i] + numbers[j] + numbers[k] < 0) {
                ++j;
            } else {
                --k;
            }
        }
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
