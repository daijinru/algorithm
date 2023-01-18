package dynamicPrograming;

import java.util.Arrays;
import java.util.Vector;

public class PackComplete {
    Vector<Integer> weight = new Vector<>();
    Vector<Integer> value = new Vector<>();
    Integer packWeight;
    Vector<Vector<Integer>> dp = new Vector<>();

    public PackComplete(Integer[] weight, Integer[] value, Integer packWeight) {
        this.weight.addAll(Arrays.asList(weight));
        this.value.addAll(Arrays.asList(value));
        this.packWeight = packWeight;

        this.dp = new Vector<>(this.weight.size());
        for (int i = 0; i <= this.weight.size() - 1; i++) {
            this.dp.add(new Vector<>(this.packWeight + 1));
            for (int j = 0; j <= this.packWeight; j++) {
                if (i == 0) {
                    if (j < this.weight.get(0)) {
                        this.dp.get(0).add(j, 0);
                    } else {
                        this.dp.get(0).add(j, this.value.get(0) * (int)Math.floor(j / this.weight.get(0)));
                    }
                } else {
                    this.dp.get(i).add(j, 0);
                }
            }
        }
    }

    public Integer run() {
        for (int i = 1; i < weight.size(); i ++) {
            for (int j = 1; j <= packWeight; j ++) {
                if (j < weight.get(i)) {
                    this.dp.get(i).set(j, this.dp.get(i - 1).get(j));
                } else {
                    this.dp.get(i).set(
                            j,
                            Math.max(
                                this.dp.get(i - 1).get(j),
                                this.dp.get(i).get(j - weight.get(i)) + value.get(i)
                            )
                    );
                }
            }
        }
        return this.dp.get(weight.size() - 1).get(packWeight);
    }
}
