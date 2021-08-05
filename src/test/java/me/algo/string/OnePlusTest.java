package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OnePlusTest {

    @DisplayName("One Plus 테스트")
    @Test
    void one_plus_test() {
        // given
        // int[] digits = {1, 2, 3};
        // int[] digits = {9, 9, 9};
        // int[] digits = {9, 8, 9};
        // int[] digits = {8, 9, 9};
        // int[] digits = {0, 0, 1};
        // int[] digits = {9, 0, 0, 9};
        int[] digits = {9, 9, 9, 9, 9};

        OnePlus onePlus = new OnePlus();

        // when
        int[] result = onePlus.solve(digits);

        // then
        // assertThat(result).containsExactly(1, 2, 4);
        // assertThat(result).containsExactly(1, 0, 0, 0);
        // assertThat(result).containsExactly(9, 9, 0);
        // assertThat(result).containsExactly(9, 0, 0);
        // assertThat(result).containsExactly(0, 0, 2);
        // assertThat(result).containsExactly(9, 0, 1, 0);
        assertThat(result).containsExactly(1, 0, 0, 0, 0, 0);
    }

}
