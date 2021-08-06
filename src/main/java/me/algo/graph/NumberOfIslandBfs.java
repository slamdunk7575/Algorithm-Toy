package me.algo.graph;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * (정리)
 *
 * 시간복잡도: O(m*n)
 * - 대상: char[][] grid
 * - 이유: 이중 for문인데 m과 n이 다른 경우 (예: DFS, BFS)
 *
 * 공간복잡도: O(min(m, n))
 * - 대상: Queue<int[]> queue = new LinkedList<>()
 * - 이유: 큐에 좌표값을 저장하고 빼면서 계산 -> 따라서, O(min(m, n)), O(max(m, n)) 중 하나임
 */
public class NumberOfIslandBfs {

    public int solve(char[][] grid) {
        System.out.println(" ========== BEFORE ==========");
        print(grid);

        if (Objects.isNull(grid) || grid.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    System.out.print(" Entry Point ["+ i +"]["+ j +"]:" + grid[i][j]);
                    count++;
                    bfs(grid, i, j);
                }
            }
        }

        System.out.println(" ========== AFTER ==========");
        print(grid);

        return count;
    }

    int[][] direction = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    private void bfs(char[][] grid, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y}); // 0, 0 (시작 좌표)
        // direction 사방으로 탐색
        while (!queue.isEmpty()) {
            int size = queue.size();
            int[] point = queue.poll();

            for (int i = 0; i < size; i++) {
                for (int[] dir : direction) {
                    int x1 = point[0] + dir[0];
                    int y1 = point[1] + dir[1];

                    if (x1 >= 0 && y1 >= 0 && x1 < grid.length && y1 < grid[0].length && grid[x1][y1] == '1') {
                        grid[x1][y1] = 'X';
                        queue.offer(new int[] {x1, y1});
                    }
                }
            }
        }
    }

    public void print(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(" grid["+ i +"]["+ j +"]:" + grid[i][j]);
            }
            System.out.println();
        }
    }


}
