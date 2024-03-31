package me.algo.bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TileJumpTest {

    @DisplayName("타일점프")
    @Test
    void title_jump() {
        // given
        int[] nums = {2, 2, 1, 2, 1, 1};
        TileJump tileJump = new TileJump();

        // when
        int result = tileJump.solution(nums);

        // then
        assertThat(result).isEqualTo(3);
    }
}
