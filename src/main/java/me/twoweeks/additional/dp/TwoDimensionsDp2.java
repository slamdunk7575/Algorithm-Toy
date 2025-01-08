package me.twoweeks.additional.dp;

public class TwoDimensionsDp2 {

    private int[] moveX = {-1, 0, 1, 0};
    private int[] moveY = {0, 1, 0, -1};

    private int X = 0;
    private int Y = 0;
    private int[][] dp;

    private int route = 0;

    public int solve(int x, int y, int[][] moveMap) {

        dp = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                dp[i][j] = -1;
            }
        }

        X = x;
        Y = y;

        int result = recur(0, 0, moveMap);

        return result;
    }

    private int recur(int i, int j, int[][] moveMap) {

        if (i == X - 1 && j == Y - 1) {
            System.out.println("i: " + i + ", j: " + j);
            return 1;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int dx, dy;
        route = 0;

        for (int k = 0; k < 4; k++) {
            dx = i + moveX[k];
            dy = j + moveY[k];

            if (dx < 0 || dy < 0 || dx >= X || dy >= Y) {
                continue;
            }

            if (moveMap[i][j] > moveMap[dx][dy]) {
                route += recur(dx, dy, moveMap);
            }
        }

        System.out.println(route);
        dp[i][j] = route;

        return dp[i][j];
    }
}
