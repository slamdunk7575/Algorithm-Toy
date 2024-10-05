package me.algo.array;

import me.algo.datastructure.array.MinSizeSubArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinSizeSubArrayTest {

    @DisplayName("서브 Array 합이 조건을 만족하는 가장 작은 사이즈 구하기")
    @Test
    void minimum_size_sub_array() {
        // given
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        MinSizeSubArray minSizeSubArray = new MinSizeSubArray();

        // when
        int result = minSizeSubArray.solve(target, nums);

        // then
        assertThat(result).isEqualTo(2);
    }

}
