package me.algo.backtracking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateParenthesesTest {

    @DisplayName("Generate Parentheses 테스트")
    @Test
    void generate_parentheses_test() {
        // given
        GenerateParentheses generateParentheses = new GenerateParentheses();
        int n = 3;

        // when
        List<String> result = generateParentheses.solve(n);

        // then
        assertThat(result.size()).isEqualTo(5);
    }

}