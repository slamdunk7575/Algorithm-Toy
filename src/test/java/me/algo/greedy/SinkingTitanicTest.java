package me.algo.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SinkingTitanicTest {

    @DisplayName("침몰하는 타이타닉")
    @Test
    void sinking_titanic_test() {
        // given
        int[] inputs = {90, 50, 70, 100, 60};
        int weight = 140;

        // when
        SinkingTitanic sinkingTitanic = new SinkingTitanic();
        int answer = sinkingTitanic.solution(inputs, weight);

        // then
        assertThat(answer).isEqualTo(3);
    }

}
