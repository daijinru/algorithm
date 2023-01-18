package dynamicPrograming;

import java.util.*;

public class Pack01 {
    public Vector<Integer> weight = new Vector<>();
    public Vector<Integer> value = new Vector<>();
    public Vector<Vector<Integer>> dp;
    public Integer packWeight;

    public Pack01(Integer[] weight, Integer[] value, Integer packWeight) {
        this.weight.addAll(Arrays.asList(weight));
        this.value.addAll(Arrays.asList(value));

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

        return this.dp.get(weight.size() - 1).get(packWeight);
    }
}
