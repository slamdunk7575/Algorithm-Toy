package me.algo.dynamic;

/**
 * targetStair 까지 오르는 방법은
 * DP를 이용하여 dp[i] = dp[i - 1] + dp[i - 2] 구할수 있다.
 */
public class ClimbingStairs {

    public int solve(int targetStair) {
        // 0을 포함하기 때문에 (targetStair + 1)
        int[] dp = new int[targetStair + 1];

        if (targetStair == 1) {
            return 1;
        }

        if (targetStair == 2) {
            return 2;
        }

        // 초기화
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < targetStair; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[targetStair];
    }
}
