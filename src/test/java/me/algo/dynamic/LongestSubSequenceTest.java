package me.algo.dynamic;

import me.algo.dp.LongestSubSequence;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class LongestSubSequenceTest {

    @DisplayName("가장 긴 서브시퀀스 증가")
    @Test
    void LongestSubSequence() {
        // given
        int[] nums = {
                1, 2, 1, 4, 3, 3
        };

        LongestSubSequence longestSubSequence = new LongestSubSequence();

        // when
        int result = longestSubSequence.solve(nums);

        // then
        assertThat(result).isEqualTo(3);
    }

}
