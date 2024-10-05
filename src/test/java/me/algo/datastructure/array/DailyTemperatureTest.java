package me.algo.datastructure.array;

import me.algo.datastructure.array.DailyTemperature;
import me.algo.util.PrintUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DailyTemperatureTest {

    @Test
    @DisplayName("DailyTemperature 테스트")
    void daily_temperature_test() {
        // given
        DailyTemperature dailyTemperature = new DailyTemperature();
        int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };

        // when
        // int[] result = dailyTemperature.solve(nums);
        int[] result = dailyTemperature.solveFor(nums);

        // then
        PrintUtil.print(result);
        assertThat(result).containsExactly(1, 1, 4, 2, 1, 1, 0, 0);
    }

}
