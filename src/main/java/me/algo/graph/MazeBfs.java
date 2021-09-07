package me.algo.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * (정리)
 * 시간복잡도: O(M*N)
 * - 대상: int[][] maze
 * - 이유: int[][]을 돌면서 탐색하기 때문 (m은 row, n은 column)
 *
 * 공간복잡도: O(M*N)
 * - 대상: boolean[][] visited
 * - 이유: 탐색한 결과를 boolean[][] 에 전부 기록하기 때문
 */
public class MazeBfs {

    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int row;
    private int col;

    public boolean solve(int[][] maze, int[] start, int[] dest) {

        row = maze.length; // 5
        col = maze[0].length; // 5

        if (start[0] == dest[0] && start[1] == dest[1]) {
            return true;
        }

        boolean[][] visited = new boolean[row][col];
        // 시작 (0, 4 -> true)
        visited[start[0]][start[1]] = true;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1]}); // 0, 4 (시작)

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : directions) {
                int dx = cur[0];
                int dy = cur[1];

                // 벽에 부딪힐 때까지 사방(directions)으로 탐색
                while (dx >= 0 && dy >= 0 && dx < row && dy < col &&
                    maze[dx][dy] == 0) {
                    dx += dir[0];
                    dy += dir[1];
                    System.out.println("이동 x: " + dx + ", y: " + dy);
                }

                // 벽에 부딪히고 나서 바로 앞 좌표
                dx -= dir[0];
                dy -= dir[1];

                System.out.println("벽전 x: " + dx + ", y: " + dy);

                if (visited[dx][dy]) {
                    continue;
                }

                visited[dx][dy] = true;

                if (dx == dest[0] && dy == dest[1]) {
                    return true;
                }

                print(visited);
                queue.offer(new int[] {dx, dy});
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
