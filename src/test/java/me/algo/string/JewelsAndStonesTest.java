package me.algo.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JewelsAndStonesTest {

    @DisplayName("보석과 돌 테스트")
    @Test
    void jewels_and_stones_test() {
        // given
        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones jewelsAndStones = new JewelsAndStones();

        // when
        int count = jewelsAndStones.solve(jewels, stones);

        // then
        assertThat(count).isEqualTo(3);
    }
}
