package me.algo.twopointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramInStringTest {

    @DisplayName("문자열에서 모든 아나그램 찾기")
    @Test
    void anagram_in_string_test() {
        // given
        String source = "bacdgabcda";
        String input = "abcd";
        AnagramInString anagramInString = new AnagramInString();

        // when
        List<Integer> result = anagramInString.solveByArray(source, input);

        // then
        assertThat(result).containsAll(Arrays.asList(0, 5, 6));
    }

}
