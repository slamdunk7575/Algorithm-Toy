package me.boj.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Tomato {

    private final int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };

    int row;
    int col;

    public int solve(int m, int n, int[][] box) {

        row = m;
        col = n;

        int dayCount = 0;
        Queue<TomatoInfo> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (box[i][j] == 1) {
                    queue.offer(new TomatoInfo(i, j));
                }
            }
        }

        while (!queue.isEmpty()) {
            TomatoInfo cur = queue.poll();

            for (int[] dir : directions) {
                int x = cur.getX() + dir[0];
                int y = cur.getY() + dir[1];

                if (x >= 0 && y >= 0 && x < m && y < n && box[x][y] == 0) {
                    queue.offer(new TomatoInfo(x, y));
                    box[x][y] = box[cur.getX()][cur.getY()] + 1;
                }
             }
        }

        print(box);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }
                dayCount = Math.max(dayCount, box[i][j]);
            }
        }

        if (dayCount == 1) {
            return 0;
        }

        return dayCount - 1;
    }

    private void print(int[][] box) {
        if (box == null || box.length == 0) {
            return;
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(box[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}

class TomatoInfo {
    int x;
    int y;

    public TomatoInfo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
