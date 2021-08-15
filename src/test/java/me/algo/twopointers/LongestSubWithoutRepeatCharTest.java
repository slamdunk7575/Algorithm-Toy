package me.algo.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubWithoutRepeatCharTest {

    @DisplayName("중복없는 가장 긴 문자열 구하기")
    @Test
    void longest_sub_char_test() {
        // given
        String input = "pawwkea";
        LongestSubWithoutRepeatChar lswrc = new LongestSubWithoutRepeatChar();

        // when
        int result = lswrc.solve(input);

        // then
        assertThat(result).isEqualTo(4);
    }

}
