package me.algo.datastructure.array;

import me.algo.datastructure.array.NiceSubString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NiceSubStringTest {

    @DisplayName("좋은 부분 문자열 구하기")
    @Test
    void nice_sub_string() {
        // given
        String inputText = "abac";
        NiceSubString niceSubString = new NiceSubString();

        // when
        int result = niceSubString.solution(inputText);

        // then
        assertThat(result).isEqualTo(7);
    }

}
