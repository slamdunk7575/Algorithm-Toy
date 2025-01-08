package me.twoweeks.additional.dp;

import java.util.Arrays;

public class ManyMove {

    private int[][] dp;
    private int[][] dYdX = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int solution(int n, int[][] posArr) {

        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                recur(n, y, x, posArr);
            }
        }

        return Arrays.stream(dp)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElse(0);
    }

    private int recur(int n, int y, int x, int[][] posArr) {

        if (dp[y][x] != 0 && dp[y][x] != -1) {
            return dp[y][x];
        }

        for (int i = 0; i < dYdX.length; i++) {
            int ey = y + dYdX[i][0];
            int ex = x + dYdX[i][1];

            if (0 <= ey && ey < n
                    && 0 <= ex && ex <n) {
                if (posArr[y][x] < posArr[ey][ex]) {
                    dp[y][x] = Math.max(dp[y][x], recur(n, ey, ex, posArr) + 1);
                }
            }
        }

        return dp[y][x];
    }
}
