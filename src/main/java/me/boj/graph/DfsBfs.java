package me.boj.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * (정리)
 * 정점이 여러 개인 경우 번호가 작은 것부터 방문한다
 * 간선은 양방향이다
 *
 * 인접행렬을 이용하는 경우는 정점의 갯수가 적을때이다
 * 예: relations[1][0~N]번 모두 탐색해야하기 때문
 */
public class DfsBfs {

    private boolean[] dfsChecked = new boolean[1001];
    private StringBuilder dfsResult = new StringBuilder();

    private boolean[] bfsChecked = new boolean[1001];
    private StringBuilder bfsResult = new StringBuilder();
    
    private List<String> result = new ArrayList<>();

    public List<String> solve(int n, int v, int[][] relations) {
        dfs(n, v, relations);
        result.add(dfsResult.toString());


        bfs(n, v, relations);
        result.add(bfsResult.toString());

        return result;
    }

    private void dfs(int n, int v, int[][] relations) {
        dfsChecked[v] = true;

        for (int i = 1; i <= n; i++) {
            if (relations[v][i] == 1 && dfsChecked[i] == false) {
                dfs(n, i, relations);
            }
        }
    }

    private void bfs(int n, int v, int[][] relations) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        bfsChecked[v] = true;
        result.add(String.valueOf(v));

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (relations[temp][i] == 1 && bfsChecked[i] == false) {
                    queue.offer(i);
                    bfsChecked[i] = true;
                    result.add(String.valueOf(i));
                }
            }
        }
    }

}
