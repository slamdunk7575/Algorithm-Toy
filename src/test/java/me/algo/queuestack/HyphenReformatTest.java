package me.algo.queuestack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HyphenReformatTest {

    @DisplayName("하이픈(-)으로 문자열 다시 구분하기")
    @Test
    void hyphen_reformat() {
        // given
        String input1 = "00-33  38 7575 8366";
        HyphenReformat hyphenReformat = new HyphenReformat();

        // when
        String result = hyphenReformat.solution(input1);

        // then
        assertThat(result).isEqualTo("003-338-757-583-66");
    }

}
