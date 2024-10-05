package me.algo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RaceTrackConstruction {

    private int n;
    private int[][] map;
    private boolean[][] visited;
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int cost = Integer.MAX_VALUE;

    public int solve(int[][] board) {

        int result = 0;

        n = board.length;
        map = board;
        visited = new boolean[n][n];

        bfs(0, 0, -1, 0);
        result = cost;

        return result;
    }

    private void bfs(int x, int y, int direction, int price) {

        Queue<Road> queue = new LinkedList<>();
        queue.add(new Road(x, y, direction, price));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Road road = queue.remove();

            int rx = road.x;
            int ry = road.y;
            int rDir = road.direction;
            int rPrice = road.cost;

            if (rx == n - 1 && ry == n - 1) {
                cost = Math.min(cost, rPrice);
            }

            for (int i = 0; i < directions.length; i++) {
                int[] dir = directions[i];
                int nx = rx + dir[0];
                int ny = ry + dir[1];
                int nDir = i;
                int nPrice = rPrice;

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || map[nx][ny] == 1) {
                    continue;
                }

                if (rDir == -1) {
                    nPrice += 100;
                } else if (rDir == nDir) {
                    nPrice += 100;
                } else {
                    nPrice += 600;
                }

                // 방문 안했고 이전 비용이 더 큰 경우 작은 비용으로 셋팅
                if (!visited[nx][ny] || map[nx][ny] >= nPrice) {
                    visited[nx][ny] = true;
                    map[nx][ny] = nPrice;
                    queue.add(new Road(nx, ny, nDir, nPrice));
                }
            }
        }
    }
}

class Road {
    int x;
    int y;
    int direction;
    int cost;

    public Road(int x, int y, int direction, int cost) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.cost = cost;
    }
}
