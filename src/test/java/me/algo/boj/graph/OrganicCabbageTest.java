package me.algo.boj.graph;

import me.boj.graph.OrganicCabbage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrganicCabbageTest {

    @DisplayName("유기농 배추 #1012")
    @Test
    void organicCabbage() {
        // given
        int m = 10;
        int n = 8;

        int[][] field = {
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0},
        };

        OrganicCabbage organicCabbage = new OrganicCabbage();

        // when
        int result = organicCabbage.solve(m, n, field);

        // then
        assertThat(result).isEqualTo(5);
    }
}
