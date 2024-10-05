package me.boj.greedy;

import me.boj.greedy.Microwave;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MicrowaveTest {

    @DisplayName("전자레인지 #10162")
    @Test
    void microwave() {
        // given
        int cookingTime = 100;
        Microwave microwave = new Microwave();

        // when
        List<Integer> result = microwave.solve(cookingTime);

        // then
        assertThat(result).containsAll(Arrays.asList(0, 1, 4));
    }
}
