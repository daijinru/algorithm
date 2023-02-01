package dynamicPrograming;

import java.util.Vector;

public class MinCostClimbingStairs {
    public int[] cost;
    public int len;

    public MinCostClimbingStairs(int[] cost) {
        this.cost = cost;
        this.len = cost.length;
    }

    /**
     *                 9
     *            8        7
     *          7   6   6    5
     *         6 5 5 4 5 4  4  3
     *  Example: cal step 6 is duplicated.
     */
    public int run() {
        return Math.min(helper(cost, len - 2),helper(cost, len - 1));
    }

    private int helper(int[] cost, int i) {
        if (i < 2) {
            return cost[i];
        }
        return Math.min(helper(cost, i - 2), helper(cost, i - 1)) + cost[i];
    }

    private Vector<Integer> dp;
    public int runDP() {
        this.dp = new Vector<>(len);
        for (int i = 0; i < len; i++) {
            this.dp.add(i, 0);
        }
        // len - 1 is the last step
        helperDp(cost, len - 1, this.dp);
        return Math.min(dp.get(len - 2), dp.get(len - 1));
    }

    public void helperDp(int[] cost, int i, Vector<Integer> dp) {
        if (i < 2) {
            dp.set(i, cost[i]);
        } else if (dp.get(i) == 0) {
            /**
             * recursive for STACK(LIFO) so can cal the values from 1,2,3...n
             */
            helperDp(cost, i - 2, dp);
            helperDp(cost, i - 1, dp);
            dp.set(
                    i,
                    Math.min(dp.get(i - 2), dp.get(i - 1)) + cost[i]
            );
        }
    }

    /**
     * It can compress to O(n) if you use order.
     * At first to initialize dp[0] and dp[1] and then cal the values later.
     * eg. dp[2] = min(dp[0], dp[1]) + cost[2]
     */
    public int runDpOn() {
        this.dp = new Vector<>(len);
        for (int i = 0; i < len; i++) {
            this.dp.add(i, 0);
        }
        this.dp.set(0, this.cost[0]);
        this.dp.set(1, this.cost[1]);
        for (int i = 2; i < len; i++) {
            dp.set(
                    i,
                    Math.min(this.dp.get(i - 2), this.dp.get(i - 1)) + cost[i]
            );
        }
        return Math.min(this.dp.get(len - 2), this.dp.get(len - 1));
    }
}
