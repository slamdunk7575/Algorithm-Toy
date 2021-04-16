package me.algo.stringarray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class MoveZerosTest {

    @DisplayName("MoveZeros 테스트")
    @Test
    void move_zeros_test() {
        // given
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = { 0, 3, 2, 0, 8, 5 };

        // when
        int[] result = moveZeros.solve(nums);

        // then
        assertThat(result).containsExactly(3, 2, 8, 5, 0, 0);

        String resultText = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(resultText);
    }

}
