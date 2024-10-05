package me.algo.datastructure.set;

import me.algo.datastructure.set.MaximumLengthSequence;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumLengthSequenceTest {

    @DisplayName("최대 길이 연속수열")
    @Test
    void maximum_length_sequence() {
        // given
        MaximumLengthSequence maximumLengthSequence = new MaximumLengthSequence();
        int[] input = new int[] { 8, 1, 9, 3, 10, 2, 4, 0, 2, 3 };

        // when
        int result = maximumLengthSequence.solution(input);

        // then
        assertThat(result).isEqualTo(5);
    }

}
