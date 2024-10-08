package me.algo.graph;

import java.util.Objects;

/**
 * (정리)
 *
 * 시간복잡도: O(m*n)
 * - 대상: char[][] grid
 * - 이유: 이중 for문인데 m과 n이 다른 경우 (예: DFS, BFS)
 *
 * 공간복잡도: O(m*n)) (Worst Case -> 모두 '1'인 경우)
 * - 대상: 내부 Stack 생성
 * - 이유: 재귀호출이 곧 Stack
 *
 */
public class NumberOfIslandDfs {

    public int solve(char[][] grid) {
        System.out.println(" ========== BEFORE ==========");
        print(grid);

        // 예외 처리
        if (Objects.isNull(grid) || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        // DFS (1인 지점을 찾아서 사방으로 깊이 탐색)
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    System.out.println(" Entry Point ["+ i +"]["+ j +"]:" + grid[i][j]);
                    count++;
                    dfs(grid, i, j);
                }

            }
        }
        System.out.println(" ========== AFTER ==========");
        print(grid);
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;

        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = 'X';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1 );
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
