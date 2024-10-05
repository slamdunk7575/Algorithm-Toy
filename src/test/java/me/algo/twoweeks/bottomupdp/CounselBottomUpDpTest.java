package me.algo.twoweeks.bottomupdp;

import me.twoweeks.bottomupdp.CounselBottomUpDp;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounselBottomUpDpTest {

    @Test
    void counsel_bottom_up_dp() {
        // given
        int count = 7;
        int[][] schedules = {{4, 10}, {1, 20}, {3, 30}, {1, 40}, {2, 35}, {3, 150}, {2, 10}};
        int[] dp = new int[count + 1];

        // when
        CounselBottomUpDp counselBottomUpDp = new CounselBottomUpDp();
        int[] result = counselBottomUpDp.test(count, schedules, dp);

        // then
        assertThat(result[0]).isEqualTo(95);
    }

}
