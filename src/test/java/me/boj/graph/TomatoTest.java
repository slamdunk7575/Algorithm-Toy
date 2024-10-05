package me.boj.graph;

import me.boj.graph.Tomato;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TomatoTest {

    @DisplayName("토마토 #7576")
    @Test
    void tomato() {
        // given
        int m = 4;
        int n = 6;
        /*int[][] box = {
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
        };*/

        int[][] box = {
                {1, -1, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0},
                {0, 0, 0, 0, -1, 1},
        };

        Tomato tomato = new Tomato();

        // when
        int result = tomato.solve(m, n, box);

        // then
        assertThat(result).isEqualTo(6);
    }
}
