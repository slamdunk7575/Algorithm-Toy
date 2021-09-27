package me.algo.boj.dp;

import java.util.Arrays;

public class SugarDeliveryDp {

    public int solve(int[] bags, int amount) {

        int max = amount + 1;
        int[] dp = new int[max];

        Arrays.fill(dp, 1, dp.length, max);

        for (int i = 0; i <= amount ; i++) {
            for (int j = 0; j < bags.length; j++) {
                if (i >= bags[j]) {
                    dp[i] = Math.min(dp[i], dp[i - bags[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
