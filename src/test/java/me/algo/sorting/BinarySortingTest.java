package me.algo.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySortingTest {

    @DisplayName("이진수 정렬")
    @Test
    void binary_sorting_test() {
        // given
        int[] inputs = { 5, 6, 7, 8, 9 };
        BinarySorting binarySorting = new BinarySorting();

        // when
        int[] answers = binarySorting.solution(inputs);

        // then
        assertThat(answers[0]).isEqualTo(8);
    }

}
