package me.algo.boj.graph;

import java.util.ArrayList;
import java.util.List;

public class AreaNumbering {

    private int[][] direction = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1}
    };

    int m;
    int n;
    int count = 0;

    public List<Integer> solve(int[][] grid) {

        List<Integer> result = new ArrayList<>();

        m = grid.length;
        n = grid[0].length;

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return result;
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count = dfs(grid, i, j);
                    result.add(count);
                    count = 0;
                    System.out.println("-------------");
                }
            }
        }

        return result;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) {
            return 0;
        }

        System.out.println("x: " + i + ", y: " + j);
        grid[i][j] = 'X'; // 방문
        count++;

        for (int[] dir : direction) {
            dfs(grid, i + dir[0], j + dir[1]);
        }

        return count;
    }

}
