package me.algo.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubMostTwoDistinctTest {

    @DisplayName("최대 2개의 고유문자가 있는 가장 긴 부분 문자열")
    @Test
    void longest_sub_most_two_distinct() {
        // given
        String input = "ccaabbb";
        LongestSubMostTwoDistinct lsmtd = new LongestSubMostTwoDistinct();

        // when
        int result = lsmtd.solve(input);

        // then
        assertThat(result).isEqualTo(5);
    }
}
