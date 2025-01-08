package me.twoweeks.additional.dp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ManyMoveTest {

    @Test
    void many_move() {
        // given
        int n = 4;
        int[][] posArr = {
                {14, 9, 12, 10},
                {1, 11, 5, 4},
                {7, 15, 2, 3},
                {6, 3, 16, 8}
        };

        ManyMove manyMove = new ManyMove();

        // when
        int result = manyMove.solution(n, posArr);

        // then
        assertThat(result).isEqualTo(4);
    }

}
