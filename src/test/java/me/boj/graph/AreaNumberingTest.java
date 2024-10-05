package me.boj.graph;

import me.boj.graph.AreaNumbering;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AreaNumberingTest {

    @DisplayName("단지번호붙이기 #2667")
    @Test
    void areaNumbering() {
        // given
        int[][] grid = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        AreaNumbering areaNumbering = new AreaNumbering();

        // when
        List<Integer> result = areaNumbering.solve(grid);

        // then
        assertThat(result).containsExactly(7, 8, 9);
    }
}
