package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @DisplayName("단어 찾기")
    @Test
    void word_search() {
        // given
        char[][] grid = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        String word = "ABCCEDF";
        WordSearch wordSearch = new WordSearch();

        // when
        /* {true, true, true, 'E'},
           {'S', true, true, 'S'},
           {'A', true, true, 'E'} */
        boolean result = wordSearch.solve(grid, word);

        // then
        assertThat(result).isTrue();
    }

}
