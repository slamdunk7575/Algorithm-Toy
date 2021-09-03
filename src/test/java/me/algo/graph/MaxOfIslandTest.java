package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxOfIslandTest {

    @DisplayName("가장 큰 섬의 크기 찾기")
    @Test
    void max_of_island() {
        // given
        int[][] grid = {
                {1, 1, 0, 1, 1},
                {0, 1, 1, 0, 0},
                {0, 0 ,0 ,0 ,0},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 0, 1, 1, 1}
        };

        MaxOfIsland maxOfIsland = new MaxOfIsland();

        // when
        int result = maxOfIsland.solve(grid);

        // then
        assertThat(result).isEqualTo(8);
    }

}
