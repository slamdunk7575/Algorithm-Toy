package me.twoweeks.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionsDp {

    private static int count;
    private static int[][] moveMap;
    private static int[][] dp;

    private static int[] moveX = {-1, 0, 1, 0};
    private static int[] moveY = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        count = Integer.parseInt(br.readLine());

        moveMap = new int[count][count];
        dp = new int[count][count];
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                moveMap[i][j] = Integer.parseInt(input[j]);
            }
        }

        int result = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                result = recur(i, j);
            }
        }

        System.out.println(result);
    }

    private static int recur(int i, int j) {
        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        dp[i][j] = 1;

        int dx, dy;
        for (int k = 0; k < 4; k++) {
            dx = i + moveX[k];
            dy = j + moveY[k];

            if (dx < 0 || dy < 0 || dx >= count || dy >= count) {
                continue;
            }

            if (moveMap[i][j] < moveMap[dx][dy]) {
                dp[i][j] = Math.max(dp[i][j], recur(dx, dy) + 1);
            }
        }

        return dp[i][j];
    }

    public int recur(int i, int j,
                     int[] moveX, int[] moveY,
                     int count,
                     int[][] moveMap, int[][] dp) {

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        dp[i][j] = 1;

        int dx, dy;
        for (int k = 0; k < 4; k++) {
            dx = i + moveX[k];
            dy = j + moveY[k];

            if (dx < 0 || dy < 0 || dx >= count || dy >= count) {
                continue;
            }

            if (moveMap[i][j] < moveMap[dx][dy]) {
                dp[i][j] = Math.max(dp[i][j], recur(dx, dy, moveX, moveY, count, moveMap, dp) + 1);
            }
        }

        return dp[i][j];
    }

}
