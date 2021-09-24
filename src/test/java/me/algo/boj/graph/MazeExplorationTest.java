package me.algo.boj.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MazeExplorationTest {

    @DisplayName("미로 탐색 #2178")
    @Test
    void mazeExploration() {
        // given
        int n = 4;
        int m = 6;
        int[][] maze = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1, 1},
                {1, 1, 1, 0, 1, 1}
        };

        int[] start = {0, 0};
        int[] dest = {3, 5};

        MazeExploration mazeExploration = new MazeExploration();

        // when
        int result = mazeExploration.solve(n, m, maze, start, dest);

        // then
        assertThat(result).isEqualTo(15);
    }

}
