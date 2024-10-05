package me.algo.datastructure.array;

import me.algo.datastructure.array.TrappingRainWater;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrappingRainWaterTest {

    @DisplayName("빗물담기")
    @Test
    void trapping_rain_water() {
        // given
        int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        TrappingRainWater trw = new TrappingRainWater();

        // when
        int result = trw.solve(nums);

        // then
        assertThat(result).isEqualTo(6);
    }

}
