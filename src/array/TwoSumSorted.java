package array;

public class TwoSumSorted extends Array<int[]>{
    int target;
    public TwoSumSorted() {
        super();
    }

    public int[] runSorted(int[] sorted, int target) {
        int i = 0;
        int j = sorted.length - 1;
        while (i < j && sorted[i] + sorted[j] != target) {
            if (sorted[i] + sorted[j] > target) {
                j --;
            } else {
                i ++;
            }
        }
        return new int[]{i, j};
    }


}
