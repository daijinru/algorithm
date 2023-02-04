package dynamicPrograming;

import utils.ArrayUtil;

import java.util.Vector;

public class HouseRob extends DynamicPrograming<Integer> {
    public HouseRob(int[] houses) {
        super(ArrayUtil.IntsToIntegers(houses));
    }

    @Override
    void initial() {
        for (int i = 0; i < this.numbers.length; i++) {
            this.dp.add(i, 0);
        }
        this.dp.set(0, this.numbers[0]);
    }

    /**
     * Do not steal two adjacent houses.
     * The STE: dp[i] = Math.max(dp[i - 2] + houses[i], dp[i - 1])
     */
    @Override
    public Integer STE(int i) {
        return Math.max(this.dp.get(i - 1), this.dp.get(i - 2) + this.numbers[i]);
    }

    public int run() {
        if (this.numbers.length < 1) return 0;
        if (this.numbers.length > 1) {
            this.dp.set(1, Math.max(this.numbers[0], this.numbers[1]));
        }
        for (int i = 2; i < this.numbers.length; i++) {
            this.dp.set(i, this.STE(i));
        }
        return this.dp.get(this.numbers.length - 1);
    }
}
