package me.algo.simulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @DisplayName("사다리타기 테스트")
    @Test
    void ladder_test() {
        // given
        Ladder ladder = new Ladder();
        int[][] sticks = {{1, 3}, {2, 4}, {1, 4}};

        // when
        char[] solution = ladder.solution(5, sticks);

        // then
        assertThat(ladder.printResult(solution)).isEqualTo("DBACE");
    }

}
