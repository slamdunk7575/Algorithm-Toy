package me.algo.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxSubArrayTest {

    @DisplayName("서브 Array 최대값")
    @Test
    void max_sub_array_test() {
        // given
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // int[] nums = {10, 10, -3, 10, 10};
        // int[] nums = {-10, -20, -30, 10};
        MaxSubArray maxSubArray = new MaxSubArray();

        // when
        int result = maxSubArray.solve(nums);

        // then
        // assertThat(result).isEqualTo(6);
        // assertThat(result).isEqualTo(37);
        // assertThat(result).isEqualTo(10);
    }

}
