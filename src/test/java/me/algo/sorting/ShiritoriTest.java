package me.algo.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShiritoriTest {

    @DisplayName("끝말잇기")
    @Test
    void shiritori() {
        // given
        // int n = 3;
        int n = 2;
        // String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
        Shiritori shiritori = new Shiritori();

        // when
        int[] result = shiritori.solution(n, words);

        // then
        // assertThat(result).containsExactly(3, 3);
        assertThat(result).containsExactly(1, 3);
    }

}
