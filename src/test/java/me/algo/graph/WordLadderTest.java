package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class WordLadderTest {

    @DisplayName("단어 사다리")
    @Test
    void word_ladder() {
        // given
        String[] words = {"hot", "dot", "lot", "log", "cog"};
        List<String> wordList = Arrays.asList(words);

        WordLadder wordLadder = new WordLadder();

        // when
        int result = wordLadder.solve("hit", "cog", wordList);

        // then
        assertThat(result).isEqualTo(5);
    }

}
