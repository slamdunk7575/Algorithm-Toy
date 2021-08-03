package me.algo.string;

import me.algo.util.PrintUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    @DisplayName("TwoSum 테스트")
    void two_sum_test() {
        // given
        TwoSum twoSum = new TwoSum();
        int[] nums = { 2, 8, 11, 14 };
        int target = 16;

        // when
        int[] result = twoSum.solve(nums, target);

        // then
        assertThat(result).containsExactly(1, 3);

        PrintUtil.print(result);
    }

}
