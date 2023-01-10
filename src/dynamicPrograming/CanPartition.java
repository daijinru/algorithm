package dynamicPrograming;

public class CanPartition {
    public Integer[] numbers;
    public CanPartition(Integer[] numbers) {
        this.numbers = numbers;
    }

    public boolean run() {
        Integer sum = 0;
        for (Integer num : numbers)
            sum += num;
        if (sum % 2 == 1)
            return false;
        return subsetSum(numbers, sum / 2);
    }

    public boolean subsetSum(Integer[] numbers, Integer target) {
        boolean[][] dp = new boolean[numbers.length + 1][target - 1];
        for (int i = 0; i <= numbers.length; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= numbers.length; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (!dp[i][j] && j >= numbers[i - 1]) {
                    dp[i][j] = dp[i - 1][j - numbers[i - 1]];
                }
            }
        }

        return dp[numbers.length][target];
    }
}
