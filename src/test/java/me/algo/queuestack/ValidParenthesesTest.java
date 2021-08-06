package me.algo.queuestack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    @Test
    @DisplayName("ValidParentheses 테스트")
    void valid_parentheses_test() {
        // given
        ValidParentheses validParentheses = new ValidParentheses();

        String trueExp = "()[]{}";
        // String falseExp = "([)]";

        // when
        boolean result = validParentheses.solve(trueExp);

        // then
        assertThat(result).isTrue();
    }

}
