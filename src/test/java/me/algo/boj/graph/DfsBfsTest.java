package me.algo.boj.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DfsBfsTest {

    @DisplayName("DFS와 BFS #1260")
    @Test
    void dfsBfs() {
        // given
        int n = 4; // 정점의 갯수 (1 <= N <= 1,000)
        int m = 5; // 간선의 갯수 (1 <= M <= 10,000)
        int v = 1; // 시작 정점 번호

        int[][] relations = new int[1001][1001]; // 정점들 관계를 그대로 표시

        /*1 2
        1 3
        1 4
        2 4*/
        relations[1][2] = relations[2][1] = 1;
        relations[1][3] = relations[3][1] = 1;
        relations[1][4] = relations[4][1] = 1;
        relations[2][4] = relations[4][2] = 1;

        DfsBfs dfsBfs = new DfsBfs();

        // when
        List<String> result = dfsBfs.solve(n, v, relations);

        // then
        assertThat(result).containsAll(Arrays.asList("1243", "1234"));
    }

}
