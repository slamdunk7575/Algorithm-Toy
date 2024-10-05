package me.algo.array;

import me.algo.datastructure.array.DotCover;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DotCoverTest {

    @DisplayName("선분으로 점들 덮기")
    @Test
    void dot_cover() {
        // given
        int[] dots = {1, 5, 8};
        int[] lines = {1, 3, 4, 6};
        DotCover dotCover = new DotCover();

        // when
        int result = dotCover.solution(dots, lines);

        // then
        assertThat(result).isEqualTo(2);
    }

}
