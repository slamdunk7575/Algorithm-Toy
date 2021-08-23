package me.algo.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SpiralMatrixTest {

    @DisplayName("나선형 매트릭스")
    @Test
    void spiral_matrix() {
        // given
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12}
            };

        SpiralMatrix spiralMatrix = new SpiralMatrix();

        // when
        List<Integer> result = spiralMatrix.solve(nums);

        // then
        assertThat(result).containsAll(
                Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7));
    }
}
