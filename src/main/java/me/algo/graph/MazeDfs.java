package me.algo.graph;

/**
 * (정리)
 * 시간복잡도: O(M*N)
 * - 대상: int[][] maze
 * - 이유: int[][] 를 사방으로 돌면서 탐색하기 때문 (M은 row, N은 column)
 *
 * 공간복잡도: O(M*N)
 * - 대상: boolean[][] visited
 * - 이유: 탐색한 결과를 boolean[][] 에 기록하기 때문
 */
public class MazeDfs {

    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int row;
    private int col;

    public boolean solve(int[][] maze, int[] start, int[] dest) {
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return false;
        }

        row = maze.length;
        col = maze[0].length;
        boolean[][] visited = new boolean[row][col];

        return dfs(maze, start, dest, visited);
    }

    private boolean dfs(int[][] maze, int[] start, int[] dest, boolean[][] visited) {
        if (start[0] < 0 || start[0] >= row || dest[0] < 0 || dest[0] >= col
                || visited[start[0]][start[1]]) {
            return false;
        }

        visited[start[0]][start[1]] = true;
        print(visited);

        if (start[0] == dest[0] && start[1] == dest[1]) {
            return true;
        }

        // 사방으로 탐색
        for (int[] dir : directions) {
            int dx = start[0]; // 0
            int dy = start[1]; // 4

            while (dx >= 0 && dy >= 0 && dx < row && dy < col && maze[dx][dy] == 0) {
                dx += dir[0];
                dy += dir[1];
            }

            // 벽에 부딪히고 나서 전 좌표
            dx -= dir[0]; // 2
            dy -= dir[1]; // 4

            System.out.println("벽전 x: " + dx + ", y: " + dy);

            if (dfs(maze, new int[] {dx, dy}, dest, visited)) {
                return true;
            }
        }

        return false;
    }

    private void print(boolean[][] visited) {
        if (visited == null || visited.length == 0) {
            return;
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(visited[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}
