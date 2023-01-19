package dynamicPrograming;

import java.util.Arrays;
import java.util.Vector;

public class PackMultiple {
    public Vector<Integer> weight = new Vector<>();
    public Vector<Integer> value = new Vector<>();
    public Vector<Vector<Integer>> dp;
    public Integer packWeight;

    public PackMultiple(Integer[] weight, Integer[] value, Integer[] numbers, Integer packWeight) {

        for (int i = 0; i < numbers.length - 1; i++) {
            while (numbers[i] >= 0) {
                this.weight.add(weight[i]);
                this.value.add(value[i]);
                numbers[i] --;
            }
        }

        this.packWeight = packWeight;

        this.dp = new Vector<>(this.weight.size());
        for (int i = 0; i <= this.weight.size() - 1; i++) {
            this.dp.add(new Vector<>(this.packWeight + 1));
            for (int j = 0; j <= this.packWeight; j++) {
                this.dp.get(i).add(j, 0);
            }
        }

    }

    public Integer run() {
        for (int j = 1; j <= this.packWeight; j++) {
            this.dp.get(0).set(j, this.value.get(0));
        }

        for (int i = 1; i < weight.size(); i ++) {
            for (int j = 1; j <= packWeight; j ++) {
                if (j < weight.get(i)) {
                    this.dp.get(i).set(j, this.dp.get(i - 1).get(j));
                } else {
                    this.dp.get(i).set(
                            j,
                            Math.max(
                                    this.dp.get(i - 1).get(j),
                                    this.dp.get(i - 1).get(j - weight.get(i)) + value.get(i)
                            )
                    );
                }
            }
        }
        return this.dp.get(weight.size() - 1).get(packWeight);
    }
}
