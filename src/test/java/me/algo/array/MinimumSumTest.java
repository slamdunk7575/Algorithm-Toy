package me.algo.array;

import me.algo.datastructure.array.MinimumSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumSumTest {

    @DisplayName("최소 누적합")
    @Test
    void minimumSum() {
        // given
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        MinimumSum minimumSum = new MinimumSum();

        // when
        int result = minimumSum.solve(a, b);

        // then
        assertThat(result).isEqualTo(29);
    }
}
