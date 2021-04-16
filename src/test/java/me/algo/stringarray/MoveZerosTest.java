package me.algo.stringarray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

    @DisplayName("MoveZeros 테스트")
    @Test
    void move_zeros_test() {
        // given
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = { 0, 3, 2, 0, 8, 5 };

        // when
        moveZeros.solve(nums);

        // then
    }

}
