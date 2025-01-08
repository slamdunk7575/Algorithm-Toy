package me.twoweeks.additional;

import me.twoweeks.additional.dp.TwoDimensionsDp2;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoDimensionsDp2Test {

    @Test
    void two_dimensions_dp_2() {
        // given
        int x = 4;
        int y = 5;

        int[][] moveMap = {
                {50, 45, 37, 32, 30},
                {35, 50, 40, 20, 25},
                {30, 30, 25, 17, 28},
                {27, 24, 22, 15, 10}
        };

        // when
        TwoDimensionsDp2 tdp2 = new TwoDimensionsDp2();
        int result = tdp2.solve(x, y, moveMap);

        // then
        assertThat(result).isEqualTo(3);
    }

}
