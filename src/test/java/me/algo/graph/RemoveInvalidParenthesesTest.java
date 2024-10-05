package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveInvalidParenthesesTest {

    @DisplayName("유효하지 않은 괄호 제거하기")
    @Test
    void remove_invalid_parentheses() {
        // given
        String input = "(a)())()";
        RemoveInvalidParentheses removeInvalidParentheses = new RemoveInvalidParentheses();

        // when
        List<String> result = removeInvalidParentheses.solve(input);

        // then
        assertThat(result).contains("(a)()()", "(a())()");
    }

}
