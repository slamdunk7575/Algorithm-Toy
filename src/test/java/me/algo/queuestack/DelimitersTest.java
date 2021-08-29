package me.algo.queuestack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DelimitersTest {

    @DisplayName("구분자들 합치기")
    @Test
    void delimiters_test() {
        // given
        String delimiter = ".?";
        String input = "abc";

        Delimiters delimiters = new Delimiters();

        // when
        List<String> result = delimiters.solve(delimiter, input);

        // then
        assertThat(result).contains("a.b.c", "a.b?c", "a?b.c", "a?b?c");
    }

}
