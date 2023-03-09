package sort;

import java.util.Arrays;

public class MergeSort extends Sort<Integer> {
    public MergeSort(Integer[] in) {
        super(in);
    }

    @Override
    Integer[] run() {
        Integer[] dst;
        dst = Arrays.copyOf(this.numbers, this.numbers.length);
        mergeSort(this.numbers, dst, 0, this.numbers.length);
        return dst;
    }

    public void mergeSort(Integer[] src, Integer[] dst, int start, int end) {
        if (start + 1 >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(dst, src, start, mid);
        mergeSort(dst, src, mid, end);

        int i = start, j = mid, k = start;
        while (i < mid || j < end) {
            if (j == end || (i < mid && src[i] < src[j])) {
                dst[k++] = src[i++];
            } else {
                dst[k++] = src[j++];
            }
        }
    }
}
