package me.boj.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * (정리)
 * DFS, BFS 둘다 이용하여 풀수 있다.
 * 최소한의 이동거리를 구하기 위해선 BFS로 풀어야 한다
 * (깊이 탐색은 운이 나쁠 경우 계속 파고들어 도착지점과 멀어질 수 있기 때문)
 *
 * (결과) - 직전까지 이동한 좌표에 1을 더해서 가중치를 더하면서 탐색한다
 * 1	0	9	10	11	 12
 * 2	0	8	0	12	 0
 * 3	0	7	0	13	 14
 * 4	5	6	0	14	 15
 */
public class MazeExploration {

    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int row;
    private int col;

    public int solve(int n, int m, int[][] maze, int[] start, int[] dest) {

        row = n;
        col = m;

        if (start[0] == dest[0] && start[1] == dest[1]) {
            return 0;
        }

        boolean[][] visited = new boolean[n][m];
        visited[start[0]][start[1]] = true; // 0, 0 (시작점)

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start[0], start[1]});

        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();

            for (int[] dir : directions) {
                int dx = curPos[0] + dir[0];
                int dy = curPos[1] + dir[1];

                if (dx >= 0 && dy >= 0 && dx < n && dy < m) {
                    if (maze[dx][dy] != 0 && !visited[dx][dy]) {
                        visited[dx][dy] = true;
                        maze[dx][dy] = maze[curPos[0]][curPos[1]] + 1;
                        queue.offer(new int[] {dx, dy});
                    }
                }
            }
        }

        print(maze);

        return maze[dest[0]][dest[1]];
    }

    private void print(int[][] maze) {
        if (maze == null || maze.length == 0) {
            return;
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(maze[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}
