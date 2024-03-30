package me.algo.dfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NearestLargeNumberTest {

    @DisplayName("가장 가까운 큰수")
    @Test
    void nearest_large_number() {
        // given
        int input = 20573;
        NearestLargeNumber nearestLargeNumber = new NearestLargeNumber();

        // when
        int result = nearestLargeNumber.solution(input);

        // then
        assertThat(result).isEqualTo(20735);
    }

}
