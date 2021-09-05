package me.algo.graph;

public class WordSearch {

    private int[][] directions = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
    private int row;
    private int col;

    public boolean solve(char[][] grid, String word) {

        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }

        row = grid.length;
        col = grid[0].length;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(grid, visited, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    // row: 3, col: 4
    private boolean dfs(char[][] grid, boolean[][] visited,
                     int x, int y, int wordPoint, String word) {

        if (wordPoint == word.length()) {
            return true;
        }

        // DFS 조건
        if (x < 0 || x >= row || y < 0 || y >= col) {
            return false;
        }

        // 이미 방문
        if (visited[x][y]) {
            return false;
        }

        // word 비교후 다른 경우
        if (grid[x][y] != word.charAt(wordPoint)) {
            return false;
        }

        visited[x][y] = true;

        for (int[] direction : directions) {
            int dx = x + direction[0];
            int dy = y + direction[1];

            if (dfs(grid, visited, dx, dy, wordPoint + 1, word)) {
                return true;
            }
        }

        // visited 롤백
        visited[x][y] = false;

        return false;
    }
}
