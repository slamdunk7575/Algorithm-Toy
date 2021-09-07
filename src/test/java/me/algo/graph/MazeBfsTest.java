package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MazeBfsTest {

    @DisplayName("미로 BFS")
    @Test
    void maze_bfs() {
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

        MazeBfs mazeBfs = new MazeBfs();

        // when
        boolean result = mazeBfs.solve(maze, start, dest);

        // then
        assertThat(result).isTrue();

    }
}
