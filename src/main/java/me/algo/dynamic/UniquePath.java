package me.algo.dynamic;

public class UniquePath {

    public int solve(int m, int n) {
        Integer[][] map = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            map[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            map[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }

        return map[m-1][n-1];
    }

}
