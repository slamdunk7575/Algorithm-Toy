package me.algo.boj.dp;

import me.boj.dp.ClimbingStairsGame;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsGameTest {

    @DisplayName("계단 오르기 게임 #2579")
    @Test
    void climbingStairs() {
        // given
        int target = 6;
        int[] scores = {
                0, 10, 20, 15, 25, 10, 20
        };

        ClimbingStairsGame climbingStairsGame = new ClimbingStairsGame();

        // when
        int result = climbingStairsGame.solve(scores, target);

        // then
        assertThat(result).isEqualTo(75);
    }

}
