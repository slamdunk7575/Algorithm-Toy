package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumAirfareTest {


    @Test
    @DisplayName("최소 비행료")
    void minimumAirfare() {
        // given
        MinimumAirfare minimumAirfare = new MinimumAirfare();

        // when
        int result = minimumAirfare.solution(5,
                new int[][]{{0, 1, 10}, {1, 2, 20}, {0, 2, 70}, {0, 3, 100},
                        {1, 3, 80}, {2, 3, 10}, {2, 4, 30}, {3, 4, 10}},
                0, 3, 1);

        // then
        assertThat(result).isEqualTo(80);
    }

}
