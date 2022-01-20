package me.algo.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MostUsedAlphabetTest {

    @DisplayName("가장 많이 쓰인 알파벳")
    @Test
    void most_used_alphabet() {
        // given
        String input = "aAbBc";
        MostUsedAlphabet mostUsedAlphabet = new MostUsedAlphabet();

        // when
        String result = mostUsedAlphabet.solution(input);

        // then
        assertThat(result).isEqualTo("ab");
    }

}
