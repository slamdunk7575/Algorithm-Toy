package me.twoweeks.other;

import me.twoweeks.other.TwoDimensionsDp;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoDimensionsDpTest {

    @Test
    void tow_dimensions_dp() {
        // given
        int count = 4;
        int[] moveX = { -1, 0, 1, 0 };
        int[] moveY = { 0, 1, 0, -1 };

        int[][] moveMap = {{14, 9, 12, 10}, {1, 11, 5, 4}, {7, 15, 2, 13}, {6, 3, 16, 8}};
        int[][] dp = new int[count][count];

        TwoDimensionsDp twoDimensionsDp = new TwoDimensionsDp();

        // when
        int result = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                result = Math.max(result, twoDimensionsDp.recur(i, j, moveX, moveY, count, moveMap, dp));
                System.out.println(i + " " + j + " " + result);
            }
        }

        // then
        assertThat(result).isEqualTo(4);
    }

}
