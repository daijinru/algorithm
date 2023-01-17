package dynamicPrograming;

import java.util.*;

public class Bag01 {
    public Vector<Integer> weight = new Vector<>();
    public Vector<Integer> value = new Vector<>();
    public Vector<Vector<Integer>> dp;
    public Integer bagWeight;

    public Bag01(Integer[] weight, Integer[] value, Integer bagWeight) {
        this.weight.addAll(Arrays.asList(weight));
        this.value.addAll(Arrays.asList(value));
        this.bagWeight = bagWeight;

        this.dp = new Vector<>(this.weight.size());
        for (int i = 0; i <= this.weight.size() - 1; i++) {
            this.dp.add(new Vector<>(this.bagWeight + 1));
            for (int j = 0; j <= this.bagWeight; j++) {
                this.dp.get(i).add(j, 0);
            }
        }
    }

    public Integer run() {
        for (int i = 0; i <= this.weight.size() - 1; i++) {
            this.dp.get(i).set(0, 0);
        }
        for (int j = 1; j <= this.bagWeight; j++) {
            this.dp.get(0).set(j, this.value.get(0));
        }


        for (int i = 1; i < weight.size(); i ++) {
            for (int j = 1; j <= bagWeight; j ++) {
                if (j < weight.get(i)) {
                    this.dp.get(i).set(j, this.dp.get(i - 1).get(j));
                } else {
                    Integer lastValuesSameWeight = this.dp.get(i - 1).get(j);
                    Integer currentValues = this.dp.get(i - 1).get(j - weight.get(i)) + value.get(i);
                    if (lastValuesSameWeight > currentValues) {
                        this.dp.get(i).set(j, lastValuesSameWeight);
                    } else {
                        this.dp.get(i).set(j, currentValues);
                    }
                }
            }
        }

        return this.dp.get(weight.size() - 1).get(bagWeight);
    }
}
