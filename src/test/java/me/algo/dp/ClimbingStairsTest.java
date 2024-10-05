package me.algo.dp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @DisplayName("계단 오르기")
    @Test
    void climbing_stairs() {
        // given
        int targetStair = 4;
        ClimbingStairs cs = new ClimbingStairs();

        // when
        int result = cs.solve(targetStair);

        // then
        assertThat(result).isEqualTo(5);
    }
}
