package me.algo.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NmSequence {
    private static StringBuilder sb = new StringBuilder();
    private static int n, m;
    private static boolean[] visited;
    private static int[] result;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visited = new boolean[n];
        result = new int[m];
        recur(0);

        System.out.println(sb.toString());
    }

    private static void recur(int depth) {
        if (depth == m) {
            for (int num : result) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            // 해당 노드를 방문하지 않았다면
            if (!visited[i]) {
                // 해당 노드를 방문상태로 변경
                visited[i] = true;
                // 해당 깊이를 index 로 하여 i+1 값 저장
                result[depth] = i + 1;
                // 다음 자식노드 방문을 위해 depth + 1 증가시키며 재귀 호출
                recur(depth + 1);
                // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
                visited[i] = false;
            }
        }
    }
}
