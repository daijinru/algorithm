package Array;

import java.util.List;

public class Sort extends Array<int[]> {
    public Sort(int[] value) {
        super(value);
    }

    /**
     *
     */
    public int[] bubbleSort() {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length - 1 - i; j++) {
                if (value[j] > value[j + 1]) {
                    int tmp = value[j];
                    value[j] = value[j + 1];
                    value[j + 1] = tmp;
                }
            }
        }
        return value;
    }

    /**
     *
     */
    public int[] quickSort(int left, int right) {

        return null;
    }
}
