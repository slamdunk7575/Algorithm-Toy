package me.algo.datastructure.array;

import me.algo.datastructure.array.ScoreLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScoreLevelTest {

    @DisplayName("점수에 등수 부여하기")
    @Test
    void score_level() {
        // given
        int[] grade = {3, 2, 1, 2};
        ScoreLevel scoreLevel = new ScoreLevel();

        // when
        int[] result = scoreLevel.solution(grade);

        // then
        assertThat(result).containsExactly(new int[]{1, 2, 4, 2});
    }

}
