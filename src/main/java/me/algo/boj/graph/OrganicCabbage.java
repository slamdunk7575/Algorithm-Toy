package me.algo.boj.graph;

import java.util.Objects;

public class OrganicCabbage {

    private final int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1},
    };

    public int solve(int m, int n, int[][] field) {

        if (Objects.isNull(field) || field.length == 0 || field[0].length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == 1) {
                    System.out.println("[진입] x: " + i + ", y: " + j + ", field: " + field[i][j]);
                    count++;
                    dfs(field, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(int[][] field, int i, int j) {
        int m = field.length;
        int n = field[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || field[i][j] != 1) {
            return;
        }

        field[i][j] = 'X';

        for (int[] dir : directions) {
            int dx = i + dir[0];
            int dy = j + dir[1];
            dfs(field, dx, dy);
        }
    }
}
