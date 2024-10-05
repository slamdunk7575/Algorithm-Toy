package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfIslandBfsTest {

    @DisplayName("NumberOfIsland BFS 테스트")
    @Test
    void number_of_island_bfs() {
        // given
        NumberOfIslandBfs numberOfIslandBfs = new NumberOfIslandBfs();

        char[][] grid = {{'1','1','1','0','1'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','1'},
                         {'0','0','0','0','1'}};

        // when
        int result = numberOfIslandBfs.solve(grid);

        // then
        assertThat(result).isEqualTo(3);
    }


}