package me.algo.datastructure.array;

import me.algo.datastructure.array.MinSumPair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinSumPairTest {

    @DisplayName("두수의 합의 절대값이 가장 작은 쌍 찾기")
    @Test
    void min_sum_pair() {
        // given
        int[] input = {-95, -20, -10, 50, 90};
        MinSumPair minSumPair = new MinSumPair();

        // when
        int[] result = minSumPair.solve(input);

        // then
        assertThat(result).containsExactly(-95, 90);
    }

}
