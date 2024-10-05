package me.boj.greedy;

import me.boj.greedy.LostParenthesis;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LostParenthesisTest {

    @DisplayName("잃어버린 괄호 #1541")
    @Test
    void lostParenthesis() {
        // given
        String input = "55-50+40";
        LostParenthesis lostParenthesis = new LostParenthesis();

        // when
        int result = lostParenthesis.solve(input);

        // then
        assertThat(result).isEqualTo(-35);
    }

}
