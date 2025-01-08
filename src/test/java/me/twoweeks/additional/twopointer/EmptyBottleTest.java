package me.twoweeks.additional.twopointer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyBottleTest {

    @Test
    void empty_bottle() {
        // given
        int bottleCount = 7;
        int maxVolume = 13;
        int[] bottleArr = { 0, 1, 2, 3, 5, 8, 13 };

        // when
        EmptyBottle emptyBottle = new EmptyBottle();
        int result = emptyBottle.solve(bottleCount, maxVolume, bottleArr);

        // then
        assertThat(result).isEqualTo(3);
    }

}
