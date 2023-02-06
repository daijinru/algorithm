package dynamicPrograming;

import utils.ArrayUtil;

import java.util.Vector;

public class HouseRob extends DynamicPrograming<Integer> {
    public HouseRob(int[] houses) throws Exception {
        super(ArrayUtil.IntsToIntegers(houses));
    }

    @Override
    void initial() {
        this.insert(0, this.numbers[0]);
        if (this.numbers.length > 1) {
            this.insert(1, Math.max(this.numbers[0], this.numbers[1]));
        }
    }

    /**
     * Do not steal two adjacent houses.
     * The STE: dp[i] = Math.max(dp[i - 2] + houses[i], dp[i - 1])
     */
    @Override
    public Integer STE(int i) {
        return Math.max(this.get(i - 1), this.get(i - 2) + this.numbers[i]);
    }

    public int run() {
        for (int i = 2; i < this.numbers.length; i++) {
            this.insert(i, this.STE(i));
        }
        return this.get(this.numbers.length - 1);
    }

    /**
     * dp of len 2 to save values of f(i - 1) and f(i - 2).
     * And the result f(i) is written to f(i - 2).
     */
    public Integer STE_O1(int i) {
        return Math.max(this.get((i - 1) % 2), this.get((i - 2) % 2) + this.numbers[i]);
    }

    public int run_O1() {
        for (int i = 2; i < this.numbers.length; i++) {
            this.insert(i % 2, this.STE_O1(i));
        }
        return this.get((this.numbers.length - 1) % 2);
    }
}
