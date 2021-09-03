package me.algo.graph;

public class MaxOfIsland {

    private int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    int m = 0;
    int n = 0;

    public int solve(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        m = grid.length;
        n = grid[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, 0);
                    System.out.println("섬 넓이: " + area);
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int x, int y, int area) {
        // DFS 탈출
        if (x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
            return area;
        }

        // 섬(1) 안으로 들어오는 경우
        grid[x][y] = 0;
        area++;

        for (int[] dir : dirs) {
            area = dfs(grid, x + dir[0], y + dir[1], area);
        }

        return area;
    }
}
