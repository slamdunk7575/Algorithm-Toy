package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MazeDfsTest {

    @DisplayName("미로 DFS")
    @Test
    void maze_dfs() {
        // given
        int[][] maze = {
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0}
        };

        int[] start = {0, 4};
        int[] dest = {4, 4};

        MazeDfs mazeDfs = new MazeDfs();

        // when
        boolean result = mazeDfs.solve(maze, start, dest);

        // then
        assertThat(result).isTrue();
    }

}
