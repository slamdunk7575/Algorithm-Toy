package me.algo.backtracking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCombinationTest {

    @DisplayName("문자 조합")
    @Test
    void letter_combination() {
        // given
        String input = "23";
        LetterCombination lc = new LetterCombination();

        // when
        List<String> result = lc.solve(input);
        System.out.println(result);

        // then
        assertThat(result).containsAll(Arrays.asList("ad", "bd", "cd", "ae",
                        "be", "ce", "af", "bf", "cf"));
    }
}
