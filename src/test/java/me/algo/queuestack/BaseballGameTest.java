package me.algo.queuestack;

import me.algo.queuestack.BaseballGame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballGameTest {

    @DisplayName("BaseballGame 테스트")
    @Test
    void base_ball_game_test() {
        // given
        BaseballGame baseballGame = new BaseballGame();
        String[] texts = {"5", "-2", "4", "C", "D", "9", "+", "+"};

        // when
        int result = baseballGame.solve(texts);

        // then
        assertThat(result).isEqualTo(27);
    }

}
