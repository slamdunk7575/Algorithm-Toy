package me.algo.boj.dp;

/**
 * (정리)
 * - 계단은 한 번에 한 계단 or 두 계단씩만 오를 수 있다
 * - 연속된 3개의 계단을 밟으면 안된다
 *
 * 위 규칙에 따라 n 번째의 계단을 밟는 경우는 몇가지일까?
 * 1. (n - 3)을 밟고 (n - 1)을 밟는 경우
 * 2. (n - 2)를 밟는 경우
 *
 * 따라서 위 2가지 경우는 큰 값(점수) + 현재 계단의 값을 구하면 된다
 * (1, 2, 3 계단의 경우 (n - 3)이 존재하지 않기 때문에 값을 직접 대입해주었다
 */
public class ClimbingStairsGame {

    public int solve(int[] score, int target) {

        int[] dp = new int[score.length];

        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        dp[3] = Math.max(score[1], score[2]) + score[3];

        for (int i = 4; i <= target; i++) {
            dp[i] = Math.max(dp[i - 3] + score[i - 1], dp[i - 2]) + score[i];
        }

        return dp[target];
    }
}
