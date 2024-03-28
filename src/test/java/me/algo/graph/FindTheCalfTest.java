package me.algo.graph;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindTheCalfTest {

    @DisplayName("송아지 찾기")
    @Test
    void find_the_calf_test() {
        // given
        int ownerPos = 5;
        int calfPos = 14;
        FindTheCalf findTheCalf = new FindTheCalf();

        // when
        int result = findTheCalf.bfs(ownerPos, calfPos);

        // then
        assertThat(result).isEqualTo(3);
    }

}
